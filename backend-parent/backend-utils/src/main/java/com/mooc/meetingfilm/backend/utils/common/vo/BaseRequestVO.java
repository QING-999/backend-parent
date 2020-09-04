package com.mooc.meetingfilm.backend.utils.common.vo;

import com.mooc.meetingfilm.backend.utils.exception.CommonServiceException;

/**
 * @Author CJ
 * @Date 2020/8/9 18:36
 * Description
 */
public abstract class BaseRequestVO {

    /*
     * @Author 陈建
     * @description:
     * @Return void
     */
    public abstract void checkParam() throws CommonServiceException;
}
