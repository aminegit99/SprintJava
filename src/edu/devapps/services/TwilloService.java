package edu.devapps.services;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class TwilloService {
    private static final String ACCOUNT_SID = "ACb9962caeb235b5be3e260054ed0de6ef";
    private static final String AUTH_TOKEN = "2b264923783c5c9fc4db18183915a332";
    private static final String FROM_NUMBER = "+16813083167";

    public static void sendSms(String toNumber, String messageText) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(
                        new PhoneNumber(toNumber),
                        new PhoneNumber(FROM_NUMBER),
                        messageText)
                .create();

        System.out.println("Message SID: " + message.getSid());
    }
}