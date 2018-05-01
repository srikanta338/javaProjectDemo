package com.cpBoot.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cpBoot.model.Employee;
@Transactional
@Repository
public class IEmployeeDAO implements EmployeeDAO {
	@PersistenceContext
	private EntityManager emanger;

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String hql="from Employee as e ORDER BY  e.eId";
		return (List<Employee>)emanger.createQuery(hql).getResultList(); 
	}

	@Override
	public Employee getEmpById(String eId) {
		// TODO Auto-generated method stub
		return emanger.find(Employee.class, eId);
	}

	@Override
	public void addEmp(Employee emo) {
		// TODO Auto-generated method stub
		emanger.persist(emo);

	}

	@Override
	public void updateEmp(Employee emo) {
		// TODO Auto-generated method stub
		Employee emp=getEmpById(emo.geteId());
		emp.seteName(emo.geteName());
		emp.setEsal(emo.getEsal());

	}

	@Override
	public void deleteEmp(String eId) {
		// TODO Auto-generated method stub
		emanger.remove(eId);

	}

	@Override
	public boolean EmpExists(String Desg, String name) {
		// TODO Auto-generated method stub\
		String hql="From Employee as e where e.eDesg=? and e.ename=?";
		int count = emanger.createQuery(hql).setParameter(1, Desg)
	              .setParameter(2, name).getResultList().size();
		return count>0 ? true:false ;
	}

}
