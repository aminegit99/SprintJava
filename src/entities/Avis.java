/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hazem_xsx7382
 */
public class Avis {
        private int id;
    private Evenement evenementId;
    private User userId;
    private String contenu;
    
    // Constructor

    public Avis(Evenement evenementId, User userId, String contenu) {
        this.evenementId = evenementId;
        this.userId = userId;
        this.contenu = contenu;
    }

    public Avis(int id, Evenement evenementId, User userId, String contenu) {
        this.id = id;
        this.evenementId = evenementId;
        this.userId = userId;
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Avis{" + "id=" + id + ", evenementId=" + evenementId + ", userId=" + userId + ", contenu=" + contenu + '}';
    }

    public Avis() {
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

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    
}
