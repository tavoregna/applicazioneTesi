package gestionepazienti;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;


public class AmbulatorioOrdinarioUI extends javax.swing.JPanel {
    
    private PazienteUI parent;
    private ControlloAmbulatorialeStandardUI standard;
    private TerapiaPrincipaleUI terPrincipale;
    private int idControllo;
    
    public AmbulatorioOrdinarioUI(PazienteUI p, int id) {
        initComponents();
        parent=p;
        cancellaOrdinario.setVisible(Opzioni.cancellaAttivo);
        idControllo=id;
        standard=new ControlloAmbulatorialeStandardUI(parent,idControllo);
        terPrincipale=new TerapiaPrincipaleUI(parent,1,idControllo);
        
        panelStandard.setLayout(new BoxLayout(panelStandard, BoxLayout.LINE_AXIS));
        panelTerPrincipale.setLayout(new BoxLayout(panelTerPrincipale, BoxLayout.LINE_AXIS));
        panelStandard.add(standard);
        panelTerPrincipale.add(terPrincipale);
        
        Utilita.undoAndRedo(this);
        this.setVisible(true);
    }
    
    public void coloreAmbulatoriOrdinari(int i) //i=Tipo terapia principale
    {
        if(i==1)
        {
            this.setBackground(new Color(181,230,29));
            return;
        }
        if(i==2)
        {
            this.setBackground(new Color(153,217,234));
            return;
        }
        this.setBackground(new Color(0,162,232)); //if(i==3)
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruppoTeraPrinc = new javax.swing.ButtonGroup();
        panelStandard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelTerPrincipale = new javax.swing.JPanel();
        cancellaOrdinario = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(1737, 733));

        javax.swing.GroupLayout panelStandardLayout = new javax.swing.GroupLayout(panelStandard);
        panelStandard.setLayout(panelStandardLayout);
        panelStandardLayout.setHorizontalGroup(
            panelStandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelStandardLayout.setVerticalGroup(
            panelStandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Terapia Principale:");

        panelTerPrincipale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTerPrincipale.setOpaque(false);
        panelTerPrincipale.setPreferredSize(new java.awt.Dimension(451, 150));

        javax.swing.GroupLayout panelTerPrincipaleLayout = new javax.swing.GroupLayout(panelTerPrincipale);
        panelTerPrincipale.setLayout(panelTerPrincipaleLayout);
        panelTerPrincipaleLayout.setHorizontalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        panelTerPrincipaleLayout.setVerticalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        cancellaOrdinario.setBackground(java.awt.Color.red);
        cancellaOrdinario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancellaOrdinario.setText("X");
        cancellaOrdinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaOrdinarioActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTerPrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 977, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancellaOrdinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelStandard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancellaOrdinario)
                    .addComponent(panelStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTerPrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancellaOrdinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaOrdinarioActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("DELETE FROM Ambulatorio_Ordinario WHERE Controllo_Standard=?");
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
    }//GEN-LAST:event_cancellaOrdinarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancellaOrdinario;
    private javax.swing.ButtonGroup gruppoTeraPrinc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelStandard;
    private javax.swing.JPanel panelTerPrincipale;
    // End of variables declaration//GEN-END:variables
}
