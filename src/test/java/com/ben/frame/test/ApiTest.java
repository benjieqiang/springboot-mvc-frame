package com.ben.frame.test;

import com.ben.frame.domain.vo.UserVO;
import com.ben.frame.service.IUserService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Resource
    private IUserService userService;

    @Test
    public void test_queryUserList() {
        List<UserVO> userVOList = userService.queryUserList();
        log.info("测试结果：{}", JSON.toJSONString(userVOList));
    }

    @Test
    public void test_queryUserInfoByUserId() {
        UserVO userVO = userService.queryUserByUserId("torresja");
        log.info("测试结果：{}", JSON.toJSONString(userVO));
    }
}
