/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import entities.Evenement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hazem_xsx7382
 */
public interface IEvenement {
                public boolean ajouterproduit(Evenement e)throws SQLException;
        public boolean updateproduit(Evenement e)throws SQLException;
    public boolean suprimeproduit(Evenement e)throws SQLException;
    public List<Evenement> getAll()throws SQLException;
    
}
