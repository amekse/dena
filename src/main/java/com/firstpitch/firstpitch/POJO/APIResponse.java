package com.firstpitch.firstpitch.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APIResponse {
	@JsonProperty("message")
	String message = "";
	@JsonProperty("error")
	boolean error = true;
	public APIResponse(String message, boolean error) {
		this.error = error;
		this.message = message;
	}
}
