package com.yi.annotation.autowired;

import org.springframework.stereotype.Component;

@Component("personDaoImplTwo")
public class PersonDaoImplTwo implements PersonDao{
 
    @Override
    public void savePerson() {
        System.out.println("save Person Two");
         
    }
 
}