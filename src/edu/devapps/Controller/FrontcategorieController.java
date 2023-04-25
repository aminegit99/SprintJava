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
import edu.devapps.services.CategorieService;
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
public class FrontcategorieController implements Initializable {

     Categorie currentat;
     private Parent fxml;
      private List<Categorie> categories = new ArrayList<>();
    private Image image;
    private MyListener myListener;
    @FXML
    private GridPane grid;
       Bac bac;

    /**
     * Initializes the controller class.
     */
    
     private List<Categorie> getData() throws SQLException {
      
            List<Categorie> categories = new ArrayList<>();
         CategorieService s = new CategorieService();
        Categorie cat1;

        for (int i = 0; i < s.affichercategorie().size(); i++) {
            Categorie get = s.affichercategorie().get(i);
            
            
            cat1 = new Categorie();
            cat1.setId(get.getId());
            cat1.setNom(get.getNom());
            cat1.setDescription(get.getDescription());
           
           
        
           
            
         
            categories.add(cat1);
        }
    

      
        return categories;
    }

    private void setChosenCamping(Categorie cat) {
        currentat=cat;
       
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
               categories.addAll(getData());
        if (categories.size() > 0) {
            setChosenCamping(categories.get(0));
            myListener = new MyListener() {
           

            

             

                @Override
                public void onClickListener(Bac Bac) {
                }

                @Override
                public void onClickListener(Categorie Categorie) {
                      setChosenCamping(Categorie);
                }

                @Override
                public void onClickListener(Dechet Dechet) {
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < categories.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/edu/devapps/Interface/onecategorieviewfront.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();
                onecategorieviewfrontController onecategorieviewfrontController = fxmlLoader.getController();
                System.out.println(this.bac +"eee");
                onecategorieviewfrontController.setData(categories.get(i),this.bac,myListener);

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
     
     
        public void setinformation(Bac b) throws SQLException
    {
        System.out.println(b);
        this.bac=b;
        System.out.println(this.bac);
        grid.getChildren().clear();
        categories.clear();
        afficher();
    }
    
}
