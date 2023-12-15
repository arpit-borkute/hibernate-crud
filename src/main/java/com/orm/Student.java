package com.orm;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Table(name="mystudents")----only table name will change
@Entity(name = "student_details")
public class Student {

	@Id
	private int id;
	private String name;
	private String city;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id is " + id + ", name is " + name + ", city is " + city + "]";
	}

}
