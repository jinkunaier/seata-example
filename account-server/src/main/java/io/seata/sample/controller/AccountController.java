package io.seata.sample.controller;

import io.seata.sample.service.AccountService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IT云清
 */
@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService accountServiceImpl;

	/**
	 * 扣减账户余额
	 * 
	 * @param userId
	 *            用户id
	 * @param money
	 *            金额
	 * @param orderId
	 *            扣减订单id
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("decrease")
	public String decrease(@RequestParam("userId") String userId, @RequestParam("money") BigDecimal money,
			@RequestParam("orderId") String orderId) throws Exception {
		accountServiceImpl.decrease(userId, money, orderId);
		return "Account decrease success";
	}
}
