package io.seata.sample.service;

import io.seata.sample.dao.AccountDao;
import io.seata.sample.entity.Account;
import io.seata.sample.feign.OrderApi;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author IT云清
 */
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private OrderApi orderApi;

	/**
	 * 扣减账户余额
	 * 
	 * @param userId
	 *            用户id
	 * @param money
	 *            金额
	 * @throws Exception 
	 */
	@Override
	public void decrease(String userId, BigDecimal money, String orderId) throws Exception {
		Account account = accountDao.getUserAccount(userId);
		if (account.getResidue().compareTo(money) < 0) {
			throw new Exception("账户余额不足");
		}
		LOGGER.info("------->扣减账户开始account中");
		accountDao.decrease(userId, money);
		LOGGER.info("------->扣减账户结束account中");
		// 修改订单状态，此调用会导致调用成环
		LOGGER.info("修改订单状态开始");
		String mes = orderApi.update(orderId, 1);
		LOGGER.info("修改订单状态结束：{}", mes);
	}
}
