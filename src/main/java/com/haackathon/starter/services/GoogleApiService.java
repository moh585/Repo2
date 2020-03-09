package com.haackathon.starter.services;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;

@Service
public class GoogleApiService {
	
	Logger log = LoggerFactory.getLogger(GoogleApiService.class);
	
	public String addDetail(String idTokenString)throws IOException,GeneralSecurityException{
		final NetHttpTransport transport = GoogleNetHttpTransport.newTrustedTransport();
		final JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance();
		final String clientId = "1055305615564-ihgg4c1faclgem215288diflsotpa89k.apps.googleusercontent.com";
		
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(
				transport , jsonFactory)
		    .setAudience(Collections.singleton(clientId))
		    .build();
		
		GoogleIdToken idToken = verifier.verify(idTokenString);
		if (idToken != null) {
		  Payload payload = idToken.getPayload();
		  return payload.toPrettyString();
		}
		else {
			return null;
		}
	}
	
}
