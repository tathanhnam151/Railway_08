package com.vti.frontend;

import com.vti.entity.generic.Array;

public class Generic {

	public static void main(String[] args) {
		Array ar = new Array();
		
		Integer[] ints = new Integer[3];
		ints[1] = 1;
		ints[2] = 2;
		ints[0] = 3;
		
		ar.printArray(ints);
	}
}
