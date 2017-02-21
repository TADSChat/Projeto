package br.univel.tads.redes.projeto.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JList;
import java.awt.GridBagConstraints;

public class ListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		add(list, gbc_list);

	}

}
