package com.winter.app.users;

import java.util.Scanner;

public class UserController {
	
	private UserService userService;
	private UserInput userInput;
	
	public UserController() {
		// TODO Auto-generated constructor stub
		this.userService = new UserService();
		this.userInput = new UserInput();
	}

	public void start(Scanner sc) throws Exception {
		
		//로그인, 회원가입, 수정, 회원목록, 마이페이지, 탈퇴
		boolean check = true;
		
		while(check) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원목록");
			System.out.println("4.종료");
			
			int select = sc.nextInt();
			
			if(select == 1) {
				//회원가입
				UserDTO userDTO = userInput.join(sc);
				int result = userService.join(userDTO);
				if(result > 0) {
					
				}
			}else if(select == 2) {
				//로그인
				UserDTO userDTO = userInput.login(sc);
				userDTO = userService.login(userDTO);
			}else if(select == 3) {
				//목록조회
			}else {
				break;
			}
		}
	}
}
