package com.winter.app.langs.ex2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherInfo {
	
	private StringBuffer info;
	
	public WeatherInfo() {
		this.info = new StringBuffer();
		this.info.append("seoul, 10, 0.3, 맑음,");
		this.info.append("일산, -12, 0.56, 흐림,");
		this.info.append("인천* 32* 0.95* 무더위,");
		this.info.append("제주* 56* 0.02* 건조");
	}
	
	public WeatherDTO [] init() {
		String str = this.info.toString();
		str = str.replace("*", ",");
		StringTokenizer st = new StringTokenizer(str, ",");
		WeatherDTO [] dtos = new WeatherDTO [st.countTokens()/4];
		int idx = 0;
			while(st.hasMoreTokens()) {
				WeatherDTO dto = new WeatherDTO();
				dtos[idx] = dto;
				dto.setCity(st.nextToken().trim());
				dto.setGion(Integer.parseInt(st.nextToken().trim()));
				dto.setHumidity(Double.parseDouble(st.nextToken().trim()));
				dto.setStatus(st.nextToken().trim());
				idx++;
			
		}
		return dtos;
		
	}
	
	public WeatherDTO [] init_old() {
		//info의 정보를 파싱해서
		//WeatherDTO에 담아서
		//WeatherDTO들을 리턴
		String str = this.info.toString();
		str = str.replace("*", ",");

		String [] datas = str.split(",");
		WeatherDTO [] dtos = new WeatherDTO [datas.length/4];
		for(int i=0;i<datas.length;i++) {
			WeatherDTO dto = new WeatherDTO();
			dtos[i/4] = dto;
			dto.setCity(datas[i].trim());
			dto.setGion(Integer.parseInt(datas[++i].trim()));
			dto.setHumidity(Double.parseDouble(datas[++i].trim()));
			dto.setStatus(datas[++i].trim());
		
		}
		return dtos;
	}
	
	public WeatherDTO find(WeatherDTO [] dtos, Scanner sc) {
		System.out.println("도시명을 검색하시오.");
		String find = sc.next();
		WeatherDTO dto = null;
		
		for(int i=0;i<dtos.length;i++) {
			dto = dtos[i];
			if(dto.getCity().equals(find)) {
				return dtos[i];
			}
		}
		
		return null;
	}
	
	public WeatherDTO [] make(WeatherDTO [] dtos, Scanner sc) {
		WeatherDTO dto = new WeatherDTO();
		System.out.println("도시입력");
		dto.setCity(sc.next());
		System.out.println("기온입력");
		dto.setGion(sc.nextInt());
		System.out.println("습도입력");
		dto.setHumidity(sc.nextDouble());
		System.out.println("날씨입력");
		dto.setStatus(sc.next());
		
		WeatherDTO [] copys = new WeatherDTO[dtos.length + 1];
		for(int i=0;i<dtos.length;i++) {
			copys[i] = dtos[i];
		}
		copys[dtos.length] = dto;
		return copys;
	}
	
	public WeatherDTO [] delete(WeatherDTO [] dtos, Scanner sc) {
		WeatherDTO dto = new WeatherDTO();
		System.out.println("삭제할 도시 이름 검색");
		String remove = sc.next();
		WeatherDTO [] copys = new WeatherDTO[dtos.length - 1];
		for(int i=0;i<dtos.length;i++) {
			int idx = 0;
			
			if(dtos[i].getCity().equals(remove)) {
				System.out.println("삭제할 도시 : " + dtos[i].getCity());
				continue;
			}
			copys[idx] = dtos[i];
			idx++;
		}
		return copys;
	}

}
