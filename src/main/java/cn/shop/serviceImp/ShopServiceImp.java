package cn.shop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shop.mapper.ShopMapper;
import cn.shop.po.Shop;
import cn.shop.po.ShopExample;
import cn.shop.service.ShopService;
@Service(value="shopService")
public class ShopServiceImp implements ShopService{
	@Autowired
	private ShopMapper shopMapper;

	@Override
	public void addShop(Shop shop) {
		shopMapper.insert(shop);
		
	}

	@Override
	public List<Shop> findByCustomerId(Integer id) {
		return shopMapper.findByCustomerId(id);
	}

	@Override
	public int findAllMoney(int id) {
		return shopMapper.findAllMoney(id);
	}

	@Override
	public int findCount(int id) {
		return shopMapper.findCount(id);
	}

	@Override
	public void deleteShopById(int shopId) {
		shopMapper.deleteByPrimaryKey(shopId);
		
	}

	@Override
	public Shop findShopById(int shopId) {
		return shopMapper.selectByPrimaryKey(shopId);
	}

}
