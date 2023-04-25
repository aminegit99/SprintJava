/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.devapps.services;

import com.mysql.jdbc.Connection;
import edu.devapps.entity.Bac;
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
public class BacService {
    
    
    
    
    
      Connection cnx =MaConnexion.getInstance().getCnx();
   

  
    public void ajouterbac(Bac r) {
        String req ="INSERT INTO `bac`( `ref`, `adresse`, `codepostal`,  `capacite`,  `etat`) VALUES"+ " ('"+r.getRef()+"','"+r.getAdresse()+"',"+r.getCodepostal()+","+r.getCodepostal()+","+r.getEtat()+""+")";

          try {
              Statement st = cnx.createStatement();
              st.executeUpdate(req);
              System.out.println("bac ajouté");
              
            
              
              
          } catch (SQLException ex) {
              
              System.out.println(ex.getMessage());
          }
              
          }
   
    public List<Bac> afficherbac() {
        //var
        
       
        List<Bac> bacs =new ArrayList<>();
        //requette
        String req ="SELECT * FROM bac";
          try {
              Statement st = cnx.createStatement();
              ResultSet rs = st.executeQuery(req);
              while (rs.next()){
                  bacs.add(new Bac(rs.getInt(1), rs.getString(2),rs.getString(3) ,rs.getInt(4), rs.getInt(5), rs.getInt(6)));
              }
          } catch (SQLException ex) {
              }
    
        return bacs;

    
       
    }
    

    public void supprimerbac( Bac r  ) {
 String req="DELETE FROM `bac` WHERE id="+r.getId();
 
           try {
             //insert
             Statement st=cnx.createStatement();
             st.executeUpdate(req);
             System.out.println("bac supprimer avec succes");
         } catch (SQLException ex) {
             ex.printStackTrace();
         }  
             
          
    }
    
    

 
    public void modifierbac( Bac r ) {
        
        String req=null;
        if(r.getId()!=0)
        {   req="UPDATE `bac` SET ref='"+r.getRef()+"',adresse='"+r.getAdresse()+"',codepostal="+r.getCodepostal()+",capacite="+r.getCapacite()+",etat="+r.getEtat()+" where id ="+r.getId();
       
            try {
             //insert
             Statement st=cnx.createStatement();
             st.executeUpdate(req);
             System.out.println("bac modifier avec succes");
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
            
        }
       
}
    
    
    
       public List<Bac> rechercher(String s) {
        //var
        
       
        List<Bac> bacs =new ArrayList<>();
        //requette
        String req ="SELECT * FROM bac where ref LIKE '%"+s+"%' OR adresse  LIKE  '%"+s+"%' OR codepostal LIKE  '%"+s+"%' OR capacite LIKE  '%"+s+"%' OR etat LIKE '%"+s+"%'";
          try {
              Statement st = cnx.createStatement();
              ResultSet rs = st.executeQuery(req);
              while (rs.next()){
                  bacs.add(new Bac(rs.getInt(1), rs.getString(2),rs.getString(3) ,rs.getInt(4), rs.getInt(5), rs.getInt(6)));
              }
          } catch (SQLException ex) {
              }
    
        return bacs;

    
       
    }
    
}
