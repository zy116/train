package com.boss.springcloud.controller;

import com.boss.springcloud.entity.po.Permission;
import com.boss.springcloud.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
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

    @Autowired
    HttpSession httpSession;

    @RequestMapping("/query")
    public List<String> queryAll(){
        String name = (String) httpSession.getAttribute("name");
        return permissionService.queryAllPermission(name);
    }
}
