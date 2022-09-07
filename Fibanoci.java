import java.util.Scanner;

public class Fibanoci
{
	public static void main(String args[])
	{
		int cnt,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of cnt:");
		cnt=sc.nextInt();
		System.out.println("Fibanoci series is");
		for(int i=1;i<=cnt;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
		
	}
}
