package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

//1 = ORDINARIO, 2 = RICADUTA
public class TerapiaPrincipaleUI extends javax.swing.JPanel {
    private PazienteUI parent;
    
    private int idControllo;
    private int tipoControllo;
    
    public TerapiaPrincipaleUI(PazienteUI p,int tipo,int id) {
        initComponents();
        unvisibleAll();
        parent=p;
        idControllo=id;
        tipoControllo=tipo;
        AggiornaCampoTerapia();
        if(tipo==2)
            jRadioButton2.setVisible(false);
        aggiornaDatiTerap(idControllo);
        this.setVisible(true);
    }

    private void unvisibleAll()
    {
        buttonTer.setVisible(false);
        buttonTer2.setVisible(false);
        buttonTer3.setVisible(false);
        buttonTer2F.setVisible(false);
        buttonTer3F.setVisible(false);
        terapiaOra.setVisible(false);
        terapiaDH.setVisible(false);
        dataAvvio.setVisible(false);
        terapiaOra.setEnabled(false);
        terapiaDH.setEnabled(false);
        dataAvvio.setEnabled(false);
    }
    
    public void aggiornaDatiTerap(int idControllo)  //i=1 ordinario; i=2 ricaduta
    {
        try {
            PreparedStatement pst;
            String query;
            if(tipoControllo==1)
                query="SELECT * FROM Ambulatorio_Ordinario WHERE Controllo_Standard=?";
            else
                query="SELECT * FROM Ricaduta WHERE Controllo_Standard=?";
            pst=GestioneDatabase.preparedStatement(query);
            pst.setInt(1,idControllo);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                if(rs.getInt("Terapia_Principale")==1)
                {
                    jRadioButton1.setSelected(true);
                    buttonTer.setVisible(true);
                }
                else
                {
                    if(rs.getInt("Terapia_Principale")==2 && tipoControllo==1)
                        {
                            jRadioButton2.setSelected(true);
                            
                            dataAvvio.setDate(rs.getDate("Data_Avvio_Terapia"));
                            dataAvvio.setVisible(true);
                            dataAvvio.setEnabled(true);
                            
                            terapiaDH.setSelectedItem(rs.getString("Terapia_2"));
                            terapiaDH.setVisible(true);
                            terapiaDH.setEnabled(true);
                            
                            buttonTer2.setVisible(true);
                            buttonTer2F.setVisible(true);
                        }
                        else
                        {
                            jRadioButton3.setSelected(true);
                            
                            terapiaOra.setSelectedItem(rs.getString("Terapia_3"));
                            terapiaOra.setVisible(true);
                            terapiaOra.setEnabled(true);
                            
                            buttonTer3.setVisible(true);
                            buttonTer3F.setVisible(true);
                        }
                    }   
                }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private void AggiornaCampoTerapia()
    {
        terapiaDH.setEnabled(false);
        terapiaOra.setEnabled(false);
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Nome FROM Terapia");
            while(rs.next())
            {
                terapiaDH.addItem(rs.getString("Nome"));
                terapiaOra.addItem(rs.getString("Nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        terapiaDH.setEnabled(true);
        terapiaOra.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruppoTeraPrinc = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        terapiaOra = new javax.swing.JComboBox<>();
        buttonTer2 = new javax.swing.JButton();
        buttonTer3 = new javax.swing.JButton();
        dataAvvio = new org.jdesktop.swingx.JXDatePicker();
        terapiaDH = new javax.swing.JComboBox<>();
        buttonTer3F = new javax.swing.JButton();
        buttonTer = new javax.swing.JButton();
        buttonTer2F = new javax.swing.JButton();

        setOpaque(false);

        gruppoTeraPrinc.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setText("si consiglia di proseguire con la terapia in atto");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        gruppoTeraPrinc.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("switch in DH:");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        gruppoTeraPrinc.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton3.setText("switch ora a:");
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        terapiaOra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terapiaOraActionPerformed(evt);
            }
        });

        buttonTer2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer2.setText("L");
        buttonTer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer2ActionPerformed(evt);
            }
        });

        buttonTer3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer3.setText("L");
        buttonTer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer3ActionPerformed(evt);
            }
        });

        dataAvvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAvvioActionPerformed(evt);
            }
        });

        terapiaDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terapiaDHActionPerformed(evt);
            }
        });

        buttonTer3F.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer3F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer3F.setText("F");
        buttonTer3F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer3FActionPerformed(evt);
            }
        });

        buttonTer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer.setText("F");
        buttonTer.setOpaque(false);
        buttonTer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTerActionPerformed(evt);
            }
        });

        buttonTer2F.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer2F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer2F.setText("F");
        buttonTer2F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer2FActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(buttonTer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(terapiaOra, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonTer3)
                                .addGap(18, 18, 18)
                                .addComponent(buttonTer3F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(188, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataAvvio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(terapiaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTer2F)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {terapiaDH, terapiaOra});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(buttonTer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(buttonTer2)
                    .addComponent(dataAvvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terapiaDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTer2F))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTer3F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton3)
                        .addComponent(terapiaOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonTer3)))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
        unvisibleAll();
        buttonTer2.setVisible(true);
        buttonTer2F.setVisible(true);
        dataAvvio.setVisible(true);
        dataAvvio.setEnabled(true);
        
        terapiaDH.setVisible(true);
        terapiaDH.setEnabled(true);
        
        aggiornaRadioButtonControllo(2);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        
        unvisibleAll();
        buttonTer3.setVisible(true);
        buttonTer3F.setVisible(true);
        terapiaOra.setVisible(true);
        terapiaOra.setEnabled(true);
        
        aggiornaRadioButtonControllo(3);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        unvisibleAll();
        buttonTer.setVisible(true);
        aggiornaRadioButtonControllo(1);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void dataAvvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAvvioActionPerformed
        if(!dataAvvio.isEnabled() || tipoControllo!=1)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Ambulatorio_Ordinario SET Data_Avvio_Terapia=? WHERE Controllo_Standard=?");
            Date d=dataAvvio.getDate();
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_dataAvvioActionPerformed

    private void terapiaDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terapiaDHActionPerformed
        if(!terapiaDH.isEnabled())
                return;
        try {
            String q;
            if(tipoControllo==1)
                q="Ambulatorio_Ordinario";
            else
                q="Ricaduta";
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE "+q+" SET Terapia_2=? WHERE Controllo_Standard=?");
            pst.setString(1, (String)terapiaDH.getSelectedItem());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terapiaDHActionPerformed

    private void terapiaOraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terapiaOraActionPerformed
        if(!terapiaOra.isEnabled())
                return;
        try {
            String q;
            if(tipoControllo==1)
                q="Ambulatorio_Ordinario";
            else
                q="Ricaduta";
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE "+q+" SET Terapia_3=? WHERE Controllo_Standard=?");
            pst.setString(1, (String)terapiaOra.getSelectedItem());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terapiaOraActionPerformed

    private void buttonTerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTerActionPerformed
        ResultSet rs=GestioneDatabase.querySelect("SELECT Terapia FROM Paziente_Terapia WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data_Inizio LIMIT 1");
        try {
            if(!rs.next())
            {
                Utilita.mostraMessaggio("Nessuna terapia selezionata");
                return;
            }
            GenerazioneWord.generaFileF(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonTerActionPerformed

    private void buttonTer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer2ActionPerformed
        if(terapiaDH.getSelectedIndex()==-1)
        {
            Utilita.mostraMessaggio("Nessuna terapia selezionata");
            return;
        }
        parent.setVisible(false);
        Paziente p=Utilita.oggettoPaziente(WIDTH);
        new finestraDatiLetteraAvvio(parent, p.getNome(), p.getCognome(), (String)terapiaDH.getSelectedItem(), p.getSesso(),Utilita.DateUtilToSQL(dataAvvio.getDate()));
    }//GEN-LAST:event_buttonTer2ActionPerformed

    private void buttonTer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer3ActionPerformed
        if(terapiaOra.getSelectedIndex()==-1)
        {
            Utilita.mostraMessaggio("Nessuna terapia selezionata");
            return;
        }
        parent.setVisible(false);
        Paziente p=Utilita.oggettoPaziente(WIDTH);
        new finestraDatiLetteraAvvio(parent, p.getNome(), p.getCognome(), (String)terapiaOra.getSelectedItem(), p.getSesso(), Utilita.DateUtilToSQL(Utilita.removeTime(new Date(System.currentTimeMillis()))));
    }//GEN-LAST:event_buttonTer3ActionPerformed

    private void buttonTer2FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer2FActionPerformed
        if(terapiaDH.getSelectedIndex()==-1)
        {
            Utilita.mostraMessaggio("Nessuna terapia selezionata");
            return;
        }
        GenerazioneWord.generaFileF((String)terapiaDH.getSelectedItem());
    }//GEN-LAST:event_buttonTer2FActionPerformed

    private void buttonTer3FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer3FActionPerformed
        if(terapiaOra.getSelectedIndex()==-1)
        {
            Utilita.mostraMessaggio("Nessuna terapia selezionata");
            return;
        }
        GenerazioneWord.generaFileF((String)terapiaOra.getSelectedItem());
    }//GEN-LAST:event_buttonTer3FActionPerformed
    private void aggiornaRadioButtonControllo(int i)
    {
        String query;
        if(tipoControllo==1)
            query="UPDATE Ambulatorio_Ordinario SET Terapia_Principale=? WHERE Controllo_Standard=?";
        else
            query="UPDATE Ricaduta SET Terapia_Principale=? WHERE Controllo_Standard=?";
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement(query);
            pst.setInt(1, i);
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonTer;
    private javax.swing.JButton buttonTer2;
    private javax.swing.JButton buttonTer2F;
    private javax.swing.JButton buttonTer3;
    private javax.swing.JButton buttonTer3F;
    private org.jdesktop.swingx.JXDatePicker dataAvvio;
    private javax.swing.ButtonGroup gruppoTeraPrinc;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JComboBox<String> terapiaDH;
    private javax.swing.JComboBox<String> terapiaOra;
    // End of variables declaration//GEN-END:variables
}
