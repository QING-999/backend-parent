package com.mooc.meetingfilm.backend.utils.common.vo;

import com.mooc.meetingfilm.backend.utils.exception.CommonServiceException;
import lombok.Data;

/**
 * @Author 陈建
 * @Date 2020/8/9 22:35
 * Description
 */
@Data
public class BaseResponseVO<M> {
    private Integer code;    //业务编号
    private String message;     //异常信息
    private M data;     //业务数据

    private BaseResponseVO(){};

    //成功但是无参数
    public static BaseResponseVO success(){
        BaseResponseVO responseVo = new BaseResponseVO();
        responseVo.setCode(200);
        responseVo.setMessage("");

        return responseVo;
    }

    //成功并且有参数
    public static<M> BaseResponseVO success(M data){
        BaseResponseVO responseVo = new BaseResponseVO();
        responseVo.setCode(200);
        responseVo.setMessage("");
        responseVo.setData(data);

        return responseVo;
    }

    //出现业务异常
    public static<M> BaseResponseVO serviceException(CommonServiceException e){
        BaseResponseVO responseVo = new BaseResponseVO();
        responseVo.setCode(e.getCode());
        responseVo.setMessage(e.getMessage());

        return responseVo;
    }

}
