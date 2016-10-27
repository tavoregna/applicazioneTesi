package gestionepazienti;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.CharacterRun;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Section;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class GenerazioneWord {
    public static boolean generaLettera(String nome,String cognome,String terapia,String sesso,Date d,String medico,String mail)
    {
        
        String filePath = "./ModelloLetteraAvvio/"+Utilita.standardizzaNomi(terapia)+sesso.toUpperCase()+".doc";
        POIFSFileSystem fs = null;        
        try {            
            fs = new POIFSFileSystem(new FileInputStream(filePath));            
            HWPFDocument doc = new HWPFDocument(fs);
            doc = replaceText(doc, "###", nome+" "+cognome);
            doc = replaceText(doc, "///", Utilita.dataToString(d));
            
            if(medico==null)
                medico="";
            doc = replaceText(doc, "^^^", medico);
            if(mail==null)
                mail="";
            doc = replaceText(doc, "@@@", mail);
            
            filePath="./LettereGenerate/"+cognome+nome+terapia+Utilita.dataToStringNoSeparator(d)+".doc";
            saveWord(filePath, doc);
            
            if(Desktop.getDesktop()!=null)
                Desktop.getDesktop().open(new File(filePath));
            return true;
        }
        catch(FileNotFoundException e){
            Utilita.mostraMessaggioErrore("Modello Lettera non trovato");
            e.printStackTrace();
            return false;
        }
        catch(IOException e){
            Utilita.mostraMessaggioErrore("Creazione file non riuscita");
            e.printStackTrace();
            return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public static boolean fileExists(String path)
    {
        try{
            File f=new File(path);
            if(!f.exists())
            {
                throw new Exception();
            }
            return true;
        }
        catch(Exception ex)
        {
            Utilita.mostraMessaggioErrore("Non disponibile");
            return false;
        }
    }
    public static boolean generaFileF(String terapia)
    {
        terapia=tipoFarmacoFileF(terapia);
        if(terapia==null)
            return false;
        String filePath = "./ModelloFileF/"+"FILEF"+terapia.toUpperCase()+".doc";
        POIFSFileSystem fs = null;        
        try {            
            fs = new POIFSFileSystem(new FileInputStream(filePath));            
            HWPFDocument doc = new HWPFDocument(fs);
        
            Paziente p=Utilita.oggettoPaziente(Pazienti.getCurrID());
            filePath="./LettereGenerate/FILE_F_"+p.getCognome()+p.getNome()+terapia+Utilita.dataToStringNoSeparator(new Date(System.currentTimeMillis()))+".doc";
            saveWord(filePath, doc);
            
            if(Desktop.getDesktop()!=null)
                Desktop.getDesktop().open(new File(filePath));
            return true;
        }
        catch(FileNotFoundException e){
            Utilita.mostraMessaggioErrore("Modello File F non trovato");
            e.printStackTrace();
            return false;
        }
        catch(IOException e){
            Utilita.mostraMessaggioErrore("Creazione file non riuscita");
            e.printStackTrace();
            return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
   public static boolean existsFarmaco(String path,String terapia)
    {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].getName().toUpperCase().contains(terapia.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
   public static String tipoFarmacoLettera(String terapia)
    {
        if(!terapia.toUpperCase().contains("REBIF"))
            return terapia;
        String[] possibleValues = { "Fiale", "Cartucce"};
        Object selectedValue = JOptionPane.showInputDialog(null,"Tipo", "Tipo",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        if(selectedValue==null)
            return null;
        return terapia+" "+((String)selectedValue).toLowerCase();
    }
   public static String tipoFarmacoFileF(String terapia)
    {
        if(terapia.toUpperCase().contains("REBIF"))
        {
        String[] possibleValues = { "Fiale", "Cartucce"};
        Object selectedValue = JOptionPane.showInputDialog(null,"Tipo", "Tipo",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        if(selectedValue==null)
            return null;
        return terapia+" "+((String)selectedValue).toUpperCase();
        }
         if(terapia.toUpperCase().contains("AVONEX"))
        {
        String[] possibleValues = { "Normale", "Penna"};
        Object selectedValue = JOptionPane.showInputDialog(null,"Tipo", "Tipo",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        if(selectedValue==null)
            return null;
        String tmp=((String)selectedValue).toUpperCase();
        if(tmp.equals("NORMALE"))
            return terapia;
        return terapia+" "+tmp;
        }
        return terapia;
    }
    public static boolean generaFileFA(String terapia)
    {
        String filePath = "./ModelloFileF/"+"FILEF"+terapia.toUpperCase()+" AVVIO.doc";
        POIFSFileSystem fs = null;        
        try {            
            fs = new POIFSFileSystem(new FileInputStream(filePath));            
            HWPFDocument doc = new HWPFDocument(fs);
        
            Paziente p=Utilita.oggettoPaziente(Pazienti.getCurrID());
            filePath="./LettereGenerate/FILE_F_AVVIO_"+p.getCognome()+p.getNome()+terapia+" AVVIO "+Utilita.dataToStringNoSeparator(new Date(System.currentTimeMillis()))+".doc";
            saveWord(filePath, doc);
            
            if(Desktop.getDesktop()!=null)
                Desktop.getDesktop().open(new File(filePath));
            return true;
        }
        catch(FileNotFoundException e){
            Utilita.mostraMessaggioErrore("Modello File F di avvio non trovato");
            e.printStackTrace();
            return false;
        }
        catch(IOException e){
            Utilita.mostraMessaggioErrore("Creazione file non riuscita");
            e.printStackTrace();
            return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    private static HWPFDocument replaceText(HWPFDocument doc, String findText, String replaceText){
        Range r1 = doc.getRange(); 

        for (int i = 0; i < r1.numSections(); ++i ) { 
            Section s = r1.getSection(i); 
            for (int x = 0; x < s.numParagraphs(); x++) { 
                Paragraph p = s.getParagraph(x); 
                for (int z = 0; z < p.numCharacterRuns(); z++) { 
                    CharacterRun run = p.getCharacterRun(z); 
                    String text = run.text();
                    if(text.contains(findText)) {
                        run.replaceText(findText, replaceText);
                    } 
                }
            }
        } 
        return doc;
    }
    
    private static void saveWord(String filePath, HWPFDocument doc){
        FileOutputStream out = null;
        try{
            new File(filePath);
            out = new FileOutputStream(filePath);
            doc.write(out);
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(GenerazioneWord.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GenerazioneWord.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally{
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(GenerazioneWord.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
}
