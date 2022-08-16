package com.java.jpa.insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.java.employee.EmployeeEntity;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

    	    EntityManager em=emf.createEntityManager();

    	    em.getTransaction().begin();

    	    EmployeeEntity e1=new EmployeeEntity();

    	   e1.setEmpno(1234);
    	   e1.setEname("Rakesh");
    	   e1.setDesgination("SDE");
    	   e1.setSalary(50000.0);
    	   EmployeeEntity e2=new EmployeeEntity();

    	   e2.setEmpno(123);
    	   e2.setEname("Katty");
    	   e2.setDesgination("SE");
    	   e2.setSalary(48000.0); 
    	    em.persist(e1);
    	    em.persist(e2);
    	    em.getTransaction().commit();

    }
}
