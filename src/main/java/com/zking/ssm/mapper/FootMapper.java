package com.zking.ssm.mapper;

import com.zking.ssm.model.Foot;

public interface FootMapper {
    int deleteByPrimaryKey(Integer footId);

    int insert(Foot record);

    int insertSelective(Foot record);

    Foot selectByPrimaryKey(Integer footId);

    int updateByPrimaryKeySelective(Foot record);

    int updateByPrimaryKey(Foot record);
}