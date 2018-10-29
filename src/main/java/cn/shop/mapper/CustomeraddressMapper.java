package cn.shop.mapper;

import cn.shop.po.Customeraddress;
import cn.shop.po.CustomeraddressExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CustomeraddressMapper {
    int countByExample(CustomeraddressExample example);

    int deleteByExample(CustomeraddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customeraddress record);

    int insertSelective(Customeraddress record);

    List<Customeraddress> selectByExample(CustomeraddressExample example);

    Customeraddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customeraddress record, @Param("example") CustomeraddressExample example);

    int updateByExample(@Param("record") Customeraddress record, @Param("example") CustomeraddressExample example);

    int updateByPrimaryKeySelective(Customeraddress record);

    int updateByPrimaryKey(Customeraddress record);

	List<Customeraddress> findAddress(Integer id);

	void addAddress(Customeraddress customerAddress);

	int findCountByCuId(Integer customer_id);

	

}