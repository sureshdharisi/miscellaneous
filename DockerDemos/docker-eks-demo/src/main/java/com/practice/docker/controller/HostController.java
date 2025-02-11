package com.practice.docker.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.docker.dto.HostResponse;

@RestController
@RequestMapping(("/v1"))
public class HostController {

	@GetMapping("/home")
	public ResponseEntity<HostResponse> welcome() {
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			String hostname = localHost.getHostName();

			System.out.println("Hostname: " + hostname);
			return ResponseEntity.ok(HostResponse.builder().message("Welcome from host: " + hostname).build());
		} catch (UnknownHostException e) {
			System.err.println("Error getting hostname: " + e.getMessage());
		}
		return ResponseEntity.badRequest().build();
	}

}
