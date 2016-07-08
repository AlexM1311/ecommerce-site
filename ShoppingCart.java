package com.ecommerce.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

/**
 * Shopping Cart page.
 * 
 * Functionalities:
 * 
 *  1) add the products to the cart and calculate the totalprice  of the order
 *  2) increase the size for the capacity of the order
 *  3) remove the product from the shopping cart
 *
 */

public class ShoppingCart {

	/** Total price of the order */
	private double totalPrice;

	/** The number of products from cart */
	private static int amountOfItems;

	private static List<Item> cart = new ArrayList<Item>();

	/**
	 * 
	 * Add a product to the ShoppingCart product list.
	 * 
	 * @param productID
	 * @param productName
	 * @param productPrice
	 * @product productQuantity
	 */

	public void add(int productID, String productName, double productPrice, int productQuantity) {
		Item item = new Item(productID, productName, productPrice, productQuantity);
		totalPrice += (productPrice * productQuantity);
		System.out.println("\n" + "The total price of the order " + totalPrice);

		cart.add(item);
		amountOfItems = cart.size();
		System.out.println("\n" + "The amount of items " + amountOfItems);

	}
	
	/**
	 * 
	 * Remove a product to the ShoppingCart product list 
	 * 
	 * @param productName
	 */

	public static void remove(String productName) {

		for (int i = 0; i < amountOfItems; i++) {
			System.out.println("\n" + "The amount of items " + amountOfItems);
			Item remove = (Item) cart.get(i);

			if (productName.equals(remove.getName())) {
				System.out.println("\n" + "The product name " + productName);
				cart.remove(i);
				amountOfItems = cart.size();
				System.out.println("\n" + "The amount of items " + amountOfItems);
			}
		}

	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public static int getAmountOfItems() {
		return amountOfItems;
	}

	public static void setAmountOfItems(int amountOfItems) {
		ShoppingCart.amountOfItems = amountOfItems;
	}

	public static void setCart(List<Item> cart) {
		ShoppingCart.cart = cart;
	}

}
