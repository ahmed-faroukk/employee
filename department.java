/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employee.management;
import java.util.ArrayList;
/**
 *
 * @author farouk
 */
public class department {
    int no;
    String name;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public department(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public department() {
    }
    ArrayList<Employee>emplist;
    public void addemployee(Employee idx)
    {
    emplist.add(idx);
    
    }
    public void removeEmployee(int idx)
    {
    emplist.remove(idx);
    }
    public void get_employee_count(int size)
    {
    emplist.size();
    }
    public void print_basic_data()
    {
    for(int i=0;i<emplist.size();i++)
    {
    System.out.println(emplist.get(i).getName()+" "+emplist.get(i).getGender()+" "+emplist.get(i).getAddress()+" "  );
    }
    }
    public void print_all_details()
    {
        for(int i=0; i<emplist.size();i++)
        {
        if(emplist.get(i) instanceof salariedEmployee)
            ((salariedEmployee) emplist.get(i)).displayalldetails();
        if (emplist.get(i) instanceof hourlyEmployee )
            ((hourlyEmployee) emplist.get(i)).displayalldetails();
        if(emplist.get(i) instanceof commissinalEmployee )
        ((commissinalEmployee) emplist.get(i)).displayalldetails();
        if(emplist.get(i) instanceof baseplusCommissionEmployee )
            ((baseplusCommissionEmployee) emplist.get(i)).displayalldetails();
            }
    }
    
    
    }
    
    

