/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Riccardo
 */
public class GestioneDatabase {
     public static void main(String[] args){
        boolean connesso=false;
        do{
            try
            {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection conn=DriverManager.getConnection("jdbc:ucanaccess://c:/Prova1.accdb");

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
