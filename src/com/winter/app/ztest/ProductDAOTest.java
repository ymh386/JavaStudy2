package com.winter.app.ztest;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.winter.app.products.ProductDAO;
import com.winter.app.products.ProductDTO;
import com.winter.app.users.UserDAO;

public class ProductDAOTest {
	
	private ProductDAO dao;
	
	public ProductDAOTest() {
		// TODO Auto-generated constructor stub
		dao = new ProductDAO();
	}
	
	public void joinTest() throws Exception {
		ProductDTO dto = new ProductDTO();
		dto.setProductName("청년적금3");
		dto.setProductRate(9.5);
		dto.setProductDate(Date.valueOf("2027-01-23"));
		dto.setProductDetail("쳥년들을 위한 적금3"); 
		
		int result = dao.join(dto);
		
		if (result > 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
	
	public void getListTest() throws Exception {
		List<ProductDTO> ar = dao.getList();
		for(ProductDTO dto : ar) {
			System.out.print(dto.getProductNum() + "\t\t");
			System.out.print(dto.getProductName() + "\t\t");
			System.out.print(dto.getProductRate() + "\t\t");
			System.out.print(dto.getProductDate() + "\t\t");
			System.out.println(dto.getProductDetail());
		}
	}
	
	public void getDetailTest() throws Exception {
		ProductDTO dto = new ProductDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 입력");
		dto.setProductName(sc.next());
		dto = dao.getDetail(dto);

		System.out.println(dto.getProductDetail());
		
	}
	
	public void updateRateTest() throws Exception {
		Scanner sc = new Scanner(System.in);
		ProductDTO dto = new ProductDTO();
		System.out.println("수정할 상품명 입력");
		dto.setProductName(sc.next());
		System.out.println("이자율 수정값 입력");
		dto.setProductRate(sc.nextDouble());
		
		int result = dao.updateRate(dto);
		
		if (result > 0) {
			System.out.println("수정성공");
		} else {
			System.out.println("수정실패");
		}
	}

}
