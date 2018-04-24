package com.yasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasi.mapper.SStudentMapper;
import com.yasi.pojo.SStudent;
import com.yasi.service.IstudentService;

@Service
public class studentService implements IstudentService {

	@Autowired
	private SStudentMapper sstudentMapper;
	public int addStudent(SStudent student){
		return  sstudentMapper.insert(student);
		
	}
	public int changeStudent(SStudent student){
		return  sstudentMapper.updateByPrimaryKey(student);
		
	}

	public List<SStudent> selectBy(SStudent student) throws Exception{
		return  sstudentMapper.selectstudent(student);
		
	}
	@Override
	public int deleteStudent(String sno) {
		// TODO Auto-generated method stub
		return sstudentMapper.deleteByPrimaryKey(sno);
	}
	@Override
	public List<SStudent> selectall() {
		// TODO Auto-generated method stub
		return sstudentMapper.selectall();
	}
}
