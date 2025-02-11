package com.home.angular.response;

import java.util.List;

public class EmployeeResponse {

	private List<EmployeeDetails> empDetails;

	public List<EmployeeDetails> getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(List<EmployeeDetails> empDetails) {
		this.empDetails = empDetails;
	}
}
