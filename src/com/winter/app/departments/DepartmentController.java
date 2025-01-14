package com.winter.app.departments;

import java.util.Scanner;

public class DepartmentController {
	
	private DepartmentDAO dd = new DepartmentDAO();
	private DepartmentView departmentView = new DepartmentView();
	
	public void start(Scanner sc) throws Exception {
		boolean check = true;
		while(check) {
			
			System.out.println("1. 부서 리스트 출력 2. 부서 상세정보 출력 3. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				dd.getList();
			}else if(select == 2) {
				DepartmentDTO departmentDTO = dd.getDetail();
				if(departmentDTO != null) {
					departmentView.view(departmentDTO);
				}else {
					departmentView.view("없는 부서입니다");
				}
			} else {
				System.out.println("안녕히 가세요");
				break;
			}
		}
	}

}
