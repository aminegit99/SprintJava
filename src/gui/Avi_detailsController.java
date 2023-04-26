/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Avis;
import entities.Evenement;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author hazem_xsx7382
 */
public class Avi_detailsController implements Initializable {

    @FXML
    private Text id_user;
    @FXML
    private Text avi_cuntn;
    @FXML
    private Text id_event;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
            
                              public void avisfrontController(Avis e) {
        
//        id_event.setText(String.valueOf(e.getEvenementId().getId()));
        
        id_user.setText(e.getUserId().getName());
        avi_cuntn.setText(e.getContenu());

        // TODO
    }
    
}
