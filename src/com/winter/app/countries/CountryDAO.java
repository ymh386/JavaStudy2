package com.winter.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class CountryDAO {
	//1. 접속 정보 선언
	//2. connection
	//3. SQL문 생성
	//4. 미리 보내기
	//5. ?
	//6. 최종 전송 및 결과 처리
	//7. 연결 해제
	
	public void getList() throws Exception {
		Connection con = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES ORDER BY 2 DESC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("COUNTRY_NAME"));
		}
		DBConnection.disConnect(rs, ps, con);
	}
	
	public CountryDTO getDetail() throws Exception {
		CountryDTO countryDTO = null;
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID=\'AR\'";
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			countryDTO = new CountryDTO();
			countryDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countryDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countryDTO.setRegion_id(rs.getInt("REGION_ID"));
		}
		DBConnection.disConnect(rs, ps, connection);
		
		return countryDTO;
	}

}
