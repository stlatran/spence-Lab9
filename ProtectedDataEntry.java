import java.util.Scanner;

public class ProtectedDataEntry
{
   /***********
    * Purpose: to continue asking the user for a value until they enter a double
    * Parameters: Scanner - the scanner used for input
    * Algorithm: while the user has not entered a double, read it in as a string and ask
         again.  Once the loop ends, read in a double.
    * Return: double - the read in value
    */
   public static double readDouble(Scanner scan)
   {
   	//Keep trying until they get it right
   	while(!scan.hasNextDouble())
   	{
   		String garbage = scan.nextLine();
   		System.out.println("Please enter the value as a real number");
   	}
      //They finally entered a number! Read it in and return it
   	return scan.nextDouble();
   }
   
    /***********
    * Purpose: to continue asking the user for a value until they enter an int
    * Parameters: Scanner - the scanner used for input
    * Algorithm: while the user has not entered an int, read it in as a string and ask
         again.  Once the loop ends, read in an int.
    * Return: int - the read in value
    */
   public static int readInt(Scanner scan)
   {
   	//Keep trying until they get it right
   	while(!scan.hasNextInt())
   	{
   		String garbage = scan.nextLine();
   		System.out.println("Please enter the value as an integer");
   	}
      //They finally entered a number! Read it in and return it
   	return scan.nextInt();
   }

   //////MORE methods should be here -- one for every type we could read in
   /////////such as, boolean, short, byte, etc.
}