-- 商品表--
create Table `product`(
   product_id BIGINT comment '商品id',
   product_name varchar(50) comment '商品名字',
   product_category_id BIGINT COMMENT '商品类型',
   product_img varchar(100) COMMENT '商品图地址',
   product_stock int COMMENT '商品库存',
   product_status TINYINT COMMENT'商品状态',
   product_price decimal(8,2)COMMENT '商品价格',
   create_time datetime COMMENT '创建时间',
   update_time datetime COMMENT '更新时间',
   PRIMARY key(product_id),
   unique(product_name)
)ENGINE=INNODB CHARSET=UTF8 COMMENT'商品表';

-- 商品类目表 --
create table `prodcut_category` (
   product_category_id INT COMMENT '商品类目',
   product_category_name varchar(100) COMMENT '商品类目名称',
   create_time datetime COMMENT '创建时间',
   update_time datetime COMMENT '更新时间',
   PRIMARY key(product_category_id),
   unique(product_category_name)
)ENGINE=INNODB charset=utf8 COMMENT '商品类目表';



