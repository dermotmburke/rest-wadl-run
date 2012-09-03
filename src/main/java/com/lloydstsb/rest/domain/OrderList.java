package com.lloydstsb.rest.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
	
	private List <Order> orders = new ArrayList<Order>();
 
    public List<Order> getOrders() {
        if (orders == null) {
            orders = new ArrayList<Order>();
        }
        return this.orders;
    }   
}