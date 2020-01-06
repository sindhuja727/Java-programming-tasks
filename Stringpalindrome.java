import java.util.*;
class Stringpalindrome
{
public static void main(String arss[])
{
	int c=0;
	System.out.println("Enter string");
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	for(int i=0;i<(int)(a.length()/2);i++)
	{
		if((a.charAt(i)==a.charAt((a.length()-1)-i)))
		{
			c++;
		}
	}
	if(c==(int)(a.length()/2)){
	System.out.println("The string is palindrome");}
	else{
		System.out.println("The string is not palindrome");
	}
}
}