package io.seata.sample.entity;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
public class Account {

    private String id;

    /**用户id*/
    private String userId;

    /**总额度*/
    private BigDecimal total;

    /**已用额度*/
    private BigDecimal used;

    /**剩余额度*/
    private BigDecimal residue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getUsed() {
		return used;
	}

	public void setUsed(BigDecimal used) {
		this.used = used;
	}

	public BigDecimal getResidue() {
		return residue;
	}

	public void setResidue(BigDecimal residue) {
		this.residue = residue;
	}
}
