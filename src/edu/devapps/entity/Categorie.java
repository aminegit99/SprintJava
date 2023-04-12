/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.entity;

/**
 *
 * @author THEOLDISBACK
 */
public class Categorie {
        private int Id;
    private  String Nom;
    private String Description;

    public Categorie() {
    }

    public Categorie(int Id, String Nom, String Description) {
        this.Id = Id;
        this.Nom = Nom;
        this.Description = Description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Categorie{" + "Id=" + Id + ", Nom=" + Nom + ", Description=" + Description + '}';
    }

  
    
    
    
    
    
    
}
