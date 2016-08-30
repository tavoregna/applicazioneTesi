package gestionepazienti;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PannelloEsami extends javax.swing.JPanel {

    private PazienteUI parent;
    private int idControllo;
    private String terapia;
    
    public PannelloEsami(PazienteUI p,int idCon,String terapy) {
        initComponents();
        parent=p;
        idControllo=idCon;
        terapia=terapy;
        
        pannello.setLayout(new GridLayout(0,2));
        aggiornaPannello();
    }
    private void aggiornaPannello()
    {
        pannello.removeAll();
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Terapia_Esame WHERE Terapia=?");
            pst.setString(1, terapia);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                JLabel eti=new JLabel(rs.getString("Esame"));
                pannello.add(eti);
                JTextField fi=new JTextField();
                fi.setName(rs.getString("Esame"));
                fi.addKeyListener(new KeyListener() {   
                    public void keyTyped(KeyEvent e) {}          
                    public void keyPressed(KeyEvent e) {}         
                    public void keyReleased(KeyEvent e) { 
                        //Completare
                    }
                });
                pannello.add(fi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PannelloEsami.class.getName()).log(Level.SEVERE, null, ex);
        }
        aggiornaUI();
        
    }
    private void aggiornaUI()
    {
        pannello.setVisible(false);
        pannello.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        pannello = new javax.swing.JPanel();

        setOpaque(false);

        pannello.setOpaque(false);

        javax.swing.GroupLayout pannelloLayout = new javax.swing.GroupLayout(pannello);
        pannello.setLayout(pannelloLayout);
        pannelloLayout.setHorizontalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );
        pannelloLayout.setVerticalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        scroll.setViewportView(pannello);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pannello;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
