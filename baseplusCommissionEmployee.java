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
public class baseplusCommissionEmployee extends commissinalEmployee {
    
         private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
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
    return   base + super.earning();

    
    }
}
