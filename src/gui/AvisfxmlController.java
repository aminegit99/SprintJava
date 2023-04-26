/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Avis;
import entities.Evenement;
import entities.User;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import services.Avisservice;
import services.Evenementservice;

/**
 * FXML Controller class
 *
 * @author hazem_xsx7382
 */
public class AvisfxmlController implements Initializable {

    @FXML
    private GridPane grid_avus;
    @FXML
    private TextField avis_sai;
    Avisservice es=new Avisservice();
    @FXML
    private Text id_event;
Evenementservice ess = new Evenementservice();

    /**
     * Initializes the controller class.
     */
 
// int aa = Integer.parseInt(id_event.getText());

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
                                        try {
                                      

            List<Avis> evenements = es.getAvisList(1);
            int row = 0;
            int column = 0;
            for (int i = 0; i < evenements.size(); i++) {
                //chargement dynamique d'une interface
                FXMLLoader loader = new FXMLLoader(getClass().getResource("avi_details.fxml"));
                AnchorPane pane = loader.load();
               
                //passage de parametres
                Avi_detailsController controller = loader.getController();
                controller.avisfrontController(evenements.get(i));
              //  controller.setIdevent(evenements.get(i).getId_event());
                grid_avus.add(pane, column, row);
                column++;
                if (column > 1) {
                    column = 0;
                    row++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
        Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
   
             public void  event_data(Evenement e)
    {
       id_event.setText(String.valueOf(e.getId()));
    }

    @FXML
    private void ajouter_avis(ActionEvent event) throws SQLException {
         Avis p = new Avis();
         Evenement ef = new Evenement(Integer.parseInt(id_event.getText()));
         User us = new User(1);
         p.setEvenementId(ef);
         p.setUserId(us);
            p.setContenu(avis_sai.getText());
        es.ajouteAvis(p);
                                                try {
                                      

            List<Avis> evenements = es.getAvisList(Integer.parseInt(id_event.getText()));
            int row = 0;
            int column = 0;
            for (int i = 0; i < evenements.size(); i++) {
                //chargement dynamique d'une interface
                FXMLLoader loader = new FXMLLoader(getClass().getResource("avi_details.fxml"));
                AnchorPane pane = loader.load();
               
                //passage de parametres
                Avi_detailsController controller = loader.getController();
                controller.avisfrontController(evenements.get(i));
              //  controller.setIdevent(evenements.get(i).getId_event());
                grid_avus.add(pane, column, row);
                column++;
                if (column > 1) {
                    column = 0;
                    row++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
        Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
     
    }

      
    
}
