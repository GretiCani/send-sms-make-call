package com.twilio.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.TwilioConfiguration;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

@Service("twilio")
public class TwilioSmsSenderImpl implements SmsSender {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSenderImpl.class);
	
	private final TwilioConfiguration twilioConfiguration;
	
	
    @Autowired
	public TwilioSmsSenderImpl(TwilioConfiguration twilioConfiguration) {
		super();
		this.twilioConfiguration = twilioConfiguration;
	}



	@Override
	public void sendSms(SmsRequest smsRequest) {
		PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
		PhoneNumber from = new PhoneNumber(twilioConfiguration.getTwilioNumber());
		String message = smsRequest.getMessage();
		MessageCreator messageCreator = Message.creator(to, from, message);
		messageCreator.create();
		LOGGER.info("Send SMS {} "+smsRequest);
		
	}

}
