package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;


public class SchedaEsamiUI extends javax.swing.JPanel {

    private PazienteUI parent;
    private int idPaziente;
    
    public SchedaEsamiUI(PazienteUI p,int idPaz) {
        initComponents();
        parent=p;
        idPaziente=idPaz;
        aggiornaDati(idPaz);
    }
    
    public void ticcaEsameText(JCheckBox c,Date data,JXDatePicker d,JTextField t,String stringa)
    {
        if(data==null)
            return;
        c.setEnabled(false);
        d.setEnabled(false);
        t.setEnabled(false);
        c.setSelected(true);
        d.setDate(data);
        t.setText(stringa);
    }
    
    public void ticcaEsameCombo(JCheckBox c,Date data,JXDatePicker d,JComboBox t,String stringa)
    {
        if(data==null)
            return;
        c.setEnabled(false);
        d.setEnabled(false);
        t.setEnabled(false);
        c.setSelected(true);
        d.setDate(data);
        t.setSelectedItem(stringa);
    }
    
    public void aggiornaDati(int idPaz)
    {
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Scheda_Esami WHERE ID_Paziente=?");
            pst.setInt(1,idPaz);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                ticcaEsameText(comboLeucociti,rs.getDate("Data_Leucociti"),dataLeucociti,leu,""+(rs.getDouble("Leucociti")));
                ticcaEsameText(comboLinfociti,rs.getDate("Data_Linfociti"),dataLinfociti,linf,""+(rs.getDouble("Linfociti")));
                ticcaEsameText(comboGR,rs.getDate("Data_GR"),dataGR,gr,""+(rs.getDouble("GR")));
                ticcaEsameText(comboPiastrine,rs.getDate("Data_Piastrine"),dataPiastrine,pia,""+(rs.getDouble("Piastrine")));
                ticcaEsameCombo(comboCMV,rs.getDate("Data_CMV"),dataCMV,cmv,rs.getString("CMV"));
                ticcaEsameCombo(comboHBV,rs.getDate("Data_HBV"),dataHBV,hbv,rs.getString("HBV"));
                ticcaEsameCombo(comboHCV,rs.getDate("Data_HCV"),dataHCV,hcv,rs.getString("HCV"));
                ticcaEsameCombo(comboHIV1,rs.getDate("Data_HIV_1"),dataHIV1,hiv1,rs.getString("HIV_1"));
                ticcaEsameCombo(comboHIV2,rs.getDate("Data_HIV_2"),dataHIV2,hiv2,rs.getString("HIV_2"));
                ticcaEsameCombo(comboTBC,rs.getDate("Data_TBC"),dataTBC,tbc,rs.getString("TBC"));
                ticcaEsameCombo(comboPPTest,rs.getDate("Data_Pap_Test"),dataPT,ppTest,rs.getString("Pap_Test"));
                ticcaEsameCombo(comboJCV,rs.getDate("Data_JCV"),dataJCV,jcv,rs.getString("JCV"));
                ticcaEsameCombo(comboVZV,rs.getDate("Data_VZV"),dataVZV,vzv,rs.getString("VZV"));
                ticcaEsameCombo(comboEBV,rs.getDate("Data_EBV"),dataEBV,ebv,rs.getString("EBV"));
                ticcaEsameCombo(comboHSV1,rs.getDate("Data_HSV_1"),dataHSV1,hsv1,rs.getString("HSV_1"));
                ticcaEsameCombo(comboHSV2,rs.getDate("Data_HSV_2"),dataHSV2,hsv2,rs.getString("HSV_2"));
                ticcaEsameText(comboECG,rs.getDate("Data_ECG"),dataECG,ecg,rs.getString("ECG"));
                ticcaEsameText(comboOCT,rs.getDate("Data_OCT"),dataOCT,oct,rs.getString("OCT"));
                ticcaEsameText(comboRX,rs.getDate("Data_RX"),dataRX,rx,rs.getString("RX"));
                ticcaEsameText(comboEcocardio,rs.getDate("Data_Ecocardiogramma"),dataEcocardio,ecocardio,rs.getString("Ecocardiogramma"));
                ticcaEsameText(comboEcografia,rs.getDate("Data_Ecografia_Vescicale"),dataEcografia,ecografia,rs.getString("Ecografia_Vescicale"));
                ticcaEsameText(comboDerma,rs.getDate("Data_Dermatologica"),dataDerma,derma,rs.getString("Dermatologica"));
                ticcaEsameText(comboCardio,rs.getDate("Data_Cardiologica"),dataCardio,cardio,rs.getString("Cardiologica"));
                ticcaEsameText(comboPneu,rs.getDate("Data_Pneumologica"),dataPneu,pneu,rs.getString("Pneumologica"));
                ticcaEsameText(comboInfet,rs.getDate("Data_Infettivologica"),dataInfet,infet,rs.getString("Infettivologica"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker3 = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        comboLeucociti = new javax.swing.JCheckBox();
        dataPiastrine = new org.jdesktop.swingx.JXDatePicker();
        dataGR = new org.jdesktop.swingx.JXDatePicker();
        dataLinfociti = new org.jdesktop.swingx.JXDatePicker();
        comboPiastrine = new javax.swing.JCheckBox();
        linf = new javax.swing.JTextField();
        pia = new javax.swing.JTextField();
        leu = new javax.swing.JTextField();
        comboLinfociti = new javax.swing.JCheckBox();
        gr = new javax.swing.JTextField();
        dataLeucociti = new org.jdesktop.swingx.JXDatePicker();
        comboGR = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        hsv1 = new javax.swing.JComboBox<>();
        jcv = new javax.swing.JComboBox<>();
        dataTBC = new org.jdesktop.swingx.JXDatePicker();
        dataHSV2 = new org.jdesktop.swingx.JXDatePicker();
        dataHBV = new org.jdesktop.swingx.JXDatePicker();
        comboPPTest = new javax.swing.JCheckBox();
        comboHCV = new javax.swing.JCheckBox();
        tbc = new javax.swing.JComboBox<>();
        comboEBV = new javax.swing.JCheckBox();
        comboHBV = new javax.swing.JCheckBox();
        dataCMV = new org.jdesktop.swingx.JXDatePicker();
        dataPT = new org.jdesktop.swingx.JXDatePicker();
        hiv2 = new javax.swing.JComboBox<>();
        comboVZV = new javax.swing.JCheckBox();
        hcv = new javax.swing.JComboBox<>();
        dataHIV2 = new org.jdesktop.swingx.JXDatePicker();
        dataHCV = new org.jdesktop.swingx.JXDatePicker();
        dataEBV = new org.jdesktop.swingx.JXDatePicker();
        comboHIV2 = new javax.swing.JCheckBox();
        ebv = new javax.swing.JComboBox<>();
        dataHSV1 = new org.jdesktop.swingx.JXDatePicker();
        comboHSV2 = new javax.swing.JCheckBox();
        cmv = new javax.swing.JComboBox<>();
        comboCMV = new javax.swing.JCheckBox();
        comboJCV = new javax.swing.JCheckBox();
        hiv1 = new javax.swing.JComboBox<>();
        comboTBC = new javax.swing.JCheckBox();
        hsv2 = new javax.swing.JComboBox<>();
        comboHIV1 = new javax.swing.JCheckBox();
        comboHSV1 = new javax.swing.JCheckBox();
        dataHIV1 = new org.jdesktop.swingx.JXDatePicker();
        hbv = new javax.swing.JComboBox<>();
        dataVZV = new org.jdesktop.swingx.JXDatePicker();
        vzv = new javax.swing.JComboBox<>();
        dataJCV = new org.jdesktop.swingx.JXDatePicker();
        ppTest = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        comboDerma = new javax.swing.JCheckBox();
        dataDerma = new org.jdesktop.swingx.JXDatePicker();
        derma = new javax.swing.JTextField();
        comboCardio = new javax.swing.JCheckBox();
        dataCardio = new org.jdesktop.swingx.JXDatePicker();
        cardio = new javax.swing.JTextField();
        comboPneu = new javax.swing.JCheckBox();
        dataPneu = new org.jdesktop.swingx.JXDatePicker();
        pneu = new javax.swing.JTextField();
        comboInfet = new javax.swing.JCheckBox();
        dataInfet = new org.jdesktop.swingx.JXDatePicker();
        infet = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        dataECG = new org.jdesktop.swingx.JXDatePicker();
        ecg = new javax.swing.JTextField();
        dataOCT = new org.jdesktop.swingx.JXDatePicker();
        oct = new javax.swing.JTextField();
        dataRX = new org.jdesktop.swingx.JXDatePicker();
        rx = new javax.swing.JTextField();
        dataEcocardio = new org.jdesktop.swingx.JXDatePicker();
        ecocardio = new javax.swing.JTextField();
        dataEcografia = new org.jdesktop.swingx.JXDatePicker();
        ecografia = new javax.swing.JTextField();
        comboECG = new javax.swing.JCheckBox();
        comboOCT = new javax.swing.JCheckBox();
        comboRX = new javax.swing.JCheckBox();
        comboEcocardio = new javax.swing.JCheckBox();
        comboEcografia = new javax.swing.JCheckBox();

        setOpaque(false);

        jScrollPane1.setBackground(new java.awt.Color(239, 228, 176));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("ESAMI EMATOCHIMICI"));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1018, 182));

        jPanel1.setBackground(new java.awt.Color(239, 228, 176));
        jPanel1.setPreferredSize(new java.awt.Dimension(1018, 425));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("EMOCROMO CON FORMULA"));
        jPanel4.setOpaque(false);

        comboLeucociti.setText("Leucociti");
        comboLeucociti.setOpaque(false);

        dataPiastrine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPiastrineActionPerformed(evt);
            }
        });

        dataGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataGRActionPerformed(evt);
            }
        });

        dataLinfociti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataLinfocitiActionPerformed(evt);
            }
        });

        comboPiastrine.setText("Piastrine");
        comboPiastrine.setOpaque(false);

        linf.setEnabled(false);
        linf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfKeyReleased(evt);
            }
        });

        pia.setEnabled(false);
        pia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                piaKeyReleased(evt);
            }
        });

        leu.setEnabled(false);
        leu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leuKeyReleased(evt);
            }
        });

        comboLinfociti.setText("Linfociti");
        comboLinfociti.setOpaque(false);

        gr.setEnabled(false);
        gr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grKeyReleased(evt);
            }
        });

        dataLeucociti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataLeucocitiActionPerformed(evt);
            }
        });

        comboGR.setText("GR");
        comboGR.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(comboLeucociti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataLeucociti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(leu))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboGR)
                            .addComponent(comboPiastrine)
                            .addComponent(comboLinfociti))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(dataGR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gr))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(dataLinfociti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(linf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(dataPiastrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLeucociti)
                    .addComponent(dataLeucociti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLinfociti)
                    .addComponent(dataLinfociti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGR)
                    .addComponent(dataGR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPiastrine)
                    .addComponent(dataPiastrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("SCREENING MICROBIOLOGICO"));
        jPanel5.setOpaque(false);

        hsv1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        hsv1.setSelectedIndex(-1);
        hsv1.setEnabled(false);
        hsv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsv1ActionPerformed(evt);
            }
        });

        jcv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        jcv.setSelectedIndex(-1);
        jcv.setEnabled(false);
        jcv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcvActionPerformed(evt);
            }
        });

        dataTBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTBCActionPerformed(evt);
            }
        });

        dataHSV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataHSV2ActionPerformed(evt);
            }
        });

        dataHBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataHBVActionPerformed(evt);
            }
        });

        comboPPTest.setText("Pap-Test");
        comboPPTest.setOpaque(false);

        comboHCV.setText("IgG anti-HCV");
        comboHCV.setOpaque(false);

        tbc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        tbc.setSelectedIndex(-1);
        tbc.setEnabled(false);
        tbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbcActionPerformed(evt);
            }
        });

        comboEBV.setText("IgG anti-EBV");
        comboEBV.setOpaque(false);

        comboHBV.setText("IgG anti-HBV");
        comboHBV.setOpaque(false);

        dataCMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCMVActionPerformed(evt);
            }
        });

        dataPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPTActionPerformed(evt);
            }
        });

        hiv2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        hiv2.setSelectedIndex(-1);
        hiv2.setEnabled(false);
        hiv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiv2ActionPerformed(evt);
            }
        });

        comboVZV.setText("IgG anti-VZV");
        comboVZV.setOpaque(false);

        hcv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        hcv.setSelectedIndex(-1);
        hcv.setEnabled(false);
        hcv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hcvActionPerformed(evt);
            }
        });

        dataHIV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataHIV2ActionPerformed(evt);
            }
        });

        dataHCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataHCVActionPerformed(evt);
            }
        });

        dataEBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEBVActionPerformed(evt);
            }
        });

        comboHIV2.setText("IgG anti-HIV 2");
        comboHIV2.setOpaque(false);

        ebv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        ebv.setSelectedIndex(-1);
        ebv.setEnabled(false);
        ebv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebvActionPerformed(evt);
            }
        });

        dataHSV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataHSV1ActionPerformed(evt);
            }
        });

        comboHSV2.setText("IgG anti-HSV 2");
        comboHSV2.setOpaque(false);

        cmv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        cmv.setSelectedIndex(-1);
        cmv.setEnabled(false);
        cmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmvActionPerformed(evt);
            }
        });

        comboCMV.setText("IgG anti-CMV");
        comboCMV.setOpaque(false);

        comboJCV.setText("IgG anti-JCV");
        comboJCV.setOpaque(false);

        hiv1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        hiv1.setSelectedIndex(-1);
        hiv1.setEnabled(false);
        hiv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiv1ActionPerformed(evt);
            }
        });

        comboTBC.setText("TBC");
        comboTBC.setOpaque(false);

        hsv2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        hsv2.setSelectedIndex(-1);
        hsv2.setEnabled(false);
        hsv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsv2ActionPerformed(evt);
            }
        });

        comboHIV1.setText("IgG anti-HIV 1");
        comboHIV1.setOpaque(false);

        comboHSV1.setText("IgG anti-HSV 1");
        comboHSV1.setOpaque(false);

        dataHIV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataHIV1ActionPerformed(evt);
            }
        });

        hbv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        hbv.setSelectedIndex(-1);
        hbv.setEnabled(false);
        hbv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbvActionPerformed(evt);
            }
        });

        dataVZV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataVZVActionPerformed(evt);
            }
        });

        vzv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        vzv.setSelectedIndex(-1);
        vzv.setEnabled(false);
        vzv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vzvActionPerformed(evt);
            }
        });

        dataJCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataJCVActionPerformed(evt);
            }
        });

        ppTest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        ppTest.setSelectedIndex(-1);
        ppTest.setEnabled(false);
        ppTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboCMV)
                        .addGap(14, 14, 14)
                        .addComponent(dataCMV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboHBV)
                        .addGap(14, 14, 14)
                        .addComponent(dataHBV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hbv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboHCV)
                        .addGap(14, 14, 14)
                        .addComponent(dataHCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboHIV1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataHIV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hiv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboJCV)
                        .addGap(14, 14, 14)
                        .addComponent(dataJCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(comboTBC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dataTBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(comboHIV2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataHIV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hiv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboPPTest)
                        .addGap(30, 30, 30)
                        .addComponent(dataPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ppTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboVZV)
                        .addGap(14, 14, 14)
                        .addComponent(dataVZV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vzv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboEBV)
                        .addGap(14, 14, 14)
                        .addComponent(dataEBV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ebv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboHSV1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataHSV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hsv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboHSV2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataHSV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hsv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dataCMV, dataEBV, dataHBV, dataHCV, dataHIV1, dataHIV2, dataHSV1, dataHSV2, dataJCV, dataPT, dataTBC, dataVZV});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboVZV)
                            .addComponent(dataVZV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vzv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboEBV)
                            .addComponent(dataEBV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ebv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboHSV1)
                            .addComponent(dataHSV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hsv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboHSV2)
                            .addComponent(dataHSV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hsv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboCMV)
                                .addComponent(dataCMV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboHBV)
                                .addComponent(dataHBV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hbv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboHCV)
                                .addComponent(dataHCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboHIV1)
                                .addComponent(dataHIV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hiv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboHIV2)
                                .addComponent(dataHIV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hiv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboTBC)
                                .addComponent(dataTBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboPPTest)
                                .addComponent(dataPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ppTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboJCV)
                                .addComponent(dataJCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("VALUTAZIONE SPECIALISTICA"));
        jPanel3.setOpaque(false);

        comboDerma.setText("Dermatologica");
        comboDerma.setOpaque(false);

        dataDerma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDermaActionPerformed(evt);
            }
        });

        derma.setEnabled(false);
        derma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dermaKeyReleased(evt);
            }
        });

        comboCardio.setText("Cardiologica");
        comboCardio.setOpaque(false);

        dataCardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCardioActionPerformed(evt);
            }
        });

        cardio.setEnabled(false);
        cardio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardioKeyReleased(evt);
            }
        });

        comboPneu.setText("Pneumologica");
        comboPneu.setOpaque(false);

        dataPneu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPneuActionPerformed(evt);
            }
        });

        pneu.setEnabled(false);
        pneu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pneuKeyReleased(evt);
            }
        });

        comboInfet.setText("Infettivologica");
        comboInfet.setOpaque(false);

        dataInfet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInfetActionPerformed(evt);
            }
        });

        infet.setEnabled(false);
        infet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                infetKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboDerma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataDerma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboCardio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataCardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboPneu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboInfet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataInfet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(derma, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cardio, derma, infet, pneu});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDerma)
                    .addComponent(dataDerma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(derma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCardio)
                    .addComponent(dataCardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPneu)
                    .addComponent(dataPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboInfet)
                    .addComponent(dataInfet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jScrollPane2.setBackground(new java.awt.Color(239, 228, 176));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("ESAMI STRUMENTALI"));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(470, 156));

        jPanel2.setBackground(new java.awt.Color(239, 228, 176));

        dataECG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataECGActionPerformed(evt);
            }
        });

        ecg.setEnabled(false);
        ecg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ecgKeyReleased(evt);
            }
        });

        dataOCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataOCTActionPerformed(evt);
            }
        });

        oct.setEnabled(false);
        oct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                octKeyReleased(evt);
            }
        });

        dataRX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRXActionPerformed(evt);
            }
        });

        rx.setEnabled(false);
        rx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rxKeyReleased(evt);
            }
        });

        dataEcocardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEcocardioActionPerformed(evt);
            }
        });

        ecocardio.setEnabled(false);
        ecocardio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ecocardioKeyReleased(evt);
            }
        });

        dataEcografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEcografiaActionPerformed(evt);
            }
        });

        ecografia.setEnabled(false);
        ecografia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ecografiaKeyReleased(evt);
            }
        });

        comboECG.setText("ECG");
        comboECG.setOpaque(false);

        comboOCT.setText("OCT");
        comboOCT.setOpaque(false);

        comboRX.setText("RX torace");
        comboRX.setOpaque(false);

        comboEcocardio.setText("Ecocardiogramma");
        comboEcocardio.setOpaque(false);

        comboEcografia.setText("Ecografia vescicale");
        comboEcografia.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(comboRX)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataRX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rx, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(comboEcocardio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataEcocardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ecocardio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(comboEcografia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                            .addComponent(dataEcografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ecografia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboOCT)
                            .addComponent(comboECG))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dataOCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(oct, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dataECG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ecg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ecg, ecocardio, ecografia, oct, rx});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataECG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboECG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataOCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOCT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataRX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataEcocardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecocardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEcocardio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataEcografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEcografia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dataLeucocitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataLeucocitiActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Leucociti=? WHERE ID_Paziente=?");
            Date d=dataLeucociti.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                leu.setEnabled(false);
                leu.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboLeucociti.setSelected(true);
                leu.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataLeucocitiActionPerformed

    private void dataLinfocitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataLinfocitiActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Linfociti=? WHERE ID_Paziente=?");
            Date d=dataLinfociti.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                linf.setEnabled(false);
                linf.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboLinfociti.setSelected(true);
                linf.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataLinfocitiActionPerformed

    private void dataGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataGRActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_GR=? WHERE ID_Paziente=?");
            Date d=dataGR.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                gr.setEnabled(false);
                gr.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboGR.setSelected(true);
                gr.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataGRActionPerformed

    private void dataPiastrineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPiastrineActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Piastrine=? WHERE ID_Paziente=?");
            Date d=dataPiastrine.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                pia.setEnabled(false);
                pia.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboPiastrine.setSelected(true);
                pia.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataPiastrineActionPerformed

    private void dataCMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCMVActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_CMV=? WHERE ID_Paziente=?");
            Date d=dataCMV.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                cmv.setEnabled(false);
                cmv.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboCMV.setSelected(true);
                cmv.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataCMVActionPerformed

    private void dataHBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataHBVActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_HBV=? WHERE ID_Paziente=?");
            Date d=dataHBV.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                hbv.setEnabled(false);
                hbv.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboHBV.setSelected(true);
                hbv.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataHBVActionPerformed

    private void dataHCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataHCVActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_HCV=? WHERE ID_Paziente=?");
            Date d=dataHCV.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                hcv.setEnabled(false);
                hcv.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboHCV.setSelected(true);
                hcv.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataHCVActionPerformed

    private void dataHIV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataHIV1ActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_HIV_1=? WHERE ID_Paziente=?");
            Date d=dataHIV1.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                hiv1.setEnabled(false);
                hiv1.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboHIV1.setSelected(true);
                hiv1.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataHIV1ActionPerformed

    private void dataHIV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataHIV2ActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_HIV_2=? WHERE ID_Paziente=?");
            Date d=dataHIV2.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                hiv2.setEnabled(false);
                hiv2.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboHIV2.setSelected(true);
                hiv2.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataHIV2ActionPerformed

    private void dataTBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTBCActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_TBC=? WHERE ID_Paziente=?");
            Date d=dataTBC.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                tbc.setEnabled(false);
                tbc.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboTBC.setSelected(true);
                tbc.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataTBCActionPerformed

    private void dataPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPTActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Pap_Test=? WHERE ID_Paziente=?");
            Date d=dataPT.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                ppTest.setEnabled(false);
                ppTest.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboPPTest.setSelected(true);
                ppTest.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataPTActionPerformed

    private void dataJCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataJCVActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_JCV=? WHERE ID_Paziente=?");
            Date d=dataJCV.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                jcv.setEnabled(false);
                jcv.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboJCV.setSelected(true);
                jcv.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataJCVActionPerformed

    private void dataVZVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataVZVActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_VZV=? WHERE ID_Paziente=?");
            Date d=dataVZV.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                vzv.setEnabled(false);
                vzv.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboVZV.setSelected(true);
                vzv.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataVZVActionPerformed

    private void dataEBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEBVActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_EBV=? WHERE ID_Paziente=?");
            Date d=dataEBV.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                ebv.setEnabled(false);
                ebv.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboEBV.setSelected(true);
                ebv.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEBVActionPerformed

    private void dataHSV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataHSV1ActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_HSV_1=? WHERE ID_Paziente=?");
            Date d=dataHSV1.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                hsv1.setEnabled(false);
                hsv1.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboHSV1.setSelected(true);
                hsv1.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataHSV1ActionPerformed

    private void dataHSV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataHSV2ActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_HSV_2=? WHERE ID_Paziente=?");
            Date d=dataHSV2.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                hsv2.setEnabled(false);
                hsv2.setSelectedIndex(-1);
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboHSV2.setSelected(true);
                hsv2.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataHSV2ActionPerformed

    private void dataECGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataECGActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_ECG=? WHERE ID_Paziente=?");
            Date d=dataECG.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                ecg.setEnabled(false);
                ecg.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboECG.setSelected(true);
                ecg.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataECGActionPerformed

    private void dataOCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataOCTActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_OCT=? WHERE ID_Paziente=?");
            Date d=dataOCT.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                oct.setEnabled(false);
                oct.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboOCT.setSelected(true);
                oct.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataOCTActionPerformed

    private void dataRXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRXActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_RX=? WHERE ID_Paziente=?");
            Date d=dataRX.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                rx.setEnabled(false);
                rx.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboRX.setSelected(true);
                rx.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataRXActionPerformed

    private void dataEcocardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEcocardioActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Ecocardiogramma=? WHERE ID_Paziente=?");
            Date d=dataEcocardio.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                ecocardio.setEnabled(false);
                ecocardio.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboEcocardio.setSelected(true);
                ecocardio.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEcocardioActionPerformed

    private void dataEcografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEcografiaActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Ecografia_Vescicale=? WHERE ID_Paziente=?");
            Date d=dataEcografia.getDate();
            if(d==null)
           {
                pst.setNull(1, java.sql.Types.DATE);
                ecografia.setEnabled(false);
                ecografia.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboEcografia.setSelected(true);
                ecografia.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEcografiaActionPerformed

    private void dataDermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDermaActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Dermatologica=? WHERE ID_Paziente=?");
            Date d=dataDerma.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                derma.setEnabled(false);
                derma.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboDerma.setSelected(true);
                derma.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataDermaActionPerformed

    private void dataCardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCardioActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Cardiologica=? WHERE ID_Paziente=?");
            Date d=dataCardio.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                cardio.setEnabled(false);
                cardio.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboCardio.setSelected(true);
                cardio.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataCardioActionPerformed

    private void dataPneuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPneuActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Pneumologica=? WHERE ID_Paziente=?");
            Date d=dataPneu.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                pneu.setEnabled(false);
                pneu.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboPneu.setSelected(true);
                pneu.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataPneuActionPerformed

    private void dataInfetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInfetActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Data_Infettivologica=? WHERE ID_Paziente=?");
            Date d=dataInfet.getDate();
            if(d==null)
            {
                pst.setNull(1, java.sql.Types.DATE);
                infet.setEnabled(false);
                infet.setText("");
            }
            else
            {
                pst.setDate(1, Utilita.DateUtilToSQL(d));
                comboInfet.setSelected(true);
                infet.setEnabled(true);
            }
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataInfetActionPerformed

    private void leuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leuKeyReleased
       try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Leucociti=? WHERE ID_Paziente=?");
            pst.setDouble(1, Double.parseDouble(leu.getText()));
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_leuKeyReleased

    private void linfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Linfociti=? WHERE ID_Paziente=?");
            pst.setDouble(1, Double.parseDouble(linf.getText()));
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_linfKeyReleased

    private void grKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET GR=? WHERE ID_Paziente=?");
            pst.setDouble(1, Double.parseDouble(gr.getText()));
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_grKeyReleased

    private void piaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_piaKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Piastrine=? WHERE ID_Paziente=?");
            pst.setDouble(1, Double.parseDouble(pia.getText()));
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_piaKeyReleased

    private void cmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmvActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET CMV=? WHERE ID_Paziente=?");
            pst.setString(1, (String)cmv.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_cmvActionPerformed

    private void hbvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbvActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET HBV=? WHERE ID_Paziente=?");
            pst.setString(1, (String)hbv.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_hbvActionPerformed

    private void hcvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hcvActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET HCV=? WHERE ID_Paziente=?");
            pst.setString(1, (String)hcv.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_hcvActionPerformed

    private void hiv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiv1ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET HIV_1=? WHERE ID_Paziente=?");
            pst.setString(1, (String)hiv1.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_hiv1ActionPerformed

    private void hiv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiv2ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET HIV_2=? WHERE ID_Paziente=?");
            pst.setString(1, (String)hiv2.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_hiv2ActionPerformed

    private void tbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbcActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET TBC=? WHERE ID_Paziente=?");
            pst.setString(1, (String)tbc.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_tbcActionPerformed

    private void ppTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppTestActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Pap_Test=? WHERE ID_Paziente=?");
            pst.setString(1, (String)ppTest.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_ppTestActionPerformed

    private void jcvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcvActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET JCV=? WHERE ID_Paziente=?");
            pst.setString(1, (String)jcv.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jcvActionPerformed

    private void vzvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vzvActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET VZV=? WHERE ID_Paziente=?");
            pst.setString(1, (String)vzv.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_vzvActionPerformed

    private void ebvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebvActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET EBV=? WHERE ID_Paziente=?");
            pst.setString(1, (String)ebv.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_ebvActionPerformed

    private void hsv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsv1ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET HSV_1=? WHERE ID_Paziente=?");
            pst.setString(1, (String)hsv1.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_hsv1ActionPerformed

    private void hsv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsv2ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET HSV_2=? WHERE ID_Paziente=?");
            pst.setString(1, (String)hsv2.getSelectedItem());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_hsv2ActionPerformed

    private void ecgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecgKeyReleased
       try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET ECG=? WHERE ID_Paziente=?");
            pst.setString(1, ecg.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_ecgKeyReleased

    private void octKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_octKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET OCT=? WHERE ID_Paziente=?");
            pst.setString(1, oct.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_octKeyReleased

    private void rxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rxKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET RX=? WHERE ID_Paziente=?");
            pst.setString(1, rx.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_rxKeyReleased

    private void ecocardioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecocardioKeyReleased
       try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Ecocardiologica=? WHERE ID_Paziente=?");
            pst.setString(1, ecocardio.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_ecocardioKeyReleased

    private void ecografiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecografiaKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Ecografia_Vescicale=? WHERE ID_Paziente=?");
            pst.setString(1, ecografia.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_ecografiaKeyReleased

    private void dermaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dermaKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Dermatologica=? WHERE ID_Paziente=?");
            pst.setString(1, derma.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_dermaKeyReleased

    private void cardioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardioKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Cardiologica=? WHERE ID_Paziente=?");
            pst.setString(1, cardio.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_cardioKeyReleased

    private void pneuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pneuKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Pneumologica=? WHERE ID_Paziente=?");
            pst.setString(1, pneu.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_pneuKeyReleased

    private void infetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_infetKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Scheda_Esami SET Infettivologica=? WHERE ID_Paziente=?");
            pst.setString(1, infet.getText());
            pst.setInt(2, idPaziente);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SchedaEsamiUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_infetKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardio;
    private javax.swing.JComboBox<String> cmv;
    private javax.swing.JCheckBox comboCMV;
    private javax.swing.JCheckBox comboCardio;
    private javax.swing.JCheckBox comboDerma;
    private javax.swing.JCheckBox comboEBV;
    private javax.swing.JCheckBox comboECG;
    private javax.swing.JCheckBox comboEcocardio;
    private javax.swing.JCheckBox comboEcografia;
    private javax.swing.JCheckBox comboGR;
    private javax.swing.JCheckBox comboHBV;
    private javax.swing.JCheckBox comboHCV;
    private javax.swing.JCheckBox comboHIV1;
    private javax.swing.JCheckBox comboHIV2;
    private javax.swing.JCheckBox comboHSV1;
    private javax.swing.JCheckBox comboHSV2;
    private javax.swing.JCheckBox comboInfet;
    private javax.swing.JCheckBox comboJCV;
    private javax.swing.JCheckBox comboLeucociti;
    private javax.swing.JCheckBox comboLinfociti;
    private javax.swing.JCheckBox comboOCT;
    private javax.swing.JCheckBox comboPPTest;
    private javax.swing.JCheckBox comboPiastrine;
    private javax.swing.JCheckBox comboPneu;
    private javax.swing.JCheckBox comboRX;
    private javax.swing.JCheckBox comboTBC;
    private javax.swing.JCheckBox comboVZV;
    private org.jdesktop.swingx.JXDatePicker dataCMV;
    private org.jdesktop.swingx.JXDatePicker dataCardio;
    private org.jdesktop.swingx.JXDatePicker dataDerma;
    private org.jdesktop.swingx.JXDatePicker dataEBV;
    private org.jdesktop.swingx.JXDatePicker dataECG;
    private org.jdesktop.swingx.JXDatePicker dataEcocardio;
    private org.jdesktop.swingx.JXDatePicker dataEcografia;
    private org.jdesktop.swingx.JXDatePicker dataGR;
    private org.jdesktop.swingx.JXDatePicker dataHBV;
    private org.jdesktop.swingx.JXDatePicker dataHCV;
    private org.jdesktop.swingx.JXDatePicker dataHIV1;
    private org.jdesktop.swingx.JXDatePicker dataHIV2;
    private org.jdesktop.swingx.JXDatePicker dataHSV1;
    private org.jdesktop.swingx.JXDatePicker dataHSV2;
    private org.jdesktop.swingx.JXDatePicker dataInfet;
    private org.jdesktop.swingx.JXDatePicker dataJCV;
    private org.jdesktop.swingx.JXDatePicker dataLeucociti;
    private org.jdesktop.swingx.JXDatePicker dataLinfociti;
    private org.jdesktop.swingx.JXDatePicker dataOCT;
    private org.jdesktop.swingx.JXDatePicker dataPT;
    private org.jdesktop.swingx.JXDatePicker dataPiastrine;
    private org.jdesktop.swingx.JXDatePicker dataPneu;
    private org.jdesktop.swingx.JXDatePicker dataRX;
    private org.jdesktop.swingx.JXDatePicker dataTBC;
    private org.jdesktop.swingx.JXDatePicker dataVZV;
    private javax.swing.JTextField derma;
    private javax.swing.JComboBox<String> ebv;
    private javax.swing.JTextField ecg;
    private javax.swing.JTextField ecocardio;
    private javax.swing.JTextField ecografia;
    private javax.swing.JTextField gr;
    private javax.swing.JComboBox<String> hbv;
    private javax.swing.JComboBox<String> hcv;
    private javax.swing.JComboBox<String> hiv1;
    private javax.swing.JComboBox<String> hiv2;
    private javax.swing.JComboBox<String> hsv1;
    private javax.swing.JComboBox<String> hsv2;
    private javax.swing.JTextField infet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker3;
    private javax.swing.JComboBox<String> jcv;
    private javax.swing.JTextField leu;
    private javax.swing.JTextField linf;
    private javax.swing.JTextField oct;
    private javax.swing.JTextField pia;
    private javax.swing.JTextField pneu;
    private javax.swing.JComboBox<String> ppTest;
    private javax.swing.JTextField rx;
    private javax.swing.JComboBox<String> tbc;
    private javax.swing.JComboBox<String> vzv;
    // End of variables declaration//GEN-END:variables
}
