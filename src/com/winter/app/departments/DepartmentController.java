package com.winter.app.departments;

import java.util.List;
import java.util.Scanner;

public class DepartmentController {
	
	private DepartmentService departmentService;
	private DepartmentView departmentView;
	
	public DepartmentController() {
		// TODO Auto-generated constructor stub
		departmentService = new DepartmentService();
		departmentView = new DepartmentView();
	}
	
	public void start(Scanner sc) throws Exception {
		boolean check = true;
		while(check) {
			
			System.out.println("1. 부서 리스트 출력 2. 부서 상세정보 출력 3. 종료");
			int select = sc.nextInt();
			if(select == 1) {
				List<DepartmentDTO> ar = departmentService.getList();
				departmentView.view(ar);
			}else if(select == 2) {
				DepartmentDTO departmentDTO = departmentService.getDetail(sc);
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
