package gestionepazienti;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;


public class LemtradaUI extends javax.swing.JPanel {

     private PazienteUI parent;
    private int idStandardDH;
    private int numero=0;
    
    public LemtradaUI(PazienteUI p,int id) {
        initComponents();
        parent=p;
        idStandardDH=id;
        pannello.setLayout(new BoxLayout(pannello, BoxLayout.Y_AXIS));
        aggiornaDati(idStandardDH);
    }
    
    public void aggiornaDati(int id)
    {
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Lemtrada WHERE ID_Standard=?");
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                inserisciPannello(id,rs.getDate("Data_DC"));
                numero++;
            }
            num.setText(""+numero);
        } catch (SQLException ex) {
            Logger.getLogger(LemtradaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inserisciPannello(int id,Date data)
    {
        pannello.add(new PannelloLemtradaUI(id,data));
        aggiornaUI();
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
        jLabel1 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();

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

        jLabel1.setText("Numero giorni:");

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
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 623, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pannello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int reply=JOptionPane.showConfirmDialog(null, "Sei sicuro di vole inserire un nuovo giorno ?","CONFERMA AGGIUNTA",JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_OPTION)
        {
            pannello.add(new PannelloLemtradaUI(1, null));
            numero++;
            num.setText(""+numero);
            aggiornaUI();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField num;
    private javax.swing.JPanel pannello;
    // End of variables declaration//GEN-END:variables
}
