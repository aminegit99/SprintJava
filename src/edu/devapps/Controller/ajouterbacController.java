/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import edu.devapps.entity.Bac;
import edu.devapps.services.BacService;
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
public class ajouterbacController implements Initializable {

    @FXML
    private AnchorPane anchorme;
    @FXML
    private TextField ref;
    @FXML
    private TextField codepostal;
    @FXML
    private TextField adresse;
    @FXML
    private TextField capacite;
    @FXML
    private TextField etat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void annulerbac(ActionEvent event) throws IOException {
 
     anchorme.setVisible(false);
        
                           FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/bacview.fxml"));
                           Parent root =load.load();
                           bacviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage s= new Stage();
                           s=(Stage)((Node)event.getSource()).getScene().getWindow();
                           s.setScene(ss);
                           s.show();
    }

    @FXML
    private void ajouterbac(ActionEvent event) throws IOException {
        
                BacService c = new BacService();
                 int ip;
                 int ab=0;
               try{
    ip= Integer.parseInt(codepostal.getText());

  }catch(NumberFormatException e){
          Alert a = new Alert(Alert.AlertType.INFORMATION, "code postal cant be string");
                a.show();
                ab=1;
    }
               
         
               
                try{
    ip= Integer.parseInt(capacite.getText());

  }catch(NumberFormatException e){
          Alert a = new Alert(Alert.AlertType.INFORMATION, "capacite cant be string");
                a.show();
                ab=1;
    }
                
                               try{
    ip= Integer.parseInt(etat.getText());

  }catch(NumberFormatException e){
          Alert a = new Alert(Alert.AlertType.INFORMATION, "etat cant be string");
                a.show();
                ab=1;
    }
               if( ab==0)
               {
                 int       cod= Integer.parseInt(codepostal.getText());

            
                
                        
                        int cap = Integer.valueOf(capacite.getText());
                        
                        int  etat1 = Integer.valueOf(etat.getText());
                        
                        if( checkString(ref.getText()))
                        {
                            if (adresse.getText().equals(""))
                            {
                               Alert a = new Alert(Alert.AlertType.INFORMATION, "adresse cant be null");
                a.show(); 
                            }
                            else
                            {
                                
                            
                       
          c.ajouterbac(new Bac(1,ref.getText(), adresse.getText(), cod,cap,etat1));
                Alert a = new Alert(Alert.AlertType.INFORMATION, "bac  ajouter avec  success");
                a.show();
                            anchorme.setVisible(false);
        
                           FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/bacview.fxml"));
                           Parent root =load.load();
                          bacviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage s= new Stage();
                           s=(Stage)((Node)event.getSource()).getScene().getWindow();
                           s.setScene(ss);
                           s.show();
                            }}
                        else
                        {
                             Alert a = new Alert(Alert.AlertType.INFORMATION, "referance must have atleast one uppercase , one lowercase , one number ");
                              a.show();
                        }
    }   }
   
    
    
    
    
    private static boolean checkString(String str) {
    char ch;
    boolean capitalFlag = false;
    boolean lowerCaseFlag = false;
    boolean numberFlag = false;
    for(int i=0;i < str.length();i++) {
        ch = str.charAt(i);
        if( Character.isDigit(ch)) {
            numberFlag = true;
        }
        else if (Character.isUpperCase(ch)) {
            capitalFlag = true;
        } else if (Character.isLowerCase(ch)) {
            lowerCaseFlag = true;
        }
        if(numberFlag && capitalFlag && lowerCaseFlag)
            return true;
    }
    return false;
}
}
