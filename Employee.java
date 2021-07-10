/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employee.management;

/**
 *
 * @author farouk
 */
enum sex {male , female}
public abstract class Employee {
    
    String name,address;
    int ssn;
    sex gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public sex getGender() {
        return gender;
    }

    public void setGender(sex gender) {
        this.gender = gender;
    }
    public Employee()
    {}    
    public Employee(String getname,String getaddress, int getssn,sex getgender)
    {
    name = getname;
    address = getaddress;
    ssn = getssn;
    gender= getgender;
    
    }
    public abstract double earning();
    
    
    
}
