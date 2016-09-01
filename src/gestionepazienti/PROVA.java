/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/**
 *
 * @author Riccardo
 */
public class PROVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
     //Blank Document
   XWPFDocument document= new XWPFDocument(); 
        
   //Write the Document in file system
   FileOutputStream out = new FileOutputStream(
   new File("fontstyle.docx"));
        
   //create paragraph
   XWPFParagraph paragraph = document.createParagraph();
        
   //Set Bold an Italic
   XWPFRun paragraphOneRunOne = paragraph.createRun();
   paragraphOneRunOne.setBold(true);
   paragraphOneRunOne.setItalic(true);
   paragraphOneRunOne.setText("Font Style");
   paragraphOneRunOne.addBreak();
        
   //Set text Position
   XWPFRun paragraphOneRunTwo = paragraph.createRun();
   paragraphOneRunTwo.setText("Font Style two");
   paragraphOneRunTwo.setTextPosition(100);
 
   //Set Strike through and Font Size and Subscript
   XWPFRun paragraphOneRunThree = paragraph.createRun();
   paragraphOneRunThree.setStrike(true);
   paragraphOneRunThree.setFontSize(20);
   paragraphOneRunThree.setSubscript(
   VerticalAlign.SUBSCRIPT);
   paragraphOneRunThree.setText(" Different Font Styles");
        
   document.write(out);
   out.close();
   System.out.println("fontstyle.docx written successully");
   }
    
}
