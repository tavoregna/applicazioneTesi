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
    }
    public static boolean generaFileF(String terapia)
    {
        String filePath = "./ModelloFileF/"+"FILEF"+terapia.toUpperCase()+".doc";
        POIFSFileSystem fs = null;        
        try {            
            fs = new POIFSFileSystem(new FileInputStream(filePath));            
            HWPFDocument doc = new HWPFDocument(fs);
        
            Paziente p=Utilita.oggettoPaziente(Pazienti.getCurrID());
            filePath="./LettereGenerate/FILE_F_"+p.getCognome()+p.getNome()+Utilita.dataToStringNoSeparator(new Date(System.currentTimeMillis()))+".doc";
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
