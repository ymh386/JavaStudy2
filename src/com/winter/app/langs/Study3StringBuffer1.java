package com.winter.app.langs;

public class Study3StringBuffer1 {
	
	public static void main(String[] args) {
		String str = "a";
		str = str + "b";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		sb.append("b");
		
		System.out.println(sb);//toString()
		
		str = sb.toString();
		
		
	}

}
