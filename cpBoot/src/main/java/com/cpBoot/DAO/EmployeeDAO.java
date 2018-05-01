package com.cpBoot.DAO;

import java.util.List;

import com.cpBoot.model.Employee;

public interface EmployeeDAO {
	
	List<Employee>getAllEmployee();
	Employee getEmpById(String eId);
	void addEmp(Employee emo);
    void updateEmp(Employee emo);
    void deleteEmp(String eId);
    boolean EmpExists(String Desg, String name);


}
