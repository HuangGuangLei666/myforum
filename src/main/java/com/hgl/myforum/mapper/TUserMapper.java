package com.hgl.myforum.mapper;


import com.hgl.myforum.entity.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    List<TUser> getUserList();

    int delUserById(Integer userId);

    int register(@Param("username") String username,@Param("password") String password);
}
