package br.univel.tads.redes.projeto.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Font;

public class DownloadView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DownloadView frame = new DownloadView();
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
	public DownloadView() {
		setTitle("Download");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 141);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblFulanoDeTal = new JLabel("Fulano de Tal enviou um arquivo");
		lblFulanoDeTal.setFont(new Font("Arial", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFulanoDeTal = new GridBagConstraints();
		gbc_lblFulanoDeTal.gridwidth = 3;
		gbc_lblFulanoDeTal.insets = new Insets(0, 0, 5, 5);
		gbc_lblFulanoDeTal.gridx = 0;
		gbc_lblFulanoDeTal.gridy = 0;
		contentPane.add(lblFulanoDeTal, gbc_lblFulanoDeTal);
		
		JLabel lblNomearquivorar = new JLabel("NomeArquivo.rar");
		lblNomearquivorar.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblNomearquivorar = new GridBagConstraints();
		gbc_lblNomearquivorar.gridwidth = 3;
		gbc_lblNomearquivorar.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomearquivorar.gridx = 0;
		gbc_lblNomearquivorar.gridy = 1;
		contentPane.add(lblNomearquivorar, gbc_lblNomearquivorar);
		
		JProgressBar progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.gridwidth = 3;
		gbc_progressBar.insets = new Insets(0, 0, 5, 5);
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 2;
		contentPane.add(progressBar, gbc_progressBar);
		
		JButton btnAceitar = new JButton("Aceitar");
		GridBagConstraints gbc_btnAceitar = new GridBagConstraints();
		gbc_btnAceitar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAceitar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceitar.gridx = 0;
		gbc_btnAceitar.gridy = 3;
		contentPane.add(btnAceitar, gbc_btnAceitar);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 3;
		contentPane.add(btnCancelar, gbc_btnCancelar);
	}

}
