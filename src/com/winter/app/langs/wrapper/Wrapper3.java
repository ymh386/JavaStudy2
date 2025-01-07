package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();//971226-1234567
		
		//	9	7	1	2	2	6	-	1	2	3	4	5	6	7
		//*2	3	4	5	6	7		8	9	2	3	4	5	마지막번호는 검증용번호
		//18  +	21 +	.....................						총합계 구하기
		//122
		//11로 나눈 나머지값 구하기 ex) 0~10
		//11-나머지 결과값 구하기
		//나머지값을 검증용번호와 일치하는지 확인 1==7
		//만약에 나머지 값이 두자리 수라면
		//나머지값을 다시 10으로 나눈 나머지값을 구하기
		//나머지값을 검증용번호와 일치하는지 확인 1==7
		jumin = jumin.replace("-", "");
		
		String [] jumins = new String [13];
		int [] nums = new int [13];
		int sum = 0;
		for(int i=0;i<jumins.length;i++) {
			jumins[i] = jumin.substring(i, i+1);
			nums[i] = Integer.parseInt(jumins[i]);
			if(i >= 0  && i <= 7) {
				nums[i] = nums[i]*(i+2);
			}else if(i >=8 && i <= 11) {
				nums[i] = nums[i]*(i-6);
			}
			if(i != 12) {
				sum = sum + nums[i];	
			}
		}
		
		sum = sum % 11;
		sum = 11 - sum;
		if(sum == 10) {
			sum = sum % 10;
		}
		System.out.println(sum == nums[12]);
	}

}
