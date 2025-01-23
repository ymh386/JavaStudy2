package com.winter.app.countries;

import java.util.List;
import java.util.Scanner;

public class CountryController {
	
	private CountryService countryService;
	private CountryView countryView;
	
	public CountryController() {
		// TODO Auto-generated constructor stub
		countryService = new CountryService();
		countryView = new CountryView();
	}
	
	public void start(Scanner sc) throws Exception {
		
		boolean check = true;
		while(check) {
			
			System.out.println("1. 나라 리스트 출력 2. 나라 상세정보 출력 3. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				List<CountryDTO> ar = countryService.getList();
				countryView.view(ar);
			} else if(select == 2) {
				CountryDTO countryDTO = countryService.getDetail(sc);
				if(countryDTO != null) {
					countryView.view(countryDTO);
				}else {
					countryView.view("없는 나라입니다");
				}
			}else {
				System.out.println("안녕히가세요");
				break;
			}
			
			
		}
	}

}
