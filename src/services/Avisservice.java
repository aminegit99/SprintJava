/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Avis;
import entities.Evenement;
import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MyDB;

/**
 *
 * @author hazem_xsx7382
 */
public class Avisservice implements IAvis{
    Connection cnx;

    public Avisservice() {
        cnx =MyDB.getInstance().getCnx();
    }
    

    @Override
    public boolean ajouteAvis(Avis p) throws SQLException {
    String insertQuery = "INSERT INTO avis (evenement_id,user_id,contenu) VALUES (?, ?, ?)";
    PreparedStatement insertStmt = cnx.prepareStatement(insertQuery);
    insertStmt.setInt(1, p.getEvenementId().getId());
    insertStmt.setInt(2, p.getUserId().getId());
    insertStmt.setString(3, p.getContenu());
    int rowsAffected = insertStmt.executeUpdate();
    if (rowsAffected == 1) {
        System.out.println("Avis added successfully");
        return true;
    } else {
        System.out.println("Failed to add avis");
        return false;
    }    }

    @Override
    public boolean updateAvis(Avis p) throws SQLException {
            String request = "UPDATE avis SET contenu = ? WHERE id = ?";
    PreparedStatement pst = cnx.prepareStatement(request);
    pst.setString(1, p.getContenu());
    pst.setInt(2, p.getId());
    int result = pst.executeUpdate();
    return result > 0;
    }

    @Override
    public boolean suprimeAvis(Avis p) throws SQLException {
           String request = "DELETE FROM avis WHERE id_avis=?";
    PreparedStatement pst = cnx.prepareStatement(request);
    pst.setInt(1, p.getId());
    int result = pst.executeUpdate();
    if (result > 0) {
        System.out.println("Avis deleted");
        return true;
    } else {
        return false;
    }
    }

    @Override
    public List<Avis> getAll() throws SQLException {
List<Avis> aviss = new ArrayList<>();
List<Avis> avisList = new ArrayList<>();
    String request = "SELECT * FROM avis INNER JOIN evenement ON avis.evenement_id=evenement.id INNER JOIN user ON avis.user_id=user.id";
    PreparedStatement pst = cnx.prepareStatement(request);
    ResultSet rs = pst.executeQuery();
    while (rs.next()) {
        Avis avis = new Avis();
        Evenement evenement = new Evenement();
        User user = new User();

        avis.setId(rs.getInt("id"));
        avis.setContenu(rs.getString("contenu"));

        evenement.setId(rs.getInt("id"));
        evenement.setNom(rs.getString("nom"));
        evenement.setDescription(rs.getString("description"));
        // set other fields of evenement

        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        // set other fields of user

        avis.setEvenementId(evenement);
        avis.setUserId(user);
        avisList.add(avis);
    }
    return avisList;
    }
public List<Avis> getAvisList(int eventId) throws SQLException {
    List<Avis> avisList = new ArrayList<>();
    String request = "SELECT * FROM avis INNER JOIN user ON avis.user_id=user.id WHERE evenement_id = ?";
    PreparedStatement pst = cnx.prepareStatement(request);
    pst.setInt(1, eventId);
    ResultSet rs = pst.executeQuery();
    while (rs.next()) {
        Evenement evenement = new Evenement(eventId);
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        Avis avis = new Avis();
        avis.setId(rs.getInt("id"));
        avis.setEvenementId(evenement);
        avis.setUserId(user);
        avis.setContenu(rs.getString("contenu"));
        // set other fields of avis
        avisList.add(avis);
    }
    return avisList;
}


    

   
    
}
