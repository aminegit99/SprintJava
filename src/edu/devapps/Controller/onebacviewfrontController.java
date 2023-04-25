/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import aminejava.MyListener;
import edu.devapps.entity.Bac;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author THEOLDISBACK
 */
public class onebacviewfrontController implements Initializable {

    @FXML
    private Label ref;
    @FXML
    private Label adresse;
    @FXML
    private Label codepostal;
    @FXML
    private Label capacite;
    @FXML
    private Label etat;
 private Bac bac;
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
                      myListener.onClickListener(bac);

    }
    
    
     public void setData(Bac newbac, MyListener myListener) {
        this.bac = newbac;
        this.myListener = myListener;
        ref.setText(newbac.getRef());
        adresse.setText(newbac.getAdresse());
        codepostal.setText(""+newbac.getCodepostal());
        capacite.setText(""+newbac.getCapacite());
        etat.setText(""+newbac.getEtat());
       
      
        
    }

    @FXML
    private void ajouterdechet(ActionEvent event) throws IOException, SQLException {
         FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/frontcategorie.fxml"));
        
                           Parent root =load.load();
                            FrontcategorieController c2=  load.getController();
                          c2.setinformation(this.bac);
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();
    }
}
