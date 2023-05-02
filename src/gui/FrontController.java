/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import com.google.zxing.WriterException;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import entities.Evenement;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import services.Evenementservice;

/**
 * FXML Controller class
 *
 * @author hazem_xsx7382
 */
public class FrontController implements Initializable {
Evenementservice es = new Evenementservice();
    @FXML
    private GridPane grid_event;
    @FXML
    private TextField cherrrrr;
    @FXML
    private Button trier;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                        try {
                            es.ticketGagnate();
                            
            List<Evenement> evenements = es.getAll();
            int row = 0;
            int column = 0;
            for (int i = 0; i < evenements.size(); i++) {
                //chargement dynamique d'une interface
                FXMLLoader loader = new FXMLLoader(getClass().getResource("eventfront.fxml"));
                AnchorPane pane = loader.load();
               
                //passage de parametres
                EventfrontController controller = loader.getController();
                                try {
                                    controller.setEvenement(evenements.get(i));
                                } catch (WriterException ex) {
                                    Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
                                }
              //  controller.setIdevent(evenements.get(i).getId_event());
                grid_event.add(pane, column, row);
                column++;
                if (column > 1) {
                    column = 0;
                    row++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
        Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MessagingException ex) {
        Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
    } catch (javax.mail.MessagingException ex) {
        Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }    

    @FXML
    private void chercher_event(KeyEvent event) {

        
    }

    @FXML
    private void cherchheetbt(ActionEvent event) {
        grid_event.getChildren().clear();
        String a=cherrrrr.getText();
                
                                try {
                                    
            List<Evenement> evenements = es.chercher(a);
            int row = 0;
            int column = 0;
            for (int i = 0; i < evenements.size(); i++) {
                //chargement dynamique d'une interface
                FXMLLoader loader = new FXMLLoader(getClass().getResource("eventfront.fxml"));
                AnchorPane pane = loader.load();
               
                //passage de parametres
                EventfrontController controller = loader.getController();
                try {
                    controller.setEvenement(evenements.get(i));
                } catch (WriterException ex) {
                    Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
                }
              //  controller.setIdevent(evenements.get(i).getId_event());
                grid_event.add(pane, column, row);
                column++;
                if (column > 1) {
                    column = 0;
                    row++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
        Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
    }

    }

    @FXML
    private void trie(ActionEvent event) throws SQLException {
                grid_event.getChildren().clear();
        
                
                                try {
                                    
            List<Evenement> evenements = es.trier();
            int row = 0;
            int column = 0;
            for (int i = 0; i < evenements.size(); i++) {
                //chargement dynamique d'une interface
                FXMLLoader loader = new FXMLLoader(getClass().getResource("eventfront.fxml"));
                AnchorPane pane = loader.load();
               
                //passage de parametres
                EventfrontController controller = loader.getController();
                try {
                    controller.setEvenement(evenements.get(i));
                } catch (WriterException ex) {
                    Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
                }
              //  controller.setIdevent(evenements.get(i).getId_event());
                grid_event.add(pane, column, row);
                column++;
                if (column > 1) {
                    column = 0;
                    row++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        }catch (SQLException ex){
        Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
}
