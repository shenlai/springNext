package com.yi.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonService {

	//@Autowired   它首先会根据类型去匹配， 如果类型匹配多个结果，则按照名称匹配 
	//private PersonDao personDao;
	//private PersonDao personDaoImpOne;  //改名称
	
	@Autowired   //@Autowired 和 @Qualifier("名称") 配合使用
	@Qualifier("personDaoImplOne")   
	private PersonDao personDao;
		
	
	public void savePerson() {
		this.personDao.savePerson();
	}
}
