package com.vti.backend;

import com.vti.entity.abstraction.Phone;
import com.vti.entity.abstraction.VietnamesePhone;

public class Abstraction {
	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("cong", "0123456789");
		phone.removeContact("cong");
		phone.updateContact("cong", "0123456789");
		phone.searchContact("cong");
	}
}
