package com.evolvus.examples.others.domain;

import java.io.Serializable;

public class CustomerCredit implements Serializable {

    private static final long serialVersionUID = 1134026621535965173L;
    private String name;
    private String credit;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCredit() {
        return credit;
    }
    public void setCredit(String credit) {
        this.credit = credit;
    }
    
}
