package com.javaProgram.Spring.JDBC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	

	@Autowired
	UserDao userDao;
	
	@GetMapping("/listUser")
	public String listUsers(Model model) {
		
		List<User> users = userDao.getProducts();
		model.addAttribute("users", users);
		
		return "listUsers";
	}

    }



