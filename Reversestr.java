import java.util.Scanner;

public class Reversestr {	
	
	private static Scanner sc;	
	
	public static void main(String[] args) 
	{
		String revStr;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Text =  ");
		revStr = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(revStr);
		
		System.out.println("The result =  " + sb.reverse());
	}
}
