package com.huowolf.dto;

/**
 * @author huowolf
 * @date 2019/4/10
 * @description 补助津贴类
 */
public class SubSidy {

    private String year;
    private String No;
    private String department;
    private String name;
    private String money;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
