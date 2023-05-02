/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Avis;
import entities.Evenement;
import entities.Ticket;
import entities.User;
import entities.mail;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.mail.MessagingException;
import services.Avisservice;
import services.Evenementservice;
import services.Ticketservice;
import utils.MyDB;
import utils.SmsAPI;

/**
 *
 * @author hazem_xsx7382
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, MessagingException, com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException {
        
        
      
      Connection cnx = MyDB.getInstance().getCnx();
      
       Evenementservice es = new Evenementservice();
       Avisservice avis = new Avisservice();
       Avisservice as = new Avisservice();
       User use= new User(1, "mootaz","mootaz"); 
       Ticket ticket = new Ticket();
       Ticketservice ts = new Ticketservice();
       Evenement e = new Evenement(71);
       ticket.setId(1);
               ticket.setEvenementId(e); // set the evenement id to 1
        ticket.setTicketId(use); // set the user id to 2
        ticket.setPrix(50);
        ticket.setQuantite(2);
        ticket.setType("mootaz");
         Avis avi = new Avis(e,use,"ahahahahah");
//    Evenement e = new Evenement("", "", "", "", 12, 15, "", true);
//Avis A = new Avis( 2,e, use,  "mootaz");
    //service.ajouterproduit(e);
//    service.suprimeproduit(54);
//as.ajouteAvis(A);
//        System.out.println( es.getAll());
//System.out.println(as.getAll());
//ts.ajouterproduit(ticket);
//ts.updateproduit(ticket);
//System.out.println(ts.getAll());
//ts.suprimeproduit(ticket);
//es.updateNombrePlace(57, 100);
//System.out.println(avis.getAvisList(71));

es.ticketGagnate();
mail.envoyer("hazem.kechiched@esprit.tn", 0);
SmsAPI.send("+21699195169", "votre achat de billet a été effectué avec succès");

//avis.ajouteAvis(avi);


           
}
}
