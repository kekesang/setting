package com.yasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasi.mapper.SClassMapper;
import com.yasi.mapper.SCourseMapper;
import com.yasi.pojo.SClass;
import com.yasi.service.IclassService;
@Service
public class classService implements IclassService {
	@Autowired
	private SClassMapper sclassMapper;
	@Override
	public int addClass(SClass s) {
		// TODO Auto-generated method stub
		return  sclassMapper.insert(s);
	}

	@Override
	public int deleteClass(String no) {
		// TODO Auto-generated method stub
		return sclassMapper.deleteByPrimaryKey(no);
	}

	@Override
	public int updataClass(SClass s) {
		// TODO Auto-generated method stub
		return sclassMapper.updateByPrimaryKey(s);
	}

	@Override
	public List<SClass> findclass(SClass s) {
		// TODO Auto-generated method stub
		return sclassMapper.findclass(s);
	}

	@Override
	public List<SClass> findall() {
		// TODO Auto-generated method stub
		return sclassMapper.findall();
	}

	

	

}
