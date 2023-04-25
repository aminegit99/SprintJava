/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Evenement;
import entities.Ticket;
import entities.User;
import java.io.File;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import services.Evenementservice;
import services.Ticketservice;

/**
 * FXML Controller class
 *
 * @author hazem_xsx7382
 */
public class Event_detailsController implements Initializable {

    @FXML
    private ImageView image_event;
    @FXML
    private TextField sai_tickts_prix;
    @FXML
    private TextField sai_tickts_quantite;
    @FXML
    private Text id_event;
    @FXML
    private Text nom_event;
    @FXML
    private Text des_event;
    @FXML
    private Text type_event;
    @FXML
    private Text prix_event;
    @FXML
    private Text nb_event;
    @FXML
    private Text adresse_event;
Ticketservice ts = new Ticketservice();
Evenementservice es = new Evenementservice();
    @FXML
    private Text invalid;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        
        
    }    
            public void  descriptiondata(Evenement e )
    {
       id_event.setText(String.valueOf(e.getId()));
    
     nom_event.setText(e.getNom());
    
     des_event.setText(e.getDescription());
    
    type_event.setText(e.getType());
    
    prix_event.setText(String.valueOf(e.getPrix()));
    
     nb_event.setText(String.valueOf(e.getNombrePlace()));
    
     adresse_event.setText(e.getAdresse());
              String path = e.getImageName();
               File file=new File(path);
              Image img = new Image(file.toURI().toString());
                image_event.setImage(img);

    }
            

    @FXML
    private void ajouter_ticket(ActionEvent event) throws SQLException {
          int a=Integer.parseInt(id_event.getText());
        int b=Integer.parseInt(nb_event.getText())-Integer.parseInt(sai_tickts_quantite.getText());
         Evenement e = es.getEventById(Integer.parseInt(id_event.getText()));
        User use= new User(1, "mootaz","mootaz"); 
        Ticket ticket = new Ticket();
       ticket.setEvenementId(e); // set the evenement id to 1
        ticket.setTicketId(use); // set the user id to 2
        ticket.setPrix(Integer.parseInt(prix_event.getText()));
        ticket.setQuantite(Integer.parseInt(sai_tickts_quantite.getText()));
        ticket.setType(sai_tickts_prix.getText());
        if(e.getNombrePlace()< Integer.parseInt(sai_tickts_quantite.getText())){
            invalid.setText("nombre de place est limité");

             sai_tickts_prix.setText("");
  
          sai_tickts_quantite.setText("");
        
        }else{                ts.ajouterproduit(ticket);
      
        es.updateNombrePlace(a,b);
                     sai_tickts_prix.setText("");
                     
         nb_event.setText(String.valueOf(b));
          sai_tickts_quantite.setText("");}

        
    }
    
}
