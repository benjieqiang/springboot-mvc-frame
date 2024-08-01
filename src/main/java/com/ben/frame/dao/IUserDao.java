package com.ben.frame.dao;

import com.ben.frame.domain.po.User;
import com.ben.frame.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IUserDao {

    List<User> queryUserList();

    User queryUserByUserId(@Param("userId") String userId);
}
