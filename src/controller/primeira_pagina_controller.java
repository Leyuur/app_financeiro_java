package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;
import view.primeira_pagina;
import view.AplicativoControleFinanceiroGUI;

public class primeira_pagina_controller {

	private primeira_pagina view;

	public primeira_pagina_controller(primeira_pagina view) {
		this.view = view;

	}

	public void autenticar() throws SQLException {
		// Buscar um usuario da view //txtBarraSenha
		String usuario = view.getTxtBarraUser().getText();
		String senha = new String(view.getTxtBarraSenha().getPassword());

		Usuario usuario_autenticar = new Usuario(usuario, senha, senha, senha);
		// Verificar se existe no banco de dados

		Connection conexao = new Conexao().getConnection();
		UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
		
		usuarioDao.existeNoBancoPorUsuarioESenha(usuario_autenticar);

		boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuario_autenticar);

		if (existe) {
			
                    new AplicativoControleFinanceiroGUI().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
                        new primeira_pagina().setVisible(true);
                }


	}

}
