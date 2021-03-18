package com.vti.backend.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.repository.CandidateRepository;

public class CandidateController {
	private CandidateRepository repository;

	public CandidateController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		repository = new CandidateRepository();

	}

	public void registerExperienceCandidate(String firstName, String lastName, String email, String phone,
			int expInYear, String password) throws Exception {
		if (repository.ExpCInfoIsCorrect(firstName, lastName, email, phone, expInYear)) {
			repository.registerExperienceCandidate(firstName, lastName, email, phone, expInYear, password);
		} else
			throw new Exception("Vui long kiem tra lai thong tin nhap vao!");
	}

	public void registerFresherCandidate(String firstName, String lastName, String email, String phone,
			String graduationRank, String password) throws Exception {
		if (repository.FresherCInfoIsCorrect(firstName, lastName, email, phone, graduationRank)) {
			repository.registerFresherCandidate(firstName, lastName, email, phone, graduationRank, password);
		} else
			throw new Exception("Vui long kiem tra lai thong tin nhap vao!");
	}

	public boolean searchByEmail(String email)
			throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		if (repository.searchByEmailExp(email) || repository.searchByEmailFresher(email)) {
			return true;
		} else
			return false;
	}

	public boolean loginInfoIsValidExp(String email, String password)
			throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		if (repository.isLoginValid(email, password)) {
			if (repository.loginInfoIsValidExp(email, password)) {
				return true;
			}
		} return false;
	}
}
