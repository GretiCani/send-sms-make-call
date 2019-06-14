package com.twilio.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {

	private final  SmsSender smsSender;
	
	@Autowired
	public SmsServiceImpl(@Qualifier("twilio") TwilioSmsSenderImpl smsSender) {
		super();
		this.smsSender = smsSender;
	}
	
	@Override
	public void sendSms(SmsRequest smsRequest) {

		smsSender.sendSms(smsRequest);
		
		
	}

	

}
