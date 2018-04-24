package com.yasi.mapper;

import com.yasi.pojo.SStudent;
import com.yasi.pojo.SStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SStudentMapper {
    int countByExample(SStudentExample example);

    int deleteByExample(SStudentExample example);

    int deleteByPrimaryKey(String sNo);

    int insert(SStudent record);

    int insertSelective(SStudent record);

    List<SStudent> selectByExample(SStudentExample example);

    SStudent selectByPrimaryKey(String sNo);

    int updateByExampleSelective(@Param("record") SStudent record, @Param("example") SStudentExample example);

    int updateByExample(@Param("record") SStudent record, @Param("example") SStudentExample example);

    int updateByPrimaryKeySelective(SStudent record);

    int updateByPrimaryKey(SStudent record);

	List<SStudent> selectstudent(SStudent student);

	List<SStudent> selectall();
}