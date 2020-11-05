package io.seata.sample.controller;

import io.seata.sample.entity.Order;
import io.seata.sample.entity.OrderItem;
import io.seata.sample.service.OrderService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.core.util.IdUtil;

@RestController
@RequestMapping(value = "order")
public class OrderController {

	@Autowired
	private OrderService orderServiceImpl;

	/**
	 * 创建订单
	 * 
	 * @param order
	 * @return
	 */
	@GetMapping("create")
	public String create() {
		Order order = buildOrder();
		orderServiceImpl.create(order);
		return "Create order success";
	}

	private Order buildOrder() {
		Order order = new Order();
		order.setId(IdUtil.simpleUUID());
		order.setOrderDate(new Date());
		order.setUserId("USR001");
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		orderItems.add(buildOrderItem("PROD001", 5, new BigDecimal(80)));
		orderItems.add(buildOrderItem("PROD002", 21, new BigDecimal(170)));
		order.setOrderItems(orderItems);
		return order;
	}

	private OrderItem buildOrderItem(String productId, Integer count, BigDecimal money) {
		OrderItem orderItem = new OrderItem();
		orderItem.setId(IdUtil.simpleUUID());
		orderItem.setCount(count);
		orderItem.setProductId(productId);
		orderItem.setMoney(money);
		return orderItem;
	}

	/**
	 * 修改订单状态
	 * 
	 * @param orderId
	 * @param status
	 * @return
	 */
	@RequestMapping("update")
	String update(@RequestParam("orderId") String orderId, @RequestParam("status") Integer status) {
		orderServiceImpl.update(orderId, status);
		return "订单状态修改成功";
	}

	/**
	 * 根据ID获取订单详情
	 * 
	 * @param orderId
	 * @param status
	 * @return
	 */
	@RequestMapping("selectById")
	public Order update(@RequestParam("orderId") String orderId) {
		return orderServiceImpl.selectById(orderId);
	}
}
