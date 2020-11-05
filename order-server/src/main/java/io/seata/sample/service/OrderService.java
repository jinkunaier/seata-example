package io.seata.sample.service;

import io.seata.sample.entity.Order;

/**
 * @author IT云清
 */
public interface OrderService {

	/**
	 * 创建订单
	 * 
	 * @param order
	 * @return
	 */
	void create(Order order);

	/**
	 * 修改订单状态
	 * 
	 * @param orderId
	 * @param status
	 */
	void update(String orderId, Integer status);
	
	/**
	 * 根据ID获取订单详情
	 * 
	 * @param orderId
	 */
	Order selectById(String orderId);
}
