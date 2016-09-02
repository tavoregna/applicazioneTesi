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
    private int giornoCorrente;
    private int idLemtrada;
    
    public LemtradaUI(PazienteUI p,int id) {
        initComponents();
        parent=p;
        giornoCorrente=1;
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
   
   public void inserisciPannello(int gg,int id)
   {
       switch(gg)
       {
           case 1:
                panelGG1.setLayout(new BoxLayout(panelGG1, BoxLayout.LINE_AXIS));
                panelGG1.add(new PannelloLemtradaUI(1,id));
                panelGG1.setVisible(false);
                panelGG1.setVisible(true);
                break;
           case 2:
                panelGG2.setLayout(new BoxLayout(panelGG2, BoxLayout.LINE_AXIS));
                panelGG2.add(new PannelloLemtradaUI(2,id));
                panelGG2.setVisible(false);
                panelGG2.setVisible(true);
                break;
           case 3:
                panelGG3.setLayout(new BoxLayout(panelGG3, BoxLayout.LINE_AXIS));
                panelGG3.add(new PannelloLemtradaUI(3,id));
                panelGG3.setVisible(false);
                panelGG3.setVisible(true);
           case 4:
                panelGG4.setLayout(new BoxLayout(panelGG4, BoxLayout.LINE_AXIS));
                panelGG4.add(new PannelloLemtradaUI(4,id));
                panelGG4.setVisible(false);
                panelGG4.setVisible(true);
                break;
           case 5:
                panelGG5.setLayout(new BoxLayout(panelGG5, BoxLayout.LINE_AXIS));
                panelGG5.add(new PannelloLemtradaUI(5,id));
                panelGG5.setVisible(false);
                panelGG5.setVisible(true);
                break;        
       }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGG2 = new javax.swing.JPanel();
        panelGG3 = new javax.swing.JPanel();
        panelGG4 = new javax.swing.JPanel();
        panelGG5 = new javax.swing.JPanel();
        panelGG1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));

        panelGG2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG2.setOpaque(false);

        javax.swing.GroupLayout panelGG2Layout = new javax.swing.GroupLayout(panelGG2);
        panelGG2.setLayout(panelGG2Layout);
        panelGG2Layout.setHorizontalGroup(
            panelGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        panelGG2Layout.setVerticalGroup(
            panelGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        panelGG3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG3.setOpaque(false);

        javax.swing.GroupLayout panelGG3Layout = new javax.swing.GroupLayout(panelGG3);
        panelGG3.setLayout(panelGG3Layout);
        panelGG3Layout.setHorizontalGroup(
            panelGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGG3Layout.setVerticalGroup(
            panelGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        panelGG4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG4.setOpaque(false);

        javax.swing.GroupLayout panelGG4Layout = new javax.swing.GroupLayout(panelGG4);
        panelGG4.setLayout(panelGG4Layout);
        panelGG4Layout.setHorizontalGroup(
            panelGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGG4Layout.setVerticalGroup(
            panelGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        panelGG5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG5.setOpaque(false);

        javax.swing.GroupLayout panelGG5Layout = new javax.swing.GroupLayout(panelGG5);
        panelGG5.setLayout(panelGG5Layout);
        panelGG5Layout.setHorizontalGroup(
            panelGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGG5Layout.setVerticalGroup(
            panelGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        panelGG1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG1.setOpaque(false);

        javax.swing.GroupLayout panelGG1Layout = new javax.swing.GroupLayout(panelGG1);
        panelGG1.setLayout(panelGG1Layout);
        panelGG1Layout.setHorizontalGroup(
            panelGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGG1Layout.setVerticalGroup(
            panelGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("AGGIUNGI GIORNO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGG4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGG5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelGG2, panelGG3, panelGG4, panelGG5});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int reply=JOptionPane.showConfirmDialog(null, "Sei sicuro di voler inserire un nuovo giorno ??","CONFERMA NUOVO GIORNO",JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_OPTION)
        {
            giornoCorrente++;
            inserisciPannello(giornoCorrente, idLemtrada);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelGG1;
    private javax.swing.JPanel panelGG2;
    private javax.swing.JPanel panelGG3;
    private javax.swing.JPanel panelGG4;
    private javax.swing.JPanel panelGG5;
    // End of variables declaration//GEN-END:variables
}
