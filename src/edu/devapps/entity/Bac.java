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
public class Bac {
private int id;
private String ref;
private String adresse;
private int codepostal;
private int capacite;
private int etat;

    public Bac() {
    }

    public Bac(int id, String ref, String adresse, int codepostal, int capacite, int etat) {
        this.id = id;
        this.ref = ref;
        this.adresse = adresse;
        this.codepostal = codepostal;
        this.capacite = capacite;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(int codepostal) {
        this.codepostal = codepostal;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Bac{" + "id=" + id + ", ref=" + ref + ", adresse=" + adresse + ", codepostal=" + codepostal + ", capacite=" + capacite + ", etat=" + etat + '}';
    }
    
    
    
    
    
}
