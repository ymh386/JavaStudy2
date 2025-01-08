package com.winter.app.collections;

public class CollectionMain {
	public static void main(String[] args) {
		StudyStack ss = new StudyStack();
		ss.set(3);
		ss.info();
		ss.set(5);
		ss.info();
		ss.set(5);
		ss.info();
		ss.set(10);
		ss.info();
//		System.out.println("POP : " + ss.pop());
//		ss.info();
		
	}
}
