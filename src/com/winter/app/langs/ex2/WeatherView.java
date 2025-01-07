package com.winter.app.langs.ex2;


public class WeatherView {
	
	public void view() {
		System.out.println("도시\t기온\t습도\t현재상태");
	}
	
	public void view(String message) {
		System.out.println();
	}

	public void view(WeatherDTO [] dtos) {
		//WeatherDTO들의 정보를 출력
		this.view();
		for(int i=0;i<dtos.length;i++) {
			System.out.println(dtos[i].getCity() + "\t" + dtos[i].getGion() + "\t" + dtos[i].getHumidity() + "\t" + dtos[i].getStatus());
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
