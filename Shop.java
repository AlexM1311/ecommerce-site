package com.ecommerce.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
	
	/**
	 * Shop page.
	 * 
	 * Using a switch case statement 
	 * 
	 * Case 0: exit program
	 * 
	 * Case 1: Add product to shopping cart
	 * 
	 * Case 2: Remove product from shopping cart
	 */
public static void main(String[] args) {
	
	/** Item. */
    Item item;
    
	/** Product id. */
    int productID;
    
	/** Product name. */
    String productName;
    
	/** Product price. */
    double productPrice;
    
	/**Quantity. */
    int productQuantity;
   
	/** Switch option */
    int ch;
    
    /** Switch  */
    
    String choice;

    ShoppingCart shoppingCart = new ShoppingCart();

    Scanner s = new Scanner(System.in);// Scanner class allows the user to read values of various types
    
    List<Item> cart = new ArrayList<Item>();
    
    while (true) {
        System.out.println("Menu:");
        System.out.println("0) Exit " + "\n"
                + "1) Add item in shopping cart" + "\n"
                + "2) Remove item from shpping cart");
        ch = s.nextInt();

        try {
			switch (ch) {
			case 0:
			    System.out.println("\n" + "Good bye!");
			    System.exit(0);

			case 1:
			    System.out.println("Enter product Id: ");
			    productID = s.nextInt();

			    System.out.println("Enter product name");
			    productName = s.next();

			    System.out.println("Enter product price");
			    productPrice = s.nextDouble();

			    System.out.println("Enter quantity: ");
			    productQuantity = s.nextInt();

			    shoppingCart.add(productID, productName, productPrice,productQuantity);

			    break;
			 case 2:
		            System.out.println("The product that will be removed: ");
		            choice = s.next();
		            ShoppingCart.remove(choice);

		            break;

			}
		} catch (IndexOutOfBoundsException ioob) {
			// TODO Auto-generated catch block
			ioob.printStackTrace();
		}

    }
}
    

   
}
