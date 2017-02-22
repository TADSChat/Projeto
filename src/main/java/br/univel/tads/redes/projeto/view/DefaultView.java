package br.univel.tads.redes.projeto.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.CardLayout;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

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
		setTitle("O CHAT!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 485);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JRadioButtonMenuItem radioOn = new JRadioButtonMenuItem("Online");
		mnArquivo.add(radioOn);
		
		JRadioButtonMenuItem radioOff = new JRadioButtonMenuItem("Offline");
		mnArquivo.add(radioOff);
		
		JSeparator separator = new JSeparator();
		mnArquivo.add(separator);
		
		JMenuItem mntmAlterarDados = new JMenuItem("Alterar Dados");
		mnArquivo.add(mntmAlterarDados);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
	}

}
