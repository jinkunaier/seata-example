package io.seata.sample.entity;

import java.util.Date;
import java.util.List;

/**
 * 订单
 * 
 * @author IT云清
 */
public class Order {

	private String id;

	private String userId;

	private List<OrderItem> orderItems;

	private Date orderDate;

	/** 订单状态：0：创建中；1：已完结 */
	private Integer status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
