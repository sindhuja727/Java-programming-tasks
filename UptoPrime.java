import java.util.*;
import java.lang.Math.*;
class UptoPrime
{
public static void main(String args[])
{
	int n,j,c=0,num=1,count;
	System.out.println("Enter number of terms");
	Scanner dd=new Scanner(System.in);
	n=dd.nextInt();
	while(num>0)
	{
		if(c<n)
		{
			num++;
			count=0;
			for(j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(num+"  ");
				c++;
			}
		}
		else
		{
			break;
		}
	}
}
}