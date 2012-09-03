package com.lloydstsb.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.dozer.DozerBeanMapper;

import com.lloydstsb.rest.domain.Address;
import com.lloydstsb.rest.domain.Order;
import com.lloydstsb.rest.domain.OrderList;
import com.lloydstsb.rest.exception.NotFoundException;
import com.lloydstsb.rest.valueobjecs.OrderListVo;
import com.lloydstsb.rest.valueobjecs.OrderVo;


public class OrderInfoImpl implements OrderInfo {
 
	OrderList list = new OrderList();
 
    public OrderInfoImpl(){
        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setItemName("Soap");
        order1.setQuantity(120);
        order1.setCustomerName("Sandeep");

        list.getOrders().add(order1);
 
        Order order2 = new Order();
        order2.setOrderId(2);
        order2.setItemName("Shampoo");
        order2.setQuantity(50);
        order2.setCustomerName("Sandeep");
        Address address = new Address();
        address.setCity("Glasgow");
        address.setPostCode("G52 4AF");
        address.setAddress("106 Kelhead Avenue");
        order2.setShippingAddress(address);
        
        list.getOrders().add(order2);
    }
 
    @Override
    public OrderListVo getAllOrders() {
    	List myMappingFiles = new ArrayList();
    	myMappingFiles.add("dozer.xml");
    	DozerBeanMapper mapper = new DozerBeanMapper();
    	mapper.setMappingFiles(myMappingFiles);
    	OrderListVo destObject =  mapper.map(list, OrderListVo.class);
        return destObject;
    }
    
    @Override
    public OrderVo getOrder(int orderId){
		OrderListVo allOrders = this.getAllOrders();
		for(OrderVo order : allOrders.getOrders()){
			if(order.getOrderId() == orderId){
				return order;
			}
		}
		throw new NotFoundException();
	}
}