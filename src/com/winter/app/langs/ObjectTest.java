package com.winter.app.langs;

public class ObjectTest {
	
	int num1;
	
	@Override
	public String toString() {
		System.out.println(this.num1);
		return num1+"";
	}
	
	public void m1() {
		System.out.println(this.num1);
	}

}
