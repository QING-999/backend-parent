package com.mooc.meetingfilm.backend.user.service;

import com.mooc.meetingfilm.backend.utils.exception.CommonServiceException;

/**
 * @Author 陈建
 * @Date 2020/8/10 22:51
 * Description
 */
public interface IUserService {
    String checkUserLogin(String username, String password) throws CommonServiceException;
}
