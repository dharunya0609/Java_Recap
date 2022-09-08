Class GFG
{
 
// Function to return the word
// of the corresponding digit

Static void printValue(char digit)
{
 

    // Switch block to check for each digit c

    Switch (digit)

    {
 

    // For digit 0

    Case ‘0’:

        System.out.print(“Zero “);

        Break;
 

    // For digit 1

    Case ‘1’:

        System.out.print(“One “);

        Break;
 

    // For digit 2

    Case ‘2’:

        System.out.print(“Two “);

        Break;
 

    // For digit 3

    Case ‘3’:

        System.out.print(“Three “);

        Break;
 

    // For digit 4

    Case ‘4’:

        System.out.print(“Four “);

        Break;
 

    // For digit 5

    Case ‘5’:

        System.out.print(“Five “);

        Break;
 

    // For digit 6

    Case ‘6’:

        System.out.print(“Six “);

        Break;
 

    // For digit 7

    Case ‘7’:

        System.out.print(“Seven “);

        Break;
 

    // For digit 8

    Case ‘8’:

        System.out.print(“Eight “);

        Break;
 

    // For digit 9

    Case ‘9’:

        System.out.print(“Nine “);

        Break;

    }
}
 
// Function to iterate through every
// digit in the given number

Static void printWord(String N)
{

    Int I, length = N.length();
 

    // Finding each digit of the number

    For (I = 0; I < length; i++)

    {
 

        // Print the digit in words

        printValue(N.charAt(i));

    }
}
 
// Driver code

Public static void macFGin(String[] args)
{

    String N = “123”;

    printWord(N);
}
}
 


