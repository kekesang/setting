package com.yasi.service;

import java.util.List;

import com.yasi.pojo.SClass;

public interface IclassService {
int addClass(SClass s);
int deleteClass(String no);
int updataClass(SClass s);
List<SClass> findclass(SClass s);
List<SClass> findall();
}
