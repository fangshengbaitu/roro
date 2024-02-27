package test.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.com.models.Account;
import test.com.repository.AccountRepository;

@Service
public class AccountService {
//注册 判断当前用户名是否存在
//得到的用户信息存入数据库
//使用repository实现
//注册方法 三个参数 用户名 密码 邮件 →controller中实现
//调用service中的方法
//参考课件6.4 第24页开始

	//実装
	@Autowired
	private AccountRepository userRepo;	
	
	//userの登録処理と登録するためのチェック　boolean
	//もし、findByName == null だったらsaveを使って保存処理をする
	//そうでない場合は、保存処理をしない
	//				             RegisterController と一致順番が重要
	public boolean accountUser(String name,String email,String password) {
		if(userRepo.findByName(name) == null) {
			//　ACCOUNT.JAVAの順番と一致
			userRepo.save(new Account(name,email,password));
			return true;
		}else {
			return false;
		}
	}
	
	
	//findByNameAndPassword == null ログインしない　null
	//そうでない場合はログインをする　ログインしているの情報を渡す
	public Account checkLogin(String name,String password) {
		Account account = userRepo.findByNameAndPassword(name,password);
		if(account == null) {
			return null;
		}else {
			return account;
		}
	}
	
	
			  	
}
