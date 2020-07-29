package com.boss.springcloud.controller;

import com.boss.springcloud.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/24 17:11
 */
@Controller
//@RequestMapping("/provider")
@Slf4j
public class NacosProviderController {

    @Autowired
    private PermissionService permissionService;

    @Autowired
    HttpSession httpSession;

    @ResponseBody
    @RequestMapping("/query")
    public List<String> queryAll(){
        String name = (String) httpSession.getAttribute("name");
        return permissionService.queryAllPermission(name);
    }

    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "views/login";
    }

    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable("id") int id){
        return "views/level1/"+id;
    }

    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable("id") int id){
        return "views/level2/"+id;
    }

    @RequestMapping("/level3/{id}")
    public String level3(@PathVariable("id") int id){
        return "views/level3/"+id;
    }
}
