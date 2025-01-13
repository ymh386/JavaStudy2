package com.winter.app.io.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileInput {
	
	
	public ArrayList<Weather> input() throws Exception {
		File file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test\\sample.txt");
		file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test", "sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<Weather> ar = new ArrayList<>();
		
		boolean check = true;
			while(check) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				
				StringTokenizer st = new StringTokenizer(data, "-");
//			System.out.print(st.nextToken() + "\t");
//			System.out.print(st.nextToken() + "\t");
//			System.out.print(st.nextToken() + "\t");
//			System.out.println(st.nextToken());
				//Weather에 Data입력하고
				//Weather들을 모아서 리턴
				//main 메서드에 모든 내용을 출력
				while(st.hasMoreTokens()) {
					
					Weather weather = new Weather();
					
					weather.setCity(st.nextToken());
					weather.setGion(Integer.parseInt(st.nextToken()));
					weather.setHuminity(Double.parseDouble(st.nextToken()));
					weather.setStatus(st.nextToken());
					
					ar.add(weather);
				}
			}
			if(!ar.isEmpty()) {
				br.close();
				fr.close();
				return ar;
			} else {
				br.close();
				fr.close();
				return null;
			}
			
	}
	

}
