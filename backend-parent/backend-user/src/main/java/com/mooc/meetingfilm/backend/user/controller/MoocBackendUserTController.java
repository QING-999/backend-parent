package com.mooc.meetingfilm.backend.user.controller;


import com.mooc.meetingfilm.backend.user.controller.vo.LoginReqVO;
import com.mooc.meetingfilm.backend.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.user.service.IUserService;
import com.mooc.meetingfilm.backend.utils.common.vo.BaseResponseVO;
import com.mooc.meetingfilm.backend.utils.exception.CommonServiceException;
import com.mooc.meetingfilm.backend.utils.properties.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author JC
 * @since 2020-08-09
 */
@RestController
@RequestMapping("/user")
public class MoocBackendUserTController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponseVO login(@RequestBody LoginReqVO reqVO) throws CommonServiceException {

        //数据验证
        reqVO.checkParam();

        //校验用户名密码
        String uuid = userService.checkUserLogin(reqVO.getUsername(), reqVO.getPassword());

        //randomkey  token
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        String randomKey = jwtTokenUtil.getRandomKey();
        String token = jwtTokenUtil.generateToken(reqVO.getUsername(), randomKey);

        Map<String, String> result = new HashMap<>();
        result.put("randomKey", randomKey);
        result.put("token", token);


        return BaseResponseVO.success(result);
    }

    @RequestMapping("ListUser")
    public List<MoocBackendUserT> listUser(){
        return null;
    }
}
