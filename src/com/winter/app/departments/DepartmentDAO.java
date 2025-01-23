package com.winter.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class DepartmentDAO {
	//DAO -> Data Access Object
	//DB의 Data를 조회, 입력, 수정, 삭제
	
	//1. 접속 정보 선언
	//2. connection
	//3. SQL문 생성
	//4. 미리 보내기
	//5. ? 세팅
	//6. 최종 전송 및 결과 처리
	//7. 연결 해제
	public List<DepartmentDTO> getList() throws Exception {
		Connection con = DBConnection.getConnection();
		String sql = "SELECT * FROM DEPARTMENTS ORDER BY 2 DESC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<DepartmentDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			ar.add(departmentDTO);
		}
		DBConnection.disConnect(rs, ps, con);
		
		return ar;
	}
	
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO2) throws Exception {
		DepartmentDTO departmentDTO = null;
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		//? 값을 세팅
		st.setInt(1, departmentDTO2.getDepartment_id());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return departmentDTO;
	}
	
	public DepartmentDTO getName() throws Exception{
		Connection con = DBConnection.getConnection();
		String sql = "SELECT DEPARTMENT_NAME FROM DEPARTMENTS"
				+ " WHERE DEPARTMENT_ID ="
				+ " (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE FIRST_NAME='Lex')";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		DepartmentDTO departmentDTO = null;
		if(rs.next()) {
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
		}
		DBConnection.disConnect(rs, st, con);
		
		return departmentDTO;
	}
	
	//Insert
	public int add(DepartmentDTO departmentDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		String sql = "INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)"
				+ " VALUES (DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, departmentDTO.getDepartment_name());
		st.setInt(2, departmentDTO.getManager_id());
		st.setInt(3, departmentDTO.getLocation_id());
		
		//최종 전송 (INSERT, UPDATE, DELETE)
		//결과 int , 메서드는 executeUpdate
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		return result;
	}
	
	
	//update
	public int update(DepartmentDTO departmentDTO) throws Exception {
		//하나의 부서에 매니저번호 수정
		Connection connection = DBConnection.getConnection();
		
		String sql="UPDATE DEPARTMENTS SET MANAGER_ID=? WHERE DEPARTMENT_ID=?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setInt(1, departmentDTO.getManager_id());
		st.setInt(2, departmentDTO.getDepartment_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		return result;
		
	}
	
	//delete
	public int delete(DepartmentDTO departmentDTO)throws Exception{
		//하나의 부서 삭제
		Connection connection = DBConnection.getConnection();
		String sql = "DELETE DEPARTMENTS WHERE DEPARTMENT_ID=?";
		PreparedStatement st = connection.prepareStatement(sql);
		st.setInt(1, departmentDTO.getDepartment_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		return result;
	}

}
