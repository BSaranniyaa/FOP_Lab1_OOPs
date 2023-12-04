package com.greatlearning.model;

public class Employee {
	
	private String fname;
	private String lname;
	private String email;
	private String pasword;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String fname, String lname, String email, String pasword) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pasword = pasword;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	
	

}
