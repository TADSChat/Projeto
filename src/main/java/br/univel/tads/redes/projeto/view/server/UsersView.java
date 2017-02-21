package br.univel.tads.redes.projeto.view.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JList;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UsersView extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNome;
	private JTextField tf_name;
	private JLabel lblEmail;
	private JTextField tf_;
	private JLabel lblSenha;
	private JTextField tf_senha;
	private JLabel lblconfirmacaoSenha;
	private JTextField tf_confirmacaoSenha;
	private JButton btnSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsersView frame = new UsersView();
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
	public UsersView() {
		setTitle("Gerenciar Usu\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 9;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		contentPane.add(list, gbc_list);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 9;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 0);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		panel.add(lblNome, gbc_lblNome);
		
		tf_name = new JTextField();
		GridBagConstraints gbc_tf_name = new GridBagConstraints();
		gbc_tf_name.insets = new Insets(0, 0, 5, 0);
		gbc_tf_name.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_name.gridx = 0;
		gbc_tf_name.gridy = 1;
		panel.add(tf_name, gbc_tf_name);
		tf_name.setColumns(10);
		
		lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 2;
		panel.add(lblEmail, gbc_lblEmail);
		
		tf_ = new JTextField();
		GridBagConstraints gbc_tf_ = new GridBagConstraints();
		gbc_tf_.insets = new Insets(0, 0, 5, 0);
		gbc_tf_.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_.gridx = 0;
		gbc_tf_.gridy = 3;
		panel.add(tf_, gbc_tf_);
		tf_.setColumns(10);
		
		lblSenha = new JLabel("Senha");
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.insets = new Insets(0, 0, 5, 0);
		gbc_lblSenha.gridx = 0;
		gbc_lblSenha.gridy = 4;
		panel.add(lblSenha, gbc_lblSenha);
		
		tf_senha = new JTextField();
		GridBagConstraints gbc_tf_senha = new GridBagConstraints();
		gbc_tf_senha.insets = new Insets(0, 0, 5, 0);
		gbc_tf_senha.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_senha.gridx = 0;
		gbc_tf_senha.gridy = 5;
		panel.add(tf_senha, gbc_tf_senha);
		tf_senha.setColumns(10);
		
		lblconfirmacaoSenha = new JLabel("Confirma\u00E7\u00E3o Senha");
		GridBagConstraints gbc_lblconfirmacaoSenha = new GridBagConstraints();
		gbc_lblconfirmacaoSenha.insets = new Insets(0, 0, 5, 0);
		gbc_lblconfirmacaoSenha.gridx = 0;
		gbc_lblconfirmacaoSenha.gridy = 6;
		panel.add(lblconfirmacaoSenha, gbc_lblconfirmacaoSenha);
		
		tf_confirmacaoSenha = new JTextField();
		GridBagConstraints gbc_tf_confirmacaoSenha = new GridBagConstraints();
		gbc_tf_confirmacaoSenha.insets = new Insets(0, 0, 5, 0);
		gbc_tf_confirmacaoSenha.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_confirmacaoSenha.gridx = 0;
		gbc_tf_confirmacaoSenha.gridy = 7;
		panel.add(tf_confirmacaoSenha, gbc_tf_confirmacaoSenha);
		tf_confirmacaoSenha.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalvar.gridx = 0;
		gbc_btnSalvar.gridy = 8;
		panel.add(btnSalvar, gbc_btnSalvar);
	}

}
