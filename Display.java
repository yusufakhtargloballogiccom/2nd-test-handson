package com.java.jpa.display;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.java.employee.EmployeeEntity;

public class Display {
public static void main(String[] args) {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");
     EntityManager em = emf.createEntityManager();
    em.getTransaction().begin( );
  CriteriaBuilder cb=em.getCriteriaBuilder();

     CriteriaQuery<EmployeeEntity> cq=cb.createQuery(EmployeeEntity.class);

     Root<EmployeeEntity> stud=cq.from(EmployeeEntity.class);

     //cq.select(stud.get("s_name"));

     CriteriaQuery<EmployeeEntity> select = cq.select(stud);

     TypedQuery<EmployeeEntity> q = em.createQuery(select);

     List<EmployeeEntity> list = q.getResultList();

   
     for(EmployeeEntity s:list)

     {

     System.out.println(s.getEmpno()+"\t"+s.getEname()+"\t"+s.getDesgination()+"\t"+s.getSalary());

    }
}
}
