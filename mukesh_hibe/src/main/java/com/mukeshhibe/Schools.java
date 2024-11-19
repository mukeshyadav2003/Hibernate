package com.mukeshhibe;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schools {
	
	@Id
	private int id;
	private static String name;
	private int rollno;
	

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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
