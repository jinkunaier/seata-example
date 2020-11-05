package io.seata.sample.dao;

import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

import io.seata.sample.entity.Account;

/**
 * @author IT云清
 */
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@Param("userId") String userId, @Param("money") BigDecimal money);
    
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    Account getUserAccount(@Param("userId") String userId);
}
