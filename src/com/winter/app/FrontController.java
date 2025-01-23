package com.winter.app;

import java.util.Scanner;

import com.winter.app.countries.CountryController;
import com.winter.app.departments.DepartmentController;
import com.winter.app.employees.EmployeeController;
import com.winter.app.locations.LocationController;

public class FrontController {
	private Scanner sc;
	public FrontController() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
	}
	DepartmentController dc = new DepartmentController();
	LocationController lc = new LocationController();
	CountryController cc = new CountryController();
	EmployeeController ec = new EmployeeController();
	
	public void start() throws Exception {
		boolean check = true;
		while(check) {
			System.out.println("1. 부서정보보기 2. 지역정보보기 3. 나라정보보기 4. 사원정보보기 5. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				dc.start(sc);
			} else if(select == 2) {
				lc.start(sc);
			} else if(select == 3) {
				cc.start(sc);
			} else if(select == 4) {
				ec.start(sc);
			} else {
				System.out.println("종료");
				break;
			}
			
		}
	}

}
