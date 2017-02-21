package br.univel.tads.redes.projeto.view.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;

public class DefaultView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefaultView frame = new DefaultView();
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
	public DefaultView() {
		setTitle("O Servidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);
		
		JMenuItem mntmListarUsurios = new JMenuItem("Listar Usu\u00E1rios");
		mnUsuario.add(mntmListarUsurios);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnIniciar = new JButton("Iniciar");
		GridBagConstraints gbc_btnIniciar = new GridBagConstraints();
		gbc_btnIniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIniciar.insets = new Insets(0, 0, 5, 5);
		gbc_btnIniciar.gridx = 0;
		gbc_btnIniciar.gridy = 0;
		contentPane.add(btnIniciar, gbc_btnIniciar);
		
		JButton btnParar = new JButton("Parar");
		GridBagConstraints gbc_btnParar = new GridBagConstraints();
		gbc_btnParar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnParar.insets = new Insets(0, 0, 5, 5);
		gbc_btnParar.gridx = 1;
		gbc_btnParar.gridy = 0;
		contentPane.add(btnParar, gbc_btnParar);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		GridBagConstraints gbc_btnReiniciar = new GridBagConstraints();
		gbc_btnReiniciar.insets = new Insets(0, 0, 5, 0);
		gbc_btnReiniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnReiniciar.gridx = 2;
		gbc_btnReiniciar.gridy = 0;
		contentPane.add(btnReiniciar, gbc_btnReiniciar);
		
		JTextArea txt = new JTextArea();
		txt.setText("Vamos exercitar a imagina\u00E7\u00E3o?\r\nImagine que aqui tem uma imagem\r\nUma imagem bem legal...\r\nEnt\u00E3o, \u00E9 essa mesma!");
		GridBagConstraints gbc_txt = new GridBagConstraints();
		gbc_txt.gridwidth = 3;
		gbc_txt.insets = new Insets(0, 0, 0, 5);
		gbc_txt.fill = GridBagConstraints.BOTH;
		gbc_txt.gridx = 0;
		gbc_txt.gridy = 1;
		contentPane.add(txt, gbc_txt);
	}

}
