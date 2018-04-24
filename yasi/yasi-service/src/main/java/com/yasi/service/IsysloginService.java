package com.yasi.service;

import java.util.List;

import com.yasi.pojo.SSysman;

public interface IsysloginService {
int change(SSysman sysman);
List<SSysman> selectlogin(SSysman sysman) throws Exception;

}
