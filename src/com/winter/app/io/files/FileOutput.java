package com.winter.app.io.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
	private Scanner sc;
	
	public FileOutput() {
		sc=new Scanner(System.in);
	}
	
	public void add() {
		//도시명, 기온, 습도, 날씨상태를 입력 받아서
		//sample.txt에 추가
		
//		System.out.println("도시명 입력");
//		String name=sc.next();
//		System.out.println("온도 입력");
//		int gion = sc.nextInt();
//		System.out.println("습도 입력");
//		double h =sc.nextDouble();
//		System.out.println("날씨 입력");
//		String s =sc.next();
//		String result = name+"-"+gion+"-"+h+"-"+s;
//		//도시명-기온-습도-상태
//		this.output(result);
		
		StringBuffer sb = new StringBuffer();
		System.out.println("도시명 입력");
		sb.append(sc.next());
		sb.append("-");
		System.out.println("기온 입력");
		sb.append(sc.next());
		sb.append("-");
		System.out.println("습도 입력");
		sb.append(sc.next());
		sb.append("-");
		System.out.println("날씨 입력");
		sb.append(sc.next());
		
		String data = sb.toString();
		this.output(data);
		
	}
	
	public void write() {
		boolean check = true;
		while(check) {
			System.out.println("입력(\'end\'입력 시 종료)");
			String data=sc.next();
			if(data.toUpperCase().equals("end")) {
				break;
			}
			this.output(data);	
		}
		
		
		sc.close();
	}
	
	private void output(String data) {
		System.out.println("호출");
		//파일에 내용을 출력
		File file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test\\sample.txt");
		file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test", "sample.txt");
		FileWriter fw = null;
		try {
			//false : 기존의 파일을 삭제
			//true : 기존의 파일에 내용 추가
			fw = new FileWriter(file, true);
			System.out.println();
			fw.write(data);
			fw.write("\r\n");
			//버퍼초기화
			fw.flush();
			//buffer를 강제로 비우기
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
