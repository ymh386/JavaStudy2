package com.winter.app.langs.ex1;

import java.util.ArrayList;
import java.util.Scanner;

import com.winter.app.langs.ex2.WeatherDTO;

public class PersonController {
	private PersonInfo pi;
	private PersonView pv;
	private Scanner sc;
	
	public PersonController() {
		this.pi = new PersonInfo();
		this.pv = new PersonView();
		this.sc = new Scanner(System.in);
	}
	
	public void start() {
		//참고 : JavaStudy1->Study2_Object-> con.winter.app.study2.object2
		//1. 주소록 초기화
		//2. 주소록 출력
		//3. 검색(이름, PathInfo.find())
		//4. 주소록 정보 추가(PathInfo.add())
		//5. 주소록 삭제(이름으로 검색 후 삭제 PathInfo.delete())
		//6. 종료
		boolean check = true;
		ArrayList<Person> ar = null;
		while(true) {
			System.out.println("1. 주소록 초기화");
			System.out.println("2. 주소록 출력");
			System.out.println("3. 주소록 검색");
			System.out.println("4. 주소록 추가");
			System.out.println("5. 주소록 삭제");
			System.out.println("6. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				ar = pi.init();
			}else if(select == 2) {
				pv.view(ar);
			}else if(select == 3) {
				Person person = pi.find(ar, sc);
				if(person != null) {
					pv.findView(person);	
				}else {
					System.out.println("해당 도시를 찾지못했습니다.");
				}
			}else if(select == 4) {
				pi.make(ar, sc);
				
			}else if(select == 5) {
				pi.delete(ar, sc);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
