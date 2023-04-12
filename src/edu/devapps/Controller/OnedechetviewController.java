/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import aminejava.MyListener;
import edu.devapps.entity.Bac;
import edu.devapps.entity.Dechet;
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
public class OnedechetviewController implements Initializable {

    @FXML
    private Label quantite;
    @FXML
    private Label date;
 private Dechet dechet;
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
                      myListener.onClickListener(dechet);

    }
    
    
        public void setData(Dechet newdechet, MyListener myListener) {
        this.dechet = newdechet;
        this.myListener = myListener;
        quantite.setText(""+newdechet.getQuantite());
        date.setText(""+newdechet.getDate());
        
       
      
        
    }
    
}
