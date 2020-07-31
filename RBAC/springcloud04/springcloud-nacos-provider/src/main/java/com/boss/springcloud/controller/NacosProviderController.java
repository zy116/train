package com.boss.springcloud.controller;

import com.boss.springcloud.entity.po.User;
import com.boss.springcloud.service.PermissionService;
import com.boss.springcloud.service.UserService;
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
 * 路由控制层，提供各种接口
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
    private UserService userService;

    @Autowired
    HttpSession httpSession;

    /*
     * 获取当前用户所拥有的所有权限
     * @author 12964
     * @return java.util.List<java.lang.String>
     * @date 2020/7/31 0:12
     */
    @ResponseBody
    @RequestMapping("/query")
    public List<String> queryAll(){
//        String name = (String) httpSession.getAttribute("name");
//        return permissionService.queryAllPermission(name);
        return permissionService.queryAllPermission("zouyou");
    }

    /*
     * 得到当前用户的所有信息
     * @author 12964
     * @return com.boss.springcloud.entity.po.User
     * @date 2020/7/31 0:12
     */
    @ResponseBody
    @RequestMapping("/getUserByName")
    public User getUserByName(){
        String name = (String) httpSession.getAttribute("name");
        return userService.getUserByName(name);
    }

    /*
     * 跳转到首页
     * @author 12964
     * @return java.lang.String
     * @date 2020/7/31 0:12
     */
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    /*
     * 跳转到登陆页面，toLogin跳转的是security自带的登录页面
     * @author 12964
     * @return java.lang.String
     * @date 2020/7/31 0:13
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "views/login";
    }

//    @RequestMapping("/level1/{id}")
//    public String level1(@PathVariable("id") int id){
//        return "views/level1/"+id;
//    }
//
//    @RequestMapping("/level2/{id}")
//    public String level2(@PathVariable("id") int id){
//        return "views/level2/"+id;
//    }
//
//    @RequestMapping("/level3/{id}")
//    public String level3(@PathVariable("id") int id){
//        return "views/level3/"+id;
//    }
}
