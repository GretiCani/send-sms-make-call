package com.twilio.sms;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/send-sms")
public class SmsRestController {
	
	private final SmsService twilioSmsService;
	
	@Autowired
	public SmsRestController(SmsService twilioSmsService) {
		this.twilioSmsService=twilioSmsService;
	}
	
	@PostMapping
	public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
		twilioSmsService.sendSms(smsRequest);
	}

}
