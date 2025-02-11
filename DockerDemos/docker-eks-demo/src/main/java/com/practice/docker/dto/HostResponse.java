package com.practice.docker.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HostResponse {

	private String message;
}
