package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LemtradaUI extends javax.swing.JPanel {

    private PazienteUI parent;
   
    public LemtradaUI(PazienteUI p,int id) {
        initComponents();
        parent=p;
    }

   public void aggiornaDatiLemtrada(int id)
    {
         try {
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
               leucociti.setText(""+rs.getInt("Leucociti"));
               pioschine.setText(""+rs.getInt("Pioschine"));
               linfTot.setText(""+rs.getInt("Linfociti_Totali"));
               linfoTPer.setText(""+rs.getInt("Linfociti_Totali"));
               linfoHelperPer.setText(""+rs.getInt("Linfociti_T_Helper"));
               linfoTCitoPer.setText(""+rs.getInt("Linfociti_T_Citotossici"));
               linfoBPer.setText(""+rs.getInt("Linfociti_B"));
               linfoNKPer.setText(""+rs.getInt("Linfociti_NK"));
               esUrine.setText(""+rs.getInt("Es_Urine"));
               urea.setText(""+rs.getInt("Urea"));
               creatinina.setText(""+rs.getInt("Creatinina"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGG1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dataDC1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dataEsamEmato1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diarioClinicoGG1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        esEmatoGG1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        leucociti = new javax.swing.JTextField();
        pioschine = new javax.swing.JTextField();
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
        panelGG2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        dataDC2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        dataEsamEmato2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        diarioClinicoGG2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        esEmatoGG2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        leucociti1 = new javax.swing.JTextField();
        pioschine1 = new javax.swing.JTextField();
        linfTot1 = new javax.swing.JTextField();
        linfoTPer1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        linfoHelperPer1 = new javax.swing.JTextField();
        linfoT1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        linfoHelper1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        linfoTCitoPer1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        linfoTCito1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        linfoBPer1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        linfoB1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        linfoNKPer1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        linfoNK1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        esUrine1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        urea1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        creatinina1 = new javax.swing.JTextField();
        panelGG3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        dataDC3 = new org.jdesktop.swingx.JXDatePicker();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        dataEsamEmato3 = new org.jdesktop.swingx.JXDatePicker();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        esEmatoGG3 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        leucociti2 = new javax.swing.JTextField();
        pioschine2 = new javax.swing.JTextField();
        linfTot2 = new javax.swing.JTextField();
        linfoTPer2 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        linfoHelperPer2 = new javax.swing.JTextField();
        linfoT2 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        linfoHelper2 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        linfoTCitoPer2 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        linfoTCito2 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        linfoBPer2 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        linfoB2 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        linfoNKPer2 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        linfoNK2 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        esUrine2 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        urea2 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        creatinina2 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        diarioClinicoGG3 = new javax.swing.JTextArea();
        panelGG4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        dataDC4 = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        dataEsamEmato4 = new org.jdesktop.swingx.JXDatePicker();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        diarioClinicoGG4 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        esEmatoGG4 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        leucociti3 = new javax.swing.JTextField();
        pioschine3 = new javax.swing.JTextField();
        linfTot3 = new javax.swing.JTextField();
        linfoTPer3 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        linfoHelperPer3 = new javax.swing.JTextField();
        linfoT3 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        linfoHelper3 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        linfoTCitoPer3 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        linfoTCito3 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        linfoBPer3 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        linfoB3 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        linfoNKPer3 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        linfoNK3 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        esUrine3 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        urea3 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        creatinina3 = new javax.swing.JTextField();
        panelGG5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        dataDC5 = new org.jdesktop.swingx.JXDatePicker();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        dataEsamEmato5 = new org.jdesktop.swingx.JXDatePicker();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        diarioClinicoGG5 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        esEmatoGG5 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        leucociti4 = new javax.swing.JTextField();
        pioschine4 = new javax.swing.JTextField();
        linfTot4 = new javax.swing.JTextField();
        linfoTPer4 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        linfoHelperPer4 = new javax.swing.JTextField();
        linfoT4 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        linfoHelper4 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        linfoTCitoPer4 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        linfoTCito4 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        linfoBPer4 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        linfoB4 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        linfoNKPer4 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        linfoNK4 = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        esUrine4 = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        urea4 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        creatinina4 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 153));

        panelGG1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG1.setOpaque(false);

        jPanel3.setBackground(java.awt.Color.blue);

        dataDC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDC1ActionPerformed(evt);
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
                .addComponent(dataDC1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataDC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
        );

        jPanel4.setBackground(java.awt.Color.blue);

        dataEsamEmato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmato1ActionPerformed(evt);
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
                .addComponent(dataEsamEmato1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7))
        );

        diarioClinicoGG1.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinicoGG1.setColumns(20);
        diarioClinicoGG1.setRows(5);
        jScrollPane1.setViewportView(diarioClinicoGG1);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(390, 96));

        esEmatoGG1.setBackground(new java.awt.Color(149, 238, 234));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Leucociti:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Pioschine:");

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

        javax.swing.GroupLayout esEmatoGG1Layout = new javax.swing.GroupLayout(esEmatoGG1);
        esEmatoGG1.setLayout(esEmatoGG1Layout);
        esEmatoGG1Layout.setHorizontalGroup(
            esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(esEmatoGG1Layout.createSequentialGroup()
                        .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esUrine)
                            .addGroup(esEmatoGG1Layout.createSequentialGroup()
                                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(esEmatoGG1Layout.createSequentialGroup()
                                        .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(linfoHelperPer, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(linfoTCitoPer)
                                            .addComponent(linfoBPer)
                                            .addComponent(linfoNKPer))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel31)))
                                    .addComponent(urea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creatinina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(esEmatoGG1Layout.createSequentialGroup()
                        .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leucociti, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(pioschine, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfTot, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfoTPer, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linfoTCito)
                    .addComponent(linfoHelper, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linfoT, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(linfoB)
                    .addComponent(linfoNK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        esEmatoGG1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {linfoHelperPer, linfoT});

        esEmatoGG1Layout.setVerticalGroup(
            esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(leucociti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pioschine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(linfTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(linfoTPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(linfoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoHelperPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(linfoHelper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoTCitoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(linfoTCito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoBPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(linfoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoNKPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(linfoNK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esUrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatinina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(esEmatoGG1);

        javax.swing.GroupLayout panelGG1Layout = new javax.swing.GroupLayout(panelGG1);
        panelGG1.setLayout(panelGG1Layout);
        panelGG1Layout.setHorizontalGroup(
            panelGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG1Layout.createSequentialGroup()
                .addGroup(panelGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelGG1Layout.setVerticalGroup(
            panelGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG1Layout.createSequentialGroup()
                .addGroup(panelGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelGG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(117, 117, 117))
        );

        panelGG1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel3, jPanel4});

        panelGG2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG2.setOpaque(false);

        jPanel5.setBackground(java.awt.Color.blue);

        dataDC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDC2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("Diario Clinico:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(dataDC2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataDC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8))
        );

        jPanel6.setBackground(java.awt.Color.blue);

        dataEsamEmato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmato2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("Esami ematochimici:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addComponent(dataEsamEmato2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9))
        );

        diarioClinicoGG2.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinicoGG2.setColumns(20);
        diarioClinicoGG2.setRows(5);
        jScrollPane3.setViewportView(diarioClinicoGG2);

        jScrollPane4.setPreferredSize(new java.awt.Dimension(390, 96));

        esEmatoGG2.setBackground(new java.awt.Color(149, 238, 234));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Leucociti:");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Pioschine:");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setText("Linfociti totali:");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setText("Linfociti T:");

        jLabel38.setText("x10^9/L");

        jLabel39.setText("x10^9/L");

        jLabel40.setText("%");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel41.setText("Linfociti T helper:");

        jLabel42.setText("x10^9/L");

        jLabel43.setText("%");

        jLabel44.setText("x10^9/L");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel45.setText("Linfociti T citotossici:");

        jLabel46.setText("%");

        jLabel47.setText("x10^9/L");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel48.setText("Linfociti B:");

        jLabel49.setText("%");

        jLabel50.setText("x10^9/L");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel51.setText("Linfociti NK:");

        jLabel52.setText("%");

        jLabel53.setText("x10^9/L");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel54.setText("Es. Urine:");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel55.setText("Urea:");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel56.setText("Creatinina:");

        javax.swing.GroupLayout esEmatoGG2Layout = new javax.swing.GroupLayout(esEmatoGG2);
        esEmatoGG2.setLayout(esEmatoGG2Layout);
        esEmatoGG2Layout.setHorizontalGroup(
            esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(esEmatoGG2Layout.createSequentialGroup()
                        .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel45)
                            .addComponent(jLabel48)
                            .addComponent(jLabel51)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56))
                        .addGap(18, 18, 18)
                        .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esUrine1)
                            .addGroup(esEmatoGG2Layout.createSequentialGroup()
                                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(esEmatoGG2Layout.createSequentialGroup()
                                        .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(linfoHelperPer1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(linfoTCitoPer1)
                                            .addComponent(linfoBPer1)
                                            .addComponent(linfoNKPer1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel49)
                                            .addComponent(jLabel52)))
                                    .addComponent(urea1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creatinina1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(esEmatoGG2Layout.createSequentialGroup()
                        .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel37))
                        .addGap(61, 61, 61)
                        .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leucociti1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(pioschine1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfTot1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfoTPer1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linfoTCito1)
                    .addComponent(linfoHelper1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linfoT1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(linfoB1)
                    .addComponent(linfoNK1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        esEmatoGG2Layout.setVerticalGroup(
            esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(leucociti1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(pioschine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(linfTot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(linfoTPer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(linfoT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoHelperPer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel43)
                    .addComponent(linfoHelper1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoTCitoPer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(linfoTCito1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoBPer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(linfoB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoNKPer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(linfoNK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esUrine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatinina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(esEmatoGG2);

        javax.swing.GroupLayout panelGG2Layout = new javax.swing.GroupLayout(panelGG2);
        panelGG2.setLayout(panelGG2Layout);
        panelGG2Layout.setHorizontalGroup(
            panelGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG2Layout.createSequentialGroup()
                .addGroup(panelGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelGG2Layout.setVerticalGroup(
            panelGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG2Layout.createSequentialGroup()
                .addGroup(panelGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelGG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGG3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG3.setOpaque(false);

        jPanel7.setBackground(java.awt.Color.blue);

        dataDC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDC3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("Diario Clinico:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addComponent(dataDC3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataDC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(java.awt.Color.blue);

        dataEsamEmato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmato3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setText("Esami ematochimici:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(dataEsamEmato3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11))
        );

        jScrollPane6.setPreferredSize(new java.awt.Dimension(390, 96));

        esEmatoGG3.setBackground(new java.awt.Color(149, 238, 234));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel57.setText("Leucociti:");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel58.setText("Pioschine:");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel59.setText("Linfociti totali:");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel60.setText("Linfociti T:");

        jLabel61.setText("x10^9/L");

        jLabel62.setText("x10^9/L");

        jLabel63.setText("%");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel64.setText("Linfociti T helper:");

        jLabel65.setText("x10^9/L");

        jLabel66.setText("%");

        jLabel67.setText("x10^9/L");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel68.setText("Linfociti T citotossici:");

        jLabel69.setText("%");

        jLabel70.setText("x10^9/L");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel71.setText("Linfociti B:");

        jLabel72.setText("%");

        jLabel73.setText("x10^9/L");

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel74.setText("Linfociti NK:");

        jLabel75.setText("%");

        jLabel76.setText("x10^9/L");

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel77.setText("Es. Urine:");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel78.setText("Urea:");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel79.setText("Creatinina:");

        javax.swing.GroupLayout esEmatoGG3Layout = new javax.swing.GroupLayout(esEmatoGG3);
        esEmatoGG3.setLayout(esEmatoGG3Layout);
        esEmatoGG3Layout.setHorizontalGroup(
            esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(esEmatoGG3Layout.createSequentialGroup()
                        .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel68)
                            .addComponent(jLabel71)
                            .addComponent(jLabel74)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79))
                        .addGap(18, 18, 18)
                        .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esUrine2)
                            .addGroup(esEmatoGG3Layout.createSequentialGroup()
                                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(esEmatoGG3Layout.createSequentialGroup()
                                        .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(linfoHelperPer2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(linfoTCitoPer2)
                                            .addComponent(linfoBPer2)
                                            .addComponent(linfoNKPer2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel66)
                                            .addComponent(jLabel69)
                                            .addComponent(jLabel72)
                                            .addComponent(jLabel75)))
                                    .addComponent(urea2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creatinina2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(esEmatoGG3Layout.createSequentialGroup()
                        .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel60))
                        .addGap(61, 61, 61)
                        .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leucociti2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(pioschine2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfTot2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfoTPer2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linfoTCito2)
                    .addComponent(linfoHelper2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linfoT2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(linfoB2)
                    .addComponent(linfoNK2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        esEmatoGG3Layout.setVerticalGroup(
            esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(leucociti2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(pioschine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(linfTot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(linfoTPer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(linfoT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoHelperPer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel66)
                    .addComponent(linfoHelper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoTCitoPer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(linfoTCito2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoBPer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(linfoB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoNKPer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75)
                    .addComponent(linfoNK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esUrine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatinina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(esEmatoGG3);

        diarioClinicoGG3.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinicoGG3.setColumns(20);
        diarioClinicoGG3.setRows(5);
        jScrollPane5.setViewportView(diarioClinicoGG3);

        javax.swing.GroupLayout panelGG3Layout = new javax.swing.GroupLayout(panelGG3);
        panelGG3.setLayout(panelGG3Layout);
        panelGG3Layout.setHorizontalGroup(
            panelGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG3Layout.createSequentialGroup()
                .addGroup(panelGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(18, 18, 18)
                .addGroup(panelGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        panelGG3Layout.setVerticalGroup(
            panelGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG3Layout.createSequentialGroup()
                .addGroup(panelGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(panelGG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGG4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG4.setOpaque(false);

        jPanel9.setBackground(java.awt.Color.blue);

        dataDC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDC4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.red);
        jLabel12.setText("Diario Clinico:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addComponent(dataDC4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataDC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12))
        );

        jPanel10.setBackground(java.awt.Color.blue);

        dataEsamEmato4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmato4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("Esami ematochimici:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addComponent(dataEsamEmato4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel13))
        );

        diarioClinicoGG4.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinicoGG4.setColumns(20);
        diarioClinicoGG4.setRows(5);
        jScrollPane7.setViewportView(diarioClinicoGG4);

        jScrollPane8.setPreferredSize(new java.awt.Dimension(390, 96));

        esEmatoGG4.setBackground(new java.awt.Color(149, 238, 234));

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel80.setText("Leucociti:");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel81.setText("Pioschine:");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel82.setText("Linfociti totali:");

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel83.setText("Linfociti T:");

        jLabel84.setText("x10^9/L");

        jLabel85.setText("x10^9/L");

        jLabel86.setText("%");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel87.setText("Linfociti T helper:");

        jLabel88.setText("x10^9/L");

        jLabel89.setText("%");

        jLabel90.setText("x10^9/L");

        jLabel91.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel91.setText("Linfociti T citotossici:");

        jLabel92.setText("%");

        jLabel93.setText("x10^9/L");

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel94.setText("Linfociti B:");

        jLabel95.setText("%");

        jLabel96.setText("x10^9/L");

        jLabel97.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel97.setText("Linfociti NK:");

        jLabel98.setText("%");

        jLabel99.setText("x10^9/L");

        jLabel100.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel100.setText("Es. Urine:");

        jLabel101.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel101.setText("Urea:");

        jLabel102.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel102.setText("Creatinina:");

        javax.swing.GroupLayout esEmatoGG4Layout = new javax.swing.GroupLayout(esEmatoGG4);
        esEmatoGG4.setLayout(esEmatoGG4Layout);
        esEmatoGG4Layout.setHorizontalGroup(
            esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(esEmatoGG4Layout.createSequentialGroup()
                        .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87)
                            .addComponent(jLabel91)
                            .addComponent(jLabel94)
                            .addComponent(jLabel97)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102))
                        .addGap(18, 18, 18)
                        .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esUrine3)
                            .addGroup(esEmatoGG4Layout.createSequentialGroup()
                                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(esEmatoGG4Layout.createSequentialGroup()
                                        .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(linfoHelperPer3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(linfoTCitoPer3)
                                            .addComponent(linfoBPer3)
                                            .addComponent(linfoNKPer3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel89)
                                            .addComponent(jLabel92)
                                            .addComponent(jLabel95)
                                            .addComponent(jLabel98)))
                                    .addComponent(urea3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creatinina3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(esEmatoGG4Layout.createSequentialGroup()
                        .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81)
                            .addComponent(jLabel83))
                        .addGap(58, 58, 58)
                        .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leucociti3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(pioschine3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfTot3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfoTPer3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85)
                            .addComponent(jLabel86))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linfoTCito3)
                    .addComponent(linfoHelper3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linfoT3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(linfoB3)
                    .addComponent(linfoNK3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88)
                    .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        esEmatoGG4Layout.setVerticalGroup(
            esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(leucociti3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(pioschine3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(linfTot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(linfoTPer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(linfoT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoHelperPer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel89)
                    .addComponent(linfoHelper3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoTCitoPer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(jLabel92)
                    .addComponent(linfoTCito3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoBPer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94)
                    .addComponent(jLabel95)
                    .addComponent(linfoB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoNKPer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(linfoNK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esUrine3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatinina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane8.setViewportView(esEmatoGG4);

        javax.swing.GroupLayout panelGG4Layout = new javax.swing.GroupLayout(panelGG4);
        panelGG4.setLayout(panelGG4Layout);
        panelGG4Layout.setHorizontalGroup(
            panelGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG4Layout.createSequentialGroup()
                .addGroup(panelGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addGap(18, 18, 18)
                .addGroup(panelGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelGG4Layout.setVerticalGroup(
            panelGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG4Layout.createSequentialGroup()
                .addGroup(panelGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelGG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelGG5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGG5.setOpaque(false);

        jPanel11.setBackground(java.awt.Color.blue);

        dataDC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDC5ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setText("Diario Clinico:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addComponent(dataDC5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataDC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14))
        );

        jPanel12.setBackground(java.awt.Color.blue);

        dataEsamEmato5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmato5ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.red);
        jLabel15.setText("Esami ematochimici:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(28, 28, 28)
                .addComponent(dataEsamEmato5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15))
        );

        diarioClinicoGG5.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinicoGG5.setColumns(20);
        diarioClinicoGG5.setRows(5);
        jScrollPane9.setViewportView(diarioClinicoGG5);

        jScrollPane10.setPreferredSize(new java.awt.Dimension(390, 96));

        esEmatoGG5.setBackground(new java.awt.Color(149, 238, 234));

        jLabel103.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel103.setText("Leucociti:");

        jLabel104.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel104.setText("Pioschine:");

        jLabel105.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel105.setText("Linfociti totali:");

        jLabel106.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel106.setText("Linfociti T:");

        jLabel107.setText("x10^9/L");

        jLabel108.setText("x10^9/L");

        jLabel109.setText("%");

        jLabel110.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel110.setText("Linfociti T helper:");

        jLabel111.setText("x10^9/L");

        jLabel112.setText("%");

        jLabel113.setText("x10^9/L");

        jLabel114.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel114.setText("Linfociti T citotossici:");

        jLabel115.setText("%");

        jLabel116.setText("x10^9/L");

        jLabel117.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel117.setText("Linfociti B:");

        jLabel118.setText("%");

        jLabel119.setText("x10^9/L");

        jLabel120.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel120.setText("Linfociti NK:");

        jLabel121.setText("%");

        jLabel122.setText("x10^9/L");

        jLabel123.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel123.setText("Es. Urine:");

        jLabel124.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel124.setText("Urea:");

        jLabel125.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel125.setText("Creatinina:");

        javax.swing.GroupLayout esEmatoGG5Layout = new javax.swing.GroupLayout(esEmatoGG5);
        esEmatoGG5.setLayout(esEmatoGG5Layout);
        esEmatoGG5Layout.setHorizontalGroup(
            esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(esEmatoGG5Layout.createSequentialGroup()
                        .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addComponent(jLabel114)
                            .addComponent(jLabel117)
                            .addComponent(jLabel120)
                            .addComponent(jLabel123)
                            .addComponent(jLabel124)
                            .addComponent(jLabel125))
                        .addGap(18, 18, 18)
                        .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esUrine4)
                            .addGroup(esEmatoGG5Layout.createSequentialGroup()
                                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(esEmatoGG5Layout.createSequentialGroup()
                                        .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(linfoHelperPer4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(linfoTCitoPer4)
                                            .addComponent(linfoBPer4)
                                            .addComponent(linfoNKPer4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel112)
                                            .addComponent(jLabel115)
                                            .addComponent(jLabel118)
                                            .addComponent(jLabel121)))
                                    .addComponent(urea4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creatinina4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(esEmatoGG5Layout.createSequentialGroup()
                        .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jLabel103)
                            .addComponent(jLabel104)
                            .addComponent(jLabel106))
                        .addGap(58, 58, 58)
                        .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leucociti4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(pioschine4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfTot4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfoTPer4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107)
                            .addComponent(jLabel108)
                            .addComponent(jLabel109))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linfoTCito4)
                    .addComponent(linfoHelper4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linfoT4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(linfoB4)
                    .addComponent(linfoNK4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111)
                    .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        esEmatoGG5Layout.setVerticalGroup(
            esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoGG5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(leucociti4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(pioschine4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(linfTot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(linfoTPer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109)
                    .addComponent(linfoT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoHelperPer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110)
                    .addComponent(jLabel112)
                    .addComponent(linfoHelper4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoTCitoPer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114)
                    .addComponent(jLabel115)
                    .addComponent(linfoTCito4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoBPer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118)
                    .addComponent(linfoB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoNKPer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120)
                    .addComponent(jLabel121)
                    .addComponent(linfoNK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esUrine4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urea4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel124))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatinina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane10.setViewportView(esEmatoGG5);

        javax.swing.GroupLayout panelGG5Layout = new javax.swing.GroupLayout(panelGG5);
        panelGG5.setLayout(panelGG5Layout);
        panelGG5Layout.setHorizontalGroup(
            panelGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG5Layout.createSequentialGroup()
                .addGroup(panelGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelGG5Layout.setVerticalGroup(
            panelGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGG5Layout.createSequentialGroup()
                .addGroup(panelGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelGG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGG4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGG5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGG1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGG2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGG3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGG4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGG5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelGG1, panelGG2, panelGG3, panelGG4, panelGG5});

    }// </editor-fold>//GEN-END:initComponents

    private void dataDC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDC1ActionPerformed
       /* try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Data_Esami_Ematochimici=? WHERE ID_Controllo=?");
            Date d=dataEsamEmato.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_dataDC1ActionPerformed

    private void dataEsamEmato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEsamEmato1ActionPerformed

    private void dataDC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDC2ActionPerformed

    private void dataEsamEmato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmato2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEsamEmato2ActionPerformed

    private void dataDC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDC3ActionPerformed

    private void dataEsamEmato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmato3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEsamEmato3ActionPerformed

    private void dataDC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDC4ActionPerformed

    private void dataEsamEmato4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmato4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEsamEmato4ActionPerformed

    private void dataDC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDC5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDC5ActionPerformed

    private void dataEsamEmato5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmato5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEsamEmato5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField creatinina;
    private javax.swing.JTextField creatinina1;
    private javax.swing.JTextField creatinina2;
    private javax.swing.JTextField creatinina3;
    private javax.swing.JTextField creatinina4;
    private org.jdesktop.swingx.JXDatePicker dataDC1;
    private org.jdesktop.swingx.JXDatePicker dataDC2;
    private org.jdesktop.swingx.JXDatePicker dataDC3;
    private org.jdesktop.swingx.JXDatePicker dataDC4;
    private org.jdesktop.swingx.JXDatePicker dataDC5;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato1;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato2;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato3;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato4;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato5;
    private javax.swing.JTextArea diarioClinicoGG1;
    private javax.swing.JTextArea diarioClinicoGG2;
    private javax.swing.JTextArea diarioClinicoGG3;
    private javax.swing.JTextArea diarioClinicoGG4;
    private javax.swing.JTextArea diarioClinicoGG5;
    private javax.swing.JPanel esEmatoGG1;
    private javax.swing.JPanel esEmatoGG2;
    private javax.swing.JPanel esEmatoGG3;
    private javax.swing.JPanel esEmatoGG4;
    private javax.swing.JPanel esEmatoGG5;
    private javax.swing.JTextField esUrine;
    private javax.swing.JTextField esUrine1;
    private javax.swing.JTextField esUrine2;
    private javax.swing.JTextField esUrine3;
    private javax.swing.JTextField esUrine4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField leucociti;
    private javax.swing.JTextField leucociti1;
    private javax.swing.JTextField leucociti2;
    private javax.swing.JTextField leucociti3;
    private javax.swing.JTextField leucociti4;
    private javax.swing.JTextField linfTot;
    private javax.swing.JTextField linfTot1;
    private javax.swing.JTextField linfTot2;
    private javax.swing.JTextField linfTot3;
    private javax.swing.JTextField linfTot4;
    private javax.swing.JTextField linfoB;
    private javax.swing.JTextField linfoB1;
    private javax.swing.JTextField linfoB2;
    private javax.swing.JTextField linfoB3;
    private javax.swing.JTextField linfoB4;
    private javax.swing.JTextField linfoBPer;
    private javax.swing.JTextField linfoBPer1;
    private javax.swing.JTextField linfoBPer2;
    private javax.swing.JTextField linfoBPer3;
    private javax.swing.JTextField linfoBPer4;
    private javax.swing.JTextField linfoHelper;
    private javax.swing.JTextField linfoHelper1;
    private javax.swing.JTextField linfoHelper2;
    private javax.swing.JTextField linfoHelper3;
    private javax.swing.JTextField linfoHelper4;
    private javax.swing.JTextField linfoHelperPer;
    private javax.swing.JTextField linfoHelperPer1;
    private javax.swing.JTextField linfoHelperPer2;
    private javax.swing.JTextField linfoHelperPer3;
    private javax.swing.JTextField linfoHelperPer4;
    private javax.swing.JTextField linfoNK;
    private javax.swing.JTextField linfoNK1;
    private javax.swing.JTextField linfoNK2;
    private javax.swing.JTextField linfoNK3;
    private javax.swing.JTextField linfoNK4;
    private javax.swing.JTextField linfoNKPer;
    private javax.swing.JTextField linfoNKPer1;
    private javax.swing.JTextField linfoNKPer2;
    private javax.swing.JTextField linfoNKPer3;
    private javax.swing.JTextField linfoNKPer4;
    private javax.swing.JTextField linfoT;
    private javax.swing.JTextField linfoT1;
    private javax.swing.JTextField linfoT2;
    private javax.swing.JTextField linfoT3;
    private javax.swing.JTextField linfoT4;
    private javax.swing.JTextField linfoTCito;
    private javax.swing.JTextField linfoTCito1;
    private javax.swing.JTextField linfoTCito2;
    private javax.swing.JTextField linfoTCito3;
    private javax.swing.JTextField linfoTCito4;
    private javax.swing.JTextField linfoTCitoPer;
    private javax.swing.JTextField linfoTCitoPer1;
    private javax.swing.JTextField linfoTCitoPer2;
    private javax.swing.JTextField linfoTCitoPer3;
    private javax.swing.JTextField linfoTCitoPer4;
    private javax.swing.JTextField linfoTPer;
    private javax.swing.JTextField linfoTPer1;
    private javax.swing.JTextField linfoTPer2;
    private javax.swing.JTextField linfoTPer3;
    private javax.swing.JTextField linfoTPer4;
    private javax.swing.JPanel panelGG1;
    private javax.swing.JPanel panelGG2;
    private javax.swing.JPanel panelGG3;
    private javax.swing.JPanel panelGG4;
    private javax.swing.JPanel panelGG5;
    private javax.swing.JTextField pioschine;
    private javax.swing.JTextField pioschine1;
    private javax.swing.JTextField pioschine2;
    private javax.swing.JTextField pioschine3;
    private javax.swing.JTextField pioschine4;
    private javax.swing.JTextField urea;
    private javax.swing.JTextField urea1;
    private javax.swing.JTextField urea2;
    private javax.swing.JTextField urea3;
    private javax.swing.JTextField urea4;
    // End of variables declaration//GEN-END:variables
}
