package com.winter.app.io.files;

import java.util.ArrayList;
import java.util.List;

public class FileMain {
	
	public static void main(String[] args) {
//		FileOutput fileOutput = new FileOutput();
//		fileOutput.write();
		FileInput fileInput = new FileInput();
		FileOutput fileOutput = new FileOutput();
		
		fileOutput.add();
		
		try {
			List<Weather> ar = fileInput.input();
			System.out.println("지역\t온도\t습도\t날씨");
			for(Weather weather:ar) {	
				weather.info();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
