/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.Controller;

import edu.devapps.services.BacService;
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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author THEOLDISBACK
 */
public class StatisticController implements Initializable {

    @FXML
    private BarChart<?, ?> recchart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        XYChart.Series set1= new XYChart.Series<>();
        BacService S = new BacService();
             DechetService Se = new DechetService();
               for (int i = 0; i < S.afficherbac().size(); i++) {
            
            set1.getData().add(new XYChart.Data("bac"+S.afficherbac().get(i).getRef(),Se.statistic(S.afficherbac().get(i).getId())));
        }
          
             
             
            
           recchart.setBarGap(40);
        recchart.setCategoryGap(10);

             
      
    recchart.getData().setAll(set1);
    }    

    @FXML
    private void goback(ActionEvent event) throws IOException {
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
