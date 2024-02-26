package test.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
	//register.htmlを取る
	@GetMapping("/register")
	public String register() {
		return "register";
	}

}
