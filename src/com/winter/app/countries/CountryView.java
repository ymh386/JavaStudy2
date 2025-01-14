package com.winter.app.countries;

public class CountryView {
	
	public void view(String message) {
		System.out.println(message);
	}

	public void view(CountryDTO countryDTO) {
		System.out.println("나라번호\t나라이름\t리전번호");
		System.out.print(countryDTO.getCountry_id()+"\t");
		System.out.print(countryDTO.getCountry_name()+"\t");
		System.out.println(countryDTO.getRegion_id());
	}
}
