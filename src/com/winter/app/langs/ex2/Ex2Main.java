package com.winter.app.langs.ex2;

public class Ex2Main {
	
	public static void main(String[] args) {
//		WeatherInfo wi = new WeatherInfo();
//		WeatherDTO [] wtds = wi.init();
//		
//		WeatherView weatherView = new WeatherView();
//		weatherView.view(wtds);
		
		WeatherController wc = new WeatherController();
		wc.start();
				
	}

}
