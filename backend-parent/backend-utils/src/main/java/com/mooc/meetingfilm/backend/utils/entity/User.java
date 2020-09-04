package com.mooc.meetingfilm.backend.utils.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @Author 建
 * @Date 2020/8/13 0:25
 * Description
 */
@Data
@Document(collection = "User")
public class User {
    /*
    用户id：
    */
    @Field("id")
    private String id;
    /*
    用户名
    */
    @Field("UserName")
    private String userName;
    /*
    性别
     */
    @Field("sex")
    private String sex;
}