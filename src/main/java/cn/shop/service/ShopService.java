package cn.shop.service;

import java.util.List;

import cn.shop.po.Shop;

public interface ShopService {

	void addShop(Shop shop);

	List<Shop> findByCustomerId(Integer id);

	int findAllMoney(int id);

	int findCount(int id);

	void deleteShopById(int shopId);

	Shop findShopById(int parseInt);

}
