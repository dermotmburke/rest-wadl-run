package com.lloydstsb.rest.valueobjecs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "OrderList")
public class OrderListVo {
    
	private List <OrderVo> orders = new ArrayList<OrderVo>();

    @XmlElement(name = "order")
	public List<OrderVo> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderVo> orders) {
		this.orders = orders;
	}
}