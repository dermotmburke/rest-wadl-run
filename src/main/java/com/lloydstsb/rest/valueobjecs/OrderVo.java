package com.lloydstsb.rest.valueobjecs;

public class OrderVo {
	
	private int orderId;
	private String itemName;
	private int quantity;
	private String customerName;
	private AddressVo shippingAddress;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public AddressVo getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressVo shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
