package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImplementation implements EmployeeService{

	@Override
	public Employee readEmployeeDetails(int id, String name, float salary, String designation, String insurancescheme) {
		Employee emp=new Employee( id, name,  salary,  designation,  insurancescheme);
		
		return emp;
	}

	@Override
	public String getInsuranceScheme(float salary, String designation) {
		if(salary>20000 && designation.equals("A1"))
		{
			return "insurancescheme1";
		}
		else if(salary>30000 && designation.equals("A2"))
		{
			return "insurancescheme2";
		}
		else
		{
			return "insurancescheme3";
		}
		 
	}

	@Override
	public void printEmployeeDetails(Employee emp) {
		System.out.println("Id:"+emp.getId());
		System.out.println("name:"+emp.getName());
		System.out.println("salary:"+emp.getSalary());
		System.out.println("designation:"+emp.getDesination());
		System.out.println("insurancescheme:"+emp.getInsurancescheme());
		
		
		
	}
	

}
