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

public class UploadView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UploadView frame = new UploadView();
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
	public UploadView() {
		setTitle("Upload");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 137);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblEnviandoArquivoPara = new JLabel("Enviando arquivo para Sicrano");
		lblEnviandoArquivoPara.setFont(new Font("Arial", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEnviandoArquivoPara = new GridBagConstraints();
		gbc_lblEnviandoArquivoPara.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnviandoArquivoPara.gridx = 0;
		gbc_lblEnviandoArquivoPara.gridy = 0;
		contentPane.add(lblEnviandoArquivoPara, gbc_lblEnviandoArquivoPara);
		
		JLabel lblExemploarquivozip = new JLabel("ExemploArquivo.zip");
		lblExemploarquivozip.setFont(new Font("Arial", Font.BOLD, 18));
		GridBagConstraints gbc_lblExemploarquivozip = new GridBagConstraints();
		gbc_lblExemploarquivozip.insets = new Insets(0, 0, 5, 0);
		gbc_lblExemploarquivozip.gridx = 0;
		gbc_lblExemploarquivozip.gridy = 1;
		contentPane.add(lblExemploarquivozip, gbc_lblExemploarquivozip);
		
		JProgressBar progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 2;
		contentPane.add(progressBar, gbc_progressBar);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.gridx = 0;
		gbc_btnCancelar.gridy = 3;
		contentPane.add(btnCancelar, gbc_btnCancelar);
	}

}
