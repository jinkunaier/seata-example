CREATE TABLE tb_storage (
  id VARCHAR2(50) NOT NULL,
  product_id VARCHAR2(50) DEFAULT NULL,
  total number(18) DEFAULT NULL,
  used number(18) DEFAULT NULL,
  residue number(18) DEFAULT NULL,
  PRIMARY KEY (id)
);

COMMENT ON COLUMN tb_storage.id is 'id';
COMMENT ON COLUMN tb_storage.product_id is '产品id';
COMMENT ON COLUMN tb_storage.total is '总库存';
COMMENT ON COLUMN tb_storage.used is '已用库存';
COMMENT ON COLUMN tb_storage.residue is '剩余库存';

INSERT INTO tb_storage (id, product_id, total, used, residue) VALUES ('STG001', 'PROD001', '100', '0', '100');
INSERT INTO tb_storage (id, product_id, total, used, residue) VALUES ('STG002', 'PROD002', '100', '0', '100');