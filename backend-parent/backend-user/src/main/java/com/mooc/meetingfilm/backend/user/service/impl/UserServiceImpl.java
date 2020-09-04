package com.mooc.meetingfilm.backend.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mooc.meetingfilm.backend.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.user.dao.mapper.MoocBackendUserTMapper;
import com.mooc.meetingfilm.backend.user.service.IUserService;
import com.mooc.meetingfilm.backend.utils.exception.CommonServiceException;
import com.mooc.meetingfilm.backend.utils.utils.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 陈建
 * @Date 2020/8/10 22:52
 * Description
 */
@Service
public class UserServiceImpl  implements IUserService {

    @Resource
    private MoocBackendUserTMapper userMapper;

    @Override
    public String checkUserLogin(String username, String password) throws CommonServiceException {
        QueryWrapper<MoocBackendUserT> wrapper = new QueryWrapper();
        wrapper.eq("user_name", username);

        //避免测试出现问题
        List<MoocBackendUserT> list = userMapper.selectList(wrapper);
        MoocBackendUserT user = null;
        if (list != null && list.size() > 0){
            user = list.stream().findFirst().get();
        }else {
            throw new CommonServiceException(404, "用户名输入有误");
        }

        //检测密码是否正确
        String encrypt = MD5Util.encrypt(password);
        if (!encrypt.equals(user.getUserPwd())){
            throw new CommonServiceException(500, "用户名或密码输入错误");
        }

        return user.getUuid() + "";
    }
}
