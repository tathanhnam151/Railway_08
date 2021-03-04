package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.ScannerUtils;
import com.vti.entity.Account;
import com.vti.entity.Group;

public class Exercise10 {
	public ArrayList<Group> groups = new ArrayList<>();

	public void addGroup() {
		Group group = new Group();
		ArrayList<Account> defaultAccounts = new ArrayList<Account>();
		group.setAccounts(defaultAccounts);
		group.input();
		int x;
		while (true) {
			System.out.println("Ban co muon nhap them account khong? (Bam '1' de nhap them Account cho Group)");
			Scanner scanner = new Scanner(System.in);
			x = ScannerUtils.inputInt("Input must be int, please input again.");
			if (x == 1) {
				group.addAccount();
			} else
				break;
		}
		groups.add(group);

	}
}
