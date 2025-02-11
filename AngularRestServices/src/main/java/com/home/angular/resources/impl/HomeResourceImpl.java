package com.home.angular.resources.impl;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.home.angular.resources.HomeResource;
import com.home.angular.response.HomeDto;

@Service
public class HomeResourceImpl implements HomeResource {

	@Override
	public Response home(String name) {
		HomeDto home = new HomeDto();
		home.setName(name);
		return Response.ok(home).build();
	}

}
