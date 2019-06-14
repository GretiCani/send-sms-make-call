package com.twilio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.twilio.Twilio;



@Component
public class TwilioInit {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInit.class);
	
	private final TwilioConfiguration twilioConfiguration;
	
	@Autowired
	public TwilioInit(TwilioConfiguration twilioConfiguration) {
		this.twilioConfiguration = twilioConfiguration;
		Twilio.init(twilioConfiguration.getAccountSid(), twilioConfiguration.getAuthToken());
		LOGGER.info("Twilio initializet successfuly....acound_sid{} "+twilioConfiguration.getAccountSid());
	}

}
