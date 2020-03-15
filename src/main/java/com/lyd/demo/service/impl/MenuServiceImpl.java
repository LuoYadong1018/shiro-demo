package com.lyd.demo.service.impl;

import com.lyd.demo.entity.Menu;
import com.lyd.demo.mapper.MenuMapper;
import com.lyd.demo.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    /**
     * 根据角色查询用户权限
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    @Override
    public List<Menu> selectSysMenuByRoleId(Long roleId) {
        return this.baseMapper.selectSysMenuByRoleId(roleId);
    }
}
