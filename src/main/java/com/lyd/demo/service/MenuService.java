package com.lyd.demo.service;

import com.lyd.demo.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
public interface MenuService extends IService<Menu> {

    /**
     * 根据角色查询用户权限
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<Menu> selectSysMenuByRoleId(Long roleId);

}
