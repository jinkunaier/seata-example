package io.seata.sample.service;

import java.util.Map;

import io.seata.sample.entity.Storage;

/**
 * @author IT云清
 */
public interface StorageService {

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
	void decrease(String productId, Integer count) throws Exception;

	/**
	 * 扣减库存
	 * 
	 * @param products
	 * @throws Exception
	 */
	void decrease(Map<String, Integer> products) throws Exception;

	/**
	 * 新增库存
	 * 
	 * @param storage
	 * @throws Exception 
	 */
	void create(Storage storage) throws Exception;
}
