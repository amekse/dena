package com.firstpitch.firstpitch.POJO;

public class APIResponse {
	String message = "";
	boolean error = true;
	public APIResponse(String message, boolean error) {
		this.error = error;
		this.message = message;
	}
}
