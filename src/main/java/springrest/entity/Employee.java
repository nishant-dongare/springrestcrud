package springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String ename;
	private String edesignation;
	private int esal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	
	
}