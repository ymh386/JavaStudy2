package com.winter.app.langs.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.winter.app.langs.ex2.WeatherDTO;

public class PersonInfo {
	
	private String data;
	public PersonInfo() {
		this.data="iu, 010-1234-5678, iu@naver.com, 99-05-05,";
		this.data=this.data+"winter, 010-2222-2222, winter@gmail.com, 01-01-01,";
		this.data=this.data+"suji, 010-3333-3333, suji@naver.com, 99-12-24";
		System.out.println(this.data);
	}
	
	//메서드명 init
	//data의 변수의 값을 파싱
	public ArrayList<Person> init() {
		StringTokenizer st = new StringTokenizer(this.data, ",");
		ArrayList<Person> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			Person person = new Person();
			person.setName(st.nextToken());
			person.setPhone(st.nextToken());
			person.setEmail(st.nextToken());
			person.setBirth(st.nextToken());
			ar.add(person);
			}
		return ar;
	}
	
	public Person [] init_old() {
		String [] datas = this.data.split(",");
		
		//Person객체에 데이터를 대입
		Person [] persons = new Person[datas.length/4];
		int idx=0;
		for(int i=0;i<datas.length;i++) {
			Person person = new Person();
			
			persons[i/4] = person;
			person.setName(datas[i]);//4, 8 , 12
			person.setPhone(datas[++i]);//5, 9 , 13
			person.setEmail(datas[++i]);//6, 10, 14
			person.setBirth(datas[++i]);//7, 11, 15
			//idx++
		}
		//Person객체 들을 리턴
		
		return persons;
	}
	
	public Person find(ArrayList<Person> ar, Scanner sc) {
		System.out.println("검색할 주소록 이름");
		String name = sc.next();
		Person person = new Person();
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().equals(name)) {
				person = ar.get(i);
				return person;
			}
		}
		return null;
	}
	
	public void make(ArrayList<Person> ar, Scanner sc) {
		Person person = new Person();
		System.out.println("이름 입력");
		person.setName(sc.next());
		System.out.println("전화번호 입력");
		person.setPhone(sc.next());
		System.out.println("이메일 입력");
		person.setEmail(sc.next());
		System.out.println("생년월일 입력");
		person.setBirth(sc.next());
		ar.add(person);
	}
	
	public void delete(ArrayList<Person> ar, Scanner sc) {
		System.out.println("삭제할 이름 검색");
		String name = sc.next();
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().equals(name)) {
				ar.remove(i);
				break;
			}
		}
	}
	
	
	
	
	
	

}
