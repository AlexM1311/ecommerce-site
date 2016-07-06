package com.ecommerce.cart;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class ShoppingCart {

	private int productCount;
	private double totalPrice;
	private static int amountOfItems;
	private static Item[] cart = new Item[amountOfItems];

	
	

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
