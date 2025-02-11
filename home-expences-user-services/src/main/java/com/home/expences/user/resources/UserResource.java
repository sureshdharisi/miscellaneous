package com.home.expences.user.resources;

import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestBody;

import com.home.expences.user.dto.LoginRequest;
import com.home.expences.user.dto.UserDetailsDto;

public interface UserResource {

	public Response login(@RequestBody LoginRequest login);

	public Response createUser(@RequestBody UserDetailsDto userDetails);
}
