import java.util.*;
class Arrayduplicate
{
public static void main(String args[])
{
	System.out.println("Enter size of array :");
	Scanner d=new Scanner(System.in);
	int m=d.nextInt();
	int[] a =new int[m];
	for(int i=0;i<m;i++)
	{
		a[i]=d.nextInt();
	}
	for(int i=0;i<m;i++)
	{
		for(int j=i+1;j<m;j++)
			{
				if(a[i]==a[j]&&i!=j)	
				{
					System.out.println("Duplicate element is :"+a[j]);
				}
			}
		
	}
}
}