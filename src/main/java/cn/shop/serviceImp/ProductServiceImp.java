package cn.shop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shop.mapper.ProductMapper;
import cn.shop.po.Product;
import cn.shop.service.ProductService;
@Service(value="productService")
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public void add(Product product) {
		productMapper.insert(product);
	}

	@Override
	public List<Product> getProductAll() {
		
		return productMapper.getProductAll();
	}

	@Override
	public Product findProductById(Integer id) {
		return productMapper.selectByPrimaryKey(id);
	}

	@Override
	public int findCount() {
		
		return productMapper.countByExample(null);
	}

	@Override
	public List<Product> findByName(String keyWord) {
		return productMapper.fingByName(keyWord);
	}

	@Override
	public int findKeyWordCount(String keyWord) {
		return productMapper.findKeyWordCount(keyWord);
	}

}
