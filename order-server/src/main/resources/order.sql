CREATE TABLE tb_order (
  id varchar(32) NOT NULL,
  user_id varchar(32) DEFAULT NULL COMMENT '用户id',
  order_date date DEFAULT NULL COMMENT '订单日期',
  status int(1) DEFAULT NULL COMMENT '订单状态：0：创建中；1：已完结',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

CREATE TABLE tb_orderitem (
  id varchar(32) NOT NULL,
  order_id varchar(32) DEFAULT NULL COMMENT '订单id',
  product_id varchar(32) DEFAULT NULL COMMENT '产品id',
  count int(11) DEFAULT NULL COMMENT '数量',
  money decimal(11,0) DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;