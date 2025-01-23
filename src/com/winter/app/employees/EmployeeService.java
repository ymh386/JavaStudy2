package com.winter.app.employees;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeService {
	
	//의존성(Defendency)
	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		employeeDAO = new EmployeeDAO();
	}
	
	//list
	public List<EmployeeDTO> getList(Scanner sc) throws Exception {
		System.out.println("검색어 입력");
		String search = sc.next();
		
		List<EmployeeDTO> ar = employeeDAO.getList(search);
		
		return ar;
	}
	
	public void getList() throws Exception {
		Map<String, Object> map = employeeDAO.getInfo();
		Iterator<String> it = map.keySet().iterator();
		System.out.println("월급평균\t\t사원수");
		while(it.hasNext()) {
			String key = it.next();
			Object obj = map.get(key);
			System.out.print(obj + "\t\t");
		}
		System.out.println();
		
	}
	
	

}
