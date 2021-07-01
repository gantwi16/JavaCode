package com.qa.calculator;
import java.util.ArrayList;
import java.util.List;


public class User {
	private String forename;
	private String surname;
	private int age;
	private String email;
	private String telephoneNo;
	private List<String> middleNames;
	

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelephoneNo() {
		return telephoneNo;
	}
	
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	
	public List<String> getMiddleNames() {
		if (middleNames == null) { // if the middleNames list hasn't been initialised
			this.middleNames = new ArrayList<>(); // initialise the middleNames list
		}
		return middleNames;
	}
	
	public void setMiddleNames(List<String> middleNames) {
		if (middleNames == null) {
			this.middleNames = new ArrayList<>();
		} else {
			this.middleNames = middleNames;
		}
	}

	@Override
	public String toString() {
		return "User [forename=" + forename + ", surname=" + surname + ", age=" + age + ", email=" + email
				+ ", telephoneNo=" + telephoneNo + ", middleNames=" + middleNames + "]";
	}
	
	
	
}