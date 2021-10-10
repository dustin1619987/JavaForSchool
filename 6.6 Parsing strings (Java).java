// Start of code
import java.util.Scanner;
 
public class ParseStrings {
 
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // Sanners
        String fullName, firstName, lastName; //Strings for the names
        String[] wordList;
        while (true) { //start of while and ifs
            while (true) {
                // ask and read a string
                System.out.println("Enter input string: ");
                fullName = scnr.nextLine();
                // if user enters q, then stop the program
                if (fullName.equals("q"))
                    return;
                // if string contains , then print each word
                if (fullName.contains(",")) {
                    break;
                }
                // if comma (,) was not in string,then print an error
                System.out.println("Error: No comma in string");
            }
            // split the name into words by commas(,)
            wordList = fullName.split(",");
            // get both words (after trimming the spaces)
            firstName = wordList[0].trim(); //trimming for wordlist 0
            lastName = wordList[1].trim(); //trimming for worlist 1
            // print the words
            System.out.println("First word: " + firstName);
            System.out.println("Second word: " + lastName);
            System.out.println(""); // adds the extra line that is needed
            // print a new line, and continue the loop to get another word
            System.out.println();
        }
    }
}
// end of code
