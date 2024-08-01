package com.ben.frame.service;

import com.ben.frame.domain.vo.UserVO;

import java.util.List;

public interface IUserService {

    List<UserVO> queryUserList();

    UserVO queryUserByUserId(String userId);

}
