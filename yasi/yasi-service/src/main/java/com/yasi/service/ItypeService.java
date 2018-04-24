package com.yasi.service;

import java.util.List;

import com.yasi.pojo.SAlltype;

public interface ItypeService {
	public int addtype(SAlltype type);
	public int deletetype(String cno);
	public int updatatype(SAlltype type);
	public List<SAlltype> selectype();
	public List<SAlltype> findbyparent(String no);
}
