package com.jspiders.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentModel {
	@Id
	
	private int id;
	private String name;
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	private String tech;
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

}
