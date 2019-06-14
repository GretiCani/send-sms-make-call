# send-sms-make-call spring boot - twilio api - web
Application send sms and make calls using twilio api.
To test app clone project then before run you should create an account on www.twilio.com. Then get necessary details from twilio
respectively accoun_sid, auth_token and phone_number and put in application.properties. Lunch app then from postman set method post
and url localhost:8080/api/send-sms then click body->raw and format JSON(application/json). In json body put {"phoneNumber": "any phone numer","message":"Your message"}. 
Post the request and you should recieve the message in phone number that you put.
