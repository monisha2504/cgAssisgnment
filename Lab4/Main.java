package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImplementation;

public class Main {
	public static void main(String[] args) {
		EmployeeServiceImplementation esp=new EmployeeServiceImplementation();
	Employee a=esp.readEmployeeDetails(121, "monisha", 500000, "Analyst", "A1");
		esp.getInsuranceScheme(500000, "A1");
		esp.printEmployeeDetails(a);
	}

}
