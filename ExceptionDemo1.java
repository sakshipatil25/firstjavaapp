
public class ExceptionDemo1 
{
	public static void main(String [] args)
	{
		try
		{
			System.out.println("Program Start");
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			
			float res= n1/n2;
			System.out.println("Result: "+res);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Second number should not be zero");
		}
		catch(NumberFormatException obj)
		{
			System.out.println("Please provde arguments in integer format only");
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Please provide both arguments");
		}
		
		catch(Exception obj)
		{
			System.out.println("Exception handled by Generalized Catch Block");
		}

		System.out.println("Program End");
	}
}
