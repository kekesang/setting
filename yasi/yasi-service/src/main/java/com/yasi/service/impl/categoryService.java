package com.yasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasi.mapper.SCategoryMapper;
import com.yasi.pojo.SCategory;
import com.yasi.service.IcategoryService;
@Service
public class categoryService implements IcategoryService {
	@Autowired
	private   SCategoryMapper categoryMapper;

	@Override
	public int addBigCate(SCategory category) {
		// TODO Auto-generated method stub
		return categoryMapper.insert(category);
	}

	@Override
	public int deleteBigCate(String no) {
		// TODO Auto-generated method stub
		return categoryMapper.deleteByPrimaryKey(no);
	}

	@Override
	public int update(SCategory category) {
		// TODO Auto-generated method stub
		return categoryMapper.updateByPrimaryKey(category);
	}

	@Override
	public List<SCategory> selectallCate() {
		// TODO Auto-generated method stub
		return categoryMapper.selectallCate();
	}
	

	

}
