package com.cpBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String eId;
	private String eName;
	private String eDesg;
	private double esal;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(String eId, String eName, String eDesg, double esal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDesg = eDesg;
		this.esal = esal;
	}



	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesg() {
		return eDesg;
	}
	public void seteDesg(String eDesg) {
		this.eDesg = eDesg;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDesg=" + eDesg + ", esal=" + esal + "]";
	}
	
	

}
