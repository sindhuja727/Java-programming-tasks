import java.util.*;
class Arraylargest
{
public static void main(String args[])
{
	System.out.println("Enter size of array :");
	Scanner d=new Scanner(System.in);
	int m=d.nextInt();
	int max=-1;
	int[] a =new int[m];
	for(int i=0;i<m;i++)
	{
		a[i]=d.nextInt();
	}
	for(int j=0;j<m;j++)
	{
		if(max<a[j])
		{
			max=a[j];
		}
	}
	System.out.println("Largest element is :"+max);
}
}