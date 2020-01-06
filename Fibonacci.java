import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
	int a=1,b=1,c=0,n,d;
	System.out.println("Enter no of terms");
	Scanner ds=new Scanner(System.in);
	n= ds.nextInt();
	while(c<n-2)
	{
		if(c==0)
		{
			System.out.print(a+"  "+b+"  ");
		}
		d=a+b;
		a=b;
		b=d;
		System.out.print(b+"  ");
		c++;		
	}
}
}