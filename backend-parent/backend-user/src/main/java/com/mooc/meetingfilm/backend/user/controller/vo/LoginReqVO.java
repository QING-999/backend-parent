package com.mooc.meetingfilm.backend.user.controller.vo;

import com.mooc.meetingfilm.backend.utils.common.vo.BaseRequestVO;
import com.mooc.meetingfilm.backend.utils.exception.CommonServiceException;
import com.mooc.meetingfilm.backend.utils.utils.ToolUtils;
import lombok.Data;

import javax.tools.Tool;

/**
 * @Author CJ
 * @Date 2020/8/9 18:35
 * Description
 */
@Data
public class LoginReqVO extends BaseRequestVO {
    private String username;
    private String password;


    @Override
    public void checkParam() throws CommonServiceException {
        if (ToolUtils.strIsNull(username) || ToolUtils.strIsNull(password)){
            throw new CommonServiceException(404, "username或password不能为空");
        }
    }
}
