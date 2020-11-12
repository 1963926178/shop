package com.zking.ssm.mapper;

import com.zking.ssm.model.Kind;

public interface KindMapper {
    int deleteByPrimaryKey(Integer kindId);

    int insert(Kind record);

    int insertSelective(Kind record);

    Kind selectByPrimaryKey(Integer kindId);

    int updateByPrimaryKeySelective(Kind record);

    int updateByPrimaryKey(Kind record);
}