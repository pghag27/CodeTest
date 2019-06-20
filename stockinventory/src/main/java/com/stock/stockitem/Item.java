package com.stock.stockitem;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	private String itemId;
	private String itemName;
	private double itemPrice;
	private String itemInvCode;
	private int quantity;
	


	public Item(){
		
	}
	
	public Item(String itemId, String itemName, double itemPrice, String itemInvCode, int quantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemInvCode = itemInvCode;
		this.quantity= quantity;
	}
	
	public String getitemId() {
		return itemId;
	}
	
	public void setitemId(String itemId) {
		this.itemId = itemId;
	}
	
	
	public String getitemName() {
		return itemName;
	}
	
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getitemPrice() {
		return itemPrice;
	}
	
	public void setitemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	public String getitemInvCode() {
		return itemInvCode;
	}
	
	public void setitemInvCode(String itemInvCode) {
		this.itemInvCode = itemInvCode;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
