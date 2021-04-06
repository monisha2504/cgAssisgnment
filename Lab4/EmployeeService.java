package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public abstract Employee readEmployeeDetails(int id,String name,float salary,String designation,String insurancescheme); 
	public abstract String getInsuranceScheme(float salary,String designation);
	public abstract void printEmployeeDetails(Employee emp);
	

}
