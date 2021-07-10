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
public class commissinalEmployee extends Employee implements displayable{
    
    private double Gross_sales;
    
    private double commission_rate;

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }


    public double getGross_sales() {
        return Gross_sales;
    }

    public void setGross_sales(double Gross_sales) {
        this.Gross_sales = Gross_sales;
    }

    public commissinalEmployee() {
    }

    public commissinalEmployee(double Gross_sales, double commission_rate, String getname, String getaddress, int getssn, sex getgender) {
        super(getname, getaddress, getssn, getgender);
        this.Gross_sales = Gross_sales;
        this.commission_rate = commission_rate;
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

    /**
     *
     * @return
     */
    @Override
        public double earning()
    {
    return   commission_rate*Gross_sales;

    
    }

    @Override
    public String toString() {
        return "commissinalEmployee{" + "Gross_sales=" + Gross_sales + ", commission_rate=" + commission_rate + '}';
    }

    
}
