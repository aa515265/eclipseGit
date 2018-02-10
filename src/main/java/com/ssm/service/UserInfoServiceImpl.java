package com.ssm.service;

import com.ssm.dao.IUserInfoDAO;
import com.ssm.entity.UserInfo;

/**
 * Created by gawen on 2018/1/22.
 */
public class UserInfoServiceImpl implements IUserInfoService {
    private IUserInfoDAO dao;

    public void add(UserInfo info) {
        dao.add(info);
    }
    public IUserInfoDAO getDao() {
        return dao;
    }
    public void setDao(IUserInfoDAO dao) {
        this.dao = dao;
    }
}