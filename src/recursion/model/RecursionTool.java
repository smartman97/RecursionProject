package recursion.model;

public class RecursionTool
{
	public double getFibNumber(double position)
	{
		// Defensive code against user evilness
		if (position < 0)
		{
			return Integer.MIN_VALUE;
		}

		// Base Case
		if (position == 0 || position == 1)
		{
			return 1;
		}
		else
		// Recursive Case - Keep calling the method
		{
			return getFibNumber(position - 1) + getFibNumber(position - 2);
		}
	}

	public double getFactorialNumber(double position)
	{
		// Defensive code against user evilness
		if (position < 0)
		{
			return Integer.MIN_VALUE;
		}

		// Base Case
		if (position == 0 || position == 1)
		{
			return 1;
		}
		else
		// Recursive Case - Keep calling the method
		{
			return position * getFactorialNumber(position - 1);
		}

	}
}
