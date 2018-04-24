package com.yasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasi.mapper.SAlltypeMapper;
import com.yasi.pojo.SAlltype;
import com.yasi.service.ItypeService;
@Service
public class typeService implements ItypeService {
	@Autowired
	private SAlltypeMapper alltypeMapper;

	@Override
	public int addtype(SAlltype type) {
		// TODO Auto-generated method stub
		return alltypeMapper.insert(type);
	}

	@Override
	public int deletetype(String cno) {
		// TODO Auto-generated method stub
		return alltypeMapper.deleteByPrimaryKey(cno);
	}

	@Override
	public int updatatype(SAlltype type) {
		// TODO Auto-generated method stub
		return alltypeMapper.updateByPrimaryKey(type);
	}

	@Override
	public List<SAlltype> selectype() {
		// TODO Auto-generated method stub
		return alltypeMapper.selectype();
	}

	@Override
	public List<SAlltype> findbyparent(String no) {
		// TODO Auto-generated method stub
		return alltypeMapper.findbyparent(no);
	}

	
	
	
}
