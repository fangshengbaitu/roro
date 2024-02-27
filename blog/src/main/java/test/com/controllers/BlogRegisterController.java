package test.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import test.com.models.Account;
import test.com.models.Blog;
import test.com.service.BlogService;

@Controller
public class BlogRegisterController {

	@Autowired
	private BlogService blogService;
	
	@Autowired
	private HttpSession session;
	
	//blogからloginのページにいく
	@GetMapping("/blog/register")
	public String getBlogRegister() {
		return "register_login";
	}
	//ProductController　56-98まで
	//
	@PostMapping("/register_login")
	public String getRegisterLoginpage(@RequestParam String blogTitle,
			@RequestParam String blogDate,@RequestParam String blogArticle) {
		//Blog blog =(Blog) session.getAttribute("blogInfo");
		Account user =(Account) session.getAttribute("userInfo");
		if(user == null) {
			return "redirect:/login";
		}else {
			//model.addAttribute("blogName",blog.getBlogTitle());
			if(blogService.createBlog(blogTitle,blogDate,blogArticle,user.getId())) {
				return "redirect:/blog";
			}else {
				return"register_login";
			}
		
		}
	}
	
}
