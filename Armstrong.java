//Armstrong number 153=1^3+5^3+3^3.since no of digits of 153 are 3.
import java.util.*;
import java.lang.Math.*;
class Armstrong
{
public static void main(String arss[])
{
	int c=1,t,d,sd=0,m;
	System.out.println("Enter number");
	Scanner sq=new Scanner(System.in);
	int n=sq.nextInt();
	t=n;
	m=n;
	while(m>0)//for calculating no of digits
	{
		d=m%10;
		c++;
		m=(int)m/10;
	}
	while(n>0)
	{
		d=n%10;
		sd=sd+((int)(Math.pow(d,(c-1))));
		n=(int)n/10;
	}
	if(t==sd){
	System.out.println("Armstrong");}
	else{
		System.out.println("Not armstrong");
	}
}
}