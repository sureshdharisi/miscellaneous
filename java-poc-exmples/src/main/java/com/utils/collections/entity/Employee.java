package com.utils.collections.entity;

public class Employee {
	
	private String name;
	private Integer age;
	private String department;
	
	public Employee(String name, Integer age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	

}
