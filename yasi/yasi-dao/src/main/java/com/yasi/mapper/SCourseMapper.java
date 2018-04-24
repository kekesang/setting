package com.yasi.mapper;

import com.yasi.pojo.SCourse;
import com.yasi.pojo.SCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SCourseMapper {
    int countByExample(SCourseExample example);

    int deleteByExample(SCourseExample example);

    int deleteByPrimaryKey(String cNo);

    int insert(SCourse record);

    int insertSelective(SCourse record);

    List<SCourse> selectByExample(SCourseExample example);

    SCourse selectByPrimaryKey(String cNo);

    int updateByExampleSelective(@Param("record") SCourse record, @Param("example") SCourseExample example);

    int updateByExample(@Param("record") SCourse record, @Param("example") SCourseExample example);

    int updateByPrimaryKeySelective(SCourse record);

    int updateByPrimaryKey(SCourse record);

	List<SCourse> selectcourse(SCourse course);

	List<SCourse> selectall();
	List<SCourse> freecourse();

	List<SCourse> findCateC(String categoryNo);
}