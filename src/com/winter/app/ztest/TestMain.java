package com.winter.app.ztest;

import com.winter.app.users.UserDTO;

public class TestMain {
	public static void main(String[] args) {
		UserDAOTest daoTest = new UserDAOTest();
		ProductDAOTest daoTest2 = new ProductDAOTest();
		AccountDAOTest aDaoTest = new AccountDAOTest();
		
//		try {
//			daoTest.joinTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			daoTest.getListTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			daoTest.getDetailTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			daoTest2.joinTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			daoTest2.getListTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			daoTest2.getDetailTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			daoTest2.updateRateTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			aDaoTest.joinTest();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			aDaoTest.getListTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
