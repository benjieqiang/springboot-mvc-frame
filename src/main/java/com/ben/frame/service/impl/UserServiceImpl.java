package com.ben.frame.service.impl;

import com.alibaba.fastjson.JSON;
import com.ben.frame.dao.IUserDao;
import com.ben.frame.domain.po.User;
import com.ben.frame.domain.vo.UserVO;
import com.ben.frame.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public List<UserVO> queryUserList() {
        List<UserVO> userInfoList = new ArrayList<>();
        List<User> users = userDao.queryUserList();
        log.info("查询用户信息：{}", JSON.toJSONString(users));

        for (User user : users) {
            UserVO userInfo = UserVO.builder()
                    .userId(user.getUserId())
                    .userNickname(user.getUserNickname())
                    .createTime(user.getCreateTime())
                    .build();
            userInfoList.add(userInfo);
        }
        return userInfoList;
    }

    @Override
    public UserVO queryUserByUserId(String userId) {
        User user = userDao.queryUserByUserId(userId);
        log.info("查询用户信息：{}", JSON.toJSONString(user.toString()));
        UserVO userVO = UserVO.builder().userId(user.getUserId())
                .userNickname(user.getUserNickname())
                .createTime(user.getCreateTime())
                .build();
        return userVO;
    }

}
