package cn.shop.service;

import java.util.List;

import cn.shop.po.Product;

public interface ProductService {
	
	public void add(Product product);

	public List<Product> getProductAll();

	public Product findProductById(Integer i);

	public int findCount();

	public List<Product> findByName(String keyWord);

	public int findKeyWordCount(String keyWord);

}
