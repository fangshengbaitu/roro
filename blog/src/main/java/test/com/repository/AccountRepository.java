package test.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.com.models.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
	//データの挿入処理　insert save
	//データの更新処理　update
	Account save(Account account);
	
	//finbBy~ SELECT * FRON WHERE~
	//SELECT * FRON name WHERE user_name=?
	//              nameの保存処理チェック
	Account findByName(String name);
	
	//SELECT * FRON name WHERE user_name=? And password=?
	//             ログインチェック
	Account findByNameAndPassword(String name,String password);
}
