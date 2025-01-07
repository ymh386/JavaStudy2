package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호입력");
		String birth = sc.next();//971225-1234567
		String birthYear = birth.substring(0, 2);
		String sexNum = birth.substring(7, 8);
		
		
		int year = Integer.parseInt(birthYear);
		int num = Integer.parseInt(sexNum);
		
		
		if(num == 1 || num == 2) {
			System.out.println(2025 - (year + 1900) + 1);
		}else {
			System.out.println(25 - year + 1);
		}
		
		//월, 3-5 : 봄 6-8 : 여름 9-11 : 가을 12-2 : 겨울
		String birthMonth = birth.substring(2, 4);
		
		int month = Integer.parseInt(birthMonth);
		
		if(month>=3 && month<=5) {
			System.out.println("봄");
		}else if(month>=6 && month<=8) {
			System.out.println("여름");
		}else if(month>=9 && month<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
	}

}
