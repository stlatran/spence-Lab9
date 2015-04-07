
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
      if (choice == -5)
         System.exit(1);

      outputAnswers(choice); //do whatever the menu choice said to do
    
    }
    
    private static void announce()
    {
    System.out.println("This program is meant to help Avagail understand the physics behind projectiles.");
    System.out.print("This program will be basing our calculations off of how far away something rolls if it n/ falls off of a desk, where an object is at a given time if it's thrown up in the n/ air and then caught, and how far something travels if it is thrown into n/ the air and lands at the same height as from where it was thrown. Input -5 when you want to stop the calculation.");    
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
     System.out.print("Hello. The menu options are byte, short, int, long, double, char, and boolean"); //Tell the user the menu options

     System.out.print("Which choice from the menu would you like to make?"); //Ask them which choice they would like to make

     ProtectedDataEntry.readDouble(scan); //Read in their answer using ProtectedDataEntry

     return menu(scan); //return their answer

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
          PhysicsCalculations.distanceRolled (range);
          Plot plot1 = new Plot("distance", 0, 50, 5, 0, 100, 5);
          {
          while (velocity == 5 && height == 20)
          System.out.print(range);
          while (velocity ==10 && height == 20)
          System.out.print(range);
          while (velocity == 15 && height == 20)
          System.out.print(range);
          while (velocity == 20 && height == 20)
          System.out.print(range);
          while (velocity == 25 && height == 20)
          System.out.print(range);
          while (velocity == 30 && height == 20)
          System.out.print(range);
          while (velocity == 35 && height == 20)
          System.out.print(range);
          while (velocity == 40 && height == 20)
          System.out.print(range);
          while (velocity == 45 && height == 20)
          System.out.print(range);
          while (velocity == 50 && height == 20)
          System.out.print(range);
          }
          System.out.print(plot1);
          break;
          
          case 1:
          PhysicsCalculations.distanceUp(time, velocity);
          Plot plot2 = new Plot("distance", 0, 10, 1, 0, 150, 10);
          {
          while ((time >= 1 || time <= 10)&&(velocity == 50))
          System.out.print(y);
          }
          System.out.print(plot2);
          
          break;
          
          case 2:
          PhysicsCalculations.distanceThrown (theta, velocity);
          Plot plot3 = new Plot("distance", 0, 100, 5, 0, 12, 2);
          {
          while (theta == 0 && velocity == 10)
          System.out.print(range);
          while (theta == 5 && velocity == 10)
          System.out.print(range);
          while (theta == 10 && velocity == 10)
          System.out.print(range);
          while (theta == 15 && velocity == 10)
          System.out.print(range);
          while (theta == 20 && velocity == 10)
          System.out.print(range);
          while (theta == 25 && velocity == 10)
          System.out.print(range);
          while (theta == 30 && velocity == 10)
          System.out.print(range);
          while (theta == 35 && velocity == 10)
          System.out.print(range);
          while (theta == 40 && velocity == 10)
          System.out.print(range);
          while (theta == 45 && velocity == 10)
          System.out.print(range);
          while (theta == 50 && velocity == 10)
          System.out.print(range);
          while (theta == 55 && velocity == 10)
          System.out.print(range);
          while (theta == 60 && velocity == 10)
          System.out.print(range);
          while (theta == 65 && velocity == 10)
          System.out.print(range);
          while (theta == 70 && velocity == 10)
          System.out.print(range);
          while (theta == 75 && velocity == 10)
          System.out.print(range);
          while (theta == 80 && velocity == 10)
          System.out.print(range);
          while (theta == 85 && velocity == 10)
          System.out.print(range);
          while (theta == 90 && velocity == 10)
          System.out.print(range);
          }
          Plot.addPoint(xvalue, yvalue);
          System.out.print(plot3);
          
          break;
          
          System.out.print(range);

          default:
            System.out.println("Thanks for using the program! Good bye!");
        }

    }

}