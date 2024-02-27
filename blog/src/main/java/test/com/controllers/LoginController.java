package test.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import test.com.models.Account;
import test.com.service.AccountService;



@Controller
public class LoginController {
	//他のメゾンドを呼び出し
	@Autowired
	private AccountService accountSercice;
	
	//Sessionを使えるように宣言
	@Autowired
	private HttpSession session;
	
	//login.htmlを取る
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	//メッセージを出す
	@PostMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password) {
		Account user = accountSercice.checkLogin(username,password);
		if(user == null) {
			return "login.html";
		}else {
			session.setAttribute("userInfo",user);
			return "redirect:/blog";
		}
	}
	
	//ログアウト処理
	@GetMapping("/logout")
	public String logout() {
		//セッションの無効化
		session.invalidate();
		return "redirect:/login";
	}

}
