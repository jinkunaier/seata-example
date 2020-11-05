CREATE TABLE tb_account (
  id varchar(32) NOT NULL COMMENT 'id',
  user_id varchar(32) DEFAULT NULL COMMENT '用户id',
  total decimal(10,0) DEFAULT NULL COMMENT '总额度',
  used decimal(10,0) DEFAULT NULL COMMENT '已用余额',
  residue decimal(10,0) DEFAULT '0' COMMENT '剩余可用额度',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO tb_account (id, user_id, total, used, residue) VALUES ('ACCT001', 'USR001', '1000', '0', '1000');