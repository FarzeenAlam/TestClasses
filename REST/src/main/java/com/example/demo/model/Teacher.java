package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue
	private int tch_id;
	
	
	private String Tch_Name;
	private float Tch_Salary;
	
	
	public Teacher() {
	}
	
	public int getTch_id() {
		return tch_id;
	}
	public void setTch_id(int tch_id) {
		this.tch_id = tch_id;
	}
	public String getTch_Name() {
		return Tch_Name;
	}
	public void setTch_Name(String tch_Name) {
		Tch_Name = tch_Name;
	}
	public float getTch_Salary() {
		return Tch_Salary;
	}
	public void setTch_Salary(float tch_Salary) {
		Tch_Salary = tch_Salary;
	}
	
	

}
