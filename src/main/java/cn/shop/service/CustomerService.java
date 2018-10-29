package cn.shop.service;

import cn.shop.po.CustomerDeve;

public interface CustomerService {
	public CustomerDeve check(String username, String password);
	public void insert(CustomerDeve customerDeve);
	public void update(CustomerDeve customerDeve);
	public CustomerDeve findByName(String username);
	public CustomerDeve findMobile(String mobile, Integer integer);
	public CustomerDeve findEmail(String email, Integer id);
}
