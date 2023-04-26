/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Evenement;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import services.Evenementservice;

/**
 * FXML Controller class
 *
 * @author hazem_xsx7382
 */
public class EventfrontController implements Initializable {

    @FXML
    private ImageView image_event;
    @FXML
    private Text id_event;
    @FXML
    private Text nom_event;
    @FXML
    private Text prix_event;
    @FXML
    private Text desc_event;
Evenementservice es = new Evenementservice();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    }    
                  public void setEvenement(Evenement e) {
        
        id_event.setText(String.valueOf(e.getId()));
        
        desc_event.setText(e.getDescription());
        nom_event.setText(e.getNom());
        prix_event.setText(String.valueOf(e.getPrix()));
         String path = e.getImageName();
               File file=new File(path);
              Image img = new Image(file.toURI().toString());
                image_event.setImage(img);
        // TODO
        
    }
                          
    
    
    
                 

    @FXML
    private void got_detailse(MouseEvent event) throws SQLException {
                                try {
                              
                            
                  FXMLLoader loader = new FXMLLoader(getClass().getResource("event_details.fxml"));
        Parent root = loader.load();

        
          Event_detailsController destController = loader.getController();
//          destController.prodredcu(ps.selectProduitById(ps.getProductIdByName(nomProduirLabel.getText())));
       
          Evenement e = es.getEventById(Integer.parseInt(id_event.getText()));
         
            
                            
         destController.descriptiondata(e);

        
                    Scene sence = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(sence);
                    stage.show();
            
        } catch (IOException ex) {
            System.out.println("error" + ex.getMessage());
        }
    }

    @FXML
    private void ajouter_avis(ActionEvent event) throws SQLException {
                                        try {
                                            Evenement e = es.getEventById(Integer.parseInt(id_event.getText()));
                            
                            
                  FXMLLoader loader = new FXMLLoader(getClass().getResource("avisfxml.fxml"));
        Parent root = loader.load();
                        AvisfxmlController dedstController = loader.getController();
                            
         dedstController.event_data(e);

                    Scene sence = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(sence);
                    stage.show();
            
        } catch (IOException ex) {
            System.out.println("error" + ex.getMessage());
        }

    }
}
