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
public class salariedEmployee extends Employee implements displayable {
    
         double salary;
        
         double bouns;
        
         double deductions;
        
        

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }


    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   public salariedEmployee(){}

    public salariedEmployee(double salary, double bouns, double deductions, String getname, String getaddress, int getssn, sex getgender) {
         super(getname,getaddress,getssn,getgender);
        this.salary = salary;
        this.bouns = bouns;
        this.deductions = deductions;
    }      
      
    
         @Override
        public double earning()
        {
            
        return (salary+bouns)-deductions;
        }
        
         @Override
         public void displayalldetails()
         {
         
         System.out.println(toString()+earning());
         }

    @Override
    public String toString() {
        return "salariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deductions=" + deductions + '}';
    }
         @Override
        public void Earning()
        {
                 System.out.println(earning());

        }

    
    
    
}
   

