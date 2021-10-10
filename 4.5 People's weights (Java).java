//Start of code
import java.util.Scanner; //Imports inputs scanner

//Start of Public class PeopleWeights
public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); //scanning inputs
//Variables
      int Number = 5; 
      double[] userVals = new double[Number];
      int a; 
      int b;
      //for: the enter weight
      for (a=0;a<Number;++a){
         System.out.println("Enter weight " + (a+1) + ": "); //Enter weight for loop
         userVals[a] = scnr.nextDouble();
      }
      System.out.println("");//print blank line
      System.out.print("You entered: ");//Outputs the You entered:
      for (a=0;a<Number;++a){
         System.out.print(userVals[a]+" ");//Output user
         }
         System.out.println("");
         double totalWeight = 0.0; //double weight
         for (a=0;a<Number;++a){
            totalWeight += userVals[a];
         }
         System.out.println("Total weight: " + totalWeight); //output Totalweight
         double averageWeight = 0.0; // double averageWeight
         averageWeight = totalWeight / Number; // averageweight is = to totalweight divided by number
         System.out.println("Average weight: " + averageWeight); //output averageWeight
         double maxWeight = userVals[0];{ // double maxweight which = uservals[0]
         for (a=0;a<Number;++a) //for statement
            if (userVals[a] > maxWeight){ //if statement for uservals a > maxweight
               maxWeight = userVals[a];
            }
         }
 System.out.println("Max weight: " + maxWeight); //output 

 return;
   }
 }
 //End of Code
