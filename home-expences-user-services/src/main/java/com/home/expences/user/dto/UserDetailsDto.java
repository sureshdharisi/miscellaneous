package com.home.expences.user.dto;

public class UserDetailsDto {

	private String firstName;
	private String lastName;
	private String middleName;
	private String userName;
	private String password;
	private String gender;
	private SecurityQuestionsDto securityQuestions;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public SecurityQuestionsDto getSecurityQuestions() {
		return securityQuestions;
	}

	public void setSecurityQuestions(SecurityQuestionsDto securityQuestions) {
		this.securityQuestions = securityQuestions;
	}

}
