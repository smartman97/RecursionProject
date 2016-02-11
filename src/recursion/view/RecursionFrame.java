package recursion.view;

import recursion.controller.RecursionController;
import javax.swing.JFrame;
import recursion.view.RecursionPanel;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel basePanel;
	
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 300);
		this.setVisible(true);
	}
}
