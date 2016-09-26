package gestionepazienti;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Utilita {
    public static void mostraMessaggio(String s)
    {
        JOptionPane.showMessageDialog(null, s);
    }
    public static void mostraMessaggioErrore(String s)
    {
        JOptionPane.showMessageDialog(null, s,"Errore",JOptionPane.ERROR_MESSAGE);
    }
    
    public static String standardizzaNomi(String s)
    {
        if(s==null || s.length()==0)
            return s;
       
        boolean nextBig=true;
        String res=s;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ')
                nextBig=true;
            else
            {
                if(nextBig)
                {
                    res=rimpiazzaCarattere(res, Character.toUpperCase(c), i);
                    nextBig=false;
                }
                else
                {
                    res=rimpiazzaCarattere(res, Character.toLowerCase(c), i);
                }
            }
        }
        return res;
    }
    
    private static String rimpiazzaCarattere(String s,char c,int pos)
    {
        if(s==null || s.length()==0 || pos>=s.length() || pos<0)
            return s;
        String tmp="";
        String res="";
        for(int i=0;i<pos;i++)
        {
            tmp+=s.charAt(i);
        }
        res+=tmp+c;
        tmp="";
        for(int i=pos+1;i<s.length();i++)
        {
            tmp+=s.charAt(i);
        }
        res+=tmp;
        return res;
        
    }
    
    public static String virgolaToPunto(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==',')
            {
                return rimpiazzaCarattere(s,'.',i);
            }
        }
        return s;
    }
    
    public static Date removeTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
    public static java.sql.Date DateUtilToSQL(java.util.Date d)
    {
        if(d==null)
            return null;
        return new java.sql.Date(d.getTime());
    }
    public static String verticalizza(String s)
    {
        if(s==null || s.length()<=1)
            return s;
        String ret="<HTML>";
        for(int i=0;i<s.length();i++)
        {
            ret+=s.charAt(i);
            if(i!=s.length()-1)
            {
                ret+="<BR>";
            }
        }
        ret+="</HTML>";
        return ret;
    }
    public static String verticalizzaData(String s)
    {
        if(s==null || s.length()<=1)
            return s;
        String ret="<HTML>";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='/')
            {
                ret+="<BR>/<BR>";
            }
            else
            {
                ret+=s.charAt(i);
            }
        }
        ret+="</HTML>";
        return ret;
    }
    
    public static String dataToString(Date d) //     dd/MM/yyyy
    {
        if(d==null)
            return null;
        SimpleDateFormat sdf = new SimpleDateFormat(); // creo l'oggetto
        sdf.applyPattern("dd/MM/yyyy"); 
        return sdf.format(d); 
    }
    public static String dataToStringNoSeparator(Date d) //     dd/MM/yyyy
    {
        if(d==null)
            return "";
        SimpleDateFormat sdf = new SimpleDateFormat(); // creo l'oggetto
        sdf.applyPattern("yyyyMMdd"); 
        return sdf.format(d); 
    }

    public static Color colorePulsante(int idControllo,int i) //i=0 Ordinario; i=1 Ricaduta
    {
        PreparedStatement pst;
        Color colore;
        if(i==0)
        {
            try {
                pst=GestioneDatabase.preparedStatement("SELECT Terapia_Principale FROM Ambulatorio_Ordinario WHERE Controllo_Standard=?");
                pst.setInt(1, idControllo);
                ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    if(rs.getInt("Terapia_Principale")==1)
                    {
                        return new Color(181,230,29);
                    }
                    if(rs.getInt("Terapia_Principale")==2)
                    {
                       return new Color(153,217,234);
                    }
                    if(rs.getInt("Terapia_Principale")==3)
                    {
                       return new Color(0,162,232); 
                    }   
                }
            } catch (SQLException ex) {
                Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try {
                pst=GestioneDatabase.preparedStatement("SELECT Ricaduta FROM Ricaduta WHERE Controllo_Standard=?");
                pst.setInt(1, idControllo);
                ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    if(rs.getString("Ricaduta").compareTo("clinica")==0 || rs.getString("Ricaduta").compareTo("radiologica")==0)
                    {
                        return new Color(237,28,36);
                    }
                    if(rs.getString("Ricaduta").compareTo("pseudoricaduta")==0 || rs.getString("Ricaduta").compareTo("no")==0)
                    {
                       return new Color(255,241,0);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public static boolean isNumeric(String str)  
    {  
     try  
     {  
       double d = Double.parseDouble(str);  
     }  
     catch(NumberFormatException nfe)  
     {  
         return false;  
     }  
      return true;  
    }
    public static Paziente oggettoPaziente(int id)
    {
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Nome,Cognome,Sesso FROM Paziente WHERE ID="+id);
            if(rs.next())
            {
                return new Paziente(rs.getString("Nome"), rs.getString("Cognome"), rs.getString("Sesso"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
