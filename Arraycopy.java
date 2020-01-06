import java.util.*;
class Arraycopy
{
public static void main(String arsf[])
{
	int m,n;
	System.out.println("Enter size of array:");
	Scanner f=new Scanner(System.in);
	m=f.nextInt();
	n=m;
	int[] a=new int[m];
	int[]b=new int[n];
	System.out.println("Enter  array :");
	for(int i=0;i<m;i++)
	{
		a[i]=f.nextInt();
	}
	b=a;
	System.out.println("The copied array is :");
	for(int i=0;i<m;i++)
	{
		System.out.print(b[i]+"    ");
	}
}
}