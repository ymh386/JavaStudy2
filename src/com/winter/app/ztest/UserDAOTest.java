package com.winter.app.ztest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

import com.winter.app.users.UserDAO;
import com.winter.app.users.UserDTO;
import com.winter.app.utils.DBConnection;

public class UserDAOTest {
	private UserDAO userDAO;
	
	public UserDAOTest() {
		// TODO Auto-generated constructor stub
		userDAO = new UserDAO();
	}
	
	public int joinTest() throws Exception {
		UserDTO userDTO = new UserDTO();
		userDTO.setUsername("ymh38630");
		userDTO.setPassword("010602ymh!");
		userDTO.setName("윤문현");
		userDTO.setPhone("010-2304-1298");
		userDTO.setEmail("dbsansgus06@naver.com");
		
		int result = userDAO.join(userDTO);
		
		if(result > 0) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
		
		return result;
		
		
	}
	public void getListTest() throws Exception {
		List<UserDTO> ar = userDAO.getList();
		for(UserDTO dto : ar) {
			System.out.print(dto.getUsername() + "\t\t");
			System.out.print(dto.getName() + "\t\t");
			System.out.print(dto.getPhone() + "\t\t");
			System.out.println(dto.getEmail());
		}
		
	}
	
	public void getDetailTest() throws Exception {
		Scanner sc = new Scanner(System.in);
		UserDTO dto = new UserDTO();
		System.out.println("아이디 입력");
		dto.setUsername(sc.next());
		dto = userDAO.getDetail(dto);
		System.out.print(dto.getUsername() + "\t\t");
		System.out.print(dto.getPassword() + "\t\t");
		System.out.print(dto.getName() + "\t\t");
		System.out.print(dto.getPhone() + "\t\t");
		System.out.println(dto.getEmail());
	}

}
