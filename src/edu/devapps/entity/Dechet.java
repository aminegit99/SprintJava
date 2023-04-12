/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.entity;

import java.sql.Date;

/**
 *
 * @author THEOLDISBACK
 */
public class Dechet {
    
    int Id;
    int Quantite;
    Date Date;
    int idcat;
    int idbac;

    public Dechet() {
    }

    public Dechet(int Id, int Quantite, Date Date, int idcat, int idbac) {
        this.Id = Id;
        this.Quantite = Quantite;
        this.Date = Date;
        this.idcat = idcat;
        this.idbac = idbac;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int Quantite) {
        this.Quantite = Quantite;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public int getIdbac() {
        return idbac;
    }

    public void setIdbac(int idbac) {
        this.idbac = idbac;
    }

    @Override
    public String toString() {
        return "Dechet{" + "Id=" + Id + ", Quantite=" + Quantite + ", Date=" + Date + ", idcat=" + idcat + ", idbac=" + idbac + '}';
    }

  
    
    
    
}
