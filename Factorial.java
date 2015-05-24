import java.io.BufferedReader;
import java.io.InputStreamReader;

	//calculate the factorial of a number
	class Factorial
	{
		public static void main(String abc[])
		{

			try 
			{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			

			Factorial f = new Factorial();
			System.out.println("Enter the number");	
			
			int a = Integer.parseInt(br.readLine());
			System.out.println("The factorial of "+a+" is "+f.fact(a));

			}
			catch(Exception e)
			{	
				e.printStackTrace();
			}
		}

		public int fact(int i)
		{
			if(i==0 || i==1)
				return 1;
			else
				return i*fact(i-1);
		}

	}
