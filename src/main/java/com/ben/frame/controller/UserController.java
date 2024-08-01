package com.ben.frame.controller;

import com.ben.frame.common.Constants;
import com.ben.frame.common.Response;
import com.ben.frame.domain.req.UserReq;
import com.ben.frame.domain.vo.UserVO;
import com.ben.frame.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/${app.config.api-version}/")
public class UserController {

    @Resource
    private IUserService userService;

    /**
     * http://localhost:8089/api/v1/queryUserInfo
     */
    @RequestMapping("queryUserInfo")
    public Response<List<UserVO>> queryUserInfo() {
        try {
            log.info("查询用户信息");
            List<UserVO> userVOList = userService.queryUserList();
            return Response.<List<UserVO>>builder()
                    .code(Constants.ResponseCode.SUCCESS.getCode())
                    .info(Constants.ResponseCode.SUCCESS.getInfo())
                    .data(userVOList)
                    .build();
        } catch (Exception e) {
            log.error("查询用户信息失败", e);
            return Response.<List<UserVO>>builder()
                    .code(Constants.ResponseCode.UN_ERROR.getCode())
                    .info(Constants.ResponseCode.UN_ERROR.getInfo())
                    .build();
        }
    }

    @RequestMapping("queryUserInfoByUserId")
    public Response<UserVO> queryUserInfoByUserId(@RequestParam UserReq userReq) {
        try {
            log.info("查询用户信息");
            UserVO userVO = userService.queryUserByUserId(userReq.getUId());
            return Response.<UserVO>builder()
                    .code(Constants.ResponseCode.SUCCESS.getCode())
                    .info(Constants.ResponseCode.SUCCESS.getInfo())
                    .data(userVO)
                    .build();
        } catch (Exception e) {
            log.error("查询用户信息失败", e);
            return Response.<UserVO>builder()
                    .code(Constants.ResponseCode.UN_ERROR.getCode())
                    .info(Constants.ResponseCode.UN_ERROR.getInfo())
                    .build();
        }
    }


}
