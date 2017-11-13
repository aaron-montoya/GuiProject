package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Font;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Clik me plz :D");
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 205, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 145, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -209, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstButton, -141, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set background color
	 */
	private void setupPanel()
	{
		this.setBackground(Color.YELLOW);
		this.setLayout(appLayout);
		this.add(firstButton);
	}

	/**
	 * Used to hold the constraint positioning for SpringLayout.
	 * AKA a giant dumping ground for all the xxxx.putConstraint(...) lines.
	 */
	private void setupLayout()
	{
	}
	
	private void setupListeners()
	{
		
	}
}
