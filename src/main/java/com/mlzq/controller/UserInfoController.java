package com.mlzq.controller;

import com.mlzq.pojo.UserInfo;
import com.mlzq.service.UserInfoService;
import com.mlzq.service.impl.UserInfoServiceImpl;
import lombok.extern.java.Log;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:李志强
 * @Date:2020/5/27 17:13
 * @version:1.0
 */

@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }

    @RequestMapping("/findOne")
    public UserInfo findOne(int id){
        return userInfoService.findOne(id);
    }

    @RequestMapping("/add")
    public void addUser(@Param("userinfo") UserInfo userInfo){
        userInfoService.addUserInfo(userInfo);
        //获取添加以后的主键id
        System.out.println(userInfo.getId());
    }

    @RequestMapping("/update")
    public void updataUserInfo(UserInfo userInfo){
        userInfoService.updateUserInfo(userInfo);
    }

    @RequestMapping("/remove")
    public void removeUserInfo(UserInfo userInfo){
        userInfoService.removeUserInfo(userInfo);
    }


}

