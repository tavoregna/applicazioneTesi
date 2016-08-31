
package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TerapiaPrincipaleUI extends javax.swing.JPanel {
    private PazienteUI parent;
    private AmbulatorioOrdinarioUI parentPanel;
    private int idControllo;
    private Date dataAvvioTerapia;
    private String terapia_2;
    
    private int tipoControllo;
    
    public TerapiaPrincipaleUI(PazienteUI p,AmbulatorioOrdinarioUI amb,int id) {
        initComponents();
        unvisibleAll();
        parent=p;
        parentPanel=amb;
        idControllo=id;
        if(parentPanel==null)
        {
            jRadioButton2.setVisible(false);
            aggiornaDatiTerap(idControllo,2);
        }
        else
            aggiornaDatiTerap(idControllo,1);
        this.setVisible(true);
    }

    private void unvisibleAll()
    {
        buttonTer2.setVisible(false);
        buttonTer3.setVisible(false);
        terapiaOra.setVisible(false);
        terapiaDH.setVisible(false);
        dataAvvio.setVisible(false);
    }
    
    public void aggiornaDatiTerap(int idControllo,int i) //i=1 ordinario; i=2 ricaduta
    {
        if(idControllo==-1)
        {
            return;
        }
        try {
            tipoControllo=i;
            PreparedStatement pst;
            String query;
            if(i==1)
                query="SELECT * FROM Ambulatorio_Ordinario WHERE Controllo_Standard=?";
            else
                query="SELECT Terapia_Principale,Terapia_3 FROM Ricaduta WHERE Controllo_Standard=?";
            pst=GestioneDatabase.preparedStatement(query);
            pst.setInt(1,idControllo);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                if(rs.getInt("Terapia_Principale")==1)
                {
                    jRadioButton1.setSelected(true);
                }
                else
                {
                    if(rs.getInt("Terapia_Principale")==2 && i==1)
                        {
                            jRadioButton2.setSelected(true);
                            buttonTer2.setVisible(true);
                            dataAvvio.setVisible(true);
                            terapiaDH.setVisible(true);
                            dataAvvioTerapia=rs.getDate("Data_Avvio_Terapia");
                            terapia_2=rs.getString("Terapia_2");
                            //parentPanel.coloreAmbulatoriOrdinari(2);
                        }
                        else
                        {
                            jRadioButton3.setSelected(true);
                            terapiaOra.setSelectedItem(rs.getString("Terapia_3"));
                            buttonTer3.setVisible(true);
                        }
                    }   
                }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private void AggiornaCampoTerapia()
    {
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

        buttonTer2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTer2.setText(">");

        buttonTer3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTer3.setText(">");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataAvvio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(terapiaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(terapiaOra, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonTer3)))
                        .addGap(18, 18, 18)
                        .addComponent(buttonTer2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {terapiaDH, terapiaOra});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(buttonTer2)
                    .addComponent(dataAvvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terapiaDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(terapiaOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTer3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
        unvisibleAll();
        buttonTer2.setVisible(true);
        dataAvvio.setVisible(true);
        terapiaDH.setVisible(true);
        aggiornaTipoControllo(2);
        if(parentPanel!=null)
        {
            //parentPanel.coloreAmbulatoriOrdinari(2);
            
            
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        
        unvisibleAll();
        buttonTer3.setVisible(true);
        terapiaOra.setVisible(true);
        aggiornaTipoControllo(3);
        if(parentPanel!=null)
        {
            //parentPanel.coloreAmbulatoriOrdinari(3);
            
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        unvisibleAll();
        aggiornaTipoControllo(1);
        if(parentPanel!=null)
        {
            //parentPanel.coloreAmbulatoriOrdinari(1);
            
            
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed
    private void aggiornaTipoControllo(int i)
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
    private javax.swing.JButton buttonTer2;
    private javax.swing.JButton buttonTer3;
    private org.jdesktop.swingx.JXDatePicker dataAvvio;
    private javax.swing.ButtonGroup gruppoTeraPrinc;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JComboBox<String> terapiaDH;
    private javax.swing.JComboBox<String> terapiaOra;
    // End of variables declaration//GEN-END:variables
}
