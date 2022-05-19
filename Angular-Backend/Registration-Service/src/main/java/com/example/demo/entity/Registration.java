package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private int userAge;
	private String gender;
	private String userHobbies;
	private String password;
	
	public Registration() {
		super();
	}

	public Registration(int userId, String userName, int userAge, String gender, String userHobbies, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.gender = gender;
		this.userHobbies = userHobbies;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserHobbies() {
		return userHobbies;
	}

	public void setUserHobbies(String userHobbies) {
		this.userHobbies = userHobbies;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
