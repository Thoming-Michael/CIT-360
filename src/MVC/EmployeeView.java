/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mthoming
 */
import MVC.EmployeeController;

public class EmployeeView {
    
    String employeeName;
    String employeeJobCode;
    int employeeSalary;
    
    public void requestEmployeeDetails (String employeeName, String employeeJobCode, int employeeSalary) {
                
    }
    
    public void printEmployeeDetails(String employeeName, String employeeJobCode, int employeeSalary){
        System.out.println("Employee: ");
        System.out.println("Name: " + employeeName);
        System.out.println("Job Code: " + employeeJobCode);
        System.out.println("Employee Salary: " + employeeSalary);        
    }    
}
