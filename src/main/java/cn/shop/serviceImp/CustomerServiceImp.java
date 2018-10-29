package cn.shop.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shop.po.*;
import cn.shop.mapper.*;
import cn.shop.service.CustomerService;

@Service(value="customerService")
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	private CustomerDeveMapper customerDeveMapper;

	@Override
	public CustomerDeve check(String username, String password) {
		// TODO Auto-generated method stub
		return customerDeveMapper.checkLogin(username, password);
	}

	@Override
	public void insert(CustomerDeve customerDeve) {
		customerDeveMapper.insert(customerDeve);
		
	}

	@Override
	public void update(CustomerDeve customerDeve) {
		customerDeveMapper.update(customerDeve);
		
	}

	@Override
	public CustomerDeve findByName(String username) {
		return customerDeveMapper.findByName(username);
		
	}

	@Override
	public CustomerDeve findMobile(String mobile,Integer id) {
		return customerDeveMapper.findMobile(mobile,id);
	}

	@Override
	public CustomerDeve findEmail(String email,Integer id) {
		return customerDeveMapper.findEmail(email,id);
	}

}
