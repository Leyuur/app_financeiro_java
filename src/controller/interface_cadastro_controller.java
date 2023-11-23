package controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;
import view.interface_cadastro;
import view.primeira_pagina;

public class interface_cadastro_controller {

	private interface_cadastro view;

	public interface_cadastro_controller(interface_cadastro view) {
		this.view = view;
	}

	public void salvaUsuario() {

		String senha = new String(view.getTxtSenha().getPassword());
		String confirm_senha = new String(view.getTxtConfirmSenha().getPassword());
		String nome = view.getTxtNome().getText();
		String email = view.getTxtEmail().getText();
		String user = view.getTxtUser().getText();

		Usuario novo_usuario = new Usuario(user, nome, email, senha);

		try {
			if (!senha.equals(confirm_senha)) {

				JOptionPane.showMessageDialog(null, "Senhas incompatíveis", "Erro", JOptionPane.ERROR_MESSAGE);
				
			}
			else if (senha.equals("") || email.equals("") || nome.equals("") || user.equals("") || confirm_senha.equals("")) {

				JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Erro",JOptionPane.ERROR_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Login registrado com sucesso!", "Login", JOptionPane.INFORMATION_MESSAGE);
				new primeira_pagina().setVisible(true);
				view.dispose();
				Connection conexao = new Conexao().getConnection();
				UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
				usuarioDao.insert(novo_usuario);
			}
		}

		catch (SQLException e1) {
			e1.printStackTrace();
			System.out.print("Erro");
		}
	}
}
