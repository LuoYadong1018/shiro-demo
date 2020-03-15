package com.lyd.demo.service;

import com.lyd.demo.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
public interface RoleService extends IService<Role> {

    /**
     * 通过用户ID查询角色集合
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<Role> selectSysRoleByUserId(Long userId);

}
