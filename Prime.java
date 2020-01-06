import java.lang.Math.*;
import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int c=0,n;
		System.out.println("Enter number");
		Scanner d=new Scanner(System.in);
		n=d.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
			System.out.println("its prime");
		else
			System.out.println("not prime");
	}
}