import java.util.Scanner;

public class ToggleCharsinStr1 {
	private static Scanner sc;
	public static void main(String[] args) {
		String StrToToggle, tCaseStr = "";
		
		sc= new Scanner(System.in);

		System.out.print("\nEnter Any String to Toggle Case =  ");
		StrToToggle = sc.nextLine();
				
		for(int i = 0; i < StrToToggle.length(); i++)  {
			if(Character.isUpperCase(StrToToggle.charAt(i)))  {
				tCaseStr +=  Character.toLowerCase(StrToToggle.charAt(i));
			}
			else if(Character.isLowerCase(StrToToggle.charAt(i))) {
				tCaseStr +=  Character.toUpperCase(StrToToggle.charAt(i));
			}
			else {
				tCaseStr += StrToToggle.charAt(i);
			}
		}

		System.out.println("\nThe Final String after Toggling all Characters =  " + tCaseStr);
	}
}
