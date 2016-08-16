package gestionepazienti;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Storico extends javax.swing.JFrame {
    
    private int IDpaziente;
    private Paziente parent;
    private ArrayList<Story> storico;
    
    private int indiceCorrente;
  
    public Storico(int paz,Paziente par) 
    {
        this();
        IDpaziente=paz;
        parent=par;
        storico=new ArrayList<Story>();
        
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Nome,Cognome FROM Paziente WHERE ID="+paz);
            if(rs.next())
            {
                titolo.setText(rs.getString(2)+" "+rs.getString(1));
            }
            rs=GestioneDatabase.querySelect("SELECT * FROM Storico WHERE ID="+paz+" ORDER BY Data DESC");
            while(rs.next())
            {
                storico.add(new Story(IDpaziente,rs.getDate("Data"),rs.getString("Testo")));  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Storico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        indiceCorrente=0;
        if(storico.size()>0)
            impostaCampi(0);  
        
    }
    public Storico() {
        initComponents();
        this.setVisible(true);
        
        abilitaCampi(false);
        mostra(true);
    }
    
    private void impostaCampi(int ind)
    {
        if(ind<0 || ind>=storico.size())
            return;
        Story st=storico.get(ind);
        
        testoDescr.setText(st.getTesto());
        data.setDate(st.getData());
    }
    
    private void abilitaCampi(boolean t)
    {
        testoDescr.setEditable(t);
        data.setEditable(t);
    }
    
    private void mostra(boolean m)
    {
        modifica.setVisible(m);
        salva.setVisible(!m);
        annulla.setVisible(!m);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titolo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testoDescr = new javax.swing.JTextArea();
        modifica = new javax.swing.JButton();
        indietro = new javax.swing.JButton();
        avanti = new javax.swing.JButton();
        annulla = new javax.swing.JButton();
        salva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        titolo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Data:");

        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Descrizione:");

        testoDescr.setColumns(20);
        testoDescr.setRows(5);
        jScrollPane1.setViewportView(testoDescr);

        modifica.setText("Modifica");
        modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaActionPerformed(evt);
            }
        });

        indietro.setText("<");
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });

        avanti.setText(">");
        avanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiActionPerformed(evt);
            }
        });

        annulla.setText("Annulla");
        annulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annullaActionPerformed(evt);
            }
        });

        salva.setText("Salva");
        salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titolo, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(indietro)
                        .addGap(18, 18, 18)
                        .addComponent(avanti))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifica)
                            .addComponent(annulla)
                            .addComponent(salva))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titolo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indietro)
                            .addComponent(avanti))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(modifica)
                        .addGap(18, 18, 18)
                        .addComponent(annulla)
                        .addGap(18, 18, 18)
                        .addComponent(salva)))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed

    }//GEN-LAST:event_dataActionPerformed

    private void modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaActionPerformed
        abilitaCampi(true);
        mostra(false);
    }//GEN-LAST:event_modificaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(parent!=null)
            parent.setVisible(true);
        storico=null;
    }//GEN-LAST:event_formWindowClosed

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
       if(indiceCorrente<storico.size()-1)
        {
            indiceCorrente++;
            impostaCampi(indiceCorrente);
        } 
        abilitaCampi(false);
        mostra(true);
    }//GEN-LAST:event_indietroActionPerformed

    private void avantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiActionPerformed
        if(indiceCorrente>0)
        {
            indiceCorrente--;
            impostaCampi(indiceCorrente);
        }
        abilitaCampi(false);
        mostra(true);
    }//GEN-LAST:event_avantiActionPerformed

    private void annullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annullaActionPerformed
        abilitaCampi(false);
        impostaCampi(indiceCorrente);
        mostra(true);
    }//GEN-LAST:event_annullaActionPerformed

    private void salvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulla;
    private javax.swing.JButton avanti;
    private org.jdesktop.swingx.JXDatePicker data;
    private javax.swing.JButton indietro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifica;
    private javax.swing.JButton salva;
    private javax.swing.JTextArea testoDescr;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
