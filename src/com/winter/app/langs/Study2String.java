package com.winter.app.langs;

public class Study2String {
	
	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String name = "winter";
		char ch = name.charAt(2);
		System.out.println(ch);
		
		for(int i=0;i<name.length();i++) {
			ch = name.charAt(i);
			System.out.println(ch);
		}
		
		int idx = name.indexOf('z');
		System.out.println(idx);
		idx = name.indexOf("it");
		System.out.println(idx);
		idx=name.indexOf('t', 2);
		
		name = "aaaaaaa";
		String find="a";
		
		//2 1 -> 3번부터
		//3 2 -> 4번부터
		//9 3 -> 10번부터
		//-1이 나오면 종료
		idx=0;
		int count=0;
		while(idx>=0) {
			idx=name.indexOf(find,idx);
			if(idx>=0) {
				count++;
				idx++;//idx=idx+1
			}
		}
		System.out.println(count+" 개 찾음");
		
		count=0;
		for(int i=0;i<name.length();i++) {
			if('1'==name.charAt(i)) {
				count++;
			}
		}
		System.out.println(count+" 개 찾음");
	}

}
