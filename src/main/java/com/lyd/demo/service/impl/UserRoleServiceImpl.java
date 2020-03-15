package com.lyd.demo.service.impl;

import com.lyd.demo.entity.UserRole;
import com.lyd.demo.mapper.UserRoleMapper;
import com.lyd.demo.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与角色关系表 服务实现类
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
