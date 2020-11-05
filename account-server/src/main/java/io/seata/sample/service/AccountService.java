package io.seata.sample.service;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
public interface AccountService {

	/**
	 * 扣减账户余额
	 * 
	 * @param userId
	 *            用户id
	 * @param money
	 *            金额
	 * @param orderId
	 *            扣减订单
	 * @throws Exception 
	 */
	public void decrease(String userId, BigDecimal money, String orderId) throws Exception;
}
