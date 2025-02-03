package com.winter.app.users;

import java.util.List;

public class UserService {
	
	//Controller DAO사이에서 데이터의 전처리나, 후처리
	private UserDAO userDAO;
	
	public UserService() {
		// TODO Auto-generated constructor stub
		this.userDAO = new UserDAO();
	}
	
	//1. 가입
	public int join(UserDTO userDTO) throws Exception {
		
		int result = userDAO.join(userDTO);
		
		return result;
	}
	
	//2.목록
	public List<UserDTO> getList() throws Exception{
		
		List<UserDTO> ar = userDAO.getList();
		
		return ar;
		
	}
	
	//3. 로그인(디테일)
	public UserDTO login(UserDTO userDTO) throws Exception{
		UserDTO result = userDAO.getDetail(userDTO);
		
		if(result == null) {
			return result;
		}
		if(result.getPassword().equals(userDTO.getPassword())) {
			return result;
		} else {
			return null;
		}
	}

}
