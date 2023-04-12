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
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import services.Avisservice;
import services.Evenementservice;
import services.Ticketservice;
import utils.MyDB;

/**
 *
 * @author hazem_xsx7382
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        
      
      Connection cnx = MyDB.getInstance().getCnx();
       Evenementservice es = new Evenementservice();
       Avisservice as = new Avisservice();
       User use= new User(1, "mootaz","mootaz"); 
       Ticket ticket = new Ticket();
       Ticketservice ts = new Ticketservice();
       Evenement e = new Evenement(1);
       ticket.setId(1);
               ticket.setEvenementId(e); // set the evenement id to 1
        ticket.setTicketId(use); // set the user id to 2
        ticket.setPrix(50);
        ticket.setQuantite(2);
        ticket.setType("mootaz");
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
System.out.println(ts.getTicketsByEventId(57));




           
}
}
