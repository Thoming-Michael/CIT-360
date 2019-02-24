/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class MVCDemo {
   public static void mainOld(String[] args) {

      //Call the function below to create an instance of the Employee record 
      Employee model  = createEmployeeInDatabase();

      //Create a view : to write employee details on console
      EmployeeView view = new EmployeeView();

      EmployeeController controller = new EmployeeController(model, view);

      controller.updateView();

      //Add another employee record with the same job code and salary
       
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.println("Please enter ANOTHER employee name: ");
    	String name = systemInScanner.next();
    	System.out.printf("Please enter this employee's job code: ");
    	String jobCode = systemInScanner.next();
    	System.out.printf("Please enter this employee's salary: ");
    	int salary = systemInScanner.nextInt();
        
      controller.setEmployeeName(name);
      controller.setEmployeeJobCode(jobCode);
      controller.setEmployeeSalary(salary);
      
      controller.updateView();
   }

   private static Employee createEmployeeInDatabase(){
       
    	Scanner systemInScanner = new Scanner(System.in);
    	System.out.println("Please enter the employee name: ");
    	String name = systemInScanner.next();
    	System.out.printf("Please enter the employee job code: ");
    	String jobCode = systemInScanner.next();
    	System.out.printf("Please enter the employee salary: ");
    	int salary = systemInScanner.nextInt();

        Employee employee = new Employee();
        employee.setName(name);
        employee.setJobCode(jobCode);
        employee.setSalary(salary);
        return employee;
   }    
}
