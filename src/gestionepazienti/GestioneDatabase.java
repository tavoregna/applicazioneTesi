/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Riccardo
 */
public class GestioneDatabase {
    private static final String RELATIVE_DB_PATH="db/Prova1.accdb";
    
    private static Connection connessione()
    {
        Connection c=null;
        try
        {
        File db=new File(RELATIVE_DB_PATH);
        if(!db.exists())
        {
            throw new FileNotFoundException();
        }
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        c=DriverManager.getConnection("jdbc:ucanaccess://"+db.getAbsolutePath());
        }
        catch(Exception e)
        {
            Utilita.mostraMessaggioErrore("Errore nell'apertura del database");
            System.exit(1);
        }
        return c;
    }
    
    public  static ResultSet querySelect(String sql)
    {
        try {
            //long t1=System.currentTimeMillis();
            Connection conn=connessione();
            //long t2=System.currentTimeMillis();
            //System.out.println("T1: "+(t2-t1));
            Statement st=conn.createStatement();
            //long t3=System.currentTimeMillis();
            //System.out.println("T2: "+(t3-t2));
            ResultSet r=st.executeQuery(sql); 
            //long t4=System.currentTimeMillis();
            //System.out.println("T3: "+(t4-t1));
            st.close();
            conn.close();
            
            return r;
            
        } catch (SQLException ex) {
            Utilita.mostraMessaggioErrore("Errore durante l'esecuzione della query");
            return null;
        }
    }
    public  static void queryNonSelect(String sql)
    {
        try {
            Connection conn=connessione();
            Statement st=conn.createStatement();
            st.executeUpdate(sql);
            
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Utilita.mostraMessaggioErrore("Errore durante l'esecuzione dell'operazione");
        }
    }
    
    
    
    
     public static void main(String[] args){
       for(int i=0;i<500;i++)
       {
          queryNonSelect("INSERT INTO Paziente(Nome,Cognome) VALUES ('"+i+"','"+i+"')"); 
       }
       
    }   
}
