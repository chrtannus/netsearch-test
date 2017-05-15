package org.cytoscape.netsearchtest.internal.task;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class CustomOptionsTaskFactory extends AbstractNetSearchTestTaskFactory {

	private final ImageIcon ICON = new ImageIcon(getClass().getClassLoader().getResource("images/star-96.png"));
	
	public CustomOptionsTaskFactory() {
		super(
				"netsearchtest.test-b",
				"B. Custom Options UI",
				"Provides its own Options UI component"
		);
	}
	
	@Override
	public Icon getIcon() {
		return ICON;
	}
	
	@Override
	public JComponent getOptionsComponent() {
		JCheckBox cb1 = new JCheckBox("Lorem Ipsum Dolor", true);
		JCheckBox cb2 = new JCheckBox("Sit Amet");
		cb1.setForeground(Color.WHITE);
		cb2.setForeground(Color.WHITE);
		
		JPanel p = new JPanel(new BorderLayout());
		p.setBackground(Color.DARK_GRAY);
		
		p.add(cb1, BorderLayout.NORTH);
		p.add(cb2, BorderLayout.SOUTH);
		
		return p;
	}
}
