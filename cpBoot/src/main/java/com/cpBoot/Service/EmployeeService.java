package com.cpBoot.Service;

import java.util.List;

import com.cpBoot.model.Employee;

public interface EmployeeService {
	
	List<Employee>getAllEmployee();
	Employee getEmpById(String eId);
	boolean addEmp(Employee emp);
    void updateEmp(Employee emp);
    void deleteEmp(String eId);
    boolean EmpExists(String Desg, String name);

}
