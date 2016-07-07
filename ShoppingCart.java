package com.ecommerce.cart;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Scanner;

/**
 * Shopping Cart page.
 * 
 * Functionalities:
 *  1) add the products to the cart and calculate the totalprice of the order 
 *  2) increase the size for the capacity of the order
 *
 */

public class ShoppingCart {

	/** Counter for the number of products */
	private int productCount;
	/** Total price of the order */
	private double totalPrice;

	/** The number of products from cart */
	private static int amountOfItems;

	private static Item[] cart = new Item[amountOfItems];

	/**
	 * 
	 * Adds a product to the ShoppingCart product list.
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

		cart[productCount] = item;
		productCount += 1;
		if (productCount == amountOfItems) {
			increaseSize(amountOfItems);
			System.out.println("\n" + "The amount of items " + amountOfItems);
		}
	}


	private void increaseSize(int amountOfItems) {
		Item[] item = new Item[amountOfItems + 3];
		for (int i = 0; i < amountOfItems; i++) {
			item[i] = cart[i];
		}
		cart = item;
		item = null;
		amountOfItems = cart.length;
		System.out.println("\n" + "The amount of items " + amountOfItems);
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public static int getCapacity() {
		return amountOfItems;
	}

	public static void setCapacity(int capacity) {
		ShoppingCart.amountOfItems = capacity;
	}

	public static Item[] getCart() {
		return cart;
	}

	public static void setCart(Item[] cart) {
		ShoppingCart.cart = cart;
	}

}
