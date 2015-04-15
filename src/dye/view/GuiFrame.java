package dye.view;

import javax.swing.JFrame;

import dye.controller.GuiController;

public class GuiFrame extends JFrame
{
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		basePanel = new GuiPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000, 1000);
		this.setVisible(true);
	}
}
