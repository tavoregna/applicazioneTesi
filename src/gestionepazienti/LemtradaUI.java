package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;


public class LemtradaUI extends javax.swing.JPanel {

    private PazienteUI parent;
   
    public LemtradaUI(PazienteUI p,int id) {
        initComponents();
        parent=p;
        pannello.setLayout(new BoxLayout(pannello, BoxLayout.Y_AXIS));
    }

   public void aggiornaDatiLemtrada(int id)
    {
         /*try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Lemtrada WHERE ID_Lemtrada=?");
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
               parent.aggiornaDatiDH(rs.getDate("Data"), 1, rs.getString("Medico"), rs.getInt("Somministrazione_N"));
               diarioClinicoGG1.setText(rs.getString("Diario_Clinico1"));
               dataDC1.setDate(rs.getDate("Data_DC1"));
               diarioClinicoGG2.setText(rs.getString("Diario_Clinico2"));
               dataDC2.setDate(rs.getDate("Data_DC2"));
               diarioClinicoGG3.setText(rs.getString("Diario_Clinico3"));
               dataDC3.setDate(rs.getDate("Data_DC3"));
               diarioClinicoGG4.setText(rs.getString("Diario_Clinico4"));
               dataDC4.setDate(rs.getDate("Data_DC4"));
               diarioClinicoGG5.setText(rs.getString("Diario_Clinico5"));
               dataDC5.setDate(rs.getDate("Data_DC5"));
               dataEsamEmato1.setDate(rs.getDate("Data_Esame1"));
               leucociti.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } */
    }
   
    public void aggiornaUI()
    {
        pannello.setVisible(false);
        pannello.setVisible(true);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pannello = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 153));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("AGGIUNGI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pannello.setOpaque(false);

        javax.swing.GroupLayout pannelloLayout = new javax.swing.GroupLayout(pannello);
        pannello.setLayout(pannelloLayout);
        pannelloLayout.setHorizontalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pannelloLayout.setVerticalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 774, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pannello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int reply=JOptionPane.showConfirmDialog(null, "Sei sicuro di vole inserire un nuovo giorno ?","CONFERMA AGGIUNTA",JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_OPTION)
        {
            pannello.add(new PannelloLemtradaUI(1, 1));
            aggiornaUI();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pannello;
    // End of variables declaration//GEN-END:variables
}
