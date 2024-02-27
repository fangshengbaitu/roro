package test.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.com.models.Blog;
import test.com.repository.BlogRepository;

@Service
public class BlogService {
	@Autowired
	private BlogRepository blogRepo;
	
	//ブログ一覧チェック
	public List<Blog> selectAll(Long userId){
		if(userId == null) {
			return null;
		}else {
			return blogRepo.findAll();
		}
	}
	
	//　ProductService　30-38行を参考
	//登録ブログの確認
	public boolean createBlog(String blogTitle,String blogDate,String blogArticle,Long userId) {
		if(userId == null) {
			return false;
		}else {
			blogRepo.save(new Blog(blogArticle,blogDate,blogTitle,userId));
			return true;
			
		}
	}
}
