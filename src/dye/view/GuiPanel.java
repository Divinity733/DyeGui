package dye.view;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import dye.controller.GuiController;

public class GuiPanel extends JPanel
{
	private GuiController baseController;
	private SpringLayout appLayout;
	
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		appLayout = new SpringLayout();
		
		setupPanel();
		heyListen();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		int startOffset = 20;
		for(int c = 0; c < 6; c++)
		{
			JLabel test = new JLabel("" + c + " label");
			JTextField textField = new JTextField(10);
			this.add(test);
			this.add(textField);
			
			appLayout.putConstraint(SpringLayout.NORTH, test, startOffset, SpringLayout.NORTH, this);
			startOffset += 20;
			appLayout.putConstraint(SpringLayout.NORTH, textField, startOffset, SpringLayout.NORTH, this);

			startOffset += 50;
		}
	}
	
	private void heyListen()
	{
		ArrayList<JTextField> myTextFields = new ArrayList<JTextField>();
		for(Component current : this.getComponents())
		{
			if(current instanceof JTextField)
			{
				myTextFields.add((JTextField)current);
			}
		}
	}
}
