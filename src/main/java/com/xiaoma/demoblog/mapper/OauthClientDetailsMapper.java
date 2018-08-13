package com.xiaoma.demoblog.mapper;

import com.xiaoma.demoblog.model.OauthClientDetails;

public interface OauthClientDetailsMapper {
    int deleteByPrimaryKey(Integer clientId);

    int insert(OauthClientDetails record);

    int insertSelective(OauthClientDetails record);

    OauthClientDetails selectByPrimaryKey(Integer clientId);

    int updateByPrimaryKeySelective(OauthClientDetails record);

    int updateByPrimaryKey(OauthClientDetails record);
}