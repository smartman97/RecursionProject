package recursion.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

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
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					baseController.startTime();
					resultsArea.setText(baseController.doFibonacci(userInput));
					baseController.stopTime();
					resultsArea.append(baseController.timingInfo());
				}
			}
		});
		
		facButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					baseController.startTime();
					resultsArea.setText(baseController.doFactorial(userInput));
					baseController.stopTime();
					resultsArea.append(baseController.timingInfo());
				}
			}
		});
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Double.parseDouble(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("That is not a valid number");
		}
		
		return isNumber;
	}
}
