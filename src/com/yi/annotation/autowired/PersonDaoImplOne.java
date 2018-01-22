package com.yi.annotation.autowired;

import org.springframework.stereotype.Component;

@Component("personDaoImplOne")
public class PersonDaoImplOne implements PersonDao {

	@Override
	public void savePerson() {
		System.out.println("save person one");
	}

	
}
