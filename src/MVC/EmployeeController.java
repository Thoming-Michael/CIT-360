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
public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
       this.model = model;
       this.view = view;
    }

    public void setEmployeeName(String name){
       model.setName(name);		
    }

    public String getEmployeeName(){
       return model.getName();		
    }

    public void setEmployeeJobCode(String jobCode){
       model.setJobCode(jobCode);		
    }

    public String getEmployeeJobCode(){
       return model.getJobCode();		
    }

    public void setEmployeeSalary(int employeeSalary){
       model.setSalary(employeeSalary);		
    }

    public int getEmployeeSalary(){
       return model.getSalary();
    }
    
    public void updateView(){	
       view.printEmployeeDetails(model.getName(), model.getJobCode(), model.getSalary());
    }

}
