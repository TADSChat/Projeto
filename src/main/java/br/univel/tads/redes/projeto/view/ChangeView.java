package br.univel.tads.redes.projeto.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;

public class ChangeView extends JFrame {

	private JPanel contentPane;
	private JTextField tf_name;
	private JTextField tf_email;
	private JPasswordField password;
	private JPasswordField password_confirmation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeView frame = new ChangeView();
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
	public ChangeView() {
		setTitle("Editar Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		tf_name = new JTextField();
		GridBagConstraints gbc_tf_name = new GridBagConstraints();
		gbc_tf_name.insets = new Insets(0, 0, 5, 0);
		gbc_tf_name.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_name.gridx = 0;
		gbc_tf_name.gridy = 1;
		contentPane.add(tf_name, gbc_tf_name);
		tf_name.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 2;
		contentPane.add(lblEmail, gbc_lblEmail);
		
		tf_email = new JTextField();
		tf_email.setEditable(false);
		GridBagConstraints gbc_tf_email = new GridBagConstraints();
		gbc_tf_email.insets = new Insets(0, 0, 5, 0);
		gbc_tf_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_email.gridx = 0;
		gbc_tf_email.gridy = 3;
		contentPane.add(tf_email, gbc_tf_email);
		tf_email.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.insets = new Insets(0, 0, 5, 0);
		gbc_lblSenha.anchor = GridBagConstraints.WEST;
		gbc_lblSenha.gridx = 0;
		gbc_lblSenha.gridy = 4;
		contentPane.add(lblSenha, gbc_lblSenha);
		
		password = new JPasswordField();
		GridBagConstraints gbc_password = new GridBagConstraints();
		gbc_password.insets = new Insets(0, 0, 5, 0);
		gbc_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_password.gridx = 0;
		gbc_password.gridy = 5;
		contentPane.add(password, gbc_password);
		password.setColumns(10);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		GridBagConstraints gbc_lblConfirmarSenha = new GridBagConstraints();
		gbc_lblConfirmarSenha.insets = new Insets(0, 0, 5, 0);
		gbc_lblConfirmarSenha.anchor = GridBagConstraints.WEST;
		gbc_lblConfirmarSenha.gridx = 0;
		gbc_lblConfirmarSenha.gridy = 6;
		contentPane.add(lblConfirmarSenha, gbc_lblConfirmarSenha);
		
		password_confirmation = new JPasswordField();
		GridBagConstraints gbc_password_confirmation = new GridBagConstraints();
		gbc_password_confirmation.insets = new Insets(0, 0, 5, 0);
		gbc_password_confirmation.fill = GridBagConstraints.HORIZONTAL;
		gbc_password_confirmation.gridx = 0;
		gbc_password_confirmation.gridy = 7;
		contentPane.add(password_confirmation, gbc_password_confirmation);
		password_confirmation.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalvar.gridx = 0;
		gbc_btnSalvar.gridy = 8;
		contentPane.add(btnSalvar, gbc_btnSalvar);
	}

}
