package com.mlzq.service.impl;

import com.mlzq.mapper.UserInfoMapper;
import com.mlzq.pojo.UserInfo;
import com.mlzq.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:李志强
 * @Date:2020/5/27 17:06
 * @version:1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 查询所有
     * @return userInfo集合
     */
    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        for (UserInfo userInfo : userInfos) {
            System.out.println(userInfo);
        }
        return userInfos;
    }

    @Override
    public UserInfo findOne(int id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUserInfo(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void removeUserInfo(UserInfo userInfo) {
        userInfoMapper.deleteByPrimaryKey(userInfo);
    }


}
