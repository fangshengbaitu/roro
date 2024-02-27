package test.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import test.com.models.Account;
import test.com.models.Blog;
import test.com.service.BlogService;

@Controller
public class BlogController {
	//blog.htmlを取る
//	@GetMapping("/blog")
//	public String blog() {
//		return "blog";
//	}
	
	@Autowired
	private BlogService blogservice;
	
	@Autowired
	private HttpSession session;

	//ProductController　　37-48まで
	//blog　一覧を戻る
	@GetMapping("/blog")
	public String getBlogpage(Model model) {
		Account user =(Account) session.getAttribute("userInfo");
		if(user == null) {
			return "redirect:/login";
		}else {
			model.addAttribute("blogList",blogservice.selectAll(user.getId()));
			//model.addAttribute("blogname",blog.getBlogTitle());
			return"blog.html";
		}
	}
	
}
