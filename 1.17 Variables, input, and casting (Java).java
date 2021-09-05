// Start of my Code
import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt = 0;
      double userDouble = 0.0;
      // FIXME Define char and string variables similarly
      char userChar = 'a';
      String userString = "new string";
  
//Entering the inputs    
      System.out.println("Enter integer: "); //Intergers
      userInt = scnr.nextInt();
      
      System.out.println("Enter double: "); //Doubled
      userDouble = scnr.nextDouble();
      
      System.out.println("Enter character: ");  //Character
      userChar = scnr.next().charAt(0);
      
      System.out.println("Enter string: "); //String
      userString = scnr.next();
      
// Where the math/switching around starts and output for it
      System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
      System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
      System.out.println(userDouble + " cast to an integer is " + (int)userDouble);

      return;
   }
}

//End of my Code
