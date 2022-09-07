import java.util.Scanner;

public class Reverse
{
	public static void main(String args[])
	{
		int num,temp,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.print("Reverse digit is "+rev);
		
		
		
	}
}
