/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import entities.Evenement;
import entities.Ticket;
import entities.User;
import entities.mail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utils.MyDB;

/**
 *
 * @author hazem_xsx7382
 */
public class Evenementservice implements IEvenement{
    Connection cnx;

     public Evenementservice() {
        cnx = MyDB.getInstance().getCnx();
    }

    @Override
public boolean ajouterproduit(Evenement e) throws SQLException {
    String request = "INSERT INTO evenement (nom, description, image_name, type, date, prix, nombre_place, adresse, etat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    PreparedStatement pst = cnx.prepareStatement(request);

    pst.setString(1, e.getNom());
    pst.setString(2, e.getDescription());
    pst.setString(3, e.getImageName());
    pst.setString(4, e.getType());
    pst.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
    pst.setInt(6, e.getPrix());
    pst.setInt(7, e.getNombrePlace());
    pst.setString(8, e.getAdresse());
    pst.setBoolean(9, e.isEtat());

    pst.executeUpdate();
    System.out.println("Evenement added");
    return true;
}

    @Override
    public boolean updateproduit(Evenement e) throws SQLException {
          String request = "UPDATE evenement SET nom=?, description=?, image_name=?, type=?, date=?, prix=?, nombre_place=?, adresse=?, etat=? WHERE id=?";

    PreparedStatement pst = cnx.prepareStatement(request);

    pst.setString(1, e.getNom());
    pst.setString(2, e.getDescription());
    pst.setString(3, e.getImageName());
    pst.setString(4, e.getType());
     pst.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
    pst.setInt(6, e.getPrix());
    pst.setInt(7, e.getNombrePlace());
    pst.setString(8, e.getAdresse());
    pst.setBoolean(9, e.isEtat());
    pst.setInt(10, e.getId());

    pst.executeUpdate();
    System.out.println("Evenement updated");
    return true;  
    }
    int e = 5 ;

    @Override
    public boolean suprimeproduit(Evenement e) throws SQLException {
        String request = "DELETE FROM evenement WHERE id=?";

    PreparedStatement pst = cnx.prepareStatement(request);

    pst.setInt(1, e.getId());
    pst.executeUpdate();
    System.out.println("Evenement deleted");
    return true; 
    }

    @Override
public List<Evenement> getAll() throws SQLException {
    String request = "SELECT *, ? FROM evenement";

    PreparedStatement pst = cnx.prepareStatement(request);
    pst.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
    ResultSet rs = pst.executeQuery();

    List<Evenement> evenements = new ArrayList<>();

    while (rs.next()) {
        Evenement e = new Evenement();
        e.setId(rs.getInt("id"));
        e.setNom(rs.getString("nom"));
        e.setDescription(rs.getString("description"));
        e.setImageName(rs.getString("image_name"));
        e.setType(rs.getString("type"));
        e.setPrix(rs.getInt("prix"));
        e.setNombrePlace(rs.getInt("nombre_place"));
        e.setAdresse(rs.getString("adresse"));
        e.setEtat(rs.getBoolean("etat"));

        evenements.add(e);
    }

    return evenements;
}
public Evenement getEventById(int eventId) throws SQLException {
     Evenement e = new Evenement();
    String request = "SELECT * FROM evenement WHERE id = ?";
    PreparedStatement pst = cnx.prepareStatement(request);
    pst.setInt(1, eventId);
    ResultSet rs = pst.executeQuery();
    if (rs.next()) {
        e.setId(rs.getInt("id"));
        e.setNom(rs.getString("nom"));
        e.setDescription(rs.getString("description"));
        e.setImageName(rs.getString("image_name"));
        e.setType(rs.getString("type"));
        e.setPrix(rs.getInt("prix"));
        e.setNombrePlace(rs.getInt("nombre_place"));
        e.setAdresse(rs.getString("adresse"));
        e.setEtat(rs.getBoolean("etat"));
        // set other fields of evenement
    }
    return e;
}
public boolean updateNombrePlace(int id, int nombrePlace) throws SQLException {
    String query = "UPDATE evenement SET nombre_place = ? WHERE id = ?";
    PreparedStatement statement = cnx.prepareStatement(query);
    statement.setInt(1, nombrePlace);
    statement.setInt(2, id);
    int rowsUpdated = statement.executeUpdate();
    return rowsUpdated > 0;
}

    @Override
    public List<Evenement> chercher(String msg) throws SQLException {
 
     List<Evenement> evenements = new ArrayList<>();


        String request = "SELECT * FROM evenement WHERE nom LIKE ? OR id LIKE ?";
        PreparedStatement pst = cnx.prepareStatement(request);
        pst.setString(1, msg);
         pst.setString(2, msg);
        
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Evenement e = new Evenement();
            e.setId(rs.getInt("id"));
            e.setNom(rs.getString("nom"));
            e.setDescription(rs.getString("description"));
            e.setImageName(rs.getString("image_name"));
            e.setType(rs.getString("type"));
            e.setPrix(rs.getInt("prix"));
            e.setNombrePlace(rs.getInt("nombre_place"));
            e.setAdresse(rs.getString("adresse"));
            e.setEtat(rs.getBoolean("etat"));
            evenements.add(e);
        }
 
    

    return evenements;
   
    }

    @Override
    public List<Evenement> trier() throws SQLException {
             List<Evenement> evenements = new ArrayList<>();


        String request = "SELECT * FROM evenement ORDER BY nom DESC";
        PreparedStatement pst = cnx.prepareStatement(request);
     
        
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Evenement e = new Evenement();
            e.setId(rs.getInt("id"));
            e.setNom(rs.getString("nom"));
            e.setDescription(rs.getString("description"));
            e.setImageName(rs.getString("image_name"));
            e.setType(rs.getString("type"));
            e.setPrix(rs.getInt("prix"));
            e.setNombrePlace(rs.getInt("nombre_place"));
            e.setAdresse(rs.getString("adresse"));
            e.setEtat(rs.getBoolean("etat"));
            evenements.add(e);
        }
 
    

    return evenements;
        
    }

   
public boolean ticketGagnate() throws SQLException, MessagingException, javax.mail.MessagingException {
    String request = "SELECT * FROM evenement WHERE nombre_place = 0 AND etat = 0";
    PreparedStatement pst = cnx.prepareStatement(request);
    ResultSet rs = pst.executeQuery();
    
    while (rs.next()) {
        int eventId = rs.getInt("id");
        
        String requestt = "SELECT * FROM ticket JOIN user ON ticket.ticket_id = user.id WHERE ticket.evenement_id = ? AND ticket.status = 0";
        PreparedStatement pstt = cnx.prepareStatement(requestt);
        pstt.setInt(1, eventId);
        ResultSet rss = pstt.executeQuery();
        
        List<Ticket> tickets = new ArrayList<>();
        while (rss.next()) {
            Ticket t = new Ticket();
            t.setId(rss.getInt("id"));
            t.setPrix(rss.getInt("prix"));
            t.setType(rss.getString("type"));
            t.setQuantite(rss.getInt("quantite"));
            t.setCreatedAt(rss.getTimestamp("created_at").toLocalDateTime());
            t.setStatus(rss.getBoolean("status"));
            User u = new User();
            u.setId(rss.getInt("user.id"));
            u.setName(rss.getString("user.name"));
           
            u.setEmail(rss.getString("user.email"));
            t.setTicketId(u);
            tickets.add(t);
        }
        
        if (tickets.size() > 0) {
            // Select a random winning ticket from the list of tickets
            int randomIndex = (int) (Math.random() * tickets.size());
            Ticket winningTicket = tickets.get(randomIndex);
            
            // Update the status of the winning ticket to indicate that it has won
            String updateRequest = "UPDATE ticket SET status = 1 WHERE id = ?";
            PreparedStatement updatePst = cnx.prepareStatement(updateRequest);
            updatePst.setInt(1, winningTicket.getId());
            updatePst.executeUpdate();
            
            // Update the etat field in the Evenement table to indicate that the event has been processed
            String updateEventRequest = "UPDATE evenement SET etat = 1 WHERE id = ?";
            PreparedStatement updateEventPst = cnx.prepareStatement(updateEventRequest);
            updateEventPst.setInt(1, eventId);
            updateEventPst.executeUpdate();
            
            // Get the e-mail address of the user associated with the winning ticket
            String getEmailRequest = "SELECT email FROM user WHERE id = ?";
            PreparedStatement selectEmailPst = cnx.prepareStatement(getEmailRequest);
            selectEmailPst.setInt(1, winningTicket.getTicketId().getId());
            ResultSet emailRs = selectEmailPst.executeQuery();
            String email = "";
            if (emailRs.next()) {
                email = emailRs.getString("email");
            }
           
            System.out.println("The winning ticket belongs to user with e-mail: " + email);
            mail.envoyer(email, 150);
            
        }
    }
    
    return true;
}

    
}
