package com.muhammed.api;


//DTO Pattern, which stands for Data Transfer Object, 
//is a design pattern conceived to reduce the number of calls 
//when working with remote interfaces. 
//the main reason for using a Data Transfer Object is to batch up 
//what would be multiple remote calls into a single one.

//A Data Access Object abstracts and encapsulates all access to the data source. 
//The DAO manages the connection with the data source to obtain and store data

public class StudentDTO {
	
	 
	private int student_id = 1000;
	private String name = "Muhammed Essa";
	private String city = "Kirkuk";
	private int age = 36;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDTO [student_id=" + student_id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	

}
