package com.yasi.mapper;

import com.yasi.pojo.SAlltype;
import com.yasi.pojo.SAlltypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SAlltypeMapper {
    int countByExample(SAlltypeExample example);

    int deleteByExample(SAlltypeExample example);

    int deleteByPrimaryKey(String typeId);

    int insert(SAlltype record);

    int insertSelective(SAlltype record);

    List<SAlltype> selectByExample(SAlltypeExample example);

    SAlltype selectByPrimaryKey(String typeId);

    int updateByExampleSelective(@Param("record") SAlltype record, @Param("example") SAlltypeExample example);

    int updateByExample(@Param("record") SAlltype record, @Param("example") SAlltypeExample example);

    int updateByPrimaryKeySelective(SAlltype record);

    int updateByPrimaryKey(SAlltype record);

	List<SAlltype> selectype();

	List<SAlltype> findbyparent(String no);
}