package com.yasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasi.mapper.SStudentMapper;
import com.yasi.mapper.SSysmanMapper;
import com.yasi.pojo.SStudent;
import com.yasi.pojo.SSysman;
import com.yasi.service.IsysloginService;

@Service
public class sysloginServiceImpl implements IsysloginService {

	@Autowired
	private SSysmanMapper sysmantMapper;

	@Override
	public int change(SSysman sysman) {
		// TODO Auto-generated method stub
		return sysmantMapper.updateByPrimaryKey(sysman);
	}

	@Override
	public List<SSysman> selectlogin(SSysman sysman) throws Exception {
		List<SSysman> list = sysmantMapper.selectsysman(sysman);
		if (list != null && list.size() > 0) {
			
			return list;
		}
		return null;
	}

}
