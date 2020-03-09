package com.haackathon.starter.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.haackathon.starter.services.GoogleApiService;

@RestController
public class GoogleApiController {
	
	@Autowired
	private GoogleApiService googleApiService;
	
	@CrossOrigin
	@RequestMapping( method = RequestMethod.POST, value = "/idToken")
	public String addDetail(@RequestParam String tokenId)throws GeneralSecurityException, IOException {
		return googleApiService.addDetail(tokenId);
	}
	
}
