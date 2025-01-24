package com.winter.app.ztest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.winter.app.accounts.AccountDAO;
import com.winter.app.accounts.AccountDTO;
import com.winter.app.products.ProductDTO;
import com.winter.app.users.UserDTO;

public class AccountDAOTest {
	
	private AccountDAO dao;
	
	public AccountDAOTest() {
		// TODO Auto-generated constructor stub
		dao = new AccountDAO();
	}
	
	public void joinTest() throws Exception {
		AccountDTO dto = new AccountDTO();
		dto.setAccountNum("666-777-888-99");
		dto.setUsername("ymh38630");
		dto.setProductNum(2);
		dto.setAccountBalance(1000000);
		
		int result = dao.join(dto);
		
		if(result > 0) {
			System.out.println("개설 성공");
		}else {
			System.out.println("개설 실패");
		}
	}
	
	public void getListTest() throws Exception {
		Scanner sc = new Scanner(System.in);
		AccountDTO dto = new AccountDTO();
		System.out.println("찾을계좌들의 id입력");
		dto.setUsername(sc.next());
		List<AccountDTO> ar = dao.getList(dto);
		for(AccountDTO dto2:ar) {
			System.out.print(dto2.getAccountNum() + "\t\t");
			System.out.print(dto2.getUsername() + "\t\t");
			System.out.print(dto2.getProductNum() + "\t\t");
			System.out.print(dto2.getAccountBalance() + "\t\t");
			System.out.println(dto2.getAccountDate());
		}
//		for(int i=0;i<ar.size();i++) {
//			System.out.print(ar.get(i).getAccountNum() + "\t\t");
//			System.out.print(ar.get(i).getUsername() + "\t\t");
//			System.out.print(ar.get(i).getProductNum() + "\t\t");
//			System.out.print(ar.get(i).getAccountBalance() + "\t\t");
//			System.out.println(ar.get(i).getAccountDate());
//		}
		
	}

}
