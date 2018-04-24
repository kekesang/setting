package com.yasi.mapper;

import com.yasi.pojo.SClass;
import com.yasi.pojo.SClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SClassMapper {
    int countByExample(SClassExample example);

    int deleteByExample(SClassExample example);

    int deleteByPrimaryKey(String classNo);

    int insert(SClass record);

    int insertSelective(SClass record);

    List<SClass> selectByExample(SClassExample example);

    SClass selectByPrimaryKey(String classNo);

    int updateByExampleSelective(@Param("record") SClass record, @Param("example") SClassExample example);

    int updateByExample(@Param("record") SClass record, @Param("example") SClassExample example);

    int updateByPrimaryKeySelective(SClass record);

    int updateByPrimaryKey(SClass record);

	List<SClass> findclass(SClass s);

	List<SClass> findall();
}