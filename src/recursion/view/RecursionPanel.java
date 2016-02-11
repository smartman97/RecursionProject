package recursion.view;

import java.awt.Color;

import javax.swing.*;

import recursion.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibButton;
	private JButton facButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibButton = new JButton("Get the Fibonacci sequence for this number");
		facButton = new JButton("Get n!");
		inputField = new JTextField(20);
		resultsArea = new JTextArea(10, 20);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibButton);
		this.add(facButton);
		this.add(inputField);
		this.add(resultsArea);
		this.setBackground(Color.GREEN);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setText(baseController.getCalculatedValue());
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, fibButton, -16, SpringLayout.NORTH, resultsArea);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsArea, -6, SpringLayout.NORTH, facButton);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 16, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 98, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, facButton, 245, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, facButton, 184, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 60, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, fibButton, -60, SpringLayout.EAST, this);
	}
	
	public void setupListeners()
	{
		
	}
}
