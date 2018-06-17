package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
	private int empid;
	private String name;
	private double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}


	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.getEmpid()-this.getEmpid();
	}
	
	
	
	
}
class NameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SalarySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary()-o2.getSalary());
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>list=new ArrayList<>();
		list.add(new Employee(12, "sipu", 211111));
		list.add(new Employee(10, "sipu", 211111));
		list.add(new Employee(22, "tuku", 114111));
		list.add(new Employee(11, "niku", 131111));
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getSalary());
		}
		
		System.out.println("---------------------------");
		
		Collections.sort(list, new NameSort());
		for(Employee e2:list) {
			System.out.println(e2.getEmpid()+" "+e2.getName()+" "+e2.getSalary());
		}
		
        System.out.println("---------------------------");
		
		Collections.sort(list, new SalarySort());
		for(Employee e3:list) {
			System.out.println(e3.getEmpid()+" "+e3.getName()+" "+e3.getSalary());
		}
			
		
	}

}
