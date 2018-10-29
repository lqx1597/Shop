package cn.shop.mapper;

import cn.shop.po.Catogory;
import cn.shop.po.CatogoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatogoryMapper {
    int countByExample(CatogoryExample example);

    int deleteByExample(CatogoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Catogory record);

    int insertSelective(Catogory record);

    List<Catogory> selectByExample(CatogoryExample example);

    Catogory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Catogory record, @Param("example") CatogoryExample example);

    int updateByExample(@Param("record") Catogory record, @Param("example") CatogoryExample example);

    int updateByPrimaryKeySelective(Catogory record);

    int updateByPrimaryKey(Catogory record);
}