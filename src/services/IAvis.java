/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Avis;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hazem_xsx7382
 */
public interface IAvis {
            public boolean ajouteAvis(Avis p)throws SQLException;
        public boolean updateAvis(Avis p)throws SQLException;
    public boolean suprimeAvis(Avis p)throws SQLException;
    public List<Avis> getAll()throws SQLException;
}
