package com.winter.app.employees;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
	
	private EmployeeService employeeService;
	private EmployeeView employeeView;
	
	public EmployeeController() {
		// TODO Auto-generated constructor stub
		employeeService = new EmployeeService();
		employeeView = new EmployeeView();
	}
	
	public void start(Scanner sc) throws Exception {
		boolean check = true;
		while(check) {
			System.out.println("1. 직원 리스트 출력 2. 직원 상세정보 출력 3. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				
				List<EmployeeDTO> ar = employeeService.getList(sc);
				
				employeeView.view(ar);
			}else if(select == 2) {
				employeeService.getList();
			}else {
				System.out.println("안녕히가세요");
				break;
			}
		}
	}

}
