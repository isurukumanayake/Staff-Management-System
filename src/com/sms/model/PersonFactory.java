package com.sms.model;

public abstract class PersonFactory {

		
	public Person getPerson() {
		
		Person person = createPerson();
		return person;
	}
	
	public abstract Person createPerson();
		
}
