package com.winter.app.langs.ex2;

import java.util.ArrayList;

public class WeatherView {
	
	public void view() {
		System.out.println("도시\t기온\t습도\t현재상태");
	}
	
	public void view(String message) {
		System.out.println();
	}

	public void view(ArrayList<WeatherDTO> ar) {
		//WeatherDTO들의 정보를 출력
		this.view();
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i).getCity() + "\t");
			System.out.print(ar.get(i).getGion() + "\t");
			System.out.print(ar.get(i).getHumidity() + "\t");
			System.out.println(ar.get(i).getStatus());
		}
	}
	public void findView(WeatherDTO dto) {
		this.view();
		System.out.print(dto.getCity() + "\t");
		System.out.print(dto.getGion() + "\t");
		System.out.print(dto.getHumidity() + "\t");
		System.out.println(dto.getStatus());
	}
}
