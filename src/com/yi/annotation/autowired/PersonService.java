package com.yi.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonService {

	//@Autowired   �����Ȼ��������ȥƥ�䣬 �������ƥ�����������������ƥ�� 
	//private PersonDao personDao;
	//private PersonDao personDaoImpOne;  //������
	
	@Autowired   //@Autowired �� @Qualifier("����") ���ʹ��
	@Qualifier("personDaoImplOne")   
	private PersonDao personDao;
		
	
	public void savePerson() {
		this.personDao.savePerson();
	}
}
