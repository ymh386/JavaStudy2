package com.winter.app.utils.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain1 {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date date = calendar.getTime();
		System.out.println(date);
		
		//년도
		int y = calendar.get(Calendar.YEAR);
		System.out.println(y);
		
		//월 : 0-> 1  11->12
		int m = calendar.get(Calendar.MONTH);
		System.out.println(m+1+"월");
		
		//일
		int d = calendar.get(Calendar.DATE);
		System.out.println(d);
		
		//시
		int h = calendar.get(Calendar.HOUR);
		System.out.println(h);
		h = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(h);
		//분
		int min = calendar.get(Calendar.MINUTE);
		System.out.println(min);
		//초
		int s = calendar.get(Calendar.SECOND);
		System.out.println(s);
		//밀리세컨즈(1/1000)
		int mil = calendar.get(Calendar.MILLISECOND);
		System.out.println(mil);
		
		
	}

}
