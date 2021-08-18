package com.muhammedessa.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	private int id;  
	@NotNull
	@Size(min=4, max=50)
	private String name;  
	private String date;
	private boolean isActive;
	
	
	public Student() {
		 
	}
	
	public Student(String name, String date, boolean isActive) {
		super();
		this.name = name;
		this.date = date;
		this.isActive = isActive;
	}
	public Student(int id, String name, String date, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.isActive = isActive;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return String.format(
				"Student [id=%s, name=%s, date=%s, isActive=%s]", id, name, date, isActive
				);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
