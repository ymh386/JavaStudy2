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

public class ServerMain {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Server Start");
		
		WeatherController wc = new WeatherController();
		wc.start();
		
		//클라이언트에서 데이터를 받기
		//1이 오면 sample.txt내용을 읽어서
		//한줄로 만든 다음에 client로 전송
		
	}

}
