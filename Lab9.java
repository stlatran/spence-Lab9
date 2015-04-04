
import java.util.Scanner;
public class Lab9
{
   
   
   public static void main (String [] args)
   {
      
      //declare scanner object to read in function choice by user
      Scanner scan = new Scanner(System.in);
      
      //announce method
      announce();
      
      int choice = menu(scan);

      outputAnswers(choice); //do whatever the menu choice said to do
    
    }    
   
   /********************************************************
    * Purpose: Read in the menu option from the user and return it
    * Parameters: Scanner for user input
    * Return: int, the menu choice
    * Algorithm: Tell the user the choices, and read in the value 
                  using protected data entry class
    */
   private static int menu(Scanner scan)
   {
      //Tell the user the menu options

      //Ask them which choice they would like to make

      //Read in their answer using ProtectedDataEntry

      //return their answer

   }

   /***********************************************
    * Purpose: Call the correct physics calculations methods for the correct values
    * Parameters: int, the menu choice given by the user
    * Return: none
    * Algorithm: given a particular menu choice, loop through the required input values
              and output the results to System.out from the physics calculations method.
              Also output a plot using the Plot class, of all of those values
    */
    private static void outputAnswers(int menu)
    {
        switch(menu)
        {
          //Add each case and the code you need for it
          case 0:
          
            break;
          default:
            System.out.println("Thanks for using the program! Good bye!");
        }

    }

}