package com.lyd.demo.service.impl;

import com.lyd.demo.entity.Role;
import com.lyd.demo.mapper.RoleMapper;
import com.lyd.demo.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    /**
     * 通过用户ID查询角色集合
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    @Override
    public List<Role> selectSysRoleByUserId(Long userId) {
        return this.baseMapper.selectSysRoleByUserId(userId);
    }
}
