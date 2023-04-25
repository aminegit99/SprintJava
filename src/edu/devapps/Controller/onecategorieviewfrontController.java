/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import aminejava.MyListener;
import edu.devapps.entity.Bac;
import edu.devapps.entity.Categorie;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author THEOLDISBACK
 */
public class onecategorieviewfrontController implements Initializable {

    @FXML
    private Label nom;
    @FXML
    private Label adresse;
private Categorie categorie;
    private MyListener myListener;
    Bac bac;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterdechet(ActionEvent event) throws IOException {
          FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/ajouterdechetfront.fxml"));
                           Parent root =load.load();
                           ajouterdechetfrontController c2=  load.getController();
                           c2.getinfo(this.bac, this.categorie);
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();
    }
    

    @FXML
    private void onclick(MouseEvent event) {
                  myListener.onClickListener(categorie);

    }
    
     public void setData(Categorie newcat,Bac b, MyListener myListener) {
         this.bac=b;
         this.categorie = newcat;
        this.myListener = myListener;
        nom.setText(newcat.getNom());
        adresse.setText(newcat.getDescription());
      
      
        
    }
    
}
