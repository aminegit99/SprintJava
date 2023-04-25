/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import edu.devapps.entity.Dechet;
import edu.devapps.services.DechetService;
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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author THEOLDISBACK
 */
public class ModifierdechetController implements Initializable {

    @FXML
    private AnchorPane anchorme;
    @FXML
    private TextField quantite;
   Dechet dechet;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void annulerdechet(ActionEvent event) throws IOException {
    anchorme.setVisible(false);
        
                           FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/dechetview.fxml"));
                           Parent root =load.load();
                           dechetviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage s= new Stage();
                           s=(Stage)((Node)event.getSource()).getScene().getWindow();
                           s.setScene(ss);
                           s.show();
    
    }

    @FXML
    private void modifierdechet(ActionEvent event) throws IOException {
        
        int quantitee = Integer.valueOf(quantite.getText());
        
        
                      int ip;
                 int ab=0;
               try{
    ip= Integer.parseInt(quantite.getText());

  }catch(NumberFormatException e){
          Alert a = new Alert(Alert.AlertType.INFORMATION, "quantite cant be string");
                a.show();
                ab=1;
    }
               if (ab==0)
               {
                   
              
        DechetService s = new DechetService();
          s.modifierdechet(new Dechet(dechet.getId(), quantitee, dechet.getDate(),dechet.getIdcat(),dechet.getIdbac()));
                        Alert a = new Alert(Alert.AlertType.INFORMATION, "votre dechet est modifier ");
                        a.show();
        
                          anchorme.setVisible(false);
        
                           FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/dechetview.fxml"));
                           Parent root =load.load();
                           dechetviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();
                            }
    }
    
    
      public void  getinfo (Dechet dechet)
    {
        this.dechet=dechet;
  
        quantite.setText(""+dechet.getQuantite());
        
      
       
      
      
        
    }
}
