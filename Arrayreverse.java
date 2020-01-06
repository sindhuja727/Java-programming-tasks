import java.util.*;
class Arrayreverse
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
	System.out.println("In reversed order elements are:");
	for(int j=m-1;j>=0;j--)
	{
		System.out.print(a[j]+" ");	
	}
}
}