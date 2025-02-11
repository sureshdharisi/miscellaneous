package com.home.angular.resources.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.home.angular.resources.EmployeeResource;
import com.home.angular.response.EmployeeDetails;
import com.home.angular.response.EmployeeResponse;

@Service
public class EmployeeResourceImpl implements EmployeeResource {

	@Override
	public Response getListOfEmployees(Integer count) {

		List<EmployeeDetails> list = new ArrayList<>();
		for (Integer i = 0; i < count; i++) {
			EmployeeDetails emp = new EmployeeDetails();
			emp.setName("Name " + i);
			emp.setDateOfBirth(new Date(System.currentTimeMillis()));
			emp.setCity("Bangalore " + i);
			if (i % 2 == 0)
				emp.setGender("Male");
			else
				emp.setGender("Female");

			emp.setSalary(new Double(10000 * i));
			list.add(emp);
		}
		EmployeeResponse resp = new EmployeeResponse();
		resp.setEmpDetails(list);
		return Response.ok(resp).build();
	}

}
