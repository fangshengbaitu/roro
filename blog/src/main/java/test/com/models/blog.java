package test.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class blog {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long blogId;
	
	private String blogArticle;
	private String blogInfo;
	private String blogTitle;
	
	//空　コンストラクタ
	public blog() {

	}
	
	public blog(String blogArticle, String blogInfo, String blogTitle) {
		this.blogArticle = blogArticle;
		this.blogInfo = blogInfo;
		this.blogTitle = blogTitle;
	}

	
	//カプセル化
	public long getBlogId() {
		return blogId;
	}

	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}

	public String getBlogArticle() {
		return blogArticle;
	}

	public void setBlogArticle(String blogArticle) {
		this.blogArticle = blogArticle;
	}

	public String getBlogInfo() {
		return blogInfo;
	}

	public void setBlogInfo(String blogInfo) {
		this.blogInfo = blogInfo;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	
	
	

}
