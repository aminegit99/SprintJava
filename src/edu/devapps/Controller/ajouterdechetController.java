/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import edu.devapps.entity.Bac;
import edu.devapps.entity.Categorie;
import edu.devapps.entity.Dechet;
import edu.devapps.services.DechetService;
import edu.devapps.services.Mail;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
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
public class ajouterdechetController implements Initializable {

    @FXML
    private AnchorPane anchorme;
    @FXML
    private TextField quantite;
Bac thisbac;
Categorie thiscategorie;
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
        
                           FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/categorieview.fxml"));
                           Parent root =load.load();
                           categorieviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage s= new Stage();
                           s=(Stage)((Node)event.getSource()).getScene().getWindow();
                           s.setScene(ss);
                           s.show();
    }

    @FXML
    private void ajouterdechet(ActionEvent event) throws IOException, Exception {
   
                DechetService s = new DechetService();
                
                
                
                
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
                   
               
                    int q= Integer.valueOf(quantite.getText());
        s.ajouterdechet(new Dechet(1, q, new Date(199993010),thiscategorie.getId(),thisbac.getId()));
                   Mail.sendMail("medamine.abidi@esprit.tn", 0);
                        Alert a = new Alert(Alert.AlertType.INFORMATION, "votre dechet est ajouter avec success ");
                        a.show();
        
                          anchorme.setVisible(false);
        
                           FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/categorieview.fxml"));
                           Parent root =load.load();
                           categorieviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();}
    
    }
    
      public void  getinfo (Bac bac,Categorie cat)
    {
        thisbac=bac;
        thiscategorie=cat;
    }
}
