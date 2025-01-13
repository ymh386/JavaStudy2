package com.winter.app.network.ex.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class WeatherController {
	
	public void start() throws IOException {
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트의 접속을 기다리는 중");
		Socket socket = ss.accept();
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		//1. 날씨정보출력
		//2. 종료
		boolean check = true;
		while(check) {
			System.out.println("1. 날씨정보출력 2. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("클라이언트와 연결 성공");
				
				InputStream is = socket.getInputStream();
				InputStreamReader ir = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(ir);
				
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter ow = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(ow);
				
				while(check) {
					String data = br.readLine();
					if(data == null) {
						break;
					}
					sb.append(data);
					sb.append(",");
				}
				String data2 = sb.toString();
				
				bw.write(data2);
				bw.write("\r\n");
				bw.flush();
				
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
				socket.close();
				ss.close();
				
				
			} else {
				System.out.println("종료");
				break;
			}
		}
		
		
	}

}
