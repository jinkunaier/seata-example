package io.seata.sample.dao;

import io.seata.sample.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author IT云清
 */
@Repository
public interface OrderDao {

	/**
	 * 创建订单
	 * 
	 * @param order
	 * @return
	 */
	void create(Order order);

	/**
	 * 修改订单金额
	 * 
	 * @param orderId
	 * @param status
	 */
	void update(@Param("orderId") String orderId, @Param("status") Integer status);

	/**
	 * 根据ID获取订单详情
	 * 
	 * @param orderId
	 * @param status
	 */
	Order selectById(@Param("orderId") String orderId);
}
