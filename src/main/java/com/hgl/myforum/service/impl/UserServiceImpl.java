package com.hgl.myforum.service.impl;

import com.hgl.myforum.common.ResultResp;
import com.hgl.myforum.entity.TUser;
import com.hgl.myforum.mapper.TUserMapper;
import com.hgl.myforum.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HGL
 * @Date 2020/9/2
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper userMapper;

    public List<TUser> getUserList() {
        return userMapper.getUserList();
    }

    public ResultResp delUserById(Integer userId) {
        ResultResp resp = new ResultResp();
        int i = userMapper.delUserById(userId);
        if (i < 1){
            resp.setCode(1);
            resp.setDesc("失败");
            return resp;
        }
        resp.setCode(0);
        resp.setDesc("成功");
        return resp;
    }

    public ResultResp register(String username, String password) {
        ResultResp resp = new ResultResp();
        int i = userMapper.register(username,password);
        if (i < 1){
            resp.setCode(1);
            resp.setDesc("注册失败~~");
            return resp;
        }
        resp.setCode(0);
        resp.setDesc("注册成功~~");
        return resp;
    }
}
