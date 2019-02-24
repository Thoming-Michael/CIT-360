/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.List;

/**
 *
 * @author mthoming
 */
public class RunHibernateExample {
    
    public static void mainOld(String[] args) {
    
        TestDAO t = TestDAO.getInstance();
        
        List<Customer> c = t.getCustomers();
        for (Customer i : c) {
            System.out.println(i);
        }
        
        System.out.println(t.getCustomer(1));
    }
    
}
