package com.lloydstsb.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.lloydstsb.rest.valueobjecs.OrderListVo;
import com.lloydstsb.rest.valueobjecs.OrderVo;


@Path("/orders/")
public interface OrderInfo {

	@GET
	@Path("")
	public OrderListVo getAllOrders();
	
	@GET
	@Path("{orderId}")
	public OrderVo getOrder(@PathParam("orderId") int orderId);

}