package gestionepazienti;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PannelloLemtradaUI extends javax.swing.JPanel {

    private PazienteUI parent;
    private Date dataGiorno;
    private int idLemtrada;
    private double linfociti;
    
    public PannelloLemtradaUI(int id, Date data) {
        initComponents();
        idLemtrada=id;
        dataGiorno=data;
        aggiornaDatiLemtrada(idLemtrada,dataGiorno);
    }
    
    public void aggiornaDatiLemtrada(int id,Date data)
    {
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Lemtrada WHERE ID_Standard=? AND Data=?");
            pst.setInt(1,id);
            pst.setDate(2, Utilita.DateUtilToSQL(data));
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                diarioClinico.setText(rs.getString("Diario_Clinico"));
                dataDC.setDate(rs.getDate("Data_DC"));
                dataEsamEmato.setDate(rs.getDate("Data_Esami"));
                leucociti.setText(""+rs.getDouble("Leucociti"));
                piastrine.setText(""+rs.getDouble("Piastrine"));
                linfTot.setText(""+rs.getDouble("Linfociti_Totali"));
                linfoTPer.setText(""+rs.getDouble("Linfociti_T"));
                linfoT.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_T")));
                linfoHelperPer.setText(""+rs.getDouble("Linfociti_T_Helper"));
                linfoHelper.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_T_Helper")));
                linfoTCitoPer.setText(""+rs.getDouble("Linfociti_T_Citotossici"));
                linfoTCito.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_T_Citotossici")));
                linfoBPer.setText(""+rs.getDouble("Linfociti_B"));
                linfoB.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_B")));
                linfoNKPer.setText(""+rs.getDouble("Linfociti_NK"));
                linfoNK.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_NK")));
                esUrine.setText(rs.getString("Es_Urine"));
                urea.setText(rs.getString("Urea"));
                creatinina.setText(rs.getString("Creatinina"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PannelloLemtradaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Double calcoloLinfociti(double tot,double per)
    {
        return (tot*per)/100;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        diarioClinico = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        dataEsamEmato = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dataDC = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        esEmato = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        leucociti = new javax.swing.JTextField();
        piastrine = new javax.swing.JTextField();
        linfTot = new javax.swing.JTextField();
        linfoTPer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        linfoHelperPer = new javax.swing.JTextField();
        linfoT = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        linfoHelper = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        linfoTCitoPer = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        linfoTCito = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        linfoBPer = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        linfoB = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        linfoNKPer = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        linfoNK = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        esUrine = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        urea = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        creatinina = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(877, 146));

        diarioClinico.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinico.setColumns(20);
        diarioClinico.setRows(5);
        jScrollPane1.setViewportView(diarioClinico);

        jPanel4.setBackground(java.awt.Color.blue);

        dataEsamEmato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmatoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Esami ematochimici:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(dataEsamEmato, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7))
        );

        jPanel3.setBackground(java.awt.Color.blue);

        dataDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDCActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Diario Clinico:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(dataDC, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
        );

        jScrollPane2.setPreferredSize(new java.awt.Dimension(390, 96));

        esEmato.setBackground(new java.awt.Color(149, 238, 234));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Leucociti:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Piastrine");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Linfociti totali:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Linfociti T:");

        jLabel5.setText("x10^9/L");

        jLabel16.setText("x10^9/L");

        jLabel17.setText("%");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Linfociti T helper:");

        linfoT.setEnabled(false);

        jLabel20.setText("x10^9/L");

        jLabel21.setText("%");

        linfoHelper.setEnabled(false);

        jLabel23.setText("x10^9/L");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Linfociti T citotossici:");

        jLabel25.setText("%");

        linfoTCito.setEnabled(false);

        jLabel27.setText("x10^9/L");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Linfociti B:");

        jLabel28.setText("%");

        linfoB.setEnabled(false);

        jLabel29.setText("x10^9/L");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setText("Linfociti NK:");

        jLabel31.setText("%");

        linfoNK.setEnabled(false);

        jLabel32.setText("x10^9/L");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("Es. Urine:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel34.setText("Urea:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("Creatinina:");

        javax.swing.GroupLayout esEmatoLayout = new javax.swing.GroupLayout(esEmato);
        esEmato.setLayout(esEmatoLayout);
        esEmatoLayout.setHorizontalGroup(
            esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(esEmatoLayout.createSequentialGroup()
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esUrine)
                            .addGroup(esEmatoLayout.createSequentialGroup()
                                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(esEmatoLayout.createSequentialGroup()
                                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(linfoHelperPer, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(linfoTCitoPer)
                                            .addComponent(linfoBPer)
                                            .addComponent(linfoNKPer))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel31)))
                                    .addComponent(urea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creatinina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(esEmatoLayout.createSequentialGroup()
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leucociti, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(piastrine, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfTot, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfoTPer, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linfoTCito)
                    .addComponent(linfoHelper, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linfoT, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(linfoB)
                    .addComponent(linfoNK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        esEmatoLayout.setVerticalGroup(
            esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(leucociti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(piastrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(linfTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(linfoTPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(linfoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoHelperPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(linfoHelper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoTCitoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(linfoTCito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoBPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(linfoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoNKPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(linfoNK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esUrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatinina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(esEmato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dataEsamEmatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmatoActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Data_Esami=? WHERE ID_Standard=? AND Data=?");
            Date d=dataEsamEmato.getDate();
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEsamEmatoActionPerformed

    private void dataDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDCActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Data_DC=? WHERE ID_Standard=? AND Data=?");
            Date d=dataDC.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataDCActionPerformed


    private void leucocitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leucocitiActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Leucociti=? WHERE ID_Standard=? AND Data=");
            pst.setDouble(1,Double.parseDouble(leucociti.getText()));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leucocitiActionPerformed

    private void piastrineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piastrineActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Piatrine=? WHERE ID_Standard=? AND Data=");
            pst.setDouble(1,Double.parseDouble(piastrine.getText()));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_piastrineActionPerformed

    private void linfTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linfTotActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_Totali=? WHERE ID_Standard=? AND Data=");
            linfociti=Double.parseDouble(linfTot.getText());
            pst.setDouble(1,linfociti);
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            //linfoT.setText(""+calcoloLinfociti(linfociti, rs.getDouble("Linfociti_T")));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfTotActionPerformed

    private void linfoTPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linfoTPerActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_T=? WHERE ID_Standard=? AND Data=");
            pst.setDouble(1,Double.parseDouble(linfoTPer.getText()));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            linfoT.setText(""+calcoloLinfociti(linfociti,Double.parseDouble(linfoTPer.getText())));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoTPerActionPerformed

    private void linfoHelperPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linfoHelperPerActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_T_Helper=? WHERE ID_Standard=? AND Data=");
            pst.setDouble(1,Double.parseDouble(linfoHelperPer.getText()));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            linfoHelper.setText(""+calcoloLinfociti(linfociti,Double.parseDouble(linfoHelperPer.getText())));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoHelperPerActionPerformed

    private void linfoTCitoPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linfoTCitoPerActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_T_Citotossici=? WHERE ID_Standard=? AND Data=");
            pst.setDouble(1,Double.parseDouble(linfoTCitoPer.getText()));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            linfoTCito.setText(""+calcoloLinfociti(linfociti,Double.parseDouble(linfoTCitoPer.getText())));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoTCitoPerActionPerformed

    private void linfoBPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linfoBPerActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_B=? WHERE ID_Standard=? AND Data=");
            pst.setDouble(1,Double.parseDouble(linfoBPer.getText()));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            linfoB.setText(""+calcoloLinfociti(linfociti,Double.parseDouble(linfoBPer.getText())));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoBPerActionPerformed

    private void linfoNKPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linfoNKPerActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_NK=? WHERE ID_Standard=? AND Data=");
            pst.setDouble(1,Double.parseDouble(linfoNKPer.getText()));
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            linfoNK.setText(""+calcoloLinfociti(linfociti,Double.parseDouble(linfoNKPer.getText())));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoNKPerActionPerformed

    private void esUrineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esUrineActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Es_Urine=? WHERE ID_Standard=? AND Data=");
            pst.setString(1,esUrine.getText());
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esUrineActionPerformed

    private void ureaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureaActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Urea=? WHERE ID_Standard=? AND Data=");
            pst.setString(1,urea.getText());
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ureaActionPerformed

    private void creatininaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creatininaActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Creatinina=? WHERE ID_Standard=? AND Data=");
            pst.setString(1,creatinina.getText());
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_creatininaActionPerformed

     private void diarioClinicoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Diario_Clinico=? WHERE ID_Standard=? AND Data=");
            pst.setString(1,diarioClinico.getText());
            pst.setInt(2, idLemtrada);
            pst.setDate(3, Utilita.DateUtilToSQL(dataGiorno));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField creatinina;
    private org.jdesktop.swingx.JXDatePicker dataDC;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato;
    private javax.swing.JTextArea diarioClinico;
    private javax.swing.JPanel esEmato;
    private javax.swing.JTextField esUrine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField leucociti;
    private javax.swing.JTextField linfTot;
    private javax.swing.JTextField linfoB;
    private javax.swing.JTextField linfoBPer;
    private javax.swing.JTextField linfoHelper;
    private javax.swing.JTextField linfoHelperPer;
    private javax.swing.JTextField linfoNK;
    private javax.swing.JTextField linfoNKPer;
    private javax.swing.JTextField linfoT;
    private javax.swing.JTextField linfoTCito;
    private javax.swing.JTextField linfoTCitoPer;
    private javax.swing.JTextField linfoTPer;
    private javax.swing.JTextField piastrine;
    private javax.swing.JTextField urea;
    // End of variables declaration//GEN-END:variables
}
