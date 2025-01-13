package com.winter.app.network;

import java.io.BufferedOutputStream;
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

public class StudyServer {
	
	public static void main(String[] args) throws IOException {
		
		//클라이언트의 접속을 기다림
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트의 접속을 기다리는 중");
		Scanner sc = new Scanner(System.in);
		
		//Client와 1:1 Socket 연결
		Socket socket = ss.accept();
		System.out.println("클라이언트와 연결 성공");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		boolean check = true;
		while(check) {
			String message = br.readLine();
			if(message.equals("end")) {
				break;
			}
			
			System.out.println("Client : " + message);
			System.out.println("클라이언트로 보낼 메세지 입력");
			message = sc.next();
			
			bw.write(message);
			bw.write("\r\n");
			bw.flush();
			if(message.equals("end")) {
				break;
			}

			
		}
		bw.close();
		ow.close();
		os.close();
		br.close();
		ir.close();
		is.close();
		socket.close();
		sc.close();
		ss.close();
		
		
	}

}
