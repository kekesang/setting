package com.yasi.mapper;

import com.yasi.pojo.SStudent;
import com.yasi.pojo.SSysman;
import com.yasi.pojo.SSysmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SSysmanMapper {
    int countByExample(SSysmanExample example);

    int deleteByExample(SSysmanExample example);

    int deleteByPrimaryKey(String sysNo);

    int insert(SSysman record);

    int insertSelective(SSysman record);

    List<SSysman> selectByExample(SSysmanExample example);

    SSysman selectByPrimaryKey(String sysNo);

    int updateByExampleSelective(@Param("record") SSysman record, @Param("example") SSysmanExample example);

    int updateByExample(@Param("record") SSysman record, @Param("example") SSysmanExample example);

    int updateByPrimaryKeySelective(SSysman record);

    int updateByPrimaryKey(SSysman record);

	List<SSysman> selectsysman(SSysman sysman);
}