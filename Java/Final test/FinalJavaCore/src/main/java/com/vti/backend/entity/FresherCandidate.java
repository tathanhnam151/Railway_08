package com.vti.backend.entity;

public class FresherCandidate extends Candidate {
	private String graduationRank;

	public FresherCandidate(String firstName, String lastName, String email, String phone, String graduationRank, String password) {
		super();
		this.graduationRank = graduationRank;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

}
