package com.winter.app.utils.Collections.test;

import java.util.ArrayList;

public class UnitView {
	
	public void view(ArrayList<? extends GroundUnit> ar) {
		System.out.println("extends");
	}
	
	public void view2(ArrayList<? super GroundUnit> ar) {
		System.out.println("extends");
	}

}
