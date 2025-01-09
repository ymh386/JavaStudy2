package com.winter.app.utils.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain4 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		HashSet<Integer> hashSet = new HashSet<>();
		
//		for(int i=0;i<6;i++) {
//			int num = random.nextInt(45)+1;
//			boolean check = hashSet.add(num);
//			if(!check) {
//				i--;
//			}
//		}
		while(hashSet.size()<6) {
			int num = random.nextInt(45)+1;
			hashSet.add(num);
		}
		Iterator<Integer> it = hashSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
