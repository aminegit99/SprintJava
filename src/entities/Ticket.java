/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDateTime;

/**
 *
 * @author hazem_xsx7382
 */
public class Ticket {
        private int id;
    private Evenement evenementId;
    private User ticketId;
    private int prix;
    private int quantite;
    private String type;
    private LocalDateTime createdAt;
    private boolean status;

    public Ticket() {
    }

    public Ticket(int id, Evenement evenementId, User ticketId, int prix, int quantite, String type, LocalDateTime createdAt, boolean status) {
        this.id = id;
        this.evenementId = evenementId;
        this.ticketId = ticketId;
        this.prix = prix;
        this.quantite = quantite;
        this.type = type;
        this.createdAt = createdAt;
        this.status = status;
    }

    public Ticket(Evenement evenementId, User ticketId, int prix, int quantite, String type, LocalDateTime createdAt, boolean status) {
        this.evenementId = evenementId;
        this.ticketId = ticketId;
        this.prix = prix;
        this.quantite = quantite;
        this.type = type;
        this.createdAt = createdAt;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Evenement getEvenementId() {
        return evenementId;
    }

    public void setEvenementId(Evenement evenementId) {
        this.evenementId = evenementId;
    }

    public User getTicketId() {
        return ticketId;
    }

    public void setTicketId(User ticketId) {
        this.ticketId = ticketId;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", evenementId=" + evenementId + ", ticketId=" + ticketId + ", prix=" + prix + ", quantite=" + quantite + ", type=" + type + ", createdAt=" + createdAt + ", status=" + status + '}';
    }
    
    
    
    
    

}
