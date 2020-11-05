CREATE TABLE tb_account (
  id VARCHAR2(50) NOT NULL,
  user_id VARCHAR2(50) DEFAULT NULL,
  total decimal(10,0) DEFAULT NULL,
  used decimal(10,0) DEFAULT NULL,
  residue decimal(10,0) DEFAULT '0',
  PRIMARY KEY (id)
);
COMMENT ON COLUMN tb_account.id is 'id';
COMMENT ON COLUMN tb_account.user_id is '用户id';
COMMENT ON COLUMN tb_account.total is '总额度';
COMMENT ON COLUMN tb_account.used is '已用余额';
COMMENT ON COLUMN tb_account.residue is '剩余可用额度';
COMMENT ON TABLE tb_account is '用户账户表';

INSERT INTO tb_account (id, user_id, total, used, residue) VALUES ('ACCT001', 'USR001', '1000', '0', '1000');