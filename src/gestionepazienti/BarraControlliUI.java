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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

/**
 *
 * @author Riccardo
 */
public class BarraControlliUI extends javax.swing.JPanel {

    private PazienteUI parent;
    
    private Integer indiceCorrente;
    
    public BarraControlliUI(PazienteUI p,double hei,double wid) {
        initComponents();
       
        parent=p;
        
        indiceCorrente=null;
        
        this.setBounds(0, 0, (int)wid, (int)hei);
        pannello.setLayout(new FlowLayout(FlowLayout.LEADING));
    }
    
    public void aggiornaBarra(int id)
    {
        pannello.removeAll();
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT * FROM Controllo_Standard WHERE ID_Paziente="+id+" ORDER BY Data ASC");
            int i=0;
            while(rs.next())
            {
                Date d=rs.getDate("Data");
                int c=rs.getInt("ID_Controllo");
                creaPulsante(i,d,c);
                i++;
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
    
    private void creaPulsante(int i,Date d,int cod)
    {
        PulsanteBarraControlli b=new PulsanteBarraControlli(i,cod);
        b.setText(Utilita.dataToString(d));
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!(e.getSource() instanceof PulsanteBarraControlli))
                    return;
                pressionePulsanteBarra((PulsanteBarraControlli)(e.getSource())); 
            }
        }); 
        pannello.add(b);
    }
    
    public void pressionePulsanteBarra(PulsanteBarraControlli premuto)
    {
        
         aggiornaPulsante(premuto.getIndicePulsante());
         indiceCorrente=premuto.getIndicePulsante();
         parent.aggiornaDatiControllo(premuto.getIdControllo());
        //metodo che dato l'id mi da informazioni sul controllo
    }
    private void aggiornaPulsante(int ind)
    {
        if((indiceCorrente!=null && pannello.getComponent(indiceCorrente)!=null))
            ((PulsanteBarraControlli)(pannello.getComponent(indiceCorrente))).setBackground(new JButton().getBackground());
        ((PulsanteBarraControlli)(pannello.getComponent(ind))).setBackground(Color.ORANGE);
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
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(">");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(indiceCorrente!=null && indiceCorrente>=1)
        {
            aggiornaPulsante(indiceCorrente-1);
            indiceCorrente--;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(indiceCorrente!=null && indiceCorrente<pannello.getComponentCount()-1)
        {
            aggiornaPulsante(indiceCorrente+1);
            indiceCorrente++;
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pannello;
    // End of variables declaration//GEN-END:variables
}
