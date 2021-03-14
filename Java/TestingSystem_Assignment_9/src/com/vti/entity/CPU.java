package com.vti.entity;

public class CPU {
	private int price;
	private Processor processor;
	private Ram ram;

	public CPU() {
		this.processor = new Processor();
		this.ram = new Ram();
	}
	
	public class Processor {
		private int coreAmount;
		private String manufacturer;

		public double getCache() {
			return 4.3;
		}

		public int getCoreAmount() {
			return coreAmount;
		}

		public String getManufacturer() {
			return manufacturer;
		}

	}

	public class Ram {
		private int memory;
		private String manufacturer;

		public double getClockSpeed() {
			return 5.5;
		}

		public int getMemory() {
			return memory;
		}

		public String getManufacturer() {
			return manufacturer;
		}
	}

	public int getPrice() {
		return price;
	}

	public Processor getProcessor() {
		return processor;
	}

	public Ram getRam() {
		return ram;
	}
}
