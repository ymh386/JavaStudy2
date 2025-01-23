package com.winter.app.tests;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;

public class DepartmentDAOTest {
	
	private DepartmentDAO departmentDAO;
	
	public DepartmentDAOTest() {
		// TODO Auto-generated constructor stub
		departmentDAO = new DepartmentDAO();
	}
	
	public void getNameTest() throws Exception {
		DepartmentDTO departmentDTO = departmentDAO.getName();
		System.out.println(departmentDTO.getDepartment_name());
	}

}
