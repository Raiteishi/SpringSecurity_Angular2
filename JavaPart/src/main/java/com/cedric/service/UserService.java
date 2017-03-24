package com.cedric.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cedric.model.User;

@Service
public class UserService {

	private User u1 = new User(0, "Test01", "test1@test.fr", "password1");
	private User u2 = new User(1, "Test02", "test2@test.fr", "password2");
	private User u3 = new User(2, "Test03", "test3@test.fr", "password3");
	private User u4 = new User(3, "Test04", "test4@test.fr", "password4");
	private User u5 = new User(4, "Test05", "test5@test.fr", "password5");
	private User u6 = new User(5, "Test06", "test6@test.fr", "password6");
	private User u7 = new User(6, "Test07", "test7@test.fr", "password7");
	private List<User> listUser = new ArrayList<>();
	
	public UserService() {
		this.listUser.add(u1);
		this.listUser.add(u2);
		this.listUser.add(u3);
		this.listUser.add(u4);
		this.listUser.add(u5);
		this.listUser.add(u6);
		this.listUser.add(u7);
	}
	
	public List<User> getAll(){
		return this.listUser;
	}
}
