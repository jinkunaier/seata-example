package io.seata.sample.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author IT云清
 */
@FeignClient(value = "order-server")
public interface OrderApi {

	/**
	 * 修改订单状态
	 * 
	 * @param orderId
	 * @param status
	 * @return
	 */
	@RequestMapping("/order/update")
	String update(@RequestParam("orderId") String orderId, @RequestParam("status") Integer status);
}
