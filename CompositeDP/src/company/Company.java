/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import employee.Employee;
import employee.impl.Developer;
import employee.impl.Directory;
import employee.impl.Manager;

/**
 *
 * @author urosv
 */
public class Company {
    
    public static void main(String[] args) {
        
        Directory engeneeringDirectory = makeEngeneeringDirectory();
        Directory accountingDirectory = makeAccountingDirectory();
        Directory companyDirectory = makeCompanyDirectory(engeneeringDirectory, accountingDirectory);
        
        companyDirectory.showEmployeeDetails();
        
    }

    private static Directory makeCompanyDirectory(Directory engeneeringDirectory, Directory accountingDirectory) {
        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engeneeringDirectory);
        companyDirectory.addEmployee(accountingDirectory);
        return companyDirectory;
    }

    private static Directory makeAccountingDirectory() {
        Employee mng1 = new Manager("Bobana Pavlovic", 200, "House manager");
        Employee mng2 = new Manager("Marko Markovic", 201, "Building manager");
        Directory accountingDirectory = new Directory();
        accountingDirectory.addEmployee(mng1);
        accountingDirectory.addEmployee(mng2);
        return accountingDirectory;
    }

    private static Directory makeEngeneeringDirectory() {
        Employee dev1 = new Developer("Uros Veljkovic", 100, "Ugly developer");
        Employee dev2 = new Developer("Nikola Nikolic", 101, "Good developer");
        Directory engeneeringDirectory = new Directory();
        engeneeringDirectory.addEmployee(dev1);
        engeneeringDirectory.addEmployee(dev2);
        return engeneeringDirectory;
    }
    
}
