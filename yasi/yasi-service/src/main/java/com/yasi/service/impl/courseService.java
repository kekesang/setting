package com.yasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasi.mapper.SCourseMapper;
import com.yasi.pojo.SCourse;
import com.yasi.service.IcourseService;
@Service
public class courseService implements IcourseService {
	@Autowired
	private  SCourseMapper scourseMapper;
	@Override
	public int addCourse(SCourse course) {
		// TODO Auto-generated method stub
		return scourseMapper.insert(course);
	}


	@Override
	public int updataCourse(SCourse course) {
		// TODO Auto-generated method stub
		return scourseMapper.updateByPrimaryKey( course);
	}

	@Override
	public List<SCourse> selectcourse(SCourse course) {
		// TODO Auto-generated method stub
		return scourseMapper.selectcourse(course);
	}

	@Override
	public int deleteCourse(String cno) {
		// TODO Auto-generated method stub
		return scourseMapper.deleteByPrimaryKey(cno);
	}


	@Override
	public List<SCourse> selectall() {
		// TODO Auto-generated method stub
		return scourseMapper.selectall();
	}


	@Override
	public List<SCourse> freecourse() {
		// TODO Auto-generated method stub
		return scourseMapper.freecourse();
	}


	@Override
	public List<SCourse> findcateC(String categoryNo) {
		// TODO Auto-generated method stub
		return scourseMapper.findCateC(categoryNo);
	}

}
