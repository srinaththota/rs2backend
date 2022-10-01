package com.rs2backend.models;

public class AuthResponse {

	private final String jwt;

	public AuthResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
}
