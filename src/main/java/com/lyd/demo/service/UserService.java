package com.lyd.demo.service;

import com.lyd.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名查询实体
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    User selectUserByName(String username);

}
