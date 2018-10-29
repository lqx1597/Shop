package cn.shop.service;

import java.util.List;

import cn.shop.po.Customeraddress;

public interface CustomerAddressService {

	public List<Customeraddress> findAddressByCustomerId(Integer id);

	public void addAddress(Customeraddress customerAddress);

	public void deleteAddress(int addressId);

	public void updateAddress(Customeraddress customerAddress);

	public Customeraddress findAddressByAddressId(int addressId);

	public int findCountById(Integer customer_id);

}
