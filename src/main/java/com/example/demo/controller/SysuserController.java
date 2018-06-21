package com.example.demo.controller;


import com.example.demo.entity.Sysuser;
import com.example.demo.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zp
 * @since 2018-06-15
 */
@Controller
@RequestMapping("/sysuser")
public class SysuserController {

    private SysuserService sysuserService;

    public SysuserController(SysuserService sysuserService){
        this.sysuserService = sysuserService;
    }

    @ResponseBody
    @RequestMapping("/add")
    public int addUser(@RequestBody Sysuser sysuser){
        return sysuserService.insertUser(sysuser);
    }

    @ResponseBody
    @RequestMapping("/del")
    public int deleteUser(@RequestBody long id){
        return sysuserService.deleteUser(id);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public int editUser(@RequestBody Sysuser sysuser){
        return sysuserService.editUser(sysuser);
    }

    @ResponseBody
    @RequestMapping("/get")
    public Sysuser getUser(@RequestBody long id){
        return sysuserService.getUser(id);
    }

}

