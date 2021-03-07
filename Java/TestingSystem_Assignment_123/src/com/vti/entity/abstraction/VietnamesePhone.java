package com.vti.entity.abstraction;

public class VietnamesePhone extends Phone {

	public VietnamesePhone() {
	}

	@Override
	public void insertContact(String name, String phone) {
		System.out.println("Insert new contact with " + name + ". Phone number is: " + phone);
	}

	@Override
	public void removeContact(String name) {
		System.out.println("Removing contact with name :" + name);
	}

	@Override
	public void updateContact(String name, String newPhone) {
		System.out.println("Update contact " + name + ". The new phone number is: " + newPhone);
	}

	@Override
	public void searchContact(String name) {
		System.out.println("Search for contact " + name + "...");
	}
}
