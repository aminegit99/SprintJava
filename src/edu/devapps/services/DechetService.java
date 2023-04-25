/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.services;

import com.mysql.jdbc.Connection;
import edu.devapps.entity.Dechet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utilities.MaConnexion;

/**
 *
 * @author THEOLDISBACK
 */
public class DechetService {
    
    
    
    
      Connection cnx =MaConnexion.getInstance().getCnx();
   

  
    public void ajouterdechet(Dechet r) {
        String req ="INSERT INTO `dechet`( `quantite`, `date`, `id_cat_id`,  `id_bac_id`) VALUES"+ " ('"+r.getQuantite()+"','"+r.getDate()+"','"+r.getIdcat()+"',"+r.getIdbac()+""+")";

          try {
              Statement st = cnx.createStatement();
              st.executeUpdate(req);
              System.out.println("dechet ajouté");
              
            
              
              
          } catch (SQLException ex) {
              
              System.out.println(ex.getMessage());
          }
              
          }
   
    public List<Dechet> afficherdechet() {
        //var
        
       
        List<Dechet> dechets =new ArrayList<>();
        //requette
        String req ="SELECT * FROM dechet";
          try {
              Statement st = cnx.createStatement();
              ResultSet rs = st.executeQuery(req);
              while (rs.next()){
                  dechets.add(new Dechet(rs.getInt(1), rs.getInt(2),rs.getDate(3) ,rs.getInt(4), rs.getInt(5)));
              }
          } catch (SQLException ex) {
              }
    
        return dechets;

    
       
    }
    

    public void supprimerdechet( Dechet r  ) {
 String req="DELETE FROM `dechet` WHERE id="+r.getId();
 
           try {
             //insert
             Statement st=cnx.createStatement();
             st.executeUpdate(req);
             System.out.println("dechet supprimer avec succes");
         } catch (SQLException ex) {
             ex.printStackTrace();
         }  
             
          
    }
    
    

 
    public void modifierdechet( Dechet r ) {
        
        String req=null;
        if(r.getId()!=0)
        {   req="UPDATE `dechet` SET quantite="+r.getQuantite()+" where id ="+r.getId();
       
            try {
             //insert
             Statement st=cnx.createStatement();
             st.executeUpdate(req);
             System.out.println("dechet modifier avec succes");
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
            
        }
       
}
    
     public int statistic(int id) {
        //var
        
       int i=0;
        List<Dechet> dechets =new ArrayList<>();
        //requette
        String req ="SELECT SUM(quantite) as nb from dechet WHERE id_bac_id="+id;
          try {
              Statement st = cnx.createStatement();
              ResultSet rs = st.executeQuery(req);
              while (rs.next()){
             i= rs.getInt(1);
              }
          } catch (SQLException ex) {
              }
    
        return  i;

    
       
    }
}
