public class PhysicsCalculations
   {
   
   public static double distanceRolled (double velocity, double height)
   {
   double range = velocity*Math.sqrt((2*height)/9.8);
   }
   
    
   public static double distanceUp (int time, double velocity)
   {
   double y = velocity*time-0.5*9.8*Math.pow(time,2);
   if (y<0)
      y=0;
   }
   
  
   public static double distanceThrown (double theta, double velocity)
   {
   double sin = 0.0;
   double cos = 0.0;
   theta = Math.toRadians(theta);
   double range = ((2*Math.pow(velocity,2))*Math.sin(theta)*Math.cos(theta))/9.8;
   }
   }