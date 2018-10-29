package cn.shop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shop.mapper.CustomeraddressMapper;
import cn.shop.po.Customeraddress;
import cn.shop.service.CustomerAddressService;

@Service("customerAddressService")
public class CustomerAddressServiceImp implements CustomerAddressService{

	@Autowired
	private CustomeraddressMapper customerAddressMapper;

	

	@Override
	public List<Customeraddress> findAddressByCustomerId(Integer id) {
		
		return customerAddressMapper.findAddress(id);
	}



	@Override
	public void addAddress(Customeraddress customerAddress) {
		customerAddressMapper.addAddress(customerAddress);
		
	}



	@Override
	public void deleteAddress(int addressId) {
		customerAddressMapper.deleteByPrimaryKey(addressId);
		
	}



	@Override
	public void updateAddress(Customeraddress customeraddress) {
		customerAddressMapper.updateByPrimaryKey(customeraddress);
		
	}



	@Override
	public Customeraddress findAddressByAddressId(int addressId) {
		return customerAddressMapper.selectByPrimaryKey(addressId);
		
	}



	@Override
	public int findCountById(Integer customer_id) {
		
		return customerAddressMapper.findCountByCuId(customer_id);
	}



	
	

}
