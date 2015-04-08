/**********************************************
Programmers: Spence Latran
Course: CS 201.02
Date: 4/07/15
Programming Assignment: Lab 9
Problem Statement: Assist in doing different physics calculations and put their trajectories onto a graph.
Data In: The physics option (0, 1, or 2)
Data Out: The points on a graph, the graph itself, and a prompt for the user to go again.
Other classes needed to compile: PhysicsCalculations.java, ProtectedDataEntry.java, Plot.java.
Credits: Class Notes 22-25
*********************************************/

import java.util.Scanner;
public class Lab9
{
   public static void main (String [] args)
   {
      
      //declare scanner object to read in function choice by user
      Scanner scan = new Scanner(System.in);
      
      //announce method
      announce();
      
      int choice = menu(scan); // declare choice variable
      while (choice != -5) //while choice is not equal to -5
      {
         outputAnswers(choice); //do whatever the menu choice said to do
         choice = menu(scan);
      }
      System.exit(1);
    }
    
    /*******************************************************
    * Purpose: announce to the user what the program does.
    * Parameters: NONE
    * Return: NONE
    * Algorithm: Tell the user what the purpose of our program is. Explain how the program runs and its different options in prose. 
    */
    private static void announce()
    {
    System.out.println("This program is meant to help Avagail understand the physics behind projectiles.");
    System.out.print("This program will be basing our calculations off of how far away something rolls if it falls off of a desk, where an object is at a given time \n if it's thrown up in the air and then caught, and how far something travels if it is thrown into the air and lands at the same height as from \n where it was thrown. Input -5 when you want to stop the calculation.");    
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
     System.out.print("\n Hello. The menu options are 0 (for Roll, 1 (for Toss up), or 2 (for Throw)"); //Tell the user the menu options

     System.out.println("\n Which choice from the menu would you like to make?"); //Ask them which choice they would like to make

     int choice = ProtectedDataEntry.readInt(scan); //Read in their answer using ProtectedDataEntry

     return choice; //return their answer

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
            double velocity = 0; //declare velocity variable
            double height = 0; //declare height variable
            Plot plot1 = new Plot("distance", 0, 50, 5, 0, 100, 5); //first option for physics
            for(velocity = 5; velocity<=50; velocity+=5) // recurring "for" loop
            {
               height = 20;
               double physics = PhysicsCalculations.distanceRolled(velocity, height);
               System.out.print(physics);
               plot1.addPoint(velocity, physics);
            }
            break;
            
          case 1: //second option for physics
            int time = 0; //declare and initialize time variable to 0
            velocity = 0; //initialize velocity to 0
            Plot plot2 = new Plot("distance", 0, 10, 1, 0, 150, 10);
            for(time = 1; time<=10; time++) //recurring "for" loop
               {
               velocity = 50;
               double physics = PhysicsCalculations.distanceUp(time, velocity);
               System.out.print(physics);
               plot2.addPoint(time, physics);
            }
            break;
            
          case 2: //third option for physics
            double theta = 0; //declare theta variable for degrees (Radians)
            velocity = 0; //declare velocity variable
            Plot plot3 = new Plot("distance", 0, 100, 5, 0, 12, 2);
            for(theta = 0; theta<=90; theta+=5) //recurring "for" loop
               {
               velocity = 10;
               double physics = PhysicsCalculations.distanceThrown(theta, velocity);
               System.out.print(physics);
               plot3.addPoint(theta,physics);
               }
             break;
            
             
          default: //default option
            System.out.println("Thanks for using the program! Good bye!");
      }
        
   }
}