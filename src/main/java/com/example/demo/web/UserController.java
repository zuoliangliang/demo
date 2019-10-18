package com.example.demo.web;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    @ApiOperation("添加用户")
    public Object insert(User user) {

        userService.save(user);
        return ResponseUtil.ok();
    }

    @PostMapping("/list")
    @ApiOperation("添加用户")
    public Object list() {

        return ResponseUtil.ok(userService.select());
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("删徐用户")
    public Object delete(@PathVariable Integer id) {

        return ResponseUtil.ok(userService.delete(id));
    }
}
