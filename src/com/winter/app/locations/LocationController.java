package com.winter.app.locations;

import java.util.List;
import java.util.Scanner;

public class LocationController {
	
	private LocationService locationService;
	private LocationView locationView;
	
	public LocationController() {
		// TODO Auto-generated constructor stub
		locationService = new LocationService();
		locationView = new LocationView();
	}
	
	public void start(Scanner sc) throws Exception {
		
		boolean check = true;
		while(check) {
			
			System.out.println("1. 지역 리스트 출력 2. 지역 상세정보 출력 3. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				List<LocationDTO> ar = locationService.getList();
				locationView.view(ar);
			} else if(select == 2) {
				LocationDTO locationDTO = locationService.getDetail(sc);
				if(locationDTO != null) {
					locationView.view(locationDTO);
				} else {
					locationView.view("없는 지역입니다");
				}
			} else {
				System.out.println("안녕히 가세요");
				break;
			}
		}
		
	}

}
