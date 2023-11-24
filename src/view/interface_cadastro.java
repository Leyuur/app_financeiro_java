package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.interface_cadastro_controller;

public class interface_cadastro extends primeira_pagina {
	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField txtEmail;
	public JPasswordField txtSenha;
	public JTextField txtNome;
	public JPasswordField txtConfirmSenha;
	public JTextField txtUser;
	private interface_cadastro_controller controller;

	/**
	 * 
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interface_cadastro frame = new interface_cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interface_cadastro() {
		setTitle("App");

		controller = new interface_cadastro_controller(this);

		setAlwaysOnTop(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1340, 780);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(534, 521, 213, 26);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.salvaUsuario();

			}
		});
		contentPane.add(btnNewButton);

		txtEmail = new JTextField();
		txtEmail.setBounds(534, 266, 213, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(534, 397, 213, 26);
		contentPane.add(txtSenha);

		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setBounds(534, 310, 92, 14);
		contentPane.add(lblNewLabel);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(534, 372, 92, 14);
		contentPane.add(lblSenha);

		JLabel lblNewLabel_1 = new JLabel("Cadastre-se");
		lblNewLabel_1.setBounds(548, 115, 220, 53);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel_1);

		txtNome = new JTextField();
		txtNome.setBounds(534, 204, 213, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(534, 179, 46, 14);
		contentPane.add(lblNewLabel_2);

		txtConfirmSenha = new JPasswordField();
		txtConfirmSenha.setBounds(534, 459, 213, 26);
		contentPane.add(txtConfirmSenha);

		JLabel lblConfirmarSenha = new JLabel("Confirmar senha");
		lblConfirmarSenha.setBounds(534, 434, 128, 14);
		contentPane.add(lblConfirmarSenha);

		txtUser = new JTextField();
		txtUser.setBounds(534, 335, 213, 26);
		txtUser.setColumns(10);
		contentPane.add(txtUser);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(534, 241, 92, 14);
		contentPane.add(lblEmail);
		this.setResizable(false);
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JPasswordField getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(JPasswordField txtSenha) {
		this.txtSenha = txtSenha;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JPasswordField getTxtConfirmSenha() {
		return txtConfirmSenha;
	}

	public void setTxtConfirmSenha(JPasswordField txtConfirmSenha) {
		this.txtConfirmSenha = txtConfirmSenha;
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

}