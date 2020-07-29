package com.boss.springcloud.controller;

import com.boss.springcloud.entity.po.Role;
import com.boss.springcloud.entity.po.User;
import com.boss.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/29 17:00
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/deleteUserById/{id}")
    public int deleteUserById(@PathVariable("id") int id){
        return userService.deleteUserById(id);
    }

    @PostMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @ResponseBody
    @RequestMapping("/queryAll")
    public List<User> queryAll(){
        return userService.queryAllUser();
    }


//
//    @RequestMapping("/getAllRole/{name}")
//    public List<Role> getAllRole(@PathVariable("name") String name){
//        return userService.getAllRole(name);
//    }
}

