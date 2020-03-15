package com.lyd.demo.controller;


import com.lyd.demo.common.util.ShiroUtils;
import com.lyd.demo.entity.Menu;
import com.lyd.demo.entity.Role;
import com.lyd.demo.entity.RoleMenu;
import com.lyd.demo.entity.User;
import com.lyd.demo.service.MenuService;
import com.lyd.demo.service.RoleMenuService;
import com.lyd.demo.service.RoleService;
import com.lyd.demo.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 权限表 前端控制器
 * </p>
 *
 * @author lyd
 * @since 2020-03-15
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private UserService sysUserService;
    @Autowired
    private RoleService sysRoleService;
    @Autowired
    private MenuService sysMenuService;
    @Autowired
    private RoleMenuService sysRoleMenuService;

    /**
     * 获取用户信息集合
     *
     * @Author Sans
     * @CreateTime 2019/6/19 10:36
     * @Return Map<String, Object> 返回结果
     */
    @RequestMapping("/getUserInfoList")
    @RequiresPermissions("sys:user:info")
    public Map<String, Object> getUserInfoList() {
        Map<String, Object> map = new HashMap<>();
        List<User> sysUserEntityList = sysUserService.list();
        map.put("sysUserEntityList", sysUserEntityList);
        return map;
    }

    /**
     * 获取角色信息集合
     *
     * @Author Sans
     * @CreateTime 2019/6/19 10:37
     * @Return Map<String, Object> 返回结果
     */
    @RequestMapping("/getRoleInfoList")
    @RequiresPermissions("sys:role:info")
    public Map<String, Object> getRoleInfoList() {
        Map<String, Object> map = new HashMap<>();
        List<Role> sysRoleEntityList = sysRoleService.list();
        map.put("sysRoleEntityList", sysRoleEntityList);
        return map;
    }

    /**
     * 获取权限信息集合
     *
     * @Author Sans
     * @CreateTime 2019/6/19 10:38
     * @Return Map<String, Object>
     */
    @RequestMapping("/getMenuInfoList")
    @RequiresPermissions("sys:menu:info")
    public Map<String, Object> getMenuInfoList() {
        Map<String, Object> map = new HashMap<>();
        List<Menu> sysMenuEntityList = sysMenuService.list();
        map.put("sysMenuEntityList", sysMenuEntityList);
        return map;
    }

    /**
     * 获取所有数据
     *
     * @Author Sans
     * @CreateTime 2019/6/19 10:38
     * @Return Map<String, Object>
     */
    @RequestMapping("/getInfoAll")
    @RequiresPermissions("sys:info:all")
    public Map<String, Object> getInfoAll() {
        Map<String, Object> map = new HashMap<>();
        List<User> sysUserEntityList = sysUserService.list();
        map.put("sysUserEntityList", sysUserEntityList);
        List<Role> sysRoleEntityList = sysRoleService.list();
        map.put("sysRoleEntityList", sysRoleEntityList);
        List<Menu> sysMenuEntityList = sysMenuService.list();
        map.put("sysMenuEntityList", sysMenuEntityList);
        return map;
    }

    /**
     * 添加管理员角色权限(测试动态权限更新)
     *
     * @Author Sans
     * @CreateTime 2019/6/19 10:39
     * @Param username 用户ID
     * @Return Map<String, Object>
     */
    @RequestMapping("/addMenu")
    public Map<String, Object> addMenu() {
        //添加管理员角色权限
        RoleMenu sysRoleMenuEntity = new RoleMenu();
        sysRoleMenuEntity.setMenuId(4L);
        sysRoleMenuEntity.setRoleId(1L);
        sysRoleMenuService.save(sysRoleMenuEntity);
        //清除缓存
        String username = "admin";
        ShiroUtils.deleteCache(username, false);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "权限添加成功");
        return map;
    }
}
