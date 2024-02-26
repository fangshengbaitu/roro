package test.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogDeleteController {
	//register_log.html を取る
	@GetMapping("/register_log")
	public String register_log() {
		return "register_log";
	}
	
	//register_delete.htmlを取る
	@GetMapping("register_delete")
	public String register_delete() {
		return "register_delete";
	}
}
