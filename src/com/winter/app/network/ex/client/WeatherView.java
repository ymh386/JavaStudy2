package com.winter.app.network.ex.client;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherView {
	
	public void view(String data2) {
		ArrayList<WeatherDTO> ar = new ArrayList<>(); 
		
		data2 = data2.replace('*', ',');
			StringTokenizer st = new StringTokenizer(data2, ",");
			while(st.hasMoreTokens()) {
				
				WeatherDTO weather = new WeatherDTO();
				
				weather.setCity(st.nextToken());
				weather.setGion(Integer.parseInt(st.nextToken()));
				weather.setHuminity(Double.parseDouble(st.nextToken()));
				weather.setStatus(st.nextToken());
				
				ar.add(weather);
			}
			System.out.println("도시\t기온\t습도\t날씨");
			for(int i=0;i<ar.size();i++) {
				System.out.print(ar.get(i).getCity() + "\t");
				System.out.print(ar.get(i).getGion() + "\t");
				System.out.print(ar.get(i).getHuminity() + "\t");
				System.out.println(ar.get(i).getStatus());
				
			}
		}
}
