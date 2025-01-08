package com.winter.app.langs.ex1;

import java.util.ArrayList;

public class PersonView {
	
	public void view() {
		System.out.println("이름\t전화번호\t이메일\t생년월일");
	}
	
	public void view(ArrayList<Person> ar) {
		this.view();
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i).getName() + "\t");
			System.out.print(ar.get(i).getPhone() + "\t");
			System.out.print(ar.get(i).getEmail() + "\t");
			System.out.println(ar.get(i).getBirth());
		}
	}
	
	public void findView(Person person) {
		this.view();
		System.out.print(person.getName() + "\t");
		System.out.print(person.getPhone() + "\t");
		System.out.print(person.getEmail() + "\t");
		System.out.println(person.getBirth());
	}

}
