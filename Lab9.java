
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
    
    private static void announce()
    {
    System.out.println("This program is meant to help Avagail understand the physics behind projectiles.");
    System.out.print("This program will be basing our calculations off of how far away something rolls if it n/ falls off of a desk, where an object is at a given time if it's thrown up in the n/ air and then caught, and how far something travels if it is thrown into n/ the air and lands at the same height as from where it was thrown.");    
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
     System.out.print("Hello. The menu options are byte, short, int, long, double, char, and boolean") //Tell the user the menu options

     System.out.print("Which choice from the menu would you like to make?"); //Ask them which choice they would like to make

     ProtectedDataEntry //Read in their answer using ProtectedDataEntry

     return menu; //return their answer

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