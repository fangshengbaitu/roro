package test.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BolgController {
	//bolg.htmlを取る
	@GetMapping("/bolg")
	public String bolg() {
		return "bolg";
	}

}
