package com.yasi.mapper;

import com.yasi.pojo.SCategory;
import com.yasi.pojo.SCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SCategoryMapper {
    int countByExample(SCategoryExample example);

    int deleteByExample(SCategoryExample example);

    int deleteByPrimaryKey(String categoryNo);

    int insert(SCategory record);

    int insertSelective(SCategory record);

    List<SCategory> selectByExample(SCategoryExample example);

    SCategory selectByPrimaryKey(String categoryNo);

    int updateByExampleSelective(@Param("record") SCategory record, @Param("example") SCategoryExample example);

    int updateByExample(@Param("record") SCategory record, @Param("example") SCategoryExample example);

    int updateByPrimaryKeySelective(SCategory record);

    int updateByPrimaryKey(SCategory record);

	List<SCategory> selectallCate();
}