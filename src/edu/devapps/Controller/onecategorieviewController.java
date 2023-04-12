/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import aminejava.MyListener;
import edu.devapps.entity.Categorie;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author THEOLDISBACK
 */
public class onecategorieviewController implements Initializable {

    @FXML
    private Label nom;
    @FXML
    private Label adresse;
 private Categorie categorie;
    private MyListener myListener;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onclick(MouseEvent event) {
          myListener.onClickListener(categorie);
    }
    
    
      public void setData(Categorie newcat, MyListener myListener) {
        this.categorie = newcat;
        this.myListener = myListener;
        nom.setText(newcat.getNom());
        adresse.setText(newcat.getDescription());
      
      
        
    }
    
}
