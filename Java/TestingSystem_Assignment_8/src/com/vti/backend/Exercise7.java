package com.vti.backend;

import java.util.HashMap;
import java.util.Map;

public class Exercise7 {
	Map<Integer, String> students = new HashMap<Integer, String>();
	public void caua() {
		for (Integer i : students.keySet()) {
			System.out.println(i);
		}
	}
}
