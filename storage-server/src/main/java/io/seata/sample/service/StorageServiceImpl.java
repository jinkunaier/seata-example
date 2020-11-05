package io.seata.sample.service;

import io.seata.sample.dao.StorageDao;
import io.seata.sample.entity.Storage;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("storageServiceImpl")
public class StorageServiceImpl implements StorageService {

	private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

	@Autowired
	private StorageDao storageDao;

	/**
	 * 扣减库存
	 * 
	 * @param productId
	 *            产品id
	 * @param count
	 *            数量
	 * @return
	 */
	@Override
	public void decrease(String productId, Integer count) throws Exception {
		Storage storage = storageDao.getProdStorage(productId);
		if (count.compareTo(storage.getResidue()) > 0) {
			throw new Exception("商品[" + productId + "]余额不足！");
		}
		storageDao.decrease(productId, count);
	}

	@Override
	public void decrease(Map<String, Integer> products) throws Exception {
		LOGGER.info("------->扣减库存开始");
		for (String productId : products.keySet()) {
			decrease(productId, products.get(productId));
		}
		LOGGER.info("------->扣减库存结束");
	}

	/**
	 * 测试spring事务是否还好使
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void create(Storage storage) throws Exception {
		storageDao.create(storage);
		if (storage.getTotal() == null || storage.getTotal() == 0) {
			throw new Exception("产品库存数量不能为0");
		}
	}
}
