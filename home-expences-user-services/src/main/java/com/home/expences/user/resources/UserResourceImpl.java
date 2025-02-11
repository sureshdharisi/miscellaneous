package com.home.expences.user.resources;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.home.expences.user.dto.LoginRequest;
import com.home.expences.user.dto.UserDetailsDto;

@Named
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResourceImpl implements UserResource {

	@Override
	@POST
	@Path("/login")
	public Response login(LoginRequest login) {

		return Response.ok().build();
	}

	@Override
	@POST
	@Path("/create")
	public Response createUser(UserDetailsDto userDetails) {
		System.out.println("User details service is calling");
		return Response.ok().build();
	}

}
