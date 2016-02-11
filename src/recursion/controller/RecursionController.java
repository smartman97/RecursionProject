package recursion.controller;

import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;

public class RecursionController
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calculatedValue;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
	}
	
	public void start()
	{
		calculatedValue = Integer.toString(mathTool.getFibNumber(0));
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}
}
