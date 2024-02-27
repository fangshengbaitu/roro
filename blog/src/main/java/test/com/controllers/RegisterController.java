package test.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.com.service.AccountService;

@Controller
public class RegisterController {
	@Autowired
	private AccountService accuntservice;
	
	//register.htmlを取る
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	//もし、accuntservice.accountUser == true　login.html
	//そうでない場合は、register.html
	@PostMapping("/register")
	public String register(@RequestParam String name,
			@RequestParam String email,@RequestParam String password) {
		//							順番が重要
		if(accuntservice.accountUser(name,email,password)) {
			return "login.html";
		}else {
			return "registet.html";
		}
	}
	
}

