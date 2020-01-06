import java.util.*;
class Palindrome
{
public static void main(String arss[])
{
	int c=0,t,d,s=0;
	System.out.println("Enter number");
	Scanner sq=new Scanner(System.in);
	int n=sq.nextInt();
	t=n;
	while(n>0)
	{
		d=n%10;
		s=d+s*10;
		n=(int)n/10;
	}
	if(t==s){
	System.out.println("Palindrome");}
	else{
		System.out.println("Not palindrome");
	}
}
}