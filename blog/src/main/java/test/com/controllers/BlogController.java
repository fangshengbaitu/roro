package test.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
	//blog.htmlを取る
	@GetMapping("/blog")
	public String blog() {
		return "blog";
	}

}
