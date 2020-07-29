package com.boss.springcloud.controller;

import com.boss.springcloud.entity.Do.Permission;
import com.boss.springcloud.service.permissionservice.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/28 11:07
 */

@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/query")
    public List<Permission> queryAll(){
        return permissionService.queryAllPermission();
    }
}
