/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Evenement;
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


    
}
