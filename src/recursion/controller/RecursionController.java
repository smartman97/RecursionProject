package recursion.controller;

import recursion.model.CodeTimer;
import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;

public class RecursionController
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calculatedValue;
	private CodeTimer timer;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
	}
	
	public void start()
	{
		timer.startTimer();
		calculatedValue = Double.toString(mathTool.getFibNumber(0));
		timer.stopTimer();
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}
	
	public String doFibonacci(String inputValue)
	{
		calculatedValue = "The Fibonacci sequence number of " + inputValue + " is " + Double.toString(mathTool.getFibNumber(Double.parseDouble(inputValue)));
		
		return calculatedValue;
	}
	
	public String doFactorial(String inputValue)
	{
		calculatedValue = "The Factorial sequence number of " + inputValue + " is " + Double.toString(mathTool.getFactorialNumber(Double.parseDouble(inputValue)));
		
		return calculatedValue;
	}
	
	public String timingInfo()
	{
		return timer.toString();
	}
}
