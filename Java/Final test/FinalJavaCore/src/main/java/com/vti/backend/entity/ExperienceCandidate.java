package com.vti.backend.entity;

public class ExperienceCandidate extends Candidate {
	private int expInYear;
	private String proSkill;

	public ExperienceCandidate(String firstName, String lastName, String email, String phone, int expInYear, String password) {
		super();
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

}
