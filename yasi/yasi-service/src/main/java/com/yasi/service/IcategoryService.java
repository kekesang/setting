package com.yasi.service;

import java.util.List;

import com.yasi.pojo.SCategory;

public interface IcategoryService {
   public int addBigCate(SCategory  category);
   public int deleteBigCate(String no);
   public int update(SCategory  category);
   public List<SCategory> selectallCate();

}
