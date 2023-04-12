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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author THEOLDISBACK
 */
public class bacviewController implements Initializable {

    @FXML
    private VBox chosenFruitCard;
    @FXML
    private Label ref;
    @FXML
    private ImageView fruitImg;
    @FXML
    private Label adresse;
    @FXML
    private Label codepostal;
    @FXML
    private Label capacite;
    @FXML
    private Label etat;
    @FXML
    private HBox hboxcamping;
    @FXML
    private ScrollPane scroll;
    @FXML
    private GridPane grid;
    @FXML
    private AnchorPane anchorforedit;
  Bac currentbac;
     private Parent fxml;
      private List<Bac> bacs = new ArrayList<>();
    private Image image;
    private MyListener myListener;
    
    
    
    
    
    
    
     private List<Bac> getData() throws SQLException {
      
            List<Bac> baccs = new ArrayList<>();
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
           
        
           
            
         
            baccs.add(bac1);
        }
    

      
        return baccs;
    }

    private void setChosenCamping(Bac bac) {
        currentbac=bac;
        ref.setText(bac.getRef());
        adresse.setText(""+ bac.getAdresse());
       codepostal.setText(""+bac.getCodepostal());
       capacite.setText(""+bac.getCapacite());
       etat.setText(""+bac.getEtat());
      
      
        chosenFruitCard.setStyle("-fx-background-color: #FAEBD7;\n" +
                "    -fx-background-radius: 30;");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
               
        anchorforedit.setVisible(false);
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
                fxmlLoader.setLocation(getClass().getResource("/edu/devapps/Interface/onebacview.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                onebacviewviewController onebacviewviewController = fxmlLoader.getController();
                onebacviewviewController.setData(bacs.get(i),myListener);

                if (column == 2) {
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

    @FXML
    private void ajouterbac(ActionEvent event) throws IOException {
         anchorforedit.setVisible(true);
           
                fxml = FXMLLoader.load(getClass().getResource("/edu/devapps/Interface/ajouterbac.fxml"));
                         FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/ajouterbac.fxml"));
                           Parent root =load.load();
                           ajouterbacController c2=  load.getController();
                          fxml=root;
                            anchorforedit.getChildren().removeAll();
                             anchorforedit.getChildren().setAll(fxml);
                              anchorforedit.setVisible(true);   
    
    }

    @FXML
    private void modifierbac(ActionEvent event) throws IOException {
          anchorforedit.setVisible(true);
           
                            fxml = FXMLLoader.load(getClass().getResource("/edu/devapps/Interface/modifierbac.fxml"));
                         FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/modifierbac.fxml"));
                           Parent root =load.load();
                           modifierbacController c2=  load.getController();
                           c2.setData(currentbac);
                          fxml=root;
                            anchorforedit.getChildren().removeAll();
                             anchorforedit.getChildren().setAll(fxml);
                              anchorforedit.setVisible(true);   
    
    
    }

    @FXML
    private void supprimerbac(ActionEvent event) throws IOException {
         BacService s = new BacService();
        
        Bac r = new Bac();
        r.setId(currentbac.getId());
        s.supprimerbac(r);
        Alert a = new Alert(Alert.AlertType.INFORMATION, "your bac has been deleted");
                a.show();
                           FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/bacview.fxml"));
                           Parent root =load.load();
                           bacviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();
    
    }

    @FXML
    private void gototransport(MouseEvent event) throws IOException {
         FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/categorieview.fxml"));
                           Parent root =load.load();
                           categorieviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();
    }

    @FXML
    private void ajouterdechet(ActionEvent event) throws IOException {
    FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/categorieview.fxml"));
                           Parent root =load.load();
                           categorieviewController c2=  load.getController();
                          c2.setinformation(currentbac);
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();
    
    }

    @FXML
    private void gotodechet(MouseEvent event) throws IOException {
    
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
