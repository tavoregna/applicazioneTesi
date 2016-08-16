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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Riccardo
 */
public class GestioneDatabase {
    private static final String RELATIVE_DB_PATH="db/Prova1.accdb";
    
    private static Connection con;
    
    public static void connessione()
    {
        try
        {
        File db=new File(RELATIVE_DB_PATH);
        if(!db.exists())
        {
            throw new FileNotFoundException();
        }
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con=DriverManager.getConnection("jdbc:ucanaccess://"+db.getAbsolutePath());
        }
        catch(Exception e)
        {
            Utilita.mostraMessaggioErrore("Errore nell'apertura del database");
            System.exit(1);
        }
    }
    
    public  static ResultSet querySelect(String sql)
    {
        try {
            if(con==null || !con.isValid(0))
                connessione();
            Statement st=con.createStatement();
            ResultSet r=st.executeQuery(sql); 
            st.close();
            
            return r;
            
        } catch (SQLException ex) {
            Utilita.mostraMessaggioErrore("Errore durante l'esecuzione della query");
            return null;
        }
    }
    public  static void queryNonSelect(String sql)
    {
        try {
            if(con==null || !con.isValid(0))
                connessione();
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            
            st.close();
          
        } catch (SQLException ex) {
            Utilita.mostraMessaggioErrore("Errore durante l'esecuzione dell'operazione");
        }
    }
    
    public static PreparedStatement preparedStatement(String sql)
    {
        PreparedStatement pst;
        try {
            if(con==null || !con.isValid(0))
                connessione();
            pst=con.prepareStatement(sql);
            return pst;
          
        } catch (SQLException ex) {
            Utilita.mostraMessaggioErrore("Errore durante l'esecuzione dell'operazione");
            return null;
        }
    }
    
    
    
    
     public static void main(String[] args){
       for(int i=0;i<500;i++)
       {
          queryNonSelect("INSERT INTO Paziente(Nome,Cognome) VALUES ('"+i+"','"+i+"')"); 
       }
       
       
    }   
}
