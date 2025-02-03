package com.winter.app.users;

import java.util.Scanner;

public class UserInput {
	
	//가입정보 입력
	public UserDTO join(Scanner sc) {
		UserDTO userDTO = new UserDTO();
		System.out.println("ID를 입력하세요");
		userDTO.setUsername(sc.next());
		System.out.println("PW를 입력하세요");
		userDTO.setPassword(sc.next());
		System.out.println("Name을 입력");
		userDTO.setName(sc.next());
		System.out.println("전화번호 입력");
		userDTO.setPhone(sc.next());
		System.out.println("이메일 입력");
		userDTO.setEmail(sc.next());
		
		return userDTO;
	}
	
	//로그인 입력
	public UserDTO login(Scanner sc) {
		UserDTO userDTO = new UserDTO();
		System.out.println("ID를 입력하세요");
		userDTO.setUsername(sc.next());
		System.out.println("PW를 입력하세요");
		userDTO.setPassword(sc.next());
		
		return userDTO;
	}

}
