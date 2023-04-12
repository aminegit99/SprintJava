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
import edu.devapps.services.DechetService;
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
public class dechetviewController implements Initializable {

    @FXML
    private VBox chosenFruitCard;
    @FXML
    private Label quantite;
    @FXML
    private ImageView fruitImg;
    @FXML
    private Label date;
    @FXML
    private HBox hboxcamping;
    @FXML
    private ScrollPane scroll;
    @FXML
    private GridPane grid;
    @FXML
    private AnchorPane anchorforedit;
 Dechet currentdechet;
     private Parent fxml;
      private List<Dechet> dechets = new ArrayList<>();
    private Image image;
    private MyListener myListener;
        private List<Dechet> getData() throws SQLException {
      
            List<Dechet> dechets = new ArrayList<>();
            DechetService s = new DechetService();
        Dechet dechet1;

        for (int i = 0; i < s.afficherdechet().size(); i++) {
            Dechet get = s.afficherdechet().get(i);
            
            
            dechet1 = new Dechet();
            dechet1.setId(get.getId());
            dechet1.setQuantite(get.getQuantite());
            dechet1.setDate(get.getDate());
            dechet1.setIdbac(get.getIdbac());
            dechet1.setIdcat(get.getIdcat());
           
        
           
            
         
            dechets.add(dechet1);
        }
    

      
        return dechets;
    }

    private void setChosenCamping(Dechet dechete) {
        currentdechet=dechete;
        quantite.setText(""+dechete.getQuantite());
        date.setText(""+ dechete.getDate());
      
      
      
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
               dechets.addAll(getData());
        if (dechets.size() > 0) {
            setChosenCamping(dechets.get(0));
            myListener = new MyListener() {
           

            

             

            

                @Override
                public void onClickListener(Bac Bac) {
                }

                @Override
                public void onClickListener(Categorie Categorie) {
                }

                @Override
                public void onClickListener(Dechet Dechet) {
                      setChosenCamping(Dechet);
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < dechets.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/edu/devapps/Interface/onedechetview.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                OnedechetviewController onedechetviewController = fxmlLoader.getController();
                onedechetviewController.setData(dechets.get(i),myListener);

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
    private void modifierdechet(ActionEvent event) throws IOException {
   anchorforedit.setVisible(true);
           
                            fxml = FXMLLoader.load(getClass().getResource("/edu/devapps/Interface/modifierdechet.fxml"));
                         FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/modifierdechet.fxml"));
                           Parent root =load.load();
                           ModifierdechetController c2=  load.getController();
                           c2.getinfo(currentdechet);
                          fxml=root;
                            anchorforedit.getChildren().removeAll();
                             anchorforedit.getChildren().setAll(fxml);
                              anchorforedit.setVisible(true);   
    }

    @FXML
    private void supprimerdechet(ActionEvent event) throws IOException {
    DechetService s = new DechetService();
        
        Dechet r = new Dechet();
        r.setId(currentdechet.getId());
        s.supprimerdechet(r);
        Alert a = new Alert(Alert.AlertType.INFORMATION, "your dechet has been deleted");
                a.show();
                           FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/dechetview.fxml"));
                           Parent root =load.load();
                           dechetviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();
    }

    @FXML
    private void gotocategorie(MouseEvent event) throws IOException {
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
    private void gotobac(MouseEvent event) throws IOException {
          FXMLLoader load = new FXMLLoader(getClass().getResource("/edu/devapps/Interface/bacview.fxml"));
                           Parent root =load.load();
                           bacviewController c2=  load.getController();
                           Scene ss= new Scene(root);
                           Stage se= new Stage();
                           se=(Stage)((Node)event.getSource()).getScene().getWindow();
                           se.setScene(ss);
                           se.show();
   
    }
    
}
