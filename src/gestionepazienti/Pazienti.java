/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Riccardo
 */
public class Pazienti {
    private static ArrayList<Integer> arrayID;
    private static int currID=0; 
            
    public static void setCurrID(int id)
    {
        currID=id;
    }
    private static void aggiorna()
    {
        if(arrayID==null)
            arrayID=new ArrayList<Integer>();
        else
            arrayID.clear();
        
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT ID FROM Paziente ORDER BY Cognome ASC");
            while(rs.next())
            {
                arrayID.add(rs.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pazienti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void inizializza()
    {
        if(arrayID==null)
            arrayID=new ArrayList<Integer>();
        if(arrayID.size()==0)
            aggiorna();
    }
    public static Integer precedente()
    {
        if(currID==0)
            return null;
        int id=currID;
        inizializza();
        Integer currPos=null;
        for(int i=0;i<arrayID.size();i++)
        {
            if(arrayID.get(i).intValue()==id)
            {
                currPos=i;
            }
        }
        if(currPos==null || currPos.intValue()==0)
            return null;
        return arrayID.get(currPos.intValue()-1);
        
        
    }
    
    public static Integer successivo()
    {
        if(currID==0)
            return null;
        int id=currID;
        inizializza();
        Integer currPos=null;
        for(int i=0;i<arrayID.size();i++)
        {
            if(arrayID.get(i).intValue()==id)
            {
                currPos=i;
            }
        }
        if(currPos==null || currPos.intValue()==arrayID.size()-1)
            return null;
        return arrayID.get(currPos.intValue()+1);
    }
    
    
}
