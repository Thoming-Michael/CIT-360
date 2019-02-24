/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author mthoming
 */
public class Employee {
    private String jobCode;
    private String name;
    private int salary;
    
    public String getJobCode() {
        return jobCode;
    }

    public String setJobCode(String jobCode) {
      this.jobCode = jobCode;
        return jobCode;
    }    
    
   
   public String getName() {
      return name;
   }
   
   public String setName(String name) {
      this.name = name;
      return name;
   } 
   
   public int getSalary() {
      return salary;
   }
   
   public int setSalary(int salary) {
      this.salary = salary;
      return salary;
   }   
    
}
