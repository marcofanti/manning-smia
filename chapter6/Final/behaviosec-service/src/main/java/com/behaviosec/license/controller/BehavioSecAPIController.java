package com.behaviosec.license.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.behaviosec.license.model.License;
import com.behaviosec.license.service.LicenseService;
import com.behaviosec.license.utils.UserContextHolder;

@RestController
@RequestMapping(value="BehavioSenseAPI")
public class BehavioSecAPIController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(BehavioSecAPIController.class);

	@Autowired
	private LicenseService licenseService;

	@RequestMapping(value="/{userId}",method = RequestMethod.GET)
	public String getLicensesWithClient( @PathVariable("userId") String userId) {

		return "User is " + userId;
	}
/*
	@PutMapping
	public ResponseEntity<License> updateLicense(@RequestBody License request) {
		return ResponseEntity.ok(licenseService.updateLicense(request));
	}

	@PostMapping
	public ResponseEntity<License> createLicense(@RequestBody License request) {
		return ResponseEntity.ok(licenseService.createLicense(request));
	}

	@DeleteMapping(value="/{licenseId}")
	public ResponseEntity<String> deleteLicense(@PathVariable("licenseId") String licenseId) {
		return ResponseEntity.ok(licenseService.deleteLicense(licenseId));
	}
*/
	@RequestMapping(value="/GetHealthCheck",method = RequestMethod.GET)
	public String getHealthCheck() throws TimeoutException {
		logger.debug("Entering the license-controller  ");
		// logger.debug("LicenseServiceController Correlation id: {}", UserContextHolder.getContext().getCorrelationId());
		return "true";
	}

}
