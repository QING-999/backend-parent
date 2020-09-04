package com.mooc.meetingfilm.backend.utils.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 陈建
 * @Date 2020/8/9 22:18
 * Description
 */

@Data
@AllArgsConstructor
public class CommonServiceException extends Throwable {
    private Integer code;
    private String message;

}
