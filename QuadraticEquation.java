import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math.*;
public class QuadraticEquation 
{

	//quadratic equation
	public 	static void main(String abc[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		System.out.println("Welcome this is program to take input from buffered reader");
		try
		{
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			double x1,x2;
			double D = Math.sqrt(b*b-(4*a*c));

			if(D>0)
			{
				System.out.println("The roots of the equation are real");
				System.out.println("Desciminent is "+D);
				x1 = (-b+D)/2.0;
				x2 = (-b-D)/2.0;	
				System.out.println("The roots of the equations are "+x1+" and "+x2);		
			}
			else
			{
				System.out.println("The roots of the equation are imaginary");
				D = Math.sqrt(4*a*c-b*b);
				String x3 = Double.toString((-b/2))+" + "+Double.toString((D/2))+'i';
				String x4 = Double.toString((-b/2))+ "-"+ Double.toString((D/2))+'i';
				System.out.println("the roots of equation are"+x3+" and "+x4);
			}	
				
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		
	}
}
