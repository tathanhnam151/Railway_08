package com.vti.entity.generic;

public class Array {
	public void addArray() {

	}

	public <E> void printArray(E[] c) {
		for (E e : c) {
			System.out.println(e);
		}
	}


}
