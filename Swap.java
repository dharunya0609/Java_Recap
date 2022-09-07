import java.util.Scanner;

public class Swap
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		System.out.println("Before,Value of a and b is "+a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap,Value of a and b is "+a+" "+b);
		
	}
}
