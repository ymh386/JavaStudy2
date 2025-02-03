package com.winter.app.accounts;

import java.util.Calendar;

public class AccountService {

	private AccountDAO accountDAO;
	
	public AccountService() {
		// TODO Auto-generated constructor stub
		accountDAO = new AccountDAO();
	}
	
	private static long count=1;
	
	//가입
	public int add(AccountDTO accountDTO) throws Exception{
		// 중복X
		// 날짜.
		// 2025-01-24 10:25:25:125
		// 12345-12-12345
		Calendar calenadar = Calendar.getInstance();
		
		
		return 0;
	}
}
