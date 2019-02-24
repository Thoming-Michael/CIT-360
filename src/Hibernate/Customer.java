
package Hibernate;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerKey")
    private int customerKey;
    
    @Column(name = "lastName")
    private String lastName;
    
    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "street1")
    private String street1;

    public int getCustomerKey() {
        return customerKey;
    }

    public void setCustomerKey(int customerKey) {
        this.customerKey = customerKey;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @Override
    public String toString() {
        //return "Customer{" + "customerKey=" + customerKey + ", lastName=" + lastName + ", firstName=" + firstName + ", phone=" + phone + ", street1=" + street1 + '}';
        return Integer.toString(customerKey) + " " + lastName + " " + firstName 
                + " " + phone + " " + street1;
    }
    
}
