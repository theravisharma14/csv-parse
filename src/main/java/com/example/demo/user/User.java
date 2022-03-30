package com.example.demo.user;

import com.opencsv.bean.CsvBindByName;

public class User {

    @CsvBindByName
    private long id;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private int salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}