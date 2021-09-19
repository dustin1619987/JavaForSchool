//Start of code
import java.util.Scanner;

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      //Variables
      int arrowBaseHeight = 0;
      int arrowBaseWidth = 0;
      int arrowHeadWidth = 0;
      int a; //for faster simpler code 
      int b; //for faster simpler code
      
      System.out.println("Enter arrow base height: "); //Whats being shown
      arrowBaseHeight = scnr.nextInt();//Input for arrow bade height
      
      System.out.println("Enter arrow base width: "); //Whats being shown
      arrowBaseWidth = scnr.nextInt();//Input for arrow base width
      
      System.out.println("Enter arrow head width: "); //Whats being shown
      arrowHeadWidth = scnr.nextInt(); //Input for arrow head width
      
      //While loop
      while (arrowHeadWidth <= arrowBaseWidth){
         System.out.println("Enter arrow head width: "); 
         arrowHeadWidth = scnr.nextInt(); //Input for arrow head width while loop
         }
         
      //for > arrowBaseHeight
      for (a=0; a<arrowBaseHeight; a++){
         for (b=1; b<arrowBaseWidth; b=b+1){
            System.out.print("*"); //What the program prints out
         }
         System.out.println("*"); //What the program prints out
      }
      
      //for > arrowHeadWidth
      for(a=arrowHeadWidth-1; a>=0; a=a-1){
         for(b=a; b>0; b=b-1){
            System.out.print("*"); //What the program prints out
         }
         System.out.println("*"); //What the program prints out
      }
      return;
   }
}
//end of code
