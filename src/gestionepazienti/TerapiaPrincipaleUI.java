
package gestionepazienti;

import java.util.Date;
import javax.swing.JPanel;


public class TerapiaPrincipaleUI extends javax.swing.JPanel {
    private PazienteUI parent;
    private AmbulatorioOrdinarioUI parentPanel;
    private Date dataControllo;
    
    public TerapiaPrincipaleUI(PazienteUI p,AmbulatorioOrdinarioUI amb,Date data) {
        initComponents();
        unvisibleAll();
        parent=p;
        parentPanel=amb;
        dataControllo=data;
        if(parentPanel==null)
        {
            jRadioButton2.setVisible(false);
        }
//        aggiornaDatiTerap(Pazienti.getCurrID(),dataControllo);
        this.setVisible(true);
    }

    private void unvisibleAll()
    {
        buttonTer2.setVisible(false);
        buttonTer3.setVisible(false);
        terapie.setVisible(false);
    }
    
    public void aggiornaDatiTerap(int idPaz,Date data)
    {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruppoTeraPric = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        terapie = new javax.swing.JComboBox<>();
        buttonTer2 = new javax.swing.JButton();
        buttonTer3 = new javax.swing.JButton();

        setOpaque(false);

        gruppoTeraPric.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setText("si consiglia di proseguire con la terapia in atto");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        gruppoTeraPric.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("switch in DM");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        gruppoTeraPric.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton3.setText("switch ora a:");
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        terapie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonTer2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTer2.setText(">");
        buttonTer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer2ActionPerformed(evt);
            }
        });

        buttonTer3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTer3.setText(">");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTer2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(terapie, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonTer3)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(buttonTer2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(terapie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTer3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
        unvisibleAll();
        buttonTer2.setVisible(true);
        if(parentPanel!=null)
        {
            parentPanel.coloreAmbulatoriOrdinari(2);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        
        unvisibleAll();
        buttonTer3.setVisible(true);
        terapie.setVisible(true);
        if(parentPanel!=null)
        {
            parentPanel.coloreAmbulatoriOrdinari(3);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        unvisibleAll();
        if(parentPanel!=null)
        {
            parentPanel.coloreAmbulatoriOrdinari(1);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void buttonTer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer2ActionPerformed
        
        parent.setVisible(false);
        new SceltaTerapiaPrincipaleUI(parent,dataControllo);
        
    }//GEN-LAST:event_buttonTer2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonTer2;
    private javax.swing.JButton buttonTer3;
    private javax.swing.ButtonGroup gruppoTeraPric;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JComboBox<String> terapie;
    // End of variables declaration//GEN-END:variables
}
