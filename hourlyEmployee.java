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
public class hourlyEmployee extends Employee implements displayable {
    
    double houre_rate;
    int number_of_hours;

    public double getHoure_rate() {
        return houre_rate;
    }

    public void setHoure_rate(double houre_rate) {
        this.houre_rate = houre_rate;
    }

    public int getNumber_of_hours() {
        return number_of_hours;
    }

    public void setNumber_of_hours(int number_of_hours) {
        this.number_of_hours = number_of_hours;
    }
    @Override
    public double earning()
    {
    return houre_rate*number_of_hours;
    
    }

    public hourlyEmployee() {
    }

    public hourlyEmployee(double houre_rate, int number_of_hours) {
        this.houre_rate = houre_rate;
        this.number_of_hours = number_of_hours;
    }

    public hourlyEmployee(double houre_rate, int number_of_hours, String getname, String getaddress, int getssn, sex getgender) {
        super(getname, getaddress, getssn, getgender);
        this.houre_rate = houre_rate;
        this.number_of_hours = number_of_hours;
    }
    @Override
     public void displayalldetails()
     {
     System.out.println(toString()+earning());
     }
    @Override
        public void Earning()
        {
             System.out.println(earning());

        }

    @Override
    public String toString() {
        return "hourlyEmployee{" + "houre_rate=" + houre_rate + ", number_of_hours=" + number_of_hours + '}';
    }
        
    
}