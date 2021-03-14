package com.vti.frontend.Inner_Class;

import com.vti.entity.CPU;

public class Program1 {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		System.out.println(cpu.getProcessor().getCache());
		System.out.println(cpu.getRam().getClockSpeed());
	}
}
