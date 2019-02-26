package com.enrique.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.enrique.entities.Role;
import com.enrique.managers.UserManager;

@RestController
public class UserManagementController {

	private UserManager userManager;

	@Inject
	public UserManagementController(UserManager userManager) {
		this.userManager = userManager;
	}

	@ResponseBody
	@GetMapping("/get_user_role")
	public Role getAllCategories(@RequestParam("user") String user, @RequestParam("password") String password) {
		try {

		} catch (Exception e) {

		}
		return new Role(1L, "Admin");
	}
}
