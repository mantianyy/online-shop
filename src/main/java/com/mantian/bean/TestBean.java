package com.mantian.bean;

public class TestBean {
    private Integer testint;

    private String teststr;

    public Integer getTestint() {
        return testint;
    }

    public void setTestint(Integer testint) {
        this.testint = testint;
    }

    public String getTeststr() {
        return teststr;
    }

    public void setTeststr(String teststr) {
        this.teststr = teststr == null ? null : teststr.trim();
    }
}