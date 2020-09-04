package com.mooc.meetingfilm.backend.user.dao.mapper;

import com.mooc.meetingfilm.backend.user.dao.entity.MoocBackendUserT;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author JC
 * @since 2020-08-09
 */
public interface MoocBackendUserTMapper extends BaseMapper<MoocBackendUserT> {
    public MoocBackendUserT selectByName(@Param("name") String name);
}
