/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Evenement;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import services.Evenementservice;

/**
 * FXML Controller class
 *
 * @author hazem_xsx7382
 */
public class FrontController implements Initializable {
Evenementservice es = new Evenementservice();
    @FXML
    private GridPane grid_event;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                        try {
            List<Evenement> evenements = es.getAll();
            int row = 0;
            int column = 0;
            for (int i = 0; i < evenements.size(); i++) {
                //chargement dynamique d'une interface
                FXMLLoader loader = new FXMLLoader(getClass().getResource("eventfront.fxml"));
                AnchorPane pane = loader.load();
               
                //passage de parametres
                EventfrontController controller = loader.getController();
                controller.setEvenement(evenements.get(i));
              //  controller.setIdevent(evenements.get(i).getId_event());
                grid_event.add(pane, column, row);
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
