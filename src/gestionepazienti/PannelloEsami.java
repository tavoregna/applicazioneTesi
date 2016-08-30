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
    private static PannelloEsami pannelloCorrente;
    
    private PazienteUI parent;
    
    public PannelloEsami(PazienteUI p) {
        initComponents();
        parent=p;
        
        pannello.setLayout(new GridLayout(0,2));
        pannelloCorrente=this;
    }
    public static void aggiorna(int idCon,String terapy)
    {
        if(pannelloCorrente==null)
            return;
        pannelloCorrente.aggiornaPannello(idCon,terapy);
    }
    private void aggiornaPannello(int idCo,String terapy)
    {
        final int idCon=idCo;
        pannello.removeAll();
        if(terapy==null || terapy.length()==0)
        {
            aggiornaUI();
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Terapia_Esame WHERE Terapia=?");
            pst.setString(1, terapy);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                JLabel eti=new JLabel(rs.getString("Esame"));
                pannello.add(eti);
                JTextField fi=new JTextField();
                PreparedStatement p=GestioneDatabase.preparedStatement("SELECT Valore FROM Controllo_Esame WHERE Controllo=? AND Esame=?");
                p.setInt(1, idCon);
                p.setString(2,rs.getString("Esame"));
                ResultSet r=p.executeQuery();
                if(r.next())
                    fi.setText(Double.toString(r.getDouble(1)));
                fi.setName(rs.getString("Esame"));
                fi.addKeyListener(new KeyListener() {   
                    public void keyTyped(KeyEvent e) {}          
                    public void keyPressed(KeyEvent e) {}         
                    public void keyReleased(KeyEvent e) { 
                        if(!(e.getSource() instanceof JTextField))
                            return;
                        JTextField dato=(JTextField)e.getSource();           
                        try {
                            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Controllo_Esame WHERE Controllo=? AND Esame=?");
                            pst.setInt(1, idCon);
                            pst.setString(2,dato.getName());
                            ResultSet rs=pst.executeQuery();
                            if(rs.next())
                            {
                                pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Esame SET Valore=? WHERE Controllo=? AND Esame=?");
                                //SISTEMARE
                                pst.setDouble(1,Double.parseDouble(dato.getText()));
                                pst.setInt(2, idCon);
                                pst.setString(3,dato.getName());
                                pst.executeUpdate();
                            }
                            else
                            {
                                pst=GestioneDatabase.preparedStatement("INSERT INTO Controllo_Esame(Controllo,Esame,Valore) VALUES (?,?,?)");
                                //SISTEMARE
                                pst.setInt(1, idCon);
                                pst.setString(2,dato.getName());
                                pst.setDouble(3,0.1);
                                //pst.setDouble(3,Double.parseDouble(dato.getText()));
                                pst.executeUpdate();
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(PannelloEsami.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
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
