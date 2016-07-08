package com.ecommerce.cart;

/**
 * Item page.
 * 
	 * 
	 * @param productID
	 * @param productName
	 * @param productPrice
	 * @product productQuantity
 *
 */
public class Item {

	/** Product id. */

	private int id;

	/** Product name. */

	private String name;
	
	 /** Product price. */

	private double price;
	
	/** Product quantity */

	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	
	 * Item page.
	 * @param productID
	 * @param productName
	 * @param productPrice
	 * @product productQuantity
	  */
	
	public Item (int productID, String productName, double productPrice, int productQuantity){
	    id = productID;
	    name = productName;
	    price = productPrice;
	    quantity = productQuantity;
	
	}

}
