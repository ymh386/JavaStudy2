package com.winter.app;

import java.util.UUID;

import com.winter.app.ztest.DBConnectionTest;

public class AppMain {
	
	public static void main(String[] args) {
		//프로그램 실행, 또는 테스트 코드 실행
		String id = UUID.randomUUID().toString();
		System.out.println(id);
	}

}
