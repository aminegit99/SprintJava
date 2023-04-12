/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import entities.Ticket;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hazem_xsx7382
 */
public interface ITicket {
                    public boolean ajouterproduit(Ticket p)throws SQLException;
        public boolean updateproduit(Ticket p)throws SQLException;
    public boolean suprimeproduit(Ticket p)throws SQLException;
    public List<Ticket> getAll()throws SQLException;
    
}
