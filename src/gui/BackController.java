/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Evenement;
import entities.Ticket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import services.Evenementservice;
import services.Ticketservice;

/**
 * FXML Controller class
 *
 * @author hazem_xsx7382
 */
public class BackController implements Initializable {

    @FXML
    private TextField sai_nom;
    @FXML
    private TextField sai_image;
    @FXML
    private TextField sai_type;
    @FXML
    private DatePicker sai_date;
    @FXML
    private TextField sai_prix;
    @FXML
    private TextField sai_nbplace;
    @FXML
    private TextField sai_adresse;
    @FXML
    private TextField sai_etat;
    @FXML
    private TableView<Evenement> tab_evnt;
    @FXML
    private TableColumn<Evenement, Integer> id_col;
    @FXML
    private TableColumn<Evenement, String> nom_col;
    @FXML
    private TableColumn<Evenement, String> image_col;
    @FXML
    private TableColumn<Evenement, String> type_col;
    @FXML
    private TableColumn<Evenement, String> date_col;
    @FXML
    private TableColumn<Evenement, Integer> prix_col;
    @FXML
    private TableColumn<Evenement, Integer> place_col;
    @FXML
    private TableColumn<Evenement, String> adresse_col;
    @FXML
    private TableColumn<Evenement, Boolean> etat_col;
    @FXML
    private TableColumn<Evenement, Button> delate_col;
    @FXML
    private TextField sai_description;
    @FXML
    private TableColumn<?, String> description_col;
int index = -1;
Evenementservice es = new Evenementservice();
Ticketservice ts = new Ticketservice();
    @FXML
    private ImageView ImageViw;
    @FXML
    private TableView<Ticket> tab_tickts;
    @FXML
    private TableColumn<Ticket, Integer> prix_tcisk_col;
    @FXML
    private TableColumn<Ticket, Integer> quntiter_tickets_col;
    @FXML
    private TableColumn<Ticket, String> type_tickest_col;
    @FXML
    private Text nom_sai;
    @FXML
    private Text description_saisir;
    @FXML
    private Text image_saisir;
    @FXML
    private Text prix_saisir;
    @FXML
    private Text adresse_saisir;
    /**
     * Initializes the controller class.
     */ 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
                    List<Evenement> Evenements = es.getAll();
            ObservableList<Evenement> olp = FXCollections.observableArrayList(Evenements);
            tab_evnt.setItems(olp);
            id_col.setCellValueFactory(new PropertyValueFactory("id"));
            nom_col.setCellValueFactory(new PropertyValueFactory("nom"));
            description_col.setCellValueFactory(new PropertyValueFactory("description"));
            image_col.setCellValueFactory(new PropertyValueFactory("imageName"));
            type_col.setCellValueFactory(new PropertyValueFactory("type"));
            date_col.setCellValueFactory(new PropertyValueFactory("date"));
            prix_col.setCellValueFactory(new PropertyValueFactory("prix"));
            place_col.setCellValueFactory(new PropertyValueFactory("nombrePlace"));
            adresse_col.setCellValueFactory(new PropertyValueFactory("adresse"));
            etat_col.setCellValueFactory(new PropertyValueFactory("etat"));
            
            this.delete();
        } catch (SQLException ex) {
            System.out.println("error" + ex.getMessage());
        }
        // TODO
    } 
   



    @FXML
    private void ajouter_ev(ActionEvent event) {
         try {
              String adresseUtilisateur = sai_adresse.getText().trim();
if(sai_nom.getText().length()==0)
{nom_sai.setText("invalide nom");}else if(sai_description.getText().length()==0){description_saisir.setText("description ivalide ");}
else if(sai_image.getText().length()==0){image_saisir.setText("image ivalide ");}
else if (!sai_prix.getText().matches("[0-9]+")) {
    prix_saisir.setText("Le prix ne peut contenir que des nombres");
}

else if (adresseUtilisateur.length() == 0 || !adresseUtilisateur.matches(".*\\b(Tunis|Ariana|Ben Arous|Mannouba|Bizerte|Nabeul|Zaghouan|Sousse|Monastir|Mahdia|Sfax|Kairouan|Kasserine|Sidi Bouzid|Gabès|Medenine|Tataouine|Gafsa|Tozeur|Kebili)\\b.*")) {
   
    adresse_saisir.setText("L'adresse doit contenir une ville de Tunisie valide");
}
else{
     nom_sai.setText("");
            description_saisir.setText("");
           image_saisir.setText("");
           adresse_saisir.setText("");
           prix_saisir.setText("");
    
            Evenement p = new Evenement();
            p.setNom(sai_nom.getText());
                    p.setDescription(sai_description.getText());
                   
            p.setImageName(sai_image.getText());
            p.setType(sai_type.getText());
            p.setDate(sai_date.getValue());
            p.setPrix(Integer.parseInt(sai_prix.getText()));
           p.setNombrePlace(Integer.parseInt(sai_nbplace.getText()));
            p.setAdresse(sai_adresse.getText());
            p.setEtat(Boolean.valueOf(sai_etat.getText()));
            
            
            es.ajouterproduit(p);
            vide();}

           
            
                    List<Evenement> Evenements = es.getAll();
            ObservableList<Evenement> olp = FXCollections.observableArrayList(Evenements);
          
                   tab_evnt.setItems(olp);
            id_col.setCellValueFactory(new PropertyValueFactory("id"));
            nom_col.setCellValueFactory(new PropertyValueFactory("nom"));
            description_col.setCellValueFactory(new PropertyValueFactory("description"));
            image_col.setCellValueFactory(new PropertyValueFactory("imageName"));
            type_col.setCellValueFactory(new PropertyValueFactory("type"));
            date_col.setCellValueFactory(new PropertyValueFactory("date"));
            prix_col.setCellValueFactory(new PropertyValueFactory("prix"));
            place_col.setCellValueFactory(new PropertyValueFactory("nombrePlace"));
            adresse_col.setCellValueFactory(new PropertyValueFactory("adresse"));
            etat_col.setCellValueFactory(new PropertyValueFactory("etat"));
            this.delete();
        } catch (SQLException ex) {
            System.out.println("error" + ex.getMessage());
        }
    }

    @FXML
    private void modif_ev(ActionEvent event) {
                 try {


            Evenement p = new Evenement();
            p.setId(id_col.getCellData(index));
            p.setNom(sai_nom.getText());
                    p.setDescription(sai_description.getText());
                   
            p.setImageName(sai_image.getText());
            p.setType(sai_type.getText());
            p.setDate(sai_date.getValue());
            p.setPrix(Integer.parseInt(sai_prix.getText()));
            p.setNombrePlace(Integer.parseInt(sai_nbplace.getText()));
            p.setAdresse(sai_adresse.getText());
            p.setEtat(Boolean.valueOf(sai_etat.getText()));
            
             es.updateproduit(p);
            vide();
           
            
                    List<Evenement> Evenements = es.getAll();
            ObservableList<Evenement> olp = FXCollections.observableArrayList(Evenements);
            tab_evnt.setItems(olp);
            id_col.setCellValueFactory(new PropertyValueFactory("id"));
            nom_col.setCellValueFactory(new PropertyValueFactory("nom"));
            description_col.setCellValueFactory(new PropertyValueFactory("description"));
            image_col.setCellValueFactory(new PropertyValueFactory("imageName"));
            type_col.setCellValueFactory(new PropertyValueFactory("type"));
            date_col.setCellValueFactory(new PropertyValueFactory("date"));
            prix_col.setCellValueFactory(new PropertyValueFactory("prix"));
            place_col.setCellValueFactory(new PropertyValueFactory("nombrePlace"));
            adresse_col.setCellValueFactory(new PropertyValueFactory("adresse"));
            etat_col.setCellValueFactory(new PropertyValueFactory("etat"));
            this.delete();
        } catch (SQLException ex) {
            System.out.println("error" + ex.getMessage());
        }
        
    }

    @FXML
    private void select_ev(MouseEvent event) throws SQLException, MalformedURLException {
           index =tab_evnt.getSelectionModel().getSelectedIndex();
        if (index < 0) {
    return;
}
sai_nom.setText(nom_col.getCellData(index).toString());
sai_description.setText(description_col.getCellData(index).toString());

 

sai_image.setText(image_col.getCellData(index).toString());

sai_prix.setText(prix_col.getCellData(index).toString());
sai_nbplace.setText(place_col.getCellData(index).toString());
sai_type.setText(type_col.getCellData(index).toString());
sai_adresse.setText(adresse_col.getCellData(index).toString());
sai_etat.setText(etat_col.getCellData(index).toString());
String path = sai_image.getText();
             File file = new File("C:\\\\Users\\\\hazem_xsx7382\\\\Documents\\\\GitHub\\\\gestion_recyclage\\\\public\\\\images\\\\" + image_col.getCellData(index).toString());
String fileUrl = file.toURI().toURL().toString();
Image img = new Image(fileUrl);
              System.out.println(img);
              ImageViw.setImage(img);
                
        
                           List<Ticket> Tickets = ts.getTicketsByEventId(id_col.getCellData(index));
            ObservableList<Ticket> olp = FXCollections.observableArrayList(Tickets);
            tab_tickts.setItems(olp);
            prix_tcisk_col.setCellValueFactory(new PropertyValueFactory("prix"));
            quntiter_tickets_col.setCellValueFactory(new PropertyValueFactory("quantite"));
            type_tickest_col.setCellValueFactory(new PropertyValueFactory("type"));      
        
    }
       public void delete() {
        delate_col.setCellFactory((param) -> {
            return new TableCell() {
                @Override
                protected void updateItem(Object item, boolean empty) {
                    setGraphic(null);
                    if (!empty) {
                        Button b = new Button("delete");
                        b.setOnAction((event) -> {
                            try {
                                if (es.suprimeproduit(tab_evnt.getItems().get(getIndex()))) {
                                    tab_evnt.getItems().remove(getIndex());
                                    tab_evnt.refresh();

                                }
                            } catch (SQLException ex) {
                                System.out.println("erreor:" + ex.getMessage());

                            }

                        });
                        setGraphic(b);

                    }
                }
            };

        });

    }
       public void vide (){
            sai_nom.setText("");
            sai_description.setText("");
           sai_image.setText("");
           sai_type.setText("");
           sai_prix.setText("");
           sai_nbplace.setText("");
           sai_adresse.setText("");
           sai_etat.setText("");
           
           

}
 @FXML
    private void UplodImage(ActionEvent event) throws FileNotFoundException, IOException {
        
  
           Random rand = new Random();
        int x = rand.nextInt(1000);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Upload File Path");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
        File file = fileChooser.showOpenDialog(null);
        String DBPath = "" + x + ".jpg";
        String imagePath = "C:\\Users\\hazem_xsx7382\\Documents\\GitHub\\gestion_recyclage\\public\\images\\" + DBPath;


        if (file != null) {
            FileInputStream Fsource = new FileInputStream(file.getAbsolutePath());
            FileOutputStream Fdestination = new FileOutputStream(imagePath);
            BufferedInputStream bin = new BufferedInputStream(Fsource);
            BufferedOutputStream bou = new BufferedOutputStream(Fdestination);
            System.out.println(file.getAbsoluteFile());
            String path=file.getAbsolutePath();
            Image img = new Image(file.toURI().toString());
            ImageViw.setImage(img);
            /* File File1 = new File(DBPath);
            Image img = new Image(File1.getAbsolutePath());
            image_event.setImage(img);*/
             sai_image.setText(DBPath);
            int b = 0;
            while (b != -1) {
                b = bin.read();
                bou.write(b);
            }
            bin.close();
            bou.close();
            
        } else {
            System.out.println("error");

        }
        
        
    }
}
