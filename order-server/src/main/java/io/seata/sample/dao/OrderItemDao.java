package io.seata.sample.dao;

import io.seata.sample.entity.OrderItem;

import org.springframework.stereotype.Repository;

/**
 * @author IT云清
 */
@Repository
public interface OrderItemDao {

	/**
	 * 创建订单项
	 * 
	 * @param orderItem
	 * @return
	 */
	void create(OrderItem orderItem);
}
