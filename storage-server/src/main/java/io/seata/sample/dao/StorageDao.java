package io.seata.sample.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import io.seata.sample.entity.Storage;

/**
 * @author IT云清
 */
@Repository
public interface StorageDao {

	/**
	 * 扣减库存
	 * 
	 * @param productId
	 *            产品id
	 * @param count
	 *            数量
	 * @return
	 */
	public void decrease(@Param("productId") String productId, @Param("count") Integer count);

	public Storage getProdStorage(@Param("productId") String productId);

	public void create(Storage storage);
}
