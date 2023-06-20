package com.sms.model;

public class StaffMemberPerson extends PersonFactory {

	@Override
	public Person createPerson() {
		return new StaffMember();
	}

}
