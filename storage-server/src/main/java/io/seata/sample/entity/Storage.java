package io.seata.sample.entity;

/**
 * @author IT云清
 */
public class Storage {

    private String id;

    /**产品id*/
    private String productId;

    /**总库存*/
    private Integer total;

    /**已用库存*/
    private Integer used;

    /**剩余库存*/
    private Integer residue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getUsed() {
		return used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

	public Integer getResidue() {
		return residue;
	}

	public void setResidue(Integer residue) {
		this.residue = residue;
	}
}
