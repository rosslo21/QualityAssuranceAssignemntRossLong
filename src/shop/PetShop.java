package shop;
import java.util.Scanner;

/**
 * 
 *This file has been developed to display and give examples of the coding conventions set
 *out in the handbook.
 *
 *This simple program is an inventory control systems that loops through a pet shops stock of tennis 
 *balls and dog food, notifying the user when the product runs out of stock. 
 * 
 *
*/

public class PetShop {
	
	 static Scanner scan = new Scanner(System.in); //This creates a scanner object 
	 public static void main(String args[]) {
		 
		 int tennisBalls = 10;
		 int dogFood = 2;
	 
	    for(int i = 0 ; i <= tennisBalls && i <= dogFood; i++ ) { //This for loop loops through stock until stock is gone
		 
		System.out.println("What do product would you like to buy ? Please Enter 1 for tennis balls OR 2 for dog Food");
		String productChoice = scan.nextLine();
		 
		if (productChoice.equalsIgnoreCase("1")) {
			
			tennisBalls = tennisBalls - 1;
			
		}else if(productChoice.equalsIgnoreCase("2")) {
			 
			 dogFood = dogFood - 1;
			 
		}else System.out.println("INVALID ENTERY!!! Enter 1 or 2");
		 
		if (tennisBalls < 10 || dogFood < 10) {
			
			  System.out.println("There are " + tennisBalls + " tennis balls left");
			  System.out.println("There are " + dogFood + " bags of dog food left");
			  
		}
	 }
	    
	    if (tennisBalls == 0) {
	       
	       String answer;
		   System.out.println("Tennis balls are out of stock");
		   System.out.println("Would you like to restock ?");
		   answer = scan.nextLine();
		   
		   if(answer.equalsIgnoreCase("yes")) {
			   tennisBalls = tennisBalls + 10;
		   }
		   
		   
		   
	    }else if(dogFood == 0) {
	    	
		   System.out.println("Dog Food is out of stock");
		   
		   String answer;
		   System.out.println("Dog food is out of stock");
		   System.out.println("Would you like to restock ?");
		   answer = scan.nextLine();
		   
		   if(answer.equalsIgnoreCase("yes")) {
			   dogFood = dogFood  + 10;
		   }
	   }
	    
	    
	   
	  }
	 


}
