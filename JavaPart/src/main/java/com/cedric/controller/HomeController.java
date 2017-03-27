package com.cedric.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cedric.model.User;
import com.cedric.service.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("index");
		return this.index();
	}
	
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
	
	@RequestMapping("/all")
	public List<User> getAllUser(){
		return userService.getAll();
	}
}
