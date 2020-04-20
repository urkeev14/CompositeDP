/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.impl;

import employee.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author urosv
 */
public class Directory implements Employee{

    private List<Employee> employeeList = new ArrayList<>();
    
    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }
    
    public void addEmployee(Employee newEmployee){
        employeeList.add(newEmployee);
    }
    
    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
    
}
