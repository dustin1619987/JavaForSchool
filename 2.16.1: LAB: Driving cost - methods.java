//Start of my code
import java.util.Scanner;

public class LabProgram {
 //Defining the variables 
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {

// Math returning      
      return (dollarsPerGallon * drivenMiles) / milesPerGallon;
   }
 // Taking input  
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double milesPerGallon = sc.nextDouble();
      double dollarsPerGallon = sc.nextDouble();
     
   
// Output each floating-point value with two digits after the decimal point 
    System.out.printf("%.2f ", drivingCost(10,milesPerGallon,dollarsPerGallon));  
    System.out.printf("%.2f ", drivingCost(50,milesPerGallon,dollarsPerGallon));
    System.out.printf("%.2f\n", drivingCost(400,milesPerGallon,dollarsPerGallon));
   }
}
//End of my code
