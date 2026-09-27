package com.hbn.learning.entity;

public class Employee {
	private int id;
	private String Name,Gender;
	private int Salary;
	
	
	
	public Employee( String name, String gender, int salary) {
		super();
		Name = name;
		Gender = gender;
		Salary = salary;
	}
	
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Gender=" + Gender + ", Salary=" + Salary + "]";
	}
}
