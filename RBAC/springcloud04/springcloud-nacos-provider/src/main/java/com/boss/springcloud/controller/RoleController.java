package com.boss.springcloud.controller;

import com.boss.springcloud.entity.po.Role;
import com.boss.springcloud.service.roleservice.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/28 11:07
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/query")
    public List<Role> queryAllRole(){
        return roleService.queryAllRole();
    }

    @RequestMapping("/addrole")
    public int addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }

    @GetMapping("/deleterole")
    public int deleteById(int id){
        return roleService.deleteById(id);
    }

    @PostMapping("/updaterole")
    public int updateRole(@RequestBody Role role){
        return roleService.updateRole(role);
    }
}
