import java.util.Scanner;
import java.lang.NumberFormatException;  //import this for exceptions!!! Note to self don't forget this
public class Paint1 {

   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       double wallHeight = 0.0;
       double wallWidth = 0.0;
       double wallArea = 0.0;
       double gallonsPaintNeeded = 0.0;

       final double squareFeetPerGallons = 350.0;
//-------------------------------------------------------------------Start of changing a lot
       // Implement a do-while loop to ensure input is valid
       // Prompt user to input wall's height

//add exception to handle and validate input
  do {
		try {
		 System.out.println("Enter wall height in feet: ");
		  wallHeight = Double.parseDouble(scnr.nextLine());
//if hieght is <= 0 print invalid
		if(wallHeight <= 0)
		      System.out.println("You have entered a invalid number. Please try again!");
// else breaks loop
		else
		     break;
//catch exception e 
		}
		catch(NumberFormatException   e) {
		 System.out.println("You have entered a invalid number. Please try again!");
//while loop
		}
              } while(true);

       // Implement a do-while loop to ensure input is valid
       // Prompt user to input wall's width

//add exception to handle and validate input

//Do and Try
	do {

	try {
	System.out.println("Enter wall width in feet: ");
//double
	wallWidth = Double.parseDouble(scnr.nextLine());
// If wall is <= it will output invalid number
	if(wallWidth <= 0)

	  System.out.println("You have entered a invalid number. Please try again!");
// else breaks loop
	else
	   break;


	}
//using catch to find numberformat exception e
		  catch(NumberFormatException   e) {
				  System.out.println("You have entered a invalid number. Please try again!");

	}
//while loop
	} while(wallWidth <= 0);


//------------------------------------------------------------------End of changing a lot
       // Calculate and output wall area
       wallArea = wallHeight * wallWidth;

       // add wallArea to output
       System.out.println("Wall area: "+wallArea+" square feet");

       // Calculate and output the amount of paint (in gallons) needed to paint the wall
       gallonsPaintNeeded = wallArea/squareFeetPerGallons;

       // correct name to be gallonsPaintNeeded instead gallonspaintneeded
       System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

   }
}
