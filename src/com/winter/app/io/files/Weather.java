package com.winter.app.io.files;

public class Weather {
	
	private String city;
	private int gion;
	private double huminity;
	private String status;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getGion() {
		return gion;
	}
	public void setGion(int gion) {
		this.gion = gion;
	}
	public double getHuminity() {
		return huminity;
	}
	public void setHuminity(double huminity) {
		this.huminity = huminity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void info() {
		//멤버변수의 값을 출력하는 메서드
		System.out.print(this.getCity() + "\t");
		System.out.print(this.getGion() + "\t");
		System.out.print(this.getHuminity() + "\t");
		System.out.println(this.getStatus());
	}

}
