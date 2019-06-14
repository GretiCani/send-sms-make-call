package com.twilio.call;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.stereotype.Service;

import com.twilio.TwilioConfiguration;
import com.twilio.rest.api.v2010.account.CallCreator;
import com.twilio.type.PhoneNumber;

@Service
public class TwilioCallService implements CallService {
	
	/*private final CallRequest callRequest;
	private final TwilioConfiguration twilioConfiguration; 
	
	public TwilioCallService(CallRequest callRequest, TwilioConfiguration twilioConfiguration) {
		this.callRequest=callRequest;
		this.twilioConfiguration=twilioConfiguration;
	}

	@Override
	public void call(CallRequest callRequest,final String responseUrl) {
		PhoneNumber toCallNumber = new PhoneNumber(callRequest.getToCallNumber());
		PhoneNumber twiloPhoneNumber = new PhoneNumber(twilioConfiguration.getTwilioNumber());
		try {
			CallCreator callCreator = new CallCreator(toCallNumber, twiloPhoneNumber, new URI(responseUrl));
			callCreator.create();
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
		
	} */

}
