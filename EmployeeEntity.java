package com.java.employee;

import javax.persistence.*;
//empno,name,designation,sal
@Entity
@Table(name="EmpDetails")
public class EmployeeEntity {
	@Id

	 private int empno;
	private String ename;
	private double salary;
	private String desgination;
	
	
	
	public EmployeeEntity(int empno, String ename, double salary, String desgination) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.desgination = desgination;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	
}
