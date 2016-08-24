package gestionepazienti;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pazienti {
    private static ArrayList<Integer> arrayID;
    private static Integer currID=null; 
            
    public static void setCurrID(int id)
    {
        currID=id;
    }
    
    public static Integer getCurrID() {
        return currID;
    }
    
    public static void aggiorna()
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

    //OTTIMIZZABILE
    public static Integer precedente()
    {
        if(currID==null || currID==0)
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
    
    //OTTIMIZZABILE
    public static Integer successivo()
    {
        if(currID==null || currID==0)
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
