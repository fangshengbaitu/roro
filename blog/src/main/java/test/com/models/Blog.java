package test.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Blog {
	



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long blogId;
	
	private String blogArticle;
	private String blogDate;
	private String blogTitle;
	private Long userId;
	
	//空　コンストラクタ
	public Blog() {

	}
	
	public Blog(String blogArticle, String blogDate, String blogTitle, Long userId) {
		this.blogArticle = blogArticle;
		this.blogDate = blogDate;
		this.blogTitle = blogTitle;
		this.userId = userId;
	}

	//カプセル化
	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public String getBlogArticle() {
		return blogArticle;
	}

	public void setBlogArticle(String blogArticle) {
		this.blogArticle = blogArticle;
	}

	public String getBlogDate() {
		return blogDate;
	}

	public void setBlogDate(String blogDate) {
		this.blogDate = blogDate;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	

	
	
	

}
