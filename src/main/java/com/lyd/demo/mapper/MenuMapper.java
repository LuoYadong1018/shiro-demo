package com.lyd.demo.mapper;

import com.lyd.demo.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据角色查询用户权限
     * @Author Sans
     * @CreateTime 2019/6/19 10:14
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<Menu> selectSysMenuByRoleId(Long roleId);

}
