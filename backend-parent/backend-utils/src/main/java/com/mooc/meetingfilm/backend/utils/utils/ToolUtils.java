package com.mooc.meetingfilm.backend.utils.utils;

/**
 * @Author 陈建
 * @Date 2020/8/9 22:20
 * Description
 */
public class ToolUtils {
    private ToolUtils(){};

    public static boolean strIsNull(String str){
        if (str == null || str.trim().length() == 0){
            return true;
        }else {
            return false;
        }
    }


    public static boolean strIsNotNull(String str){
        if (strIsNull(str)){
            return false;
        }else {
            return true;
        }
    }
}
