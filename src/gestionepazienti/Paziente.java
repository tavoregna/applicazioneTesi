
package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


public class Paziente extends javax.swing.JFrame {
    
    /**
     * Creates new form Paziente
     */
    public Paziente() {
        initComponents();
        dataIns.setDate(new java.util.Date());
        jPanelPL.setVisible(false);
        jPanelRMN.setVisible(false);
        this.setVisible(true);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label5 = new java.awt.Label();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cognome = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        cf = new javax.swing.JTextField();
        terapAtt = new javax.swing.JComboBox<>();
        supCorpo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        terPreg = new javax.swing.JTextArea();
        dataIns = new org.jdesktop.swingx.JXDatePicker();
        dataBorn = new org.jdesktop.swingx.JXDatePicker();
        dataInTer = new org.jdesktop.swingx.JXDatePicker();
        buttonMod = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        anamnestica = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dataEsord = new org.jdesktop.swingx.JXDatePicker();
        modEsord = new javax.swing.JComboBox<>();
        dataDiagno = new org.jdesktop.swingx.JXDatePicker();
        storiaMal = new javax.swing.JScrollPane();
        storicoArea = new javax.swing.JTextArea();
        noteScroll = new javax.swing.JScrollPane();
        anamnesi = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        formaClnAtt = new javax.swing.JComboBox<>();
        diagnostica = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        pev1 = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        featuresClinic1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        dataEsord_Diagn = new org.jdesktop.swingx.JXDatePicker();
        jLabel19 = new javax.swing.JLabel();
        modEsord_Diagn = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        ospedale = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        controllo = new javax.swing.JTextArea();
        jLabel76 = new javax.swing.JLabel();
        oct = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        npsi = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanelPL = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        boigg1 = new javax.swing.JComboBox<>();
        jLabel79 = new javax.swing.JLabel();
        iggIF = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        iggLOC = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        iggIndex = new javax.swing.JTextField();
        jButtonPL = new javax.swing.JButton();
        jButtonRMN = new javax.swing.JButton();
        jPanelRMN = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        controlliAmb = new javax.swing.JPanel();
        immunu = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        dataControl = new org.jdesktop.swingx.JXDatePicker();
        jLabel25 = new javax.swing.JLabel();
        dosaggio = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        numCiclo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tipoContol = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        medicoEsam = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        gr = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        hb = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        hct = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        pbg = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        esUrine = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        citologiaUrin = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        ecg = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        ecografiaVescic = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        ecocardio = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        dataEsamiBaseLine = new org.jdesktop.swingx.JXDatePicker();
        jLabel39 = new javax.swing.JLabel();
        gb = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        neu = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        linf = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        linfAss = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        mon = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        eo = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        bas = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        data1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel48 = new javax.swing.JLabel();
        gb1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        neu1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        linf1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        linfAss1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        mon1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        eo1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        bas1 = new javax.swing.JTextField();
        data2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel55 = new javax.swing.JLabel();
        gb2 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        neu2 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        linf2 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        linfAss2 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        mon2 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        eo2 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        bas2 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        sPiramidale = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        sCelebrale = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        sVisivo = new javax.swing.JTextField();
        sTroncoEncefalico = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        sSensitivo = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        sSfinterico = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        edss = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        en = new javax.swing.JTextArea();
        jLabel70 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        terapieConcomit = new javax.swing.JTextArea();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        epidem = new javax.swing.JPanel();
        nps = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        indirizzo = new javax.swing.JTextField();
        indietro = new javax.swing.JButton();
        avanti = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        telefono = new javax.swing.JList<>();
        gestioneTel = new javax.swing.JButton();

        label5.setText("label5");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PAZIENTE");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAZIENTE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Data inserimento:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Cognome:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Sesso:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Data di nascita:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("CF:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Terapia Attuale:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Data inizio terapia:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Superficie corporea m2:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Terapie pregresse:");

        nome.setName(""); // NOI18N

        cognome.setName(""); // NOI18N

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        sex.setName(""); // NOI18N

        cf.setName(""); // NOI18N

        terapAtt.setName(""); // NOI18N

        supCorpo.setName(""); // NOI18N

        jScrollPane1.setName("terPreg"); // NOI18N

        terPreg.setColumns(20);
        terPreg.setRows(5);
        jScrollPane1.setViewportView(terPreg);

        dataIns.setName(""); // NOI18N
        dataIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInsActionPerformed(evt);
            }
        });

        dataBorn.setName(""); // NOI18N

        dataInTer.setName(""); // NOI18N

        buttonMod.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonMod.setText("MODIFICA");

        buttonAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonAdd.setText("AGGIUNGI");

        jTabbedPane1.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Data di esordio:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Modalità di esordio:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Data della diagnosi:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Storia di malattia:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Anamnesi");

        modEsord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modEsordActionPerformed(evt);
            }
        });

        dataDiagno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDiagnoActionPerformed(evt);
            }
        });

        storicoArea.setColumns(20);
        storicoArea.setRows(5);
        storicoArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                storicoAreaKeyReleased(evt);
            }
        });
        storiaMal.setViewportView(storicoArea);

        anamnesi.setColumns(20);
        anamnesi.setRows(5);
        anamnesi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                anamnesiKeyReleased(evt);
            }
        });
        noteScroll.setViewportView(anamnesi);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Forma clinica attuale:");

        javax.swing.GroupLayout anamnesticaLayout = new javax.swing.GroupLayout(anamnestica);
        anamnestica.setLayout(anamnesticaLayout);
        anamnesticaLayout.setHorizontalGroup(
            anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anamnesticaLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(anamnesticaLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(modEsord, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(anamnesticaLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(40, 40, 40)
                                .addComponent(dataEsord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataDiagno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formaClnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(156, Short.MAX_VALUE))
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(29, 29, 29)
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(storiaMal, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                            .addComponent(noteScroll))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        anamnesticaLayout.setVerticalGroup(
            anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anamnesticaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(dataEsord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(dataDiagno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(modEsord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(formaClnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addComponent(jLabel16))
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(storiaMal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(noteScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17)))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anamnestica", anamnestica);

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel72.setText("RMN all'esordio:");

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel73.setText("PEV:");

        jLabel75.setText("Caratteristiche Cliniche:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Data di esordio:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Modalità di esordio:");

        modEsord_Diagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modEsord_DiagnActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Ospedale:");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Controllo:");

        controllo.setColumns(20);
        controllo.setRows(5);
        jScrollPane6.setViewportView(controllo);

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel76.setText("OCT:");

        oct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel77.setText("NPSI:");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel78.setText("PL:");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("VEDI SCHEDE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanelPL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel74.setText("BoIgG:");

        boigg1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negarivo" }));
        boigg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boigg1ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel79.setText("IgG IF:");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel80.setText("IgG Loc:");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel81.setText("IgG Index:");

        javax.swing.GroupLayout jPanelPLLayout = new javax.swing.GroupLayout(jPanelPL);
        jPanelPL.setLayout(jPanelPLLayout);
        jPanelPLLayout.setHorizontalGroup(
            jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPLLayout.createSequentialGroup()
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPLLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(18, 18, 18)
                        .addComponent(boigg1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPLLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(18, 18, 18)
                        .addComponent(iggIF))
                    .addGroup(jPanelPLLayout.createSequentialGroup()
                        .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iggLOC)
                            .addComponent(iggIndex))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanelPLLayout.setVerticalGroup(
            jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPLLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(iggIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(iggLOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iggIF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(boigg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonPL.setText(">");
        jButtonPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPLActionPerformed(evt);
            }
        });

        jButtonRMN.setText(">");
        jButtonRMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRMNActionPerformed(evt);
            }
        });

        jPanelRMN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        jCheckBox3.setText("jCheckBox3");

        jCheckBox4.setText("jCheckBox4");

        jCheckBox5.setText("altro");

        javax.swing.GroupLayout jPanelRMNLayout = new javax.swing.GroupLayout(jPanelRMN);
        jPanelRMN.setLayout(jPanelRMNLayout);
        jPanelRMNLayout.setHorizontalGroup(
            jPanelRMNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRMNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRMNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelRMNLayout.setVerticalGroup(
            jPanelRMNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRMNLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout diagnosticaLayout = new javax.swing.GroupLayout(diagnostica);
        diagnostica.setLayout(diagnosticaLayout);
        diagnosticaLayout.setHorizontalGroup(
            diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diagnosticaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diagnosticaLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(ospedale, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel75)
                        .addGap(18, 18, 18)
                        .addComponent(featuresClinic1, 0, 244, Short.MAX_VALUE)
                        .addGap(710, 710, 710))
                    .addGroup(diagnosticaLayout.createSequentialGroup()
                        .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(40, 40, 40)
                                .addComponent(dataEsord_Diagn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(modEsord_Diagn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel77)
                                .addGap(18, 18, 18)
                                .addComponent(npsi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel76))
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPL)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addComponent(oct, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pev1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRMN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelRMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diagnosticaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(561, 561, 561))
        );
        diagnosticaLayout.setVerticalGroup(
            diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diagnosticaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(ospedale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(featuresClinic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(dataEsord_Diagn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(modEsord_Diagn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(npsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76)
                    .addComponent(oct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(pev1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diagnosticaLayout.createSequentialGroup()
                        .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel22))
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelRMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(diagnosticaLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonRMN, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel72))))))
                        .addGap(0, 219, Short.MAX_VALUE))
                    .addGroup(diagnosticaLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        diagnosticaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanelPL, jPanelRMN});

        jTabbedPane1.addTab("Diagnostica()", diagnostica);

        javax.swing.GroupLayout controlliAmbLayout = new javax.swing.GroupLayout(controlliAmb);
        controlliAmb.setLayout(controlliAmbLayout);
        controlliAmbLayout.setHorizontalGroup(
            controlliAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1374, Short.MAX_VALUE)
        );
        controlliAmbLayout.setVerticalGroup(
            controlliAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Controlli ambulatoriali", controlliAmb);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Data del controllo:");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("Dosaggio:");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Ciclo N°:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setText("Tipo di Controllo:");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Medico Esaminatore:");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setText("GR:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setText("Hb:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel31.setText("Hct:");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel32.setText("PBG:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("Es Urine:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel34.setText("Citologia Urinaria:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("ECG:");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setText("Ecografia Vescicolare:");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setText("Ecocardio:");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel38.setText("Data Esami Baseline:");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel39.setText("GB:");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel40.setText("Neu:");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel41.setText("Linf:");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel42.setText("Linf Ass:");

        linfAss.setToolTipText("");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel43.setText("Mon:");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel44.setText("Eo:");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel45.setText("Bas:");
        jLabel45.setToolTipText("");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel46.setText("Data 1°:");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel47.setText("Data 2°:");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel48.setText("GB:");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel49.setText("Neu:");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel50.setText("Linf:");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel51.setText("Linf Ass:");

        linfAss1.setToolTipText("");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel52.setText("Mon:");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel53.setText("Eo:");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel54.setText("Bas:");
        jLabel54.setToolTipText("");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel55.setText("GB:");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel56.setText("Neu:");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel57.setText("Linf:");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel58.setText("Linf Ass:");

        linfAss2.setToolTipText("");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel59.setText("Mon:");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel60.setText("Eo:");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel61.setText("Bas:");
        jLabel61.setToolTipText("");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel62.setText("S. Piramidale:");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel63.setText("S. Celebrale:");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel64.setText("S. Visivo:");

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel65.setText("S. Troncoencefalico:");

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel66.setText("S. Sensitivo:");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel67.setText("S. Sfinterico:");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel68.setText("EDSS:");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel69.setText("EN:");

        en.setColumns(20);
        en.setRows(5);
        jScrollPane2.setViewportView(en);

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel70.setText("Terapie Concomitanti:");

        terapieConcomit.setColumns(20);
        terapieConcomit.setRows(5);
        jScrollPane3.setViewportView(terapieConcomit);

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel71.setText("Note:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout immunuLayout = new javax.swing.GroupLayout(immunu);
        immunu.setLayout(immunuLayout);
        immunuLayout.setHorizontalGroup(
            immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(immunuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(immunuLayout.createSequentialGroup()
                        .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(immunuLayout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sPiramidale, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(immunuLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(130, 130, 130)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sCelebrale, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sTroncoEncefalico, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sVisivo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sSfinterico, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sSensitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edss, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addGroup(immunuLayout.createSequentialGroup()
                        .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(immunuLayout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(immunuLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(dataControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(dosaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipoContol, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(medicoEsam, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(immunuLayout.createSequentialGroup()
                                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(immunuLayout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ecografiaVescic, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ecocardio))
                                    .addGroup(immunuLayout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pbg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(esUrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(citologiaUrin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel35)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ecg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(immunuLayout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(immunuLayout.createSequentialGroup()
                                    .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel55)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(gb2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel56)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(neu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel57)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(linf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel58)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(linfAss2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel59)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel60)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(eo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel61)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, immunuLayout.createSequentialGroup()
                                        .addComponent(jLabel46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(data1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gb1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(neu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(linf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(linfAss1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(eo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, immunuLayout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dataEsamiBaseLine, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(neu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(linf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(linfAss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(eo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        immunuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {citologiaUrin, dosaggio, ecg, esUrine, numCiclo, pbg});

        immunuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bas, bas1, bas2, eo, eo1, eo2, gb, gb1, gb2, gr, hb, hct, linf, linf1, linf2, linfAss, linfAss1, linfAss2, mon, mon1, mon2, neu, neu1, neu2});

        immunuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        immunuLayout.setVerticalGroup(
            immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(immunuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(dataControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(dosaggio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(numCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(tipoContol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(medicoEsam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(hb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(hct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(pbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(esUrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(citologiaUrin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(ecg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(ecografiaVescic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(ecocardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(dataEsamiBaseLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(gb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(neu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(linf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(linfAss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(eo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(bas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(data1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(gb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(neu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(linf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(linfAss1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(mon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(eo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(bas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(gb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(neu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(linf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(linfAss2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(mon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(eo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(bas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(sPiramidale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(sCelebrale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(sTroncoEncefalico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(sVisivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(sSfinterico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(sSensitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(edss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(immunuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel70))
                    .addGroup(immunuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69)))
                .addGroup(immunuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(immunuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(immunuLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel71)))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Immunosoppressione", immunu);

        javax.swing.GroupLayout epidemLayout = new javax.swing.GroupLayout(epidem);
        epidem.setLayout(epidemLayout);
        epidemLayout.setHorizontalGroup(
            epidemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1374, Short.MAX_VALUE)
        );
        epidemLayout.setVerticalGroup(
            epidemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Epidemiologica", epidem);

        javax.swing.GroupLayout npsLayout = new javax.swing.GroupLayout(nps);
        nps.setLayout(npsLayout);
        npsLayout.setHorizontalGroup(
            npsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1374, Short.MAX_VALUE)
        );
        npsLayout.setVerticalGroup(
            npsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Valutazione NPS", nps);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Indirizzo:");

        indirizzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indirizzoActionPerformed(evt);
            }
        });

        indietro.setText("<");
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });

        avanti.setText(">");
        avanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiActionPerformed(evt);
            }
        });

        jButton1.setText("Trova paziente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        telefono.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(telefono);

        gestioneTel.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        gestioneTel.setText("GESTISCI");
        gestioneTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestioneTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(indietro)
                                .addGap(18, 18, 18)
                                .addComponent(avanti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataInTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(supCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dataBorn, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nome)
                                        .addComponent(terapAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(773, 773, 773)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(dataIns, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(buttonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gestioneTel)
                        .addGap(67, 67, 67))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dataBorn, dataInTer, dataIns});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(indietro)
                                .addComponent(avanti)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(dataIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dataBorn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(terapAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(dataInTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(supCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gestioneTel)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dataBorn, dataInTer, dataIns});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInsActionPerformed

    private void modEsordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modEsordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modEsordActionPerformed

    private void indirizzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indirizzoActionPerformed

    }//GEN-LAST:event_indirizzoActionPerformed

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        Integer prec=Pazienti.precedente();
        if(prec!=null)
            visualizzaDati(prec);
    }//GEN-LAST:event_indietroActionPerformed

    private void avantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiActionPerformed
        Integer succ=Pazienti.successivo();
        if(succ!=null)
            visualizzaDati(succ);
    }//GEN-LAST:event_avantiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new CercaPaziente(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gestioneTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestioneTelActionPerformed
        if(Pazienti.getCurrID()!=null)
        {
            this.setVisible(false);
            new TelefonoUI(Pazienti.getCurrID(),this);
        }
    }//GEN-LAST:event_gestioneTelActionPerformed

    private void storicoAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_storicoAreaKeyReleased
        if(Pazienti.getCurrID()!=null && storicoArea.getText()!=null)
        {
            
            try {
                PreparedStatement st=GestioneDatabase.preparedStatement("UPDATE Paziente SET StoriaMalattia=? WHERE ID=?");
                st.setString(1, storicoArea.getText());
                st.setInt(2, Pazienti.getCurrID());
                st.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(Paziente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_storicoAreaKeyReleased

    private void anamnesiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anamnesiKeyReleased
         if(Pazienti.getCurrID()!=null && anamnesi.getText()!=null)
        {
            
            try {
                PreparedStatement st=GestioneDatabase.preparedStatement("UPDATE Paziente SET Anamnesi=? WHERE ID=?");
                st.setString(1, anamnesi.getText());
                st.setInt(2, Pazienti.getCurrID());
                st.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(Paziente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_anamnesiKeyReleased

    private void dataDiagnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDiagnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDiagnoActionPerformed

    private void modEsord_DiagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modEsord_DiagnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modEsord_DiagnActionPerformed

    private void octActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_octActionPerformed

    private void boigg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boigg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boigg1ActionPerformed

    private void jButtonPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPLActionPerformed
        // TODO add your handling code here:
        if(jPanelPL.isVisible())
        {
         jPanelPL.setVisible(false);
         jButtonPL.setText(">");
        }
        else
        {
            jPanelPL.setVisible(true); 
            jButtonPL.setText("<");
        }
    }//GEN-LAST:event_jButtonPLActionPerformed

    private void jButtonRMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRMNActionPerformed
        // TODO add your handling code here:
        if(jPanelRMN.isVisible())
        {
         jPanelRMN.setVisible(false);
         jButtonRMN.setText(">");
        }
        else
        {
            jPanelRMN.setVisible(true); 
            jButtonRMN.setText("<");
        }
    }//GEN-LAST:event_jButtonRMNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Schede_Diagnosi(this);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void visualizzaDati(int id)
    {
        Pazienti.setCurrID(id);
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Nome,Cognome FROM Paziente WHERE ID="+id);
            if(rs.next())
            {
                nome.setText(rs.getString("Nome"));
                cognome.setText(rs.getString("Cognome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Paziente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        datiStorico(id);
        
        datiTelefono(id);
        
        datiAnamnesi(id);
    }
    public void datiStorico(int id)
    {
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT StoriaMalattia FROM Paziente WHERE ID="+id);
            if(rs.next())
                storicoArea.setText(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(Paziente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void datiAnamnesi(int id)
    {
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Anamnesi FROM Paziente WHERE ID="+id);
            if(rs.next())
               anamnesi.setText(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(Paziente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void datiTelefono(int id)
    {
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Numero,Appartenenza FROM Telefono WHERE Paziente="+id);
            DefaultListModel d=new DefaultListModel();
            while(rs.next())
            {
                String tmp=rs.getString(1);
                if(rs.getString(2)!=null && rs.getString(2).length()>0)
                    tmp+=" - "+rs.getString(2);
                d.addElement(tmp);
            }
                telefono.setModel(d);
        } catch (SQLException ex) {
            Logger.getLogger(Paziente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        GestioneDatabase.connessione();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paziente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paziente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paziente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paziente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paziente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea anamnesi;
    private javax.swing.JPanel anamnestica;
    private javax.swing.JButton avanti;
    private javax.swing.JTextField bas;
    private javax.swing.JTextField bas1;
    private javax.swing.JTextField bas2;
    private javax.swing.JComboBox<String> boigg1;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonMod;
    private javax.swing.JTextField cf;
    private javax.swing.JTextField citologiaUrin;
    private javax.swing.JTextField cognome;
    private javax.swing.JPanel controlliAmb;
    private javax.swing.JTextArea controllo;
    private org.jdesktop.swingx.JXDatePicker data1;
    private org.jdesktop.swingx.JXDatePicker data2;
    private org.jdesktop.swingx.JXDatePicker dataBorn;
    private org.jdesktop.swingx.JXDatePicker dataControl;
    private org.jdesktop.swingx.JXDatePicker dataDiagno;
    private org.jdesktop.swingx.JXDatePicker dataEsamiBaseLine;
    private org.jdesktop.swingx.JXDatePicker dataEsord;
    private org.jdesktop.swingx.JXDatePicker dataEsord_Diagn;
    private org.jdesktop.swingx.JXDatePicker dataInTer;
    private org.jdesktop.swingx.JXDatePicker dataIns;
    private javax.swing.JPanel diagnostica;
    private javax.swing.JTextField dosaggio;
    private javax.swing.JTextField ecg;
    private javax.swing.JTextField ecocardio;
    private javax.swing.JTextField ecografiaVescic;
    private javax.swing.JTextField edss;
    private javax.swing.JTextArea en;
    private javax.swing.JTextField eo;
    private javax.swing.JTextField eo1;
    private javax.swing.JTextField eo2;
    private javax.swing.JPanel epidem;
    private javax.swing.JTextField esUrine;
    private javax.swing.JComboBox<String> featuresClinic1;
    private javax.swing.JComboBox<String> formaClnAtt;
    private javax.swing.JTextField gb;
    private javax.swing.JTextField gb1;
    private javax.swing.JTextField gb2;
    private javax.swing.JButton gestioneTel;
    private javax.swing.JTextField gr;
    private javax.swing.JTextField hb;
    private javax.swing.JTextField hct;
    private javax.swing.JTextField iggIF;
    private javax.swing.JTextField iggIndex;
    private javax.swing.JTextField iggLOC;
    private javax.swing.JPanel immunu;
    private javax.swing.JButton indietro;
    private javax.swing.JTextField indirizzo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonPL;
    private javax.swing.JButton jButtonRMN;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelPL;
    private javax.swing.JPanel jPanelRMN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private java.awt.Label label5;
    private javax.swing.JTextField linf;
    private javax.swing.JTextField linf1;
    private javax.swing.JTextField linf2;
    private javax.swing.JTextField linfAss;
    private javax.swing.JTextField linfAss1;
    private javax.swing.JTextField linfAss2;
    private javax.swing.JComboBox<String> medicoEsam;
    private javax.swing.JComboBox<String> modEsord;
    private javax.swing.JComboBox<String> modEsord_Diagn;
    private javax.swing.JTextField mon;
    private javax.swing.JTextField mon1;
    private javax.swing.JTextField mon2;
    private javax.swing.JTextField neu;
    private javax.swing.JTextField neu1;
    private javax.swing.JTextField neu2;
    private javax.swing.JTextField nome;
    private javax.swing.JScrollPane noteScroll;
    private javax.swing.JPanel nps;
    private javax.swing.JTextField npsi;
    private javax.swing.JTextField numCiclo;
    private javax.swing.JTextField oct;
    private javax.swing.JTextField ospedale;
    private javax.swing.JTextField pbg;
    private javax.swing.JComboBox<String> pev1;
    private javax.swing.JTextField sCelebrale;
    private javax.swing.JTextField sPiramidale;
    private javax.swing.JTextField sSensitivo;
    private javax.swing.JTextField sSfinterico;
    private javax.swing.JTextField sTroncoEncefalico;
    private javax.swing.JTextField sVisivo;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JScrollPane storiaMal;
    private javax.swing.JTextArea storicoArea;
    private javax.swing.JTextField supCorpo;
    private javax.swing.JList<String> telefono;
    private javax.swing.JTextArea terPreg;
    private javax.swing.JComboBox<String> terapAtt;
    private javax.swing.JTextArea terapieConcomit;
    private javax.swing.JComboBox<String> tipoContol;
    // End of variables declaration//GEN-END:variables
}
