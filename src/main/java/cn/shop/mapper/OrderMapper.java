package cn.shop.mapper;

import cn.shop.po.Order;
import cn.shop.po.OrderExample;
import cn.shop.po.OrderQueryVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Order record);
    
    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

	void add(Order order);

	int selectNowId();

	List<Order> selectByCustomerID(Integer id);

	Order selectByOrderId(int order_id);

	void deleteById(Integer id);

	int countByCustomerId(Integer id);
}