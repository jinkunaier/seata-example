package io.seata.sample.feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "storage-server")
public interface StorageApi {

	/**
	 * 扣减库存
	 * 
	 * @param products
	 *            key:productId,value:count
	 * @return
	 */
	@GetMapping(value = "/storage/decrease")
	String decrease(@RequestBody Map<String, Integer> products);
}
