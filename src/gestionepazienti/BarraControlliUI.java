/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Riccardo
 */
public class BarraControlliUI extends javax.swing.JPanel {

    private PazienteUI parent;
    
    private ArrayList<PulsanteBarraControlli> pulsanti;
    private Integer indiceCorrente;
    
    public BarraControlliUI(PazienteUI p,double hei,double wid) {
        initComponents();
       
        parent=p;
        
        pulsanti=new ArrayList<PulsanteBarraControlli>();
        indiceCorrente=null;
        
        this.setBounds(0, 0, (int)wid, (int)hei);
        pannello.setLayout(new FlowLayout(FlowLayout.LEADING));
    }
    
    public void aggiornaBarra(int id)
    {
        pannello.removeAll();
        pulsanti.clear();
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT * FROM Controllo_Standard WHERE ID_Paziente="+id+" ORDER BY Data DESC");
            while(rs.next())
            {
                System.out.println("1");///////////////////////////////////////// rimuovere
                Date d=rs.getDate("Data");
                int c=rs.getInt("ID_Controllo");
                creaPulsante(d,c);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BarraControlliUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        aggiornaUI();
    }
    
    private void aggiornaUI()
    {
        this.setVisible(false);
        this.setVisible(true);
    }
    
    private void creaPulsante(Date d,int cod)
    {
        JButton b=new JButton();
        b.setText(Utilita.dataToString(d));
        b.setName(Integer.toString(cod));
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!(e.getSource() instanceof JButton))
                    return;
                pressionePulsanteBarra((JButton)(e.getSource())); 
            }
        }); 
        pulsanti.add(new PulsanteBarraControlli(b, Color.blue));
        pannello.add(b);
    }
    
    public void pressionePulsanteBarra(JButton premuto)
    {
        try{
            int value=Integer.parseInt(premuto.getName());
            //int vd=pannello.
        }
        catch(Exception ex)
        {
            return;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pannello = new javax.swing.JPanel();

        jButton1.setText("+");

        jButton3.setText("<");

        jButton4.setText(">");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pannelloLayout = new javax.swing.GroupLayout(pannello);
        pannello.setLayout(pannelloLayout);
        pannelloLayout.setHorizontalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        pannelloLayout.setVerticalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pannello);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pannello;
    // End of variables declaration//GEN-END:variables
}
