import java.util.Scanner;

Public class main {

	public static void main(String[] args) {
		// Declare a variables
		String str = null;

		Scanner sc = new Scanner(System.in);
		// Accept any string from user
		System.out.print(“Enter any String: “);
		Str = sc.nextLine();
		// Convert String to lower case letter
		Str = str.toLowerCase();

		// Print all vowels
		System.out.print(“Vowels in the given String are:”);
		// For loop to iterate String
		for (int I = 0; I < str.length(); i++) {
			// Check a character is vowel or not
			if (str.charAt(i) == ‘a’ || str.charAt(i) == ‘e’ || str.charAt(i) == ‘I’ || str.charAt(i) == ‘o’
					|| str.charAt(i) == ‘u’) {
				// Display each vowel
				System.out.print(“ “ + str.charAt(i));
			}
		}

	}

}
