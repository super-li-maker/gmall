package com.mlzq.service;

/**
 * @Author:李志强
 * @Date:2020/5/27 17:04
 * @version:1.0
 */

import com.mlzq.pojo.UserInfo;

import java.util.List;

/**
 * USerInfo业务逻辑接口
 */
public interface UserInfoService {

    /**
     * 查询所有
     */
    List<UserInfo> findAll();

    /**
     * 根据id查询
     * @param id
     */
    UserInfo findOne(int id);

    /**
     * 添加用户
     * @return
     */
    int addUserInfo(UserInfo userInfo);

    /**
     * 更新用户信息
     * @param userInfo
     * @return
     */
    void updateUserInfo(UserInfo userInfo);

    /**
     * 删除用户
     */
    void removeUserInfo(UserInfo userInfo);
}
