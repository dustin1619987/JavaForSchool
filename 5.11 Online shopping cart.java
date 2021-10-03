//Start of ItemToPurchase Code
public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   public ItemToPurchase() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
      return;
   }

   //public member methods (mutators & accessors)
   
   //setName() & getName() 

   public void setName(String name) { 
      itemName = name;
      return;
   }

   public String getName() {
      return itemName;
   }

   
   

   //setPrice() & getPrice() 
   public void setPrice(int price) {
      itemPrice = price;
      return;
   }
 
   public int getPrice() {
      return itemPrice;
   }

   
   //setQuantity() & getQuantity() 
   public void setQuantity(int quantity) {
      itemQuantity = quantity;
      return;
   }
   
   public int getQuantity() {
      return itemQuantity;
   }

   
   //print item to purchase
   
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}
//End of ItemToPurchase



//Start of ShoppingCartPrinter
import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      // item one information
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      
      
      System.out.println("Enter the item price: "); //price
      productPrice = scnr.nextInt();
      
      
      System.out.println("Enter the item quantity: "); //quantity
      productQuantity = scnr.nextInt();
      
      System.out.println("");
      item1.setName(productName);
      item1.setPrice(productPrice);
 
      // Get item 2 details from user, create itemToPurchase object
      item1.setQuantity(productQuantity);
      
      // item two information      
      System.out.println("Item 2");
      System.out.println("Enter the item name: "); //name
      scnr.nextLine();
      productName = scnr.nextLine();
      
      System.out.println("Enter the item price: "); //Price
      productPrice = scnr.nextInt();
      
      System.out.println("Enter the item quantity: "); //Quantity
      productQuantity = scnr.nextInt();
      
      System.out.println("");
      item2.setName(productName);
      item2.setPrice(productPrice);
      item2.setQuantity(productQuantity);
      
      // cartTotal = item one price + item two price      
      cartTotal = (item1.getPrice() * item1.getQuantity()) +
      (item2.getPrice() * item2.getQuantity());
      
      // Totoal Cost      
      System.out.println("TOTAL COST");
      // Add costs of two items and print total     
      System.out.println(item1.getName() + " " + item1.getQuantity() +
      " @ $" + item1.getPrice() + " = $" +
      (item1.getPrice() * item1.getQuantity()));
      
      System.out.println(item2.getName() + " " + item2.getQuantity() + 
      " @ $" + item2.getPrice() + " = $" +

      // Total output
      (item2.getPrice() * item2.getQuantity()));
      
      System.out.println("");
      
      System.out.println("Total: $" + cartTotal);

      return;
   }
}
//end of ShoppingCartPrinter
