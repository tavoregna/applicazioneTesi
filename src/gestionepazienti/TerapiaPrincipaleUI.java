package gestionepazienti;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        buttonTer1.setVisible(false);
        buttonTer2.setVisible(false);
        buttonTer3.setVisible(false);
        buttonTer2F.setVisible(false);
        buttonTer2F1.setVisible(false);
        buttonTer3F.setVisible(false);
        buttonTer3F1.setVisible(false);
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
            unvisibleAll();
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
                     buttonTer1.setVisible(true);
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
                            
                            visualizzaSoloSeNonInfusiva(rs.getString("Terapia_2"));
                        }
                        else
                        {
                            jRadioButton3.setSelected(true);
                            
                            terapiaOra.setSelectedItem(rs.getString("Terapia_3"));
                            terapiaOra.setVisible(true);
                            terapiaOra.setEnabled(true);
                            
                            buttonTer3.setVisible(true);
                            buttonTer3F.setVisible(true);
                            buttonTer3F1.setVisible(true);
                        }
                    }   
                }
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    private void visualizzaSoloSeNonInfusiva(String t)
    {
        boolean val=!Utilita.isTerapiaInfusiva(t);
        buttonTer2.setVisible(val);
        buttonTer2F.setVisible(val);
        buttonTer2F1.setVisible(val);
    }
    
    private void AggiornaCampoTerapia()
    {
        terapiaDH.setEnabled(false);
        terapiaOra.setEnabled(false);
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Nome,Infusiva FROM Terapia");
            while(rs.next())
            {
                terapiaDH.addItem(rs.getString("Nome"));
                if(!rs.getBoolean("Infusiva"))
                    terapiaOra.addItem(rs.getString("Nome"));
            }
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        terapiaDH.setSelectedItem(null);
        terapiaOra.setSelectedItem(null);
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
        buttonTer2F1 = new javax.swing.JButton();
        buttonTer3F1 = new javax.swing.JButton();
        buttonTer1 = new javax.swing.JButton();

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

        buttonTer2F1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer2F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer2F1.setText("FA");
        buttonTer2F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer2F1ActionPerformed(evt);
            }
        });

        buttonTer3F1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer3F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer3F1.setText("FA");
        buttonTer3F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer3F1ActionPerformed(evt);
            }
        });

        buttonTer1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer1.setText("FA");
        buttonTer1.setOpaque(false);
        buttonTer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer1ActionPerformed(evt);
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
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(terapiaOra, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTer3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTer3F)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTer3F1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTer1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataAvvio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terapiaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTer2F, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTer2F1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {terapiaDH, terapiaOra});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonTer2, buttonTer2F, buttonTer3, buttonTer3F});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonTer1, buttonTer2F1, buttonTer3F1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(buttonTer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTer1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(buttonTer2)
                    .addComponent(dataAvvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terapiaDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTer2F)
                    .addComponent(buttonTer2F1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(terapiaOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTer3)
                    .addComponent(buttonTer3F, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTer3F1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonTer3, buttonTer3F});

    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(tipoControllo==1)
            Barra.prevColor(Opzioni.ControlloOrdinario2);
        
        unvisibleAll();
        buttonTer2.setVisible(true);
        buttonTer2F.setVisible(true);
        buttonTer2F1.setVisible(true);
        dataAvvio.setVisible(true);
        dataAvvio.setEnabled(true);
        
        terapiaDH.setVisible(true);
        terapiaDH.setEnabled(true);
        
        aggiornaRadioButtonControllo(2);
        
        azzeraCampi();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(tipoControllo==1)
            Barra.prevColor(Opzioni.ControlloOrdinario4);
        
        unvisibleAll();
        buttonTer3.setVisible(true);
        buttonTer3F.setVisible(true);
        buttonTer3F1.setVisible(true);
        terapiaOra.setVisible(true);
        terapiaOra.setEnabled(true);
        
        aggiornaRadioButtonControllo(3);
        
        azzeraCampi();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        unvisibleAll();
        buttonTer.setVisible(true);
        buttonTer1.setVisible(true);
        if(tipoControllo==1)
            Barra.prevColor(Opzioni.ControlloOrdinario1);
        aggiornaRadioButtonControllo(1);
        azzeraCampi();
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void dataAvvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAvvioActionPerformed
        if(!dataAvvio.isEnabled() || tipoControllo!=1)
                return;
        Date d=dataAvvio.getDate();
        if(d==null)
        {
            Barra.prevColor(Opzioni.ControlloOrdinario2);
        }
        else
        {
            Barra.prevColor(Opzioni.ControlloOrdinario3);
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Ambulatorio_Ordinario SET Data_Avvio_Terapia=? WHERE Controllo_Standard=?");
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
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
            visualizzaSoloSeNonInfusiva((String)terapiaDH.getSelectedItem());
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terapiaDHActionPerformed

    private void terapiaOraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terapiaOraActionPerformed
        if(!terapiaOra.isEnabled())
                return;
        if(parent.getDataTerapiaAttuale().equals(Utilita.dataToString(Utilita.removeTime(new Date(System.currentTimeMillis())))))
        {
            Utilita.mostraMessaggio("E' già presente una terapia con la data odierna");
            terapiaOra.setEnabled(false);
            terapiaOra.setSelectedItem(null);
            terapiaOra.setEnabled(true);
            return;
        }
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
            Utilita.errore(ex);Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PreparedStatement pst;
            ResultSet rs=GestioneDatabase.querySelect("SELECT Data_Inizio,Data_Fine FROM Paziente_Terapia WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data_Inizio DESC LIMIT 1");
            if(rs.next())
            {
                if(rs.getDate("Data_Fine")==null && JOptionPane.showConfirmDialog(null,"Vuoi terminare la terapia precedente?","TERMINA TERAPIA",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                {
                   pst=GestioneDatabase.preparedStatement("UPDATE Paziente_Terapia SET Data_Fine=? WHERE ID_Paziente=? AND Data_Inizio=?");
                   pst.setDate(1,new java.sql.Date(Utilita.removeTime(new java.util.Date(System.currentTimeMillis())).getTime()));
                   pst.setInt(2, Pazienti.getCurrID());
                   pst.setString(3, rs.getNString("Data_Inizio"));
                   pst.executeUpdate();
                }
            }
            pst=GestioneDatabase.preparedStatement("INSERT INTO Paziente_Terapia(Data_Inizio,ID_Paziente,Terapia) VALUES(?,?,?)");
            pst.setDate(1, new java.sql.Date(Utilita.removeTime(new java.util.Date(System.currentTimeMillis())).getTime()));
            pst.setInt(2,Pazienti.getCurrID());
            pst.setString(3,(String)terapiaOra.getSelectedItem());
            pst.executeUpdate();
            parent.aggiornaTerapie(Pazienti.getCurrID());
            Utilita.mostraMessaggio("Terapia attuale aggiornata");
        } catch (SQLException ex) {
            Utilita.mostraMessaggioErrore("C'è già una terapia con la data odierna");
        }
    }//GEN-LAST:event_terapiaOraActionPerformed

    private void buttonTerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTerActionPerformed
        ResultSet rs=GestioneDatabase.querySelect("SELECT Terapia FROM Paziente_Terapia WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data_Inizio DESC LIMIT 1");
        try {
            if(!rs.next())
            {
                Utilita.mostraMessaggio("Nessuna terapia selezionata");
                return;
            }
            GenerazioneWord.generaFileF(rs.getString(1));
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonTerActionPerformed

    private void buttonTer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer2ActionPerformed
        if(terapiaDH.getSelectedIndex()==-1)
        {
            Utilita.mostraMessaggio("Nessuna terapia selezionata");
            return;
        }
       if(!GenerazioneWord.existsFarmaco("./ModelloLetteraAvvio/", (String)terapiaDH.getSelectedItem()))
       {
           Utilita.mostraMessaggio("Modello non trovato");
           return;
       }
        parent.setVisible(false);
        Paziente p=Utilita.oggettoPaziente(Pazienti.getCurrID());
        new finestraDatiLetteraAvvio(parent, p.getNome(), p.getCognome(), (String)terapiaDH.getSelectedItem(), p.getSesso(),Utilita.DateUtilToSQL(dataAvvio.getDate()));
    }//GEN-LAST:event_buttonTer2ActionPerformed

    private void buttonTer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer3ActionPerformed
        if(terapiaOra.getSelectedIndex()==-1)
        {
            Utilita.mostraMessaggio("Nessuna terapia selezionata");
            return;
        }
        if(!GenerazioneWord.existsFarmaco("./ModelloLetteraAvvio/", (String)terapiaOra.getSelectedItem()))
        {   
            Utilita.mostraMessaggio("Modello non trovato");
            return;
        }
        parent.setVisible(false);
        Paziente p=Utilita.oggettoPaziente(Pazienti.getCurrID());
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

    private void buttonTer2F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer2F1ActionPerformed
        if(terapiaDH.getSelectedIndex()==-1)
        {
            Utilita.mostraMessaggio("Nessuna terapia selezionata");
            return;
        }
        GenerazioneWord.generaFileFA((String)terapiaDH.getSelectedItem());
    }//GEN-LAST:event_buttonTer2F1ActionPerformed

    private void buttonTer3F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer3F1ActionPerformed
        if(terapiaOra.getSelectedIndex()==-1)
        {
            Utilita.mostraMessaggio("Nessuna terapia selezionata");
            return;
        }
        GenerazioneWord.generaFileFA((String)terapiaOra.getSelectedItem());
    }//GEN-LAST:event_buttonTer3F1ActionPerformed

    private void buttonTer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer1ActionPerformed
        ResultSet rs=GestioneDatabase.querySelect("SELECT Terapia FROM Paziente_Terapia WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data_Inizio DESC LIMIT 1");
        try {
            if(!rs.next())
            {
                Utilita.mostraMessaggio("Nessuna terapia selezionata");
                return;
            }
            GenerazioneWord.generaFileFA(rs.getString(1));
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonTer1ActionPerformed
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
            Utilita.errore(ex);Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void azzeraCampi()
    {
        terapiaDH.setEnabled(false);
        terapiaOra.setEnabled(false);
        dataAvvio.setEnabled(false);
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Ambulatorio_Ordinario SET Data_Avvio_Terapia=?, Terapia_2=?, Terapia_3=? WHERE Controllo_Standard=?");
            pst.setNull(1, java.sql.Types.TIMESTAMP);
            pst.setNull(2, java.sql.Types.VARCHAR);
            pst.setNull(3, java.sql.Types.VARCHAR);
            pst.setInt(4, idControllo);
            pst.executeUpdate();
            terapiaDH.setSelectedItem(null);
            terapiaOra.setSelectedItem(null);
            dataAvvio.setDate(null);
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(TerapiaPrincipaleUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        terapiaDH.setEnabled(true);
        terapiaOra.setEnabled(true);
        dataAvvio.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonTer;
    private javax.swing.JButton buttonTer1;
    private javax.swing.JButton buttonTer2;
    private javax.swing.JButton buttonTer2F;
    private javax.swing.JButton buttonTer2F1;
    private javax.swing.JButton buttonTer3;
    private javax.swing.JButton buttonTer3F;
    private javax.swing.JButton buttonTer3F1;
    private org.jdesktop.swingx.JXDatePicker dataAvvio;
    private javax.swing.ButtonGroup gruppoTeraPrinc;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JComboBox<String> terapiaDH;
    private javax.swing.JComboBox<String> terapiaOra;
    // End of variables declaration//GEN-END:variables
}
