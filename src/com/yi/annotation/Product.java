package com.yi.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("pr")
public class Product {
	private int pid;
    private String pname;
    private Double price;
    
    @Resource(name="unit")
    private Unit unit;
    
    public void ShowUnit() {
    	this.unit.descUnit();	
	}
    
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
