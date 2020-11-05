CREATE TABLE tb_order (
  id VARCHAR2(50) NOT NULL,
  user_id VARCHAR2(50) DEFAULT NULL,
  order_date date DEFAULT NULL,
  status number(1) DEFAULT 0,
  PRIMARY KEY (id)
);

COMMENT ON COLUMN tb_order.id is 'id';
COMMENT ON COLUMN tb_order.user_id is '用户id';
COMMENT ON COLUMN tb_order.order_date is '订单日期';
COMMENT ON COLUMN tb_order.status is '订单状态：0：创建中；1：已完结';

CREATE TABLE tb_orderitem (
  id VARCHAR2(50) NOT NULL,
  order_id VARCHAR2(50) DEFAULT NULL,
  product_id VARCHAR2(50) DEFAULT NULL,
  count number(18) DEFAULT 0,
  money decimal(18,2) DEFAULT 0,
  PRIMARY KEY (id)
);

COMMENT ON COLUMN tb_orderitem.id is 'id';
COMMENT ON COLUMN tb_orderitem.order_id is '订单id';
COMMENT ON COLUMN tb_orderitem.product_id is '产品id';
COMMENT ON COLUMN tb_orderitem.count is '数量';
COMMENT ON COLUMN tb_orderitem.money is '金额';