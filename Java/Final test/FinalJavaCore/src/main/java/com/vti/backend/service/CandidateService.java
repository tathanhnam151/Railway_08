package com.vti.backend.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.repository.CandidateRepository;

public class CandidateService {
	private CandidateRepository repository;

	public CandidateService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		repository = new CandidateRepository();

	}
	
	public void registerExperienceCandidate(String firstName, String lastName, String email, String phone,
			int expInYear, String password) throws Exception {
		repository.registerExperienceCandidate(firstName, lastName, email, phone, expInYear, password);
	}

	public void registerFresherCandidate(String firstName, String lastName, String email, String phone,
			String graduationRank, String password) throws Exception {
		repository.registerFresherCandidate(firstName, lastName, email, phone, graduationRank, password);
	}


}
