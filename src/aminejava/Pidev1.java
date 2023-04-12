/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminejava;

import com.mysql.jdbc.Connection;
import edu.devapps.entity.Bac;
import edu.devapps.entity.Categorie;
import edu.devapps.entity.Dechet;
import edu.devapps.services.BacService;
import edu.devapps.services.CategorieService;
import edu.devapps.services.DechetService;

import java.sql.Date;



/**
 *
 * @author FAROUK
 */
public class Pidev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        Date d = new Date(1999, 10, 30);
   
        Dechet dd = new Dechet(8, 30, d, 4, 1);
            DechetService s = new DechetService();
            System.out.println(s.afficherdechet());
    }

   
    
}
