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
public class main {
    public static void main(String[] args)
    {
    
    department d1 = new department();
    salariedEmployee se = new salariedEmployee(5000, 200, 50, "Ahmed", "Manoura", 3, sex.male);
    d1.addemployee(se);
    hourlyEmployee he = new hourlyEmployee(24, 8, "amjed", "cairo", 20, sex.male);
    d1.addemployee(he);
    commissinalEmployee ce = new commissinalEmployee(20, 100, "mena", "alex", 22, sex.female);
    d1.addemployee(ce);
    d1.print_all_details();
    d1.print_basic_data();
    

    }
    
}
