package com.cg.eis.bean;

public class Employee {
	 int id;
	String name;
	float salary;
	String desination;
	String insurancescheme;
	public Employee(){}
	public Employee(int id,String name,float salary,String designation,String insurancescheme)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.desination=designation;
		this.insurancescheme=insurancescheme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesination() {
		return desination;
	}
	public void setDesination(String desination) {
		this.desination = desination;
	}
	public String getInsurancescheme() {
		return insurancescheme;
	}
	public void setInsurancescheme(String insurancescheme) {
		this.insurancescheme = insurancescheme;
	}

	

}
