package com.winter.app;

import com.winter.app.departments.DepartmentController;
import com.winter.app.departments.DepartmentDAO;
import com.winter.app.locations.LocationController;
import com.winter.app.locations.LocationDAO;
import com.winter.app.tests.DepartmentDAOTest;
import com.winter.app.utils.DBConnection;

public class AppMain {
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 실행");
//		DBConnection dc = new DBConnection();
//		dc.getConnection();3
		
//		Test test = new Test();
//		test.m1();
		
		DepartmentDAO dd = new DepartmentDAO();
		LocationDAO ld = new LocationDAO();
		DepartmentController dc = new DepartmentController();
		LocationController lc = new LocationController();
		FrontController fc = new FrontController();
		
		try {
//			dd.getList();
			fc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		DepartmentDAOTest daoTest = new DepartmentDAOTest();
//		try {
//			daoTest.getNameTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("프로그램 종료");
		
		
		
	}

}
