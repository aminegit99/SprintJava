/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Evenement;
import entities.Ticket;
import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import utils.MyDB;

/**
 *
 * @author hazem_xsx7382
 */
public class Ticketservice implements ITicket{
    Connection cnx;

    public Ticketservice() {
        cnx =MyDB.getInstance().getCnx();
    }

    @Override
    public boolean ajouterproduit(Ticket p) throws SQLException {
        String request = "INSERT INTO ticket (evenement_id, ticket_id, prix, quantite, type, created_at, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = cnx.prepareStatement(request);
        pst.setInt(1, p.getEvenementId().getId());
        pst.setInt(2, p.getTicketId().getId());
        pst.setInt(3, p.getPrix());
        pst.setInt(4, p.getQuantite());
        pst.setString(5, p.getType());
        pst.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
        pst.setBoolean(7, p.isStatus());
        return pst.executeUpdate() > 0;    }

    @Override
    public boolean updateproduit(Ticket p) throws SQLException {
        String request = "UPDATE ticket SET evenement_id = ?, ticket_id = ?, prix = ?, quantite = ?, type = ?, created_at = ?, status = ? WHERE id = ?";
        PreparedStatement pst = cnx.prepareStatement(request);
        pst.setInt(1, p.getEvenementId().getId());
        pst.setInt(2, p.getTicketId().getId());
        pst.setInt(3, p.getPrix());
        pst.setInt(4, p.getQuantite());
        pst.setString(5, p.getType());
        pst.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
        pst.setBoolean(7, p.isStatus());
        pst.setInt(8, p.getId());
        return pst.executeUpdate() > 0;    }

    @Override
    public boolean suprimeproduit(Ticket p) throws SQLException {
                String request = "DELETE FROM ticket WHERE id = ?";
        PreparedStatement pst = cnx.prepareStatement(request);
        pst.setInt(1, p.getId());
        return pst.executeUpdate() > 0;
    }

    @Override
    public List<Ticket> getAll() throws SQLException {
List<Ticket> tickets = new ArrayList<>();
        String request = "SELECT * FROM ticket INNER JOIN evenement ON ticket.evenement_id=evenement.id INNER JOIN user ON ticket.ticket_id=user.id";
        PreparedStatement pst = cnx.prepareStatement(request);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            Ticket ticket = new Ticket();
            Evenement evenement = new Evenement();
            User user = new User();

            ticket.setId(rs.getInt("id"));
            ticket.setPrix(rs.getInt("prix"));
            ticket.setQuantite(rs.getInt("quantite"));
            ticket.setType(rs.getString("type"));
            ticket.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
            ticket.setStatus(rs.getBoolean("status"));

            evenement.setId(rs.getInt("id"));
            evenement.setNom(rs.getString("nom"));
            evenement.setDescription(rs.getString("description"));
            // set other fields of evenement

            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            // set other fields of user

            ticket.setEvenementId(evenement);
            ticket.setTicketId(user);

            tickets.add(ticket);
        }
        return tickets;    }
public List<Ticket> getTicketsByEventId(int eventId) throws SQLException {
    List<Ticket> tickets = new ArrayList<>();
    String request = "SELECT * FROM ticket WHERE evenement_id=?";
    PreparedStatement pst = cnx.prepareStatement(request);
    pst.setInt(1, eventId);
    ResultSet rs = pst.executeQuery();
    while (rs.next()) {
        Ticket ticket = new Ticket();
        ticket.setPrix(rs.getInt("prix"));
        ticket.setQuantite(rs.getInt("quantite"));
        ticket.setType(rs.getString("type"));

       tickets.add(ticket);

    }
    return tickets;
}

    
}
