package org.controller;

import org.entity.User;
import org.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getMessage() {
        return "Hello";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex() {
        return "index";
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<User> getAllUsers() {
        List<User> users = userService.findAllUsers();
        System.out.println(users);
        return users;
    }

}
