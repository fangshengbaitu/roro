package test.com.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.com.models.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

	//保存&更新
	Blog save(Blog blog);
	
	//SELECT * FROM Blog
	// ProductRepository  24行
	List<Blog> findAll();
	

	
}
