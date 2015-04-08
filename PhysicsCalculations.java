public class PhysicsCalculations
   {
   /*******************************************************
    * Purpose: to do the calculations for the first physics option (if an object is rolled off of a surface)
    * Parameters: double velocity, double height
    * Return: range
    * Algorithm: Calculate how far an object will roll based on height and velocity. Return the calculation answer
    */

   public static double distanceRolled (double velocity, double height)
   {
   double range = velocity*(Math.sqrt((2*height)/9.8));
   if (range<0) //while range is less than 0, give 0 as the answer
   range = 0;
   return range;
   }   
   
  
   /*******************************************************
    * Purpose: to do the calculations for the second physics option (if an object is thrown directly up into the air) 
    * Parameters: int time, double velocity
    * Return: y
    * Algorithm: Calculate how high the object will go based on its time in the air and its velocity. Return the calculation answer
    */
 
   public static double distanceUp (int time, double velocity)
   {
   double y = (velocity*time)-(0.5*9.8)*Math.pow(time,2);
   if (y<0)
      y=0;
   return y;
   }
   
  /*******************************************************
    * Purpose: to do the calculations for the third physics option (if an object is thrown directly up into the air)
    * Parameters: double theta, double velocity
    * Return: range
    * Algorithm: Calculate how far the object will go based on at which it is thrown as well as its velocity. Return the calculation answer

    */

   public static double distanceThrown (double theta, double velocity)
   {
   double sin = 0.0; //declare sin variable
   double cos = 0.0; //declare cos variable
   theta = Math.toRadians(theta); //use Math class to change theta to Radians
   double range = 0; //declare and initialize range to 0
   range = ((2*Math.pow(velocity,2))*Math.sin(theta)*Math.cos(theta))/9.8;
   return range;
   }
   }