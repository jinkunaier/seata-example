CREATE TABLE tb_storage (
  id varchar(32) NOT NULL,
  product_id varchar(32) DEFAULT NULL COMMENT '产品id',
  total int(11) DEFAULT NULL COMMENT '总库存',
  used int(11) DEFAULT NULL COMMENT '已用库存',
  residue int(11) DEFAULT NULL COMMENT '剩余库存',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO tb_storage (id, product_id, total, used, residue) VALUES ('STG001', 'PROD001', '100', '0', '100');
INSERT INTO tb_storage (id, product_id, total, used, residue) VALUES ('STG002', 'PROD002', '100', '0', '100');