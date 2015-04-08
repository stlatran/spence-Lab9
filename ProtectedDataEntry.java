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

    /***********
    * Purpose: to continue asking the user for a value until they enter a boolean
    * Parameters: Scanner - the scanner used for input
    * Algorithm: while the user has not entered a boolean, read it in as a string and ask
         again.  Once the loop ends, read in a boolean.
    * Return: boolean - the read in value
    */

   public static boolean readBoolean(Scanner scan)
   {   
      while(!scan.hasNextBoolean())//keep trying until they enter it correctly
      {
         String garbage = scan.nextLine();
         System.out.println("Please enter the value as a boolean variable");
      }
      
      return scan.nextBoolean();
   }
   
    /***********
    * Purpose: to continue asking the user for a value until they enter a byte
    * Parameters: Scanner - the scanner used for input
    * Algorithm: while the user has not entered a byte, read it in as a string and ask
         again.  Once the loop ends, read in a byte.
    * Return: byte - the read in value
    */

   public static byte readByte(Scanner scan)
    {
      while(!scan.hasNextByte()) //keep trying until they enter it correctly
      {
         String garbage = scan.nextLine();
         System.out.println("Please enter the value as a byte");
      }
      
      return scan.nextByte();
   }
   
    /***********
    * Purpose: to continue asking the user for a value until they enter a short
    * Parameters: Scanner - the scanner used for input
    * Algorithm: while the user has not entered a short, read it in as a string and ask
         again.  Once the loop ends, read in a short.
    * Return: short - the read in value
    */

   public static short readShort(Scanner scan)
     {
      while(!scan.hasNextShort()) //keep trying until they get it right
      {
         String garbage = scan.nextLine();
         System.out.println("Please enter the value as a short");
      }
      
      return scan.nextShort();
   }
   
    /***********
    * Purpose: to continue asking the user for a value until they enter a long
    * Parameters: Scanner - the scanner used for input
    * Algorithm: while the user has not entered an long, read it in as a string and ask
         again.  Once the loop ends, read in a long.
    * Return: long - the read in value
    */

   public static long readLong(Scanner scan)
     {
      while(!scan.hasNextLong()) //keep trying until they get it right
      {
         String garbage = scan.nextLine();
         System.out.println("Please enter the value as a Long");
      }
      
      return scan.nextLong();
   }
   
   }
   