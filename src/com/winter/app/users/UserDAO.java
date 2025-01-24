package com.winter.app.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.winter.app.utils.DBConnection;

public class UserDAO {
	
	//1. 가입(추가) join
	public int join(UserDTO dto) throws Exception {
		Connection con = DBConnection.getConnection();
		String sql = "INSERT INTO USERS VALUES (?, ?, ?, ?, ?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dto.getUsername());
		st.setString(2, dto.getPassword());
		st.setString(3, dto.getName());
		st.setString(4, dto.getPhone());
		st.setString(5, dto.getEmail());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, con);
		
		return result;
		
	}
	
	//2. 회원들의 목록을 조회, 단, password는 빼고
	
	public List<UserDTO> getList() throws Exception {
		List<UserDTO> ar = new ArrayList<>();
		UserDTO dto = null;
		Connection con = DBConnection.getConnection();
		String sql = "SELECT USERNAME, NAME, PHONE, EMAIL FROM USERS";
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			dto = new UserDTO();
			dto.setUsername(rs.getString("USERNAME"));
			dto.setName(rs.getString("NAME"));
			dto.setPhone(rs.getString("PHONE"));
			dto.setEmail(rs.getString("EMAIL"));
			
			ar.add(dto);
		}
		
		DBConnection.disConnect(rs, st, con);
		
		return ar;
	}
	
	//회원의 ID로 회원한명의 모든 정보를 조회 getDetail
	
	public UserDTO getDetail(UserDTO dto2) throws Exception {
		UserDTO dto = null;
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM USERS WHERE USERNAME = ?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, dto2.getUsername());
		
		ResultSet rs = st.executeQuery();
		
		if (rs.next()) {
			dto = new UserDTO();
			dto.setUsername(rs.getString("USERNAME"));
			dto.setPassword(rs.getString("PASSWORD"));
			dto.setName(rs.getString("NAME"));
			dto.setPhone(rs.getString("PHONE"));
			dto.setEmail(rs.getString("EMAIL"));
		}
		
		DBConnection.disConnect(rs, st, con);
		
		return dto;
	}

}
