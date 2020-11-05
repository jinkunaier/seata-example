package io.seata.sample.controller;

import io.seata.sample.entity.Storage;
import io.seata.sample.service.StorageService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IT云清
 */
@RestController
@RequestMapping("storage")
public class StorageController {

	@Autowired
	private StorageService storageServiceImpl;

	/**
	 * 扣减库存
	 * 
	 * @param productId
	 *            产品id
	 * @param count
	 *            数量
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("decrease")
	public String decrease(@RequestBody Map<String, Integer> products) throws Exception {
		storageServiceImpl.decrease(products);
		return "Decrease storage success";
	}
	
	@RequestMapping("create")
	public String create(Storage storage) throws Exception {
		storageServiceImpl.create(storage);
		return "Decrease storage success";
	}
}
