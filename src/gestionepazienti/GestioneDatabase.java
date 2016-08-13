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
import java.sql.Statement;

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
    
    
    
    
     public static void main(String[] args){
      
        boolean connesso=false;
        do{
            try
            {
                
                Connection conn=connessione();
                Statement st=conn.createStatement();
                
                connesso=true;
                ResultSet r=st.executeQuery("SELECT * FROM Paziente");
                
                connesso=true;
                
                while(r.next())
                {
                    System.out.println(r.getInt("ID")+" "+r.getString("Nome")+" "+r.getString("Cognome"));
                }
                conn.close();
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
                javax.swing.JOptionPane.showMessageDialog(null, "Connessione non riuscita");
            }
        }while(!connesso);
    }   
}
