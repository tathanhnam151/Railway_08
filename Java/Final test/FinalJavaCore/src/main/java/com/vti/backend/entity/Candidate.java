package com.vti.backend.entity;

public class Candidate {
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String email;
	protected String password;

	public Candidate() {
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

}
