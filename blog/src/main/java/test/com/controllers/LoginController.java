package test.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class LoginController {
	//login.htmlを取る
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	//メッセージを出す
//	@PostMapping("/login")
//	public String login(@RequestParam String username,@RequestParam String password) {
//		System.out.println("Username:" + username);
//		System.out.println("Password:" + password);
//		
//		if(username.equals("admin") && password.equals("roro123456")) {
//			return "redirect:/bolg";
//		}else {
//			return "redirect:/login";
//		}
//	}

}