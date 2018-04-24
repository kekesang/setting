package com.yasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasi.mapper.STeacherMapper;
import com.yasi.pojo.STeacher;
import com.yasi.service.IteacherService;
@Service
public class TeacherSeImpl implements IteacherService {
@Autowired
private STeacherMapper teacherMapper;
	@Override
	public int addTeacher(STeacher t) {
		// TODO Auto-generated method stub
		return teacherMapper.insert(t);
	}

	@Override
	public int updataTeacher(STeacher t) {
		// TODO Auto-generated method stub
		return teacherMapper.updateByPrimaryKey(t);
	}

	@Override
	public int deleteTeacher(String no) {
		// TODO Auto-generated method stub
		return teacherMapper.deleteByPrimaryKey(no);
	}

	@Override
	public List<STeacher> findAll() {
		// TODO Auto-generated method stub
		return teacherMapper.findAll();
	}

/*	@Override
	public List<STeacher> findteacher(String tname) {
		// TODO Auto-generated method stub
		return teacherMapper.findteacher(tname);
	}
*/
	@Override
	public List<STeacher> findteacher(STeacher t) {
		// TODO Auto-generated method stub
		return teacherMapper.findteacher(t);
	}

}
