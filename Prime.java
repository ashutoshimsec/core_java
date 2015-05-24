import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

	class Prime
	{
		public static void main(String abc[])
		{
			try
			{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter the number");
	
			int a = Integer.parseInt(br.readLine());
						
			for(int i=2;i<=a-1;i++)
			{	
				if(a%i==0)
				{
					System.out.println("The number is not a prime number, it is divisible by "+i);
					System.exit(0);
				}
			}

			System.out.println(a+" is prime number");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
		}
 	}
