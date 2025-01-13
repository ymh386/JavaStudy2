package com.winter.app.network.ex.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.winter.app.io.files.Weather;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Client Start");
		Socket socket = new Socket("192.168.200.14", 8282);
		System.out.println("서버와 접속 성공");
		File file = new File("C:\\Users\\dbsan\\OneDrive\\바탕 화면\\구디\\JAVA\\test", "sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
//		ArrayList<Weather> ar = new ArrayList<>(); 
//		
//		boolean check = true;
//		while(check) {
//			String data = br.readLine();
//			if(data == null) {
//				break;
//			}
//			StringTokenizer st = new StringTokenizer(data, "-");
//			while(st.hasMoreTokens()) {
//				
//				Weather weather = new Weather();
//				
//				weather.setCity(st.nextToken());
//				weather.setGion(Integer.parseInt(st.nextToken()));
//				weather.setHuminity(Double.parseDouble(st.nextToken()));
//				weather.setStatus(st.nextToken());
//				
//				ar.add(weather);
//			}
//		}
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		
		boolean check = true;
		while(check) {
			String data = br.readLine();
			if(data == null) {
				break;
			}
			bw.write(data);
			bw.write("\r\n");
			bw.flush();
		}
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		String data2 = br.readLine();
		
		WeatherView wv = new WeatherView();
		wv.view(data2);
		
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		br.close();
		fr.close();
		socket.close();

		
		
		
		
	}
	
}
