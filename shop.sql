/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-10-23 08:39:22
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `catogory`
-- ----------------------------
DROP TABLE IF EXISTS `catogory`;
CREATE TABLE `catogory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `cat_code` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of catogory
-- ----------------------------
INSERT INTO catogory VALUES ('1', '家电', '001', '0');
INSERT INTO catogory VALUES ('2', '冰箱', '001001', '1');
INSERT INTO catogory VALUES ('3', '彩电', '001002', '1');
INSERT INTO catogory VALUES ('4', '办公用品', '002', '0');
INSERT INTO catogory VALUES ('5', '笔', '002001', '4');
INSERT INTO catogory VALUES ('10', 'aa', 'aa', '1');

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `real_name` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO customer VALUES ('1', 'aaa', 'aaaaaa', '天下', '15970055653', '1411494146@qq.com');
INSERT INTO customer VALUES ('2', 'qqq', 'qqqqqq', null, '15977777777', null);

-- ----------------------------
-- Table structure for `customeraddress`
-- ----------------------------
DROP TABLE IF EXISTS `customeraddress`;
CREATE TABLE `customeraddress` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `city` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `county` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `street` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `acceptor_name` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `acceptor_mobile` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `is_default_address` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customeraddress
-- ----------------------------
INSERT INTO customeraddress VALUES ('1', '浙江省', '杭州市', '拱墅区', '护法镇', 'laiqixiang', '15970055653', '1', '0');

-- ----------------------------
-- Table structure for `orderitem`
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `sale_number` int(11) DEFAULT NULL,
  `sale_price` int(11) DEFAULT NULL,
  `total_money` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------
INSERT INTO orderitem VALUES ('1', '1', '3', '1', '2300', '2300');
INSERT INTO orderitem VALUES ('2', '2', '3', '1', '2300', '2300');
INSERT INTO orderitem VALUES ('4', '4', '4', '1', '3999', '3999');

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `cat_id` int(11) DEFAULT NULL,
  `description` varchar(2000) CHARACTER SET utf8 DEFAULT NULL,
  `picture_file` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `sale_price` int(11) DEFAULT '0',
  `left_number` int(11) DEFAULT '0',
  `shop_id` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=28 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO product VALUES ('1', '小米MIX', '1', '5月9日-21日享花呗12期分期免息', '8c6c50fb-18ea-469a-8446-c1e421c592d9.png', '3499', null, null);
INSERT INTO product VALUES ('2', '三星Gax6', '1', '5月9日-10日，下单立减200元', 'fad4a2a8-face-45cc-8af7-af08b4e6cde8.png', '5899', null, null);
INSERT INTO product VALUES ('3', 'OPPO R9', '1', '5月9日-10日，下单立减100元', 'd426cadf-44ef-4ea0-80de-b8332c455cf6.png', '2300', null, null);
INSERT INTO product VALUES ('4', '小米电视3s 55英寸', '1', '5月9日-10日，下单立减200元', 'b67172e6-f536-4863-8901-c1f504d993a1.png', '3999', null, null);
INSERT INTO product VALUES ('5', '惠普笔记本', '1', '更轻更薄，像杂志一样随身携带', 'f7112555-702d-4584-bb01-bc7b2a171e5e.png', '5800', null, null);
INSERT INTO product VALUES ('14', '小米6 硅胶保护套', '2', '398人已评价', 'e8ede766-823c-41ee-a695-6166baa2c961.jpg', '49', null, null);
INSERT INTO product VALUES ('15', 'Vivo手机4c Vivo4c 智能', '2', '318人已评价', 'c429b84e-394c-419f-9ed5-71eab2d09203.jpg', '368', null, null);
INSERT INTO product VALUES ('16', '红米NOTE 4X 红米note4X', '2', '3118人已评价', '7cb2e989-1ceb-4fbb-8f28-687598619878.jpg', '789', null, null);
INSERT INTO product VALUES ('18', '手机支架式自拍杆', '2', '308人已评价', '5786c2e2-be32-42e6-a4f8-c73acde68b74.jpg', '45', null, null);
INSERT INTO product VALUES ('22', '小钢炮蓝牙音箱2', '2', '18人已评价', 'aa165a48-968c-488b-924f-b8a2b7e195ef.png', '129', null, null);
INSERT INTO product VALUES ('23', '手机指环支架', '2', '18人已评价', '577f2157-2be4-4d7a-8806-ef43926bccc8.jpg', '10', null, null);
INSERT INTO product VALUES ('24', '万能小电风扇', '2', '899人已评价', '71cfe626-b807-4278-9986-02a0ca768758.jpg', '15', null, null);
INSERT INTO product VALUES ('25', '诺基亚x5 伸缩自拍杆', '2', '25人已评价', 'd350d783-3300-4738-ab7e-d36f34ab62ff.jpg', '99', null, null);
INSERT INTO product VALUES ('26', '红米Note4 智能机', '2', '简单轻便，随身携带', '10671cf8-3040-4939-bafd-6109e4573a78.png', '39', null, null);
INSERT INTO product VALUES ('27', '宿舍', '1', '发斯蒂芬', null, '11', null, null);

-- ----------------------------
-- Table structure for `shop`
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) DEFAULT NULL,
  `buy_number` int(11) DEFAULT NULL,
  `price` int(255) DEFAULT NULL,
  `total_money` int(255) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `product_img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO shop VALUES ('2', '小米电视3s 55英寸', '1', '3999', '3999', '1', '1', '4', 'b67172e6-f536-4863-8901-c1f504d993a1.png');

-- ----------------------------
-- Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(255) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `total_money` int(11) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  `submit_date` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `product_img` varbinary(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO tb_order VALUES ('1', '15402548587025155', '1', '2300', '1', '2018-10-23 08:34:18', '1', 0x64343236636164662D343465662D346561302D383064652D6238333332633435356366362E706E67);
INSERT INTO tb_order VALUES ('2', '15402548616947916', '1', '2300', '1', '2018-10-23 08:34:21', '1', 0x64343236636164662D343465662D346561302D383064652D6238333332633435356366362E706E67);
INSERT INTO tb_order VALUES ('4', '15402551138108189', '1', '3999', '1', '2018-10-23 08:38:33', '1', 0x62363731373265362D663533362D343836332D383930312D6331663530346439393361312E706E67);

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `password` varchar(255) CHARACTER SET gbk DEFAULT NULL,
  `user_type` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('1', 'aaa', 'aaa', '0');
INSERT INTO user VALUES ('2', 'aaaaa', null, '0');
INSERT INTO user VALUES ('3', 'sdfsa', null, '0');
INSERT INTO user VALUES ('4', 'ssa', 'dsaf', '0');
INSERT INTO user VALUES ('5', 'aaaadf', 'asdfdf', '0');
