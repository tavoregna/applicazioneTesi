package gestionepazienti;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public final class Utilita {
    private static final int MASK= Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
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
        if(s==null)
            return null;
        String tmp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==',')
            {
               tmp+='.';
            }
            else
            {
                tmp+=s.charAt(i);
            }
        }
        return tmp;
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
                Utilita.errore(ex);Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
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
                Utilita.errore(ex);Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public static boolean isTerapiaInfusiva(String ter)
    {
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT Nome FROM Terapia WHERE Nome=? AND Infusiva=?");
            pst.setString(1, ter);
            pst.setBoolean(2, true);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
                return  true;
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
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
            Utilita.errore(ex);Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void settaIconaFrame(JFrame f)
    {
        try {
           f.setIconImage(ImageIO.read(new File("icon/logo.png")));
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    public static void undoAndRedo(JTextComponent area)
    {
        final UndoManager undoManager = new UndoManager();
        Document doc = area.getDocument();
        doc.addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
                //System.out.println(e);
            }
        });
        area.getActionMap().put("Undo", new AbstractAction("Undo") {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (undoManager.canUndo()) {
                        undoManager.undo();
                    }
                } catch (CannotUndoException e) {
                    //System.out.println(e);
                }
            }
        });
        area.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Z, MASK), "Undo");
        area.getActionMap().put("Redo", new AbstractAction("Redo") {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (undoManager.canRedo()) {
                        undoManager.redo();
                    }
                } catch (CannotRedoException e) {
                    //System.out.println(e);
                }
            }
        });
        area.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Y,MASK), "Redo");
    }
    public static void undoAndRedo(Container p)
    {
        for(int i=0;i<p.getComponentCount();i++)
        {
            Component c=p.getComponent(i);
            if(c instanceof JTextComponent)
            {  
                undoAndRedo((JTextComponent)c);
                continue;   
            }
            if(c instanceof JScrollPane)
            {
                undoAndRedo((JScrollPane)c);
                continue; 
            }
            if(c instanceof JPanel)
            {
                undoAndRedo((JPanel)c);
                continue; 
            }
        }
        if(p instanceof JScrollPane)
            {
                JViewport jv=((JScrollPane)p).getViewport();
                if(jv!=null && jv.getView()!=null && (jv.getView()) instanceof JTextComponent)
                {
                    undoAndRedo((JTextComponent)(jv.getView()));
                }
            }
    }
    public static void accesso()
    {
        try {
            String data = URLEncoder.encode("app", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8");
            data += "&" + URLEncoder.encode("info", "UTF-8") + "=" + URLEncoder.encode(dbInfo(), "UTF-8");

            URL url = new URL("http://applicazione.heliohost.org/accessi.php");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            conn.getInputStream();
            wr.close();
        } catch (Exception ex) {
            Utilita.errore(ex);Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void errore(Exception ex)
    {
        /*try{
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        errore(sw.toString());
        }
        catch(Exception e)
        {
            Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, e);
        }*/
    }
    public static void errore(String err)
    {
        if(err==null)
            err="SCONOSCIUTO";
        try {
            String data = URLEncoder.encode("app", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8");
            data += "&" + URLEncoder.encode("errore", "UTF-8") + "=" + URLEncoder.encode(err, "UTF-8");

            URL url = new URL("http://applicazione.heliohost.org/errori.php");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            conn.getInputStream();
            wr.close();
        } catch (Exception ex) {
            Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static String dbInfo()
    {
        String info="info DB:\n";
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Name FROM NomiTabelle");
            while(rs.next())
            {
                info+=rs.getString(1);
                try{
                    ResultSet r=GestioneDatabase.querySelect("SELECT COUNT(*) FROM "+rs.getString(1));
                    if(r.next())
                    {
                         info+=": "+r.getInt(1);
                    }
                } catch (Exception ex) {
                    Utilita.errore(ex);Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
                }
                info+='\n';
            }
        } catch (Exception ex) {
            Utilita.errore(ex);Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }
    public static void attivo()
    {
        int attivo=1;
        try {
            URL url = new URL("http://applicazione.heliohost.org/attivo.php");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.flush();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuffer response = new StringBuffer();
            
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();
            
            wr.close();
            in.close();
            attivo=Integer.parseInt(response.toString());
        } catch (Exception ex) {
            Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
            attivo=1;
        }
        if(attivo==0)
            System.exit(0);
    }
    public static void durata()
    {
        try {
            long fine=System.currentTimeMillis();
            String data = URLEncoder.encode("app", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8");
            data += "&" + URLEncoder.encode("durata", "UTF-8") + "=" + URLEncoder.encode((fine-PazienteUI.inizio)+"", "UTF-8");
            data += "&" + URLEncoder.encode("inizio", "UTF-8") + "=" + URLEncoder.encode(PazienteUI.inizio+"", "UTF-8");
            data += "&" + URLEncoder.encode("fine", "UTF-8") + "=" + URLEncoder.encode(fine+"", "UTF-8");
            
            URL url = new URL("http://applicazione.heliohost.org/durata.php");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            conn.getInputStream();
            wr.close();
        } catch (Exception ex) {
            Logger.getLogger(Utilita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
