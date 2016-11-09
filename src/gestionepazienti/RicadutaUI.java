package gestionepazienti;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;


public class RicadutaUI extends javax.swing.JPanel {
    
    private PazienteUI parent;
    private ControlloAmbulatorialeStandardUI standard;
    private TerapiaPrincipaleUI terPrincipale;
    private int idControllo;
    
    private boolean noteEdit=false;
    
    public RicadutaUI(PazienteUI p,int id) {
        initComponents();
        parent=p;
        cancellaRicaduta.setVisible(Opzioni.cancellaAttivo);
        idControllo=id;
        standard=new ControlloAmbulatorialeStandardUI(parent,idControllo);
        terPrincipale=new TerapiaPrincipaleUI(parent, 2,idControllo);
        panelStandard.setLayout(new BoxLayout(panelStandard, BoxLayout.LINE_AXIS));
        panelTerPrincipale.setLayout(new BoxLayout(panelTerPrincipale, BoxLayout.LINE_AXIS));
        panelStandard.add(standard);
        panelTerPrincipale.add(terPrincipale);
        ricadTerap.setVisible(false);
        aggiornaDati(idControllo);
        Utilita.undoAndRedo(this);
        this.setVisible(true);
    }
    
    public void aggiornaDati(int id)
    {
        terapiaRicaduta.setEnabled(false);
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Ricaduta WHERE Controllo_Standard=?");
            pst.setInt(1,idControllo);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                ricaduta.setSelectedItem(rs.getString("Ricaduta"));
                terapiaRicaduta.setSelectedItem(rs.getString("Terapia_Ricaduta"));
                note.setText(rs.getString("Note"));
                //gestioneRicaduta();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
        terapiaRicaduta.setEnabled(true);
    }

    public void coloreRicaduta(int i) //i=1 rosso, i=2 giallo
    {
        if(i==1)
        {
         this.setBackground(new Color(237,28,36));
         return;
        }
        this.setBackground(new Color(255,241,0));
    }
     
     public void gestioneRicaduta()
     {
        if((ricaduta.getSelectedIndex()==0) || ricaduta.getSelectedIndex()==1)
        {
            ricadTerap.setVisible(true);
            //coloreRicaduta(1);
        }
        else
        {
            ricadTerap.setVisible(false);
            //coloreRicaduta(2);
        }
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelStandard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ricaduta = new javax.swing.JComboBox<>();
        ricadTerap = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        terapiaRicaduta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        panelTerPrincipale = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cancellaRicaduta = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout panelStandardLayout = new javax.swing.GroupLayout(panelStandard);
        panelStandard.setLayout(panelStandardLayout);
        panelStandardLayout.setHorizontalGroup(
            panelStandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        panelStandardLayout.setVerticalGroup(
            panelStandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Ricaduta:");

        ricaduta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "clinica", "radiologica", "pseudoricaduta", "no" }));
        ricaduta.setSelectedIndex(3);
        ricaduta.setToolTipText("");
        ricaduta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ricadutaActionPerformed(evt);
            }
        });

        ricadTerap.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Terapia Steroidea:");

        terapiaRicaduta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "in altro centro", "per 3 giorni", "per 5 giorni", "altro" }));
        terapiaRicaduta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terapiaRicadutaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Note:");

        note.setColumns(1);
        note.setRows(1);
        note.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                noteFocusLost(evt);
            }
        });
        note.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(note);

        javax.swing.GroupLayout ricadTerapLayout = new javax.swing.GroupLayout(ricadTerap);
        ricadTerap.setLayout(ricadTerapLayout);
        ricadTerapLayout.setHorizontalGroup(
            ricadTerapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ricadTerapLayout.createSequentialGroup()
                .addGroup(ricadTerapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(ricadTerapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(terapiaRicaduta, 0, 165, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        ricadTerapLayout.setVerticalGroup(
            ricadTerapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ricadTerapLayout.createSequentialGroup()
                .addGroup(ricadTerapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(terapiaRicaduta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ricadTerapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTerPrincipale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTerPrincipale.setOpaque(false);
        panelTerPrincipale.setPreferredSize(new java.awt.Dimension(451, 150));

        javax.swing.GroupLayout panelTerPrincipaleLayout = new javax.swing.GroupLayout(panelTerPrincipale);
        panelTerPrincipale.setLayout(panelTerPrincipaleLayout);
        panelTerPrincipaleLayout.setHorizontalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        panelTerPrincipaleLayout.setVerticalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Terapia Principale:");

        cancellaRicaduta.setBackground(java.awt.Color.red);
        cancellaRicaduta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancellaRicaduta.setText("X");
        cancellaRicaduta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaRicadutaActionPerformed(evt);
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
                        .addComponent(cancellaRicaduta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ricadTerap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ricaduta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTerPrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancellaRicaduta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ricaduta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ricadTerap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(panelTerPrincipale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ricadutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ricadutaActionPerformed
        String it=(String) ricaduta.getSelectedItem();
        if(it!=null && (it.toLowerCase().equals("clinica") || it.toLowerCase().equals("radiologica")))
            Barra.prevColor(Opzioni.RicadutaClinicaRadiologica);
        else
            Barra.prevColor(Opzioni.NoRicadutaPseudo);
        try {
            gestioneRicaduta();
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Ricaduta SET Ricaduta=? WHERE Controllo_Standard=?");
            pst.setString(1,it);
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RicadutaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ricadutaActionPerformed

    private void terapiaRicadutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terapiaRicadutaActionPerformed
        if(!terapiaRicaduta.isEnabled())
                    return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Ricaduta SET Terapia_Ricaduta=? WHERE Controllo_Standard=?");
            pst.setString(1,(String) terapiaRicaduta.getSelectedItem());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RicadutaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terapiaRicadutaActionPerformed

    private void noteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noteKeyReleased
         noteEdit=true;
    }//GEN-LAST:event_noteKeyReleased

    private void noteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noteFocusLost
        if(!noteEdit)
            return;
        noteEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Ricaduta SET Note=? WHERE Controllo_Standard=?");
            pst.setString(1,note.getText());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RicadutaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_noteFocusLost

    private void cancellaRicadutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaRicadutaActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("DELETE FROM Ricaduta WHERE Controllo_Standard=?");
            pst.setInt(1, idControllo);
            pst.executeUpdate();
            pst=GestioneDatabase.preparedStatement("DELETE FROM Controllo_Esame WHERE Controllo=?");
            pst.setInt(1, idControllo);
            pst.executeUpdate();
            pst=GestioneDatabase.preparedStatement("DELETE FROM Controllo_Standard WHERE ID_Controllo=?");
            pst.setInt(1, idControllo);
            pst.executeUpdate();
            parent.pulisciPanelControlloAmb();
            parent.aggiornaBarra();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancellaRicadutaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancellaRicaduta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea note;
    private javax.swing.JPanel panelStandard;
    private javax.swing.JPanel panelTerPrincipale;
    private javax.swing.JPanel ricadTerap;
    private javax.swing.JComboBox<String> ricaduta;
    private javax.swing.JComboBox<String> terapiaRicaduta;
    // End of variables declaration//GEN-END:variables
}
