package com.yasi.service;

import java.util.List;

import com.yasi.pojo.SCourse;

public interface  IcourseService {
public int addCourse(SCourse course);
public int deleteCourse(String cno);
public int updataCourse(SCourse course);
public List<SCourse> selectcourse(SCourse course);
public List<SCourse> selectall();
/*List <SCourse>listCourse(String typno);*/
public List<SCourse> freecourse();
public List<SCourse> findcateC(String categoryNo);
}
