package com.yi.aop;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int uid;
    private String uname;
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
}