
package gestionepazienti;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;


public class RicadutaUI extends javax.swing.JPanel {
    
    private PazienteUI parent;
    private ControlloAmbulatorialeStandardUI standard;
    private TerapiaPrincipaleUI terPrincipale;
    private int idControllo;
    
    public RicadutaUI(PazienteUI p,int id) {
        initComponents();
        parent=p;
        idControllo=id;
        standard=new ControlloAmbulatorialeStandardUI(parent,idControllo);
        terPrincipale=new TerapiaPrincipaleUI(parent, null,idControllo);
        panelStandard.setLayout(new BoxLayout(panelStandard, BoxLayout.LINE_AXIS));
        panelTerPrincipale.setLayout(new BoxLayout(panelTerPrincipale, BoxLayout.LINE_AXIS));
        panelStandard.add(standard);
        panelTerPrincipale.add(terPrincipale);
        aggiornaDati(idControllo);
        ricadTerap.setVisible(false);
        this.setVisible(true);
    }
    
    public void aggiornaDati(int id)
    {
        if(id==-1)
        {
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Ricaduta WHERE Controllo_Standard=?");
            pst.setInt(1,idControllo);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                ricaduta.setSelectedItem(rs.getString("Ricaduta"));
                gestioneRicaduta();
                //if(rs.getString("Terapia_Ricaduta")!=null)
                //{
                    terapiaRicaduta.setSelectedItem(rs.getString("Terapia_Ricaduta"));
                //}
                //note.setText(rs.getString("Note"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
            coloreRicaduta(1);
        }
        else
        {
            ricadTerap.setVisible(false);
            coloreRicaduta(2);
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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Note:");

        note.setColumns(1);
        note.setRows(1);
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
            .addGap(0, 447, Short.MAX_VALUE)
        );
        panelTerPrincipaleLayout.setVerticalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Terapia Principale:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(panelTerPrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        gestioneRicaduta();
    }//GEN-LAST:event_ricadutaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
