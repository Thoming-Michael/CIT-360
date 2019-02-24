/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
/**
 *
 * @author mthoming
 */
public class TestDAO {
    
    SessionFactory factory = null;
    Session session = null;
    
    private static TestDAO single_instance = null;
    
    private TestDAO()
    {
        factory = HibernateUtil.getSessionFactory();
    }
    
    public static TestDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new TestDAO();
        }
        return single_instance;
    }
    
    public List<Customer> getCustomers() {
    
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Customer";
            List<Customer> cs = (List<Customer>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;
        
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
    
    public Customer getCustomer(int customerKey) {
    
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Customer where id = " + Integer.toString(customerKey);
            Customer c = (Customer)session.createQuery(sql).getSingleResult();
            return c;        
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
}
