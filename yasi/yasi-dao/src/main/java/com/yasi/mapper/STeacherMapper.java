package com.yasi.mapper;

import com.yasi.pojo.STeacher;
import com.yasi.pojo.STeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface STeacherMapper {
    int countByExample(STeacherExample example);

    int deleteByExample(STeacherExample example);

    int deleteByPrimaryKey(String teaNo);

    int insert(STeacher record);

    int insertSelective(STeacher record);

    List<STeacher> selectByExample(STeacherExample example);

    STeacher selectByPrimaryKey(String teaNo);

    int updateByExampleSelective(@Param("record") STeacher record, @Param("example") STeacherExample example);

    int updateByExample(@Param("record") STeacher record, @Param("example") STeacherExample example);

    int updateByPrimaryKeySelective(STeacher record);

    int updateByPrimaryKey(STeacher record);

	List<STeacher> findAll();

	List<STeacher> findteacher(STeacher t);
}