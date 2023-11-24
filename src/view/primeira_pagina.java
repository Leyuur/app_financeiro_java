package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.primeira_pagina_controller;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class primeira_pagina extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBarraUser;
	private JPasswordField txtBarraSenha;
	private final primeira_pagina_controller controller;

	/**
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primeira_pagina frame = new primeira_pagina();
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
	public primeira_pagina() {
		
		controller = new primeira_pagina_controller(this);
		
		setResizable(false);
		setTitle("WAY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1340, 780);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(534, 398, 212, 23);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new interface_cadastro().setVisible(true);
				primeira_pagina.this.dispose();

			}
		});
		btnNewButton_1.setBounds(534, 434, 212, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						try {
							controller.autenticar();
						} catch (SQLException e1) {
						
							e1.printStackTrace();
						}
		}
		});

		JLabel lblNewLabel_1 = new JLabel("BEM VINDO!");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(560, 109, 156, 60);
		contentPane.add(lblNewLabel_1);

		txtBarraUser = new JTextField();
		txtBarraUser.setBounds(534, 247, 212, 23);
		contentPane.add(txtBarraUser);
		txtBarraUser.setColumns(10);

		txtBarraSenha = new JPasswordField();
		txtBarraSenha.setBounds(534, 336, 212, 23);
		contentPane.add(txtBarraSenha);

		JLabel lblNewLabel_2 = new JLabel("Usuário");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(534, 221, 98, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Senha");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(534, 312, 98, 14);
		contentPane.add(lblNewLabel_2_1);
	}

	public JTextField getTxtBarraUser() {
		return txtBarraUser;
	}

	public void setTxtBarraUser(JTextField txtBarraUser) {
		this.txtBarraUser = txtBarraUser;
	}

	public JPasswordField getTxtBarraSenha() {
		return txtBarraSenha;
	}

	public void setTxtBarraSenha(JPasswordField txtBarraSenha) {
		this.txtBarraSenha = txtBarraSenha;
	}
}
