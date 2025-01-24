package com.winter.app.products;

import java.lang.ref.PhantomReference;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class ProductDAO {
	
	public int join(ProductDTO dto) throws Exception {
		Connection con = DBConnection.getConnection();
		String sql = "INSERT INTO PRODUCTS VALUES (PRODUCTS_SEQ.NEXTVAL, ?, ?, ?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dto.getProductName());
		st.setDouble(2, dto.getProductRate());
		st.setDate(3, dto.getProductDate());
		st.setString(4, dto.getProductDetail());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, con);
		
		return result;
	}
	
	public List<ProductDTO> getList() throws Exception {
		List<ProductDTO> ar = new ArrayList<>();
		ProductDTO dto = null;
		Connection con = DBConnection.getConnection();
		String sql = "SELECT * FROM PRODUCTS";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			dto = new ProductDTO();
			dto.setProductNum(rs.getLong("PRODUCTNUM"));
			dto.setProductName(rs.getString("PRODUCTNAME"));
			dto.setProductRate(rs.getDouble("PRODUCTRATE"));
			dto.setProductDate(rs.getDate("PRODUCTDATE"));
			dto.setProductDetail(rs.getString("PRODUCTDETAIL"));
			
			ar.add(dto);
		}
		
		DBConnection.disConnect(rs, st, con);
		
		return ar;
	}
	
	public ProductDTO getDetail(ProductDTO dto2) throws Exception {
		ProductDTO dto = null;
		Connection con = DBConnection.getConnection();
		String sql = "SELECT PRODUCTDETAIL FROM PRODUCTS WHERE PRODUCTNAME = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dto2.getProductName());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			dto = new ProductDTO();
			dto.setProductDetail(rs.getString("PRODUCTDETAIL"));
		}
		
		DBConnection.disConnect(rs, st, con);
		
		return dto;
	}
	
	public int updateRate(ProductDTO dto) throws Exception {
		Connection con = DBConnection.getConnection();
		String sql = "UPDATE PRODUCTS SET PRODUCTRATE = ? WHERE PRODUCTNAME = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setDouble(1, dto.getProductRate());
		st.setString(2, dto.getProductName());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, con);
		
		return result;
	}

}
