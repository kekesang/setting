package com.yasi.service;

import java.util.List;

import com.yasi.pojo.SStudent;

public interface IstudentService {
	public int addStudent(SStudent student);
	public int changeStudent(SStudent student);
	public List<SStudent> selectBy(SStudent student) throws Exception;
	public int deleteStudent(String sno);
	public List<SStudent> selectall();
}
