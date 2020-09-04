package com.mooc.meetingfilm.backend.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.meetingfilm.backend.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.user.dao.mapper.MoocBackendUserTMapper;
import com.mooc.meetingfilm.backend.utils.utils.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 陈建
 * @Date 2020/8/11 9:59
 * Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest{

    @Resource
    private MoocBackendUserTMapper backendUser;

    @Test
    public void queryWrapper(){
        QueryWrapper<MoocBackendUserT> wrapper = new QueryWrapper<>();
        wrapper.apply("data_format(data,'%Y-%m-%d')='2008-01-01')");
        wrapper.apply("data_format(data,'%Y-%m-%d')={0}","2008-01-01");
        backendUser.selectList(wrapper);

        System.out.println(wrapper.getCustomSqlSegment());
    }

    @Test
    public void test1(){
        QueryWrapper wrapper = new QueryWrapper();

        List list = backendUser.selectList(wrapper);
        System.out.println(list);

    }


    @Test
    public void add(){
        for (int i = 0; i < 5; i++) {
            MoocBackendUserT user = new MoocBackendUserT();
            user.setUserName("admin" + i);
            user.setUserPwd(MD5Util.encrypt("admin" + i));
            user.setUserPhone("17607000000" + i);

            backendUser.insert(user);

        }
    }

    @Test
    public void page(){
        Page<MoocBackendUserT> page = new Page<>(1, 3);
        QueryWrapper<MoocBackendUserT> wrapper = new QueryWrapper<>();

        IPage<MoocBackendUserT> iPage = backendUser.selectPage(page, wrapper);

        iPage.getRecords().forEach(System.out::println);
    }
}
