package com.sms.model;

public class ManagerPerson extends PersonFactory {

	@Override
	public Person createPerson() {
		return new Manager();
	}

}
