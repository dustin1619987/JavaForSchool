// Start of code
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      // Add more variables as needed
      int count = 0; // Added a variable for the words to be counted
   
      userText = scnr.nextLine();  // Gets entire line, including spaces from userText.
      
      for (int i =0; i < userText.length(); i++) // for statement
      {
         if(userText.charAt(i) != ' ' && userText.charAt(i) != '.' && //if statement 
   userText.charAt(i) !=',')
            {
             count++;  //counts
            }
         }
         System.out.println(count); //output
      
   }
}
// End of code
