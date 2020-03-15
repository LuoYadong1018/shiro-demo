package com.lyd.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyd.demo.entity.User;
import com.lyd.demo.mapper.UserMapper;
import com.lyd.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * 根据用户名查询实体
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    @Override
    public User selectUserByName(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getUsername,username);
        return this.baseMapper.selectOne(queryWrapper);
    }
}
