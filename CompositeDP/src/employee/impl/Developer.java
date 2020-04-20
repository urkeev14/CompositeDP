/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.impl;

import employee.Employee;

/**
 *
 * @author urosv
 */
public class Developer implements Employee{
    
    private String name;
    private long employeeID;
    private String position;

    public Developer(String name, long employeeID, String position) {
        this.name = name;
        this.employeeID = employeeID;
        this.position = position;
    }
    
    @Override
    public void showEmployeeDetails() {
        System.out.println(employeeID + " " + name + ", Position: " + position);
    }
    
}
