package com.haackathon.starter.models;

public class User {
	
	private String userId;
	private String email;
	private boolean emailVerifier;
	private String givenName;
	private String hostedDomain;
	private String issue;
	
	public User() {
	}
	
	public User(String userId,String email, boolean emailVerifier, String givenName, 
			String hostedDomain, String issue) {
		super();
		this.userId = userId;
		this.email = email;
		this.emailVerifier = emailVerifier;
		this.givenName = givenName;
		this.hostedDomain = hostedDomain;
		this.givenName = givenName;
	}

	public String getEmail() {
		return email;
	}

	public boolean isEmailVerifier() {
		return emailVerifier;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getUserId() {
		return userId;
	}

	public String getHostedDomain() {
		return hostedDomain;
	}

	public String getIssue() {
		return issue;
	}
	
}
