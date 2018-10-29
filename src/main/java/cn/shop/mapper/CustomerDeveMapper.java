package cn.shop.mapper;

import org.apache.ibatis.annotations.Param;

import cn.shop.po.CustomerDeve;

public interface CustomerDeveMapper {
		
	public CustomerDeve checkLogin(@Param("user_name")String uname, @Param("password")String upwd);
	public void insert(CustomerDeve customerDeve);
	public void update(CustomerDeve customerDeve);
	public CustomerDeve findByName(@Param("user_name")String username);
	public CustomerDeve findMobile(@Param("mobile")String mobile, @Param("id")Integer id);
	public CustomerDeve findEmail(@Param("email")String email, @Param("id")Integer id);
	
	
}
