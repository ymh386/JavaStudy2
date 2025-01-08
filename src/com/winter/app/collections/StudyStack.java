package com.winter.app.collections;

public class StudyStack {
	
	private int [] ar;
	
	public int pop() {
		//ar 배열의 0번을 리턴하고
		//0번의 값을 삭제
		int copy = ar[0];
		int []
				copys = new int [ar.length - 1];
		for(int i=0;i<copys.length;i++) {
			copys[i] = ar[i + 1]; 
		}
		ar = copys;
		return copy;
	}
	
	public void set(int num) {
		//ar 이 null이면 1칸 배열을 만들고 num을 대입
		
		//아니면 num값과 ar의 값들중 일치하는게 있으면 대입 X
		//일치하는게 없으면
		//ar의 배열에 하나 더 큰 배열을 생성하고
		//마지막에 num을 대입
		boolean flag = true;
		if(ar == null) {
			ar = new int [1];
			ar[0] = num;
		}else {
			for(int i=0;i<ar.length;i++) {
				if(ar[i] == num) {
					flag = false;
					break;
				}
			}
			
			if (flag) {
				int [] copys = new int [ar.length + 1];
				for(int i=0;i<ar.length;i++) {
					copys[i] = ar[i];
				}
				copys[ar.length] = num;
				ar = copys;
			}
		}
	}
	
	public void add(int num) {
		//ar 이 null이면 1칸 배열을 만들고 num을 대입
		//ar이 null이 아니라면
		//ar의 배열에 하나 더 큰 배열을 생성하고
		//12, 34
		//num을 0번 index에 대입
		if(ar == null) {
			ar = new int [1];
			ar[0] = num;
		}else {
			int [] newAr = new int [ar.length + 1];
			for(int i=0;i<ar.length;i++) {
				newAr[i + 1] = ar[i];
			}
			newAr[0] = num;
			ar = newAr;
		}
		
	}
	
	public void info() {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("===============================");
	}

}
