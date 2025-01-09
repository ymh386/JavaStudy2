package com.winter.app.io;

import java.io.File;

public class IoMain3 {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test", "Test.java");
		
		long size = file.length();
		System.out.println(size);
		
		file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test");
		
		String [] list = file.list();
		
		//향상
		for(String s:list) {
			//System.out.println(s);
			file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test", s);
			if(file.isDirectory()) {
				System.out.println("디렉토리 : " + s);
			}else if(file.isFile()) {
				System.out.println("파일 : " + s);
			}else {
				System.out.println("모름 : " + s);
			}
		}
		
		//기본 for문
//		for(int i=0;i<list.length;i++) {
//			file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test", list[i]);
//			if(file.isDirectory()) {
//				System.out.println("디렉토리 : " + list[i]);
//			}else if(file.isFile()){
//				System.out.println("파일 : " + list[i]);
//			}else {
//		System.out.println("모름 : " + s);
//	        }
//		}
		
		//
		File [] files = file.listFiles();
		
		for(File f:files) {
			System.out.println(f.getName());
		}
	}

}
