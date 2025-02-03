package com.winter.app.accounts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class AccountDAO {
	
	
	
	public int add(AccountDTO dto) throws Exception {
		Connection con = DBConnection.getConnection();
		String sql = "INSERT INTO ACCOUNTS VALUES (?, ?, ?, ?, SYSDATE)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dto.getAccountNum());
		st.setString(2, dto.getUsername());
		st.setLong(3, dto.getProductNum());
		st.setLong(4, dto.getAccountBalance());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, con);
		
		return result;
	}
	
	
	public List<AccountDTO> getList(AccountDTO dto2) throws Exception {
		List<AccountDTO> ar = new ArrayList<>();
		AccountDTO dto = null;
		Connection con = DBConnection.getConnection();
		String sql = "SELECT * FROM ACCOUNTS WHERE USERNAME = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dto2.getUsername());
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			dto = new AccountDTO();
			dto.setAccountNum(rs.getString("ACCOUNTNUM"));
			dto.setUsername(rs.getString("USERNAME"));
			dto.setProductNum(rs.getLong("PRODUCTNUM"));
			dto.setAccountBalance(rs.getLong("ACCOUNTBALANCE"));
			dto.setAccountDate(rs.getDate("ACCOUNTDATE"));
			
			ar.add(dto);
		}
		
		DBConnection.disConnect(rs, st, con);
		
		return ar;
	}

}
