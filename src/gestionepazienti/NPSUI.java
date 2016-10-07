/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Utente
 */
public class NPSUI extends javax.swing.JPanel {

    public int idNPS;
    public PazienteUI parent;
    
    public NPSUI(PazienteUI p, int id) {
        initComponents();
        idNPS=id;
        parent=p;
        aggiornaDatiNPS(idNPS);
    }

    public void aggiornaDatiNPS(int id)
    {
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM ValutazioneNPS WHERE ID_NPS=?");
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
               scolarita.setText(rs.getString("Scolarita"));
               data.setDate(rs.getDate("Data"));
               //buttonGroup1.setSelected("button"+rs.getInt("Tipo"), true);
               esiti.setText(rs.getString("Esiti"));
               elemClinici.setText(rs.getString("ElementiClinici"));
               BRB.setSelected(rs.getBoolean("BRB-NT"));
               DKEFS.setSelected(rs.getBoolean("D-KEFS"));
               BICAMS.setSelected(rs.getBoolean("BICAMS"));
               altroCombo.setSelected(rs.getBoolean("ALTRO"));
               msnqCombo.setSelected(rs.getBoolean("MSNQ_C"));
               DKEFS.setSelected(rs.getBoolean("D-KEFS"));
               altro.setText(rs.getString("ALTRO_1"));
               MSNQ.setText(rs.getString("MSNQ_V"));
               fssCombo.setSelected(rs.getBoolean("FSS_C"));
               FSS.setText(rs.getString("FSS_V"));
               bdiCombo.setSelected(rs.getBoolean("BDI-II_C"));
               BDI.setText(rs.getString("BDI-II_V"));
               altroCombo2.setSelected(rs.getBoolean("ALTRO_C"));
               altro2.setText(rs.getString("ALTRO_V"));
               SDMTG.setText(rs.getString("SDMT-G"));
               SDMTC.setText(rs.getString("SDMT-C"));
               SDMTZ.setText(rs.getString("SDMT-Z"));
               PASATG.setText(rs.getString("PASAT-G"));
               PASATC.setText(rs.getString("PASAT-C"));
               PASATZ.setText(rs.getString("PASAT-Z"));
               SRTLTSG.setText(rs.getString("SRT-LTS-G"));
               SRTLTSC.setText(rs.getString("SRT-LTS-C"));
               SRTLTSZ.setText(rs.getString("SRT-LTS-Z"));
               SRTCLTRG.setText(rs.getString("SRT-CLTR-G"));
               SRTCLTRC.setText(rs.getString("SRT-CLTR-C"));
               SRTCLTRZ.setText(rs.getString("SRT-CLTR-Z"));
               SRTDG.setText(rs.getString("SRT-D-G"));
               SRTDC.setText(rs.getString("SRT-D-C"));
               SRTDZ.setText(rs.getString("SRT-D-Z"));
               SPARTG.setText(rs.getString("SPART-G"));
               SPARTC.setText(rs.getString("SPART-C"));
               SPARTZ.setText(rs.getString("SPART-Z"));
               SPARTDG.setText(rs.getString("SPART-D-G"));
               SPARTDC.setText(rs.getString("SPART-D-C"));
               SPARTDZ.setText(rs.getString("SPART-D-Z"));
               WLGG.setText(rs.getString("WLG-G"));
               WLGC.setText(rs.getString("WLG-C"));
               //WLGZ.setText(rs.getString("WLG-Z"));
               jTextField24.setText(rs.getString("WLG-Z"));
               FSCATG.setText(rs.getString("FS-CAT-G"));
               FSCATC.setText(rs.getString("FS-CAT-C"));
               FSCATZ.setText(rs.getString("FS-CAT-Z"));
               FSDESG.setText(rs.getString("FS-DES-G"));
               FSDESC.setText(rs.getString("FS-DES-C"));
               FSDESZ.setText(rs.getString("FS-DES-Z"));
               SRG.setText(rs.getString("SR-G"));
               SRC.setText(rs.getString("SR-C"));
               SRZ.setText(rs.getString("SR-Z"));
               SDMTG1.setText(rs.getString("SDMT-G-BIC"));
               SDMTC1.setText(rs.getString("SDMT-C-BIC"));
               SDMTZ1.setText(rs.getString("SDMT-Z-BIC"));
               CVLTG.setText(rs.getString("CVLT-II-G"));
               CVLTC.setText(rs.getString("CVLT-II-C"));
               CVLTZ.setText(rs.getString("CVLT-II-Z"));
               BVMTG.setText(rs.getString("BVMT-R-G"));
               BVMTC.setText(rs.getString("BVMT-R-C"));
               BVMTZ.setText(rs.getString("BVMT-R-Z"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        data = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        screening = new javax.swing.JRadioButton();
        follow = new javax.swing.JRadioButton();
        trial = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        scolarita = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        esiti = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        elemClinici = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pasat1 = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        SPARTDZ = new javax.swing.JTextField();
        SRTCLTRG = new javax.swing.JTextField();
        c2 = new javax.swing.JLabel();
        SRTLTSC = new javax.swing.JTextField();
        srtLTS = new javax.swing.JLabel();
        SDMTG1 = new javax.swing.JTextField();
        PASATG = new javax.swing.JTextField();
        spartD = new javax.swing.JLabel();
        FSDESG = new javax.swing.JTextField();
        SPARTZ = new javax.swing.JTextField();
        DKEFS = new javax.swing.JCheckBox();
        WLGG = new javax.swing.JTextField();
        SRTCLTRC = new javax.swing.JTextField();
        FSCATC = new javax.swing.JTextField();
        srtLTS1 = new javax.swing.JLabel();
        CVLTC = new javax.swing.JTextField();
        wlg = new javax.swing.JLabel();
        z = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        SPARTDC = new javax.swing.JTextField();
        SRG = new javax.swing.JTextField();
        PASATC = new javax.swing.JTextField();
        sdmt2 = new javax.swing.JLabel();
        pasat2 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        SRTDG = new javax.swing.JTextField();
        SDMTG = new javax.swing.JTextField();
        sdmt = new javax.swing.JLabel();
        SPARTG = new javax.swing.JTextField();
        SDMTZ = new javax.swing.JTextField();
        PASATZ = new javax.swing.JTextField();
        pasat = new javax.swing.JLabel();
        sdmt1 = new javax.swing.JLabel();
        CVLTG = new javax.swing.JTextField();
        c1 = new javax.swing.JLabel();
        BICAMS = new javax.swing.JCheckBox();
        BRB = new javax.swing.JCheckBox();
        FSDESZ = new javax.swing.JTextField();
        SDMTC1 = new javax.swing.JTextField();
        srtCLTR = new javax.swing.JLabel();
        SRZ = new javax.swing.JTextField();
        srtD = new javax.swing.JLabel();
        z1 = new javax.swing.JLabel();
        SRTDZ = new javax.swing.JTextField();
        spart = new javax.swing.JLabel();
        SDMTZ1 = new javax.swing.JTextField();
        z2 = new javax.swing.JLabel();
        SRC = new javax.swing.JTextField();
        SDMTC = new javax.swing.JTextField();
        CVLTZ = new javax.swing.JTextField();
        SPARTDG = new javax.swing.JTextField();
        altroCombo = new javax.swing.JCheckBox();
        SPARTC = new javax.swing.JTextField();
        SRTLTSG = new javax.swing.JTextField();
        BVMTC = new javax.swing.JTextField();
        srtLTS2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        altro = new javax.swing.JTextArea();
        BVMTG = new javax.swing.JTextField();
        BVMTZ = new javax.swing.JTextField();
        SRTCLTRZ = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        FSCATZ = new javax.swing.JTextField();
        g2 = new javax.swing.JLabel();
        FSCATG = new javax.swing.JTextField();
        FSDESC = new javax.swing.JTextField();
        WLGC = new javax.swing.JTextField();
        SRTLTSZ = new javax.swing.JTextField();
        SRTDC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        FSS = new javax.swing.JTextField();
        bdiCombo = new javax.swing.JCheckBox();
        altroCombo2 = new javax.swing.JCheckBox();
        msnqCombo = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        altro2 = new javax.swing.JTextArea();
        fssCombo = new javax.swing.JCheckBox();
        BDI = new javax.swing.JTextField();
        MSNQ = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Data:");

        buttonGroup1.add(screening);
        screening.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        screening.setText("Screening");

        buttonGroup1.add(follow);
        follow.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        follow.setText("Follow-up");

        buttonGroup1.add(trial);
        trial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        trial.setText("Trial");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Scolarità:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Esiti:");

        esiti.setColumns(20);
        esiti.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        esiti.setRows(5);
        jScrollPane1.setViewportView(esiti);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Elementi clinici di rilievo:");

        elemClinici.setColumns(20);
        elemClinici.setRows(5);
        jScrollPane2.setViewportView(elemClinici);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pasat1.setText("FS DES");

        c.setText("C");

        c2.setText("C");

        srtLTS.setText("SRT-LTS");

        spartD.setText("SPART-D");

        DKEFS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DKEFS.setText("D-KEFS ST");

        srtLTS1.setText("SR");

        wlg.setText("WLG");

        z.setText("Z");

        g.setText("G");

        sdmt2.setText("SDMT");

        pasat2.setText("CVLT_II");

        g1.setText("G");

        sdmt.setText("SDMT");

        pasat.setText("PASAT");

        sdmt1.setText("FS CAT");

        c1.setText("C");

        BICAMS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BICAMS.setText("BICAMS");

        BRB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BRB.setText("BRB-NT");

        srtCLTR.setText("SRT-CLTR");

        srtD.setText("SRT-D");

        z1.setText("Z");

        spart.setText("SPART");

        z2.setText("Z");

        altroCombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        altroCombo.setText("Altro");

        srtLTS2.setText("BVMT_R");

        altro.setColumns(20);
        altro.setRows(5);
        jScrollPane3.setViewportView(altro);

        g2.setText("G");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(BRB))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(sdmt)
                            .addGap(36, 36, 36)
                            .addComponent(SDMTG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SDMTC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SDMTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pasat)
                                .addComponent(srtLTS)
                                .addComponent(srtCLTR)
                                .addComponent(spart)
                                .addComponent(srtD))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SRTLTSG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SRTLTSC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SRTLTSZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(PASATG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PASATC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PASATZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(SRTDG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SRTDC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SRTDZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SPARTG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SPARTC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SPARTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SRTCLTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SRTCLTRC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SRTCLTRZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(g)
                            .addGap(28, 28, 28)
                            .addComponent(c)
                            .addGap(30, 30, 30)
                            .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spartD)
                                .addComponent(wlg))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(SPARTDG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SPARTDC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SPARTDZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(WLGG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(WLGC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sdmt1)
                            .addComponent(pasat1)
                            .addComponent(srtLTS1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(FSDESG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FSDESC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FSDESZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(SRG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SRC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SRZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FSCATG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FSCATC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FSCATZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(g1)
                                .addGap(28, 28, 28)
                                .addComponent(c1)
                                .addGap(30, 30, 30)
                                .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(DKEFS))
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pasat2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CVLTG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CVLTC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CVLTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(srtLTS2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BVMTG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BVMTC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BVMTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(g2)
                        .addGap(28, 28, 28)
                        .addComponent(c2)
                        .addGap(30, 30, 30)
                        .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BICAMS)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sdmt2)
                                .addGap(21, 21, 21)
                                .addComponent(SDMTG1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SDMTC1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SDMTZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altroCombo))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BRB)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(g)
                            .addComponent(c)
                            .addComponent(z))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sdmt)
                            .addComponent(SDMTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SDMTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SDMTZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pasat)
                                    .addComponent(PASATG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PASATC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PASATZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(srtLTS)
                                    .addComponent(SRTLTSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SRTLTSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SRTLTSZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(srtCLTR)
                                .addComponent(SRTCLTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SRTCLTRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SRTCLTRZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SPARTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPARTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPARTZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SRTDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SRTDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SRTDZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(srtD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SPARTDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPARTDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPARTDZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spartD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WLGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WLGC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wlg)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DKEFS)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(g1)
                                    .addComponent(c1)
                                    .addComponent(z1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FSCATG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FSCATC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FSCATZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sdmt1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FSDESG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FSDESC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FSDESZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pasat1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SRZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(srtLTS1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(altroCombo)
                                    .addComponent(BICAMS, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(g2)
                                            .addComponent(c2)
                                            .addComponent(z2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(sdmt2)
                                            .addComponent(SDMTG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SDMTC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SDMTZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pasat2)
                                            .addComponent(CVLTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CVLTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CVLTZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(srtLTS2)
                                            .addComponent(BVMTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BVMTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BVMTZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(24, 24, 24))
        );

        jScrollPane4.setViewportView(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Questionario"));

        bdiCombo.setText("BDI_II");

        altroCombo2.setText("ALTRO");

        msnqCombo.setText("MSNQ");

        altro2.setColumns(20);
        altro2.setRows(5);
        jScrollPane5.setViewportView(altro2);

        fssCombo.setText("FSS");

        BDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(altroCombo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(msnqCombo)
                            .addGap(18, 18, 18)
                            .addComponent(MSNQ, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bdiCombo)
                                .addComponent(fssCombo))
                            .addGap(16, 16, 16)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BDI, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addComponent(FSS)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msnqCombo)
                    .addComponent(MSNQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(FSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fssCombo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bdiCombo)
                            .addComponent(BDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altroCombo2))
                .addContainerGap())
        );

        jButton1.setBackground(java.awt.Color.red);
        jButton1.setText("X");
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
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(screening)
                                .addGap(18, 18, 18)
                                .addComponent(follow)
                                .addGap(18, 18, 18)
                                .addComponent(trial)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scolarita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(screening)
                    .addComponent(follow)
                    .addComponent(trial)
                    .addComponent(jLabel2)
                    .addComponent(scolarita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("DELETE FROM ValutazioneNPS WHERE ID_NPS=?");
            pst.setInt(1, idNPS);
            pst.executeUpdate();
            parent.pulisciPanelNPS();
            parent.aggiornaBarra();
        } catch (SQLException ex) {
            Logger.getLogger(NPSUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BDI;
    private javax.swing.JCheckBox BICAMS;
    private javax.swing.JCheckBox BRB;
    private javax.swing.JTextField BVMTC;
    private javax.swing.JTextField BVMTG;
    private javax.swing.JTextField BVMTZ;
    private javax.swing.JTextField CVLTC;
    private javax.swing.JTextField CVLTG;
    private javax.swing.JTextField CVLTZ;
    private javax.swing.JCheckBox DKEFS;
    private javax.swing.JTextField FSCATC;
    private javax.swing.JTextField FSCATG;
    private javax.swing.JTextField FSCATZ;
    private javax.swing.JTextField FSDESC;
    private javax.swing.JTextField FSDESG;
    private javax.swing.JTextField FSDESZ;
    private javax.swing.JTextField FSS;
    private javax.swing.JTextField MSNQ;
    private javax.swing.JTextField PASATC;
    private javax.swing.JTextField PASATG;
    private javax.swing.JTextField PASATZ;
    private javax.swing.JTextField SDMTC;
    private javax.swing.JTextField SDMTC1;
    private javax.swing.JTextField SDMTG;
    private javax.swing.JTextField SDMTG1;
    private javax.swing.JTextField SDMTZ;
    private javax.swing.JTextField SDMTZ1;
    private javax.swing.JTextField SPARTC;
    private javax.swing.JTextField SPARTDC;
    private javax.swing.JTextField SPARTDG;
    private javax.swing.JTextField SPARTDZ;
    private javax.swing.JTextField SPARTG;
    private javax.swing.JTextField SPARTZ;
    private javax.swing.JTextField SRC;
    private javax.swing.JTextField SRG;
    private javax.swing.JTextField SRTCLTRC;
    private javax.swing.JTextField SRTCLTRG;
    private javax.swing.JTextField SRTCLTRZ;
    private javax.swing.JTextField SRTDC;
    private javax.swing.JTextField SRTDG;
    private javax.swing.JTextField SRTDZ;
    private javax.swing.JTextField SRTLTSC;
    private javax.swing.JTextField SRTLTSG;
    private javax.swing.JTextField SRTLTSZ;
    private javax.swing.JTextField SRZ;
    private javax.swing.JTextField WLGC;
    private javax.swing.JTextField WLGG;
    private javax.swing.JTextArea altro;
    private javax.swing.JTextArea altro2;
    private javax.swing.JCheckBox altroCombo;
    private javax.swing.JCheckBox altroCombo2;
    private javax.swing.JCheckBox bdiCombo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel c;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private org.jdesktop.swingx.JXDatePicker data;
    private javax.swing.JTextArea elemClinici;
    private javax.swing.JTextArea esiti;
    private javax.swing.JRadioButton follow;
    private javax.swing.JCheckBox fssCombo;
    private javax.swing.JLabel g;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JCheckBox msnqCombo;
    private javax.swing.JLabel pasat;
    private javax.swing.JLabel pasat1;
    private javax.swing.JLabel pasat2;
    private javax.swing.JTextField scolarita;
    private javax.swing.JRadioButton screening;
    private javax.swing.JLabel sdmt;
    private javax.swing.JLabel sdmt1;
    private javax.swing.JLabel sdmt2;
    private javax.swing.JLabel spart;
    private javax.swing.JLabel spartD;
    private javax.swing.JLabel srtCLTR;
    private javax.swing.JLabel srtD;
    private javax.swing.JLabel srtLTS;
    private javax.swing.JLabel srtLTS1;
    private javax.swing.JLabel srtLTS2;
    private javax.swing.JRadioButton trial;
    private javax.swing.JLabel wlg;
    private javax.swing.JLabel z;
    private javax.swing.JLabel z1;
    private javax.swing.JLabel z2;
    // End of variables declaration//GEN-END:variables
}
