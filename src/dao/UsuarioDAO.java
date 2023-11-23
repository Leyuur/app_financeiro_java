package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Usuario;

public class UsuarioDAO {

	private final Connection connection;

	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}

	public void insert(Usuario usuario) throws SQLException {

		
            String sql = ("insert into usuario (nome, usuario, senha, email) values ('" + usuario.getNome() + "', '"+ usuario.getUsuario() + "', '" + usuario.getSenha() + "', '" + usuario.getEmail() + "');");

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.execute();
	}

	public boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {

		String sql = "select * from usuario where usuario = '" + usuario.getUsuario() + "' and senha = '"+ usuario.getSenha() +"';";

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.execute();

		ResultSet resultSet = statement.getResultSet();

		return resultSet.next();

	}

	public void buscaonome(Usuario usuario) throws SQLException {
		
		String sql = "select * from usuario where nome = '"+usuario.getNome() +"'";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.execute();

		ResultSet resultSet = statement.getResultSet();

		System.out.println(resultSet);
		
	}

}
