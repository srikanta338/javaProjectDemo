package com.cpBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cpBoot.DAO.EmployeeDAO;
import com.cpBoot.model.Employee;
@Service

public class IEmpService implements EmployeeService {
	@Autowired
	private EmployeeDAO empDao;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empDao.getAllEmployee();
	}

	@Override
	public Employee getEmpById(String eId) {
		// TODO Auto-generated method stub
		return empDao.getEmpById(eId);
	}

	@Override
	public  synchronized boolean  addEmp(Employee emp) {
		// TODO Auto-generated method stub
		if(empDao.EmpExists(emp.geteDesg(), emp.geteName())) {
			return false;
		}else {
			empDao.addEmp(emp);
			return true;
		}
	

	}

	@Override
	public void updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		empDao.updateEmp(emp);

	}

	@Override
	public void deleteEmp(String eId) {
		// TODO Auto-generated method stub
		empDao.deleteEmp(eId);

	}

	@Override
	public boolean EmpExists(String Desg, String name) {
		// TODO Auto-generated method stub
		return empDao.EmpExists(Desg, name);
	}

}
