/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;


/**
 *
 * @author Utente
 */
public class TerapiaUI extends javax.swing.JFrame {
    private ArrayList<ElementiListaTerapieUI> list=new ArrayList<ElementiListaTerapieUI>();
    private Integer IDpaz;
    private ArrayList<String> listaNomiTerapie;
    private PazienteUI parent;
    private static String TITOLO="TERAPIE DI";
    
    /**
     * Creates new form Terapia
     */
    public TerapiaUI(int id,PazienteUI p) {
        initComponents();
        jLabel1.setText(TITOLO+" "+trovaPaziente(id).toUpperCase());
        pannello.setLayout(new BoxLayout(pannello, BoxLayout.Y_AXIS));
        list=new ArrayList<ElementiListaTerapieUI>();
        IDpaz=id;
        parent=p;
        listaNomiTerapie=new ArrayList<String>();
        listaNomiTerapie();
        aggiornaTerapie();
        this.setVisible(true);
        //ricercaTerapia();
        //enable(false);
    }
    private void listaNomiTerapie()
    {
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Nome FROM Terapia ORDER BY Nome ASC");
            while(rs.next())
            {
                listaNomiTerapie.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TerapiaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void aggiornaTerapie() 
    {
        pannello.removeAll();
        list.clear();
        
        ResultSet rs=GestioneDatabase.querySelect("SELECT * FROM Paziente_Terapia WHERE ID_Paziente="+IDpaz+" ORDER BY Data_Inizio DESC");
        try {
            while(rs.next())
            {
                Terapy t=new Terapy(rs.getDate("Data_Inizio"),rs.getDate("Data_Fine"),rs.getInt("ID_Paziente"),rs.getString("Terapia"));
                ElementiListaTerapieUI temp=new ElementiListaTerapieUI(this,listaNomiTerapie,t);
                pannello.add(temp);
                list.add(temp);
            }
            pannello.setVisible(false);
            pannello.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TerapiaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String trovaPaziente(int ID)
    {
        try {
            ResultSet rs= GestioneDatabase.querySelect("SELECT Nome,Cognome FROM Paziente WHERE ID="+ID);
            if(rs.next())
            {
                String stringa=rs.getString(1)+" "+rs.getString(2);
                return stringa;
            }
        }catch (SQLException ex) {
        }
        return "";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pannello = new javax.swing.JPanel();
        nuovaTerapia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestione Terapie");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Terapie:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pannello.setBackground(new java.awt.Color(108, 255, 167));
        pannello.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pannelloLayout = new javax.swing.GroupLayout(pannello);
        pannello.setLayout(pannelloLayout);
        pannelloLayout.setHorizontalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        pannelloLayout.setVerticalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pannello);

        nuovaTerapia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nuovaTerapia.setText("NUOVA TERAPIA");
        nuovaTerapia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuovaTerapiaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TERAPIE \"NOME PAZIENTE\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(nuovaTerapia)
                .addGap(328, 328, 328))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(nuovaTerapia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(140, 140, 140))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuovaTerapiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuovaTerapiaActionPerformed
        this.setEnabled(false);
        if(IDpaz==null)
            return;
         try {
            PreparedStatement pst;
            ResultSet rs=GestioneDatabase.querySelect("SELECT Data_Inizio,Data_Fine FROM Paziente_Terapia WHERE ID_Paziente="+IDpaz+" ORDER BY Data_Inizio DESC LIMIT 1");
            if(rs.next())
            {
                if(rs.getDate("Data_Fine")==null && JOptionPane.showConfirmDialog(null,"Vuoi terminare la terapia precedente?","TERMINA TERAPIA",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                {
                   pst=GestioneDatabase.preparedStatement("UPDATE Paziente_Terapia SET Data_Fine=? WHERE ID_Paziente=? AND Data_Inizio=?");
                   pst.setDate(1,new Date(Utilita.removeTime(new java.util.Date(System.currentTimeMillis())).getTime()));
                   pst.setInt(2, IDpaz);
                   pst.setString(3, rs.getNString("Data_Inizio"));
                   pst.executeUpdate();
                }
            }
            pst=GestioneDatabase.preparedStatement("INSERT INTO Paziente_Terapia(Data_Inizio,ID_Paziente,Terapia) VALUES(?,?,?)");
            pst.setDate(1, new Date(Utilita.removeTime(new java.util.Date(System.currentTimeMillis())).getTime()));
            pst.setInt(2,IDpaz);
            pst.setString(3,listaNomiTerapie.get(0));
            pst.executeUpdate();
            aggiornaTerapie();
        } catch (SQLException ex) {
            Utilita.mostraMessaggioErrore("C'è già una terapia con la data odierna");
        }
         this.setEnabled(true);
        
    }//GEN-LAST:event_nuovaTerapiaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(parent!=null)
        {
            if(IDpaz!=null)
            {
                parent.aggiornaTerapie(IDpaz);
            }
            parent.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuovaTerapia;
    private javax.swing.JPanel pannello;
    // End of variables declaration//GEN-END:variables
}
