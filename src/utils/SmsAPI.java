/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author hazem_xsx7382
 */
public class SmsAPI {

    /**
     * @param args the command line arguments
     */
    public static void send(String numero, String contenu) {
                final String AUTH_TOKEN = "3406691ff738267fa60dfec286502c9a";
        final String ACCOUNT_SID = "AC19c18dbfaf43a218601a2024b983f004";

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(
                new PhoneNumber(numero), // TO
                new PhoneNumber("+16086368058"), // FROM
                contenu
        ).create();

        System.out.println(message.getSid());
    }
    
}
