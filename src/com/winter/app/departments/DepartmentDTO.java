package com.winter.app.departments;

import java.util.List;

import com.winter.app.employees.EmployeeDTO;

public class DepartmentDTO {
	//DTO를 선언하는 구칙
	//모든 멤버변수의 접근지정자는 private
	//Getter, Setter
	//생성자는 기본생성자는 필수
	//멤버변수 명은 대응하는 테이블의 컬럼명과 데이터타입 동일
	
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	//1:N의 관계
	private List<EmployeeDTO> employeeDTOs;
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	

}
