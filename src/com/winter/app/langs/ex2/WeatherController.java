package com.winter.app.langs.ex2;

import java.util.Scanner;

public class WeatherController {
	
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	private Scanner sc;
	
	public WeatherController() {
		this.weatherInfo = new WeatherInfo();
		this.weatherView = new WeatherView();
		this.sc = new Scanner(System.in);
	}
	
	public void start() {
		boolean check = true;
		WeatherDTO [] dtos = null;
		while(check) {
			System.out.println("1. 날씨정보초기화");
			System.out.println("2. 날씨정보출력");
			System.out.println("3. 날씨정보검색");
			System.out.println("4. 날씨정보추가");
			System.out.println("5. 날씨정보삭제");
			System.out.println("6. 날씨정보종료");
			int select = this.sc.nextInt();
			if(select == 1) {
				dtos = this.weatherInfo.init();
			}else if(select == 2) {
				this.weatherView.view(dtos);
			}else if(select == 3) {
				WeatherDTO dto = weatherInfo.find(dtos, sc);
				if(dto != null) {
					weatherView.findView(dto);	
				}else {
					System.out.println("해당 도시를 찾지못했습니다.");
				}
			}else if(select == 4) {
				dtos = weatherInfo.make(dtos, sc);
				
			}else if(select == 5) {
				dtos = weatherInfo.delete(dtos, sc);
				
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
