package com.winter.app.locations;

import java.util.List;
import java.util.Scanner;

public class LocationService {
	
	private LocationDAO locationDAO;
	
	public LocationService() {
		// TODO Auto-generated constructor stub
		locationDAO = new LocationDAO();
	}

	public List<LocationDTO> getList() throws Exception {
		List<LocationDTO> ar = locationDAO.getList();
		
		return ar;
	}
	
	public LocationDTO getDetail(Scanner sc) throws Exception {
		System.out.println("조회할 지역번호를 입력");
		LocationDTO locationDTO = new LocationDTO();
		
		locationDTO.setLocation_id(sc.nextInt());
		locationDTO = locationDAO.getDetail(locationDTO);
		
		return locationDTO;
	}
}
