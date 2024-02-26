package test.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogDeleteController {
	//register_login.html を取る
	@GetMapping("/register_login")
	public String register_login() {
		return "register_login";
	}
	
	//register_delete.htmlを取る
	@GetMapping("register_delete")
	public String register_delete() {
		return "register_delete";
	}
} 
