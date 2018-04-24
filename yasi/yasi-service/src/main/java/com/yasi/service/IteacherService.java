package com.yasi.service;

import java.util.List;

import com.yasi.pojo.STeacher;

public interface IteacherService {
int addTeacher( STeacher t);
int updataTeacher( STeacher t);
int deleteTeacher(String no);
List< STeacher > findAll();
List< STeacher > findteacher(STeacher t);
}
