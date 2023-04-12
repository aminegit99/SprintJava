/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDate;

/**
 *
 * @author hazem_xsx7382
 */
public class Evenement {
       private int id;
    private String nom;
    private String description;
    private String imageName;
    private String type;
    private LocalDate date;
    private int prix;
    private int nombrePlace;
    private String adresse;
    private boolean etat;
    
    // Constructor
    public Evenement(int id, String nom, String description, String imageName, String type, LocalDate date, int prix, int nombrePlace, String adresse, boolean etat) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.imageName = imageName;
        this.type = type;
        this.date = date;
        this.prix = prix;
        this.nombrePlace = nombrePlace;
        this.adresse = adresse;
        this.etat = etat;
        
}

    public Evenement(int id) {
        this.id = id;
    }

    public Evenement( String nom, String description, String imageName, String type, int prix, int nombrePlace, String adresse, boolean etat) {
      
        this.nom = nom;
        this.description = description;
        this.imageName = imageName;
        this.type = type;
        this.prix = prix;
        this.nombrePlace = nombrePlace;
        this.adresse = adresse;
        this.etat = etat;
    }
    

    public Evenement(String nom, String description, String imageName, String type, LocalDate date, int prix, int nombrePlace, String adresse, boolean etat) {
        this.nom = nom;
        this.description = description;
        this.imageName = imageName;
        this.type = type;
        this.date = date;
        this.prix = prix;
        this.nombrePlace = nombrePlace;
        this.adresse = adresse;
        this.etat = etat;
    }

    public Evenement() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Evenement{" + "id=" + id + ", nom=" + nom + ", description=" + description + ", imageName=" + imageName + ", type=" + type + ", date=" + date + ", prix=" + prix + ", nombrePlace=" + nombrePlace + ", adresse=" + adresse + ", etat=" + etat + '}';
    }
    
}
