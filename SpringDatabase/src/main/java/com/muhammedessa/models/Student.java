package com.muhammedessa.models;

public class Student {
	
	private int id;
	private String student_id;
	private String name;
	private String city;
	private String age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", student_id=" + student_id + ", name=" + name + ", city=" + city + ", age=" + age
				+ "]";
	}
	
	
	

}
