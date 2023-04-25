/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import aminejava.MyListener;
import edu.devapps.entity.Bac;
import edu.devapps.entity.Categorie;
import edu.devapps.entity.Dechet;
import edu.devapps.services.BacService;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;




/**
 * FXML Controller class
 *
 * @author THEOLDISBACK
 */
public class FrontbacController implements Initializable {

     Bac currentbac;
     private Parent fxml;
      private List<Bac> bacs = new ArrayList<>();
    private Image image;
    private MyListener myListener;
    @FXML
    private GridPane grid;
    /**
     * Initializes the controller class.
     */
    
       private List<Bac> getData() throws SQLException {
      
            List<Bac> sponsors = new ArrayList<>();
         BacService s = new BacService();
        Bac bac1;

        for (int i = 0; i < s.afficherbac().size(); i++) {
            Bac get = s.afficherbac().get(i);
            
            
            bac1 = new Bac();
            bac1.setId(get.getId());
            bac1.setRef(get.getRef());
            bac1.setAdresse(get.getAdresse());
            bac1.setCodepostal(get.getCodepostal());
            bac1.setCapacite(get.getCapacite());
            bac1.setEtat(get.getEtat());
           
        
           
            
         
            sponsors.add(bac1);
        }
    

      
        return sponsors;
    }

    private void setChosenCamping(Bac bac) {
        currentbac=bac;
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         try {
            // TODO
            afficher();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }    
    
    
     public void afficher() throws SQLException
    {
               bacs.addAll(getData());
        if (bacs.size() > 0) {
            setChosenCamping(bacs.get(0));
            myListener = new MyListener() {
           

            

          

                @Override
                public void onClickListener(Bac Bac) {
                      setChosenCamping(Bac);
                }

                @Override
                public void onClickListener(Categorie Categorie) {
                }

                @Override
                public void onClickListener(Dechet Dechet) {
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < bacs.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/edu/devapps/Interface/onebacviewfront.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                onebacviewfrontController onebacviewfrontController = fxmlLoader.getController();
                onebacviewfrontController.setData(bacs.get(i),myListener);
                System.out.println(bacs.get(i).getId());
                if (column == 1) {
                    column = 0;
                    row++;
                }

                grid.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
