package gestionepazienti;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class PazienteUI extends javax.swing.JFrame {
    private final String NOME_MODIFICA="MODIFICA";
    private final String NOME_TERMINA_MODIFICA="TERMINA MODIFICHE";
    
    private BarraDiagnosticaUI barra;
    private AmbulatorioOrdinarioUI ambulatorio;
    private RicadutaUI ricaduta;
    private BarraControlliUI barraControlli;
    
    public PazienteUI() {
        initComponents();
        
        ripristinaPulsanti();
        dataIns.setDate(null);
        dataIns.setEnabled(false);
        
        barra=new BarraDiagnosticaUI(this,panelBarra.getHeight(),panelBarra.getWidth());
        panelBarra.add(barra);
        pannelloDiagnostica.setVisible(false);
        AggiornaCampoDiagnosi();

        barraControlli=new BarraControlliUI(this,pannelloBarra.getHeight(),pannelloBarra.getWidth());
        pannelloBarra.add(barraControlli);
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label5 = new java.awt.Label();
        jFrame1 = new javax.swing.JFrame();
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
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(0, 0));
        diagnostica = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        dataEsord_Diagn = new org.jdesktop.swingx.JXDatePicker();
        jLabel19 = new javax.swing.JLabel();
        modEsord_Diagn = new javax.swing.JComboBox<>();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 32767));
        panelBarra = new javax.swing.JPanel();
        pannelloDiagnostica = new javax.swing.JPanel();
        dataDiagnosi = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane6 = new javax.swing.JScrollPane();
        controllo = new javax.swing.JTextArea();
        ospedale = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        dataPL = new org.jdesktop.swingx.JXDatePicker();
        jPanelPL = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        boigg1 = new javax.swing.JComboBox<>();
        jLabel79 = new javax.swing.JLabel();
        iggIF = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        iggLOC = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        iggIndex = new javax.swing.JTextField();
        caratteristicheCliniche = new javax.swing.JComboBox<>();
        diagnosi = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        dataPEV = new org.jdesktop.swingx.JXDatePicker();
        jPanel2 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        odPEV = new javax.swing.JComboBox<>();
        osPEV = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        pev = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        dataNPSI = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane9 = new javax.swing.JScrollPane();
        npsi = new javax.swing.JTextArea();
        jLabel84 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        varie = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        dataRMN = new org.jdesktop.swingx.JXDatePicker();
        jLabel72 = new javax.swing.JLabel();
        jPanelRMN = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel75 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        dataOCT = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane8 = new javax.swing.JScrollPane();
        oct = new javax.swing.JTextArea();
        caricaFile = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        controlliAmb = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cognomeContrAmb = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        nomeContrAmb = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        dataContrAmb = new org.jdesktop.swingx.JXDatePicker();
        jLabel91 = new javax.swing.JLabel();
        terapiaPrinc = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        medicoEsamContrAmb = new javax.swing.JComboBox<>();
        jLabel93 = new javax.swing.JLabel();
        tipoControllo = new javax.swing.JComboBox<>();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        panelContolloScroll = new javax.swing.JScrollPane();
        panelControlloAmb = new javax.swing.JPanel();
        pannelloBarra = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        indietro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        trovaPaziente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        terapiePregresse = new javax.swing.JTextArea();
        cognome = new javax.swing.JTextField();
        dataNascita = new org.jdesktop.swingx.JXDatePicker();
        cf = new javax.swing.JTextField();
        dataIns = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        pulsanteTerapie = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        avanti = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        telefono = new javax.swing.JList<>();
        nome = new javax.swing.JTextField();
        supCorpo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buttonMod = new javax.swing.JButton();
        gestioneTel = new javax.swing.JButton();
        indirizzo = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        dataInizioTerapia = new javax.swing.JTextField();
        terapiaAttuale = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        setBackground(new java.awt.Color(255, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setBackground(new java.awt.Color(239, 228, 176));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setOpaque(true);

        anamnestica.setBackground(new java.awt.Color(239, 228, 176));

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

        dataEsord.setEditable(false);
        dataEsord.setEnabled(false);

        modEsord.setEnabled(false);

        dataDiagno.setEditable(false);
        dataDiagno.setEnabled(false);

        storicoArea.setColumns(20);
        storicoArea.setRows(5);
        storicoArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                storicoAreaKeyReleased(evt);
            }
        });
        storiaMal.setViewportView(storicoArea);

        anamnesi.setColumns(1);
        anamnesi.setRows(1);
        anamnesi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                anamnesiKeyReleased(evt);
            }
        });
        noteScroll.setViewportView(anamnesi);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Forma clinica attuale:");

        formaClnAtt.setEnabled(false);

        filler1.setBackground(new java.awt.Color(0, 0, 0));
        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        filler1.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout anamnesticaLayout = new javax.swing.GroupLayout(anamnestica);
        anamnestica.setLayout(anamnesticaLayout);
        anamnesticaLayout.setHorizontalGroup(
            anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anamnesticaLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(29, 29, 29)
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(storiaMal)
                            .addComponent(noteScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(anamnesticaLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(dataDiagno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(260, 260, 260)
                                .addComponent(jLabel20))
                            .addGroup(anamnesticaLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(40, 40, 40)
                                .addComponent(dataEsord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(258, 258, 258)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formaClnAtt, 0, 442, Short.MAX_VALUE)
                            .addComponent(modEsord, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        anamnesticaLayout.setVerticalGroup(
            anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anamnesticaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(dataEsord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(modEsord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel16))
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(dataDiagno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(formaClnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(storiaMal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(anamnesticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(noteScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(anamnesticaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anamnestica", anamnestica);
        anamnestica.getAccessibleContext().setAccessibleName("");
        anamnestica.getAccessibleContext().setAccessibleDescription("");

        diagnostica.setBackground(new java.awt.Color(239, 228, 176));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Data di esordio:");

        dataEsord_Diagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsord_DiagnActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Modalità di esordio:");

        modEsord_Diagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modEsord_DiagnActionPerformed(evt);
            }
        });

        filler2.setBackground(new java.awt.Color(0, 0, 0));
        filler2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        filler2.setEnabled(false);

        panelBarra.setOpaque(false);

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        pannelloDiagnostica.setOpaque(false);

        dataDiagnosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDiagnosiActionPerformed(evt);
            }
        });

        controllo.setColumns(1);
        controllo.setRows(1);
        controllo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                controlloKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(controllo);

        ospedale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ospedaleKeyReleased(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(239, 228, 176));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel78.setText("PL:");

        dataPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPLActionPerformed(evt);
            }
        });

        jPanelPL.setBackground(new java.awt.Color(255, 233, 157));
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

        iggIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iggIFKeyReleased(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel80.setText("IgG Loc:");

        iggLOC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iggLOCKeyReleased(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel81.setText("IgG Index:");

        iggIndex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iggIndexKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelPLLayout = new javax.swing.GroupLayout(jPanelPL);
        jPanelPL.setLayout(jPanelPLLayout);
        jPanelPLLayout.setHorizontalGroup(
            jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPLLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boigg1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPLLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(23, 23, 23)
                        .addComponent(iggIF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPLLayout.createSequentialGroup()
                        .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iggIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iggLOC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        jPanelPLLayout.setVerticalGroup(
            jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(iggIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(iggLOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(iggIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(boigg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelPL, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(dataPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        caratteristicheCliniche.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caratteristicheCliniche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caratteristicheClinicheActionPerformed(evt);
            }
        });

        diagnosi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        diagnosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosiActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Ospedale:");

        jPanel6.setBackground(new java.awt.Color(239, 228, 176));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dataPEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPEVActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 233, 157));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel85.setText("OD:");

        jLabel86.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel86.setText("OS:");

        odPEV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normale", "Ritardo conduzione", "Ridotta ampiezza", "Rit. conduz. + Rid. ampiezza" }));
        odPEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odPEVActionPerformed(evt);
            }
        });

        osPEV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normale", "Ritardo conduzione", "Ridotta ampiezza", "Rit. conduz. + Rid. ampiezza" }));
        osPEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osPEVActionPerformed(evt);
            }
        });

        pev.setColumns(1);
        pev.setRows(1);
        pev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pevKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(pev);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85)
                            .addComponent(jLabel86))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(odPEV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(osPEV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(odPEV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(osPEV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel73.setText("PEV:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataPEV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(dataPEV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(239, 228, 176));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel77.setText("NPSI:");

        dataNPSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNPSIActionPerformed(evt);
            }
        });

        npsi.setColumns(1);
        npsi.setRows(1);
        npsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                npsiKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(npsi);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNPSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(dataNPSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9)
                .addContainerGap())
        );

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel84.setText("Diagnosi:");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel82.setText("Data della diagnosi:");

        jPanel9.setBackground(new java.awt.Color(239, 228, 176));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel87.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel87.setText("Varie:");

        varie.setColumns(1);
        varie.setRows(1);
        varie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                varieKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(varie);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addComponent(jScrollPane10))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(239, 228, 176));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dataRMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRMNActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel72.setText("RMN all'esordio:");

        jPanelRMN.setBackground(new java.awt.Color(255, 233, 157));
        jPanelRMN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBox1.setBackground(new java.awt.Color(255, 233, 157));
        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.setOpaque(false);

        jCheckBox2.setBackground(getBackground());
        jCheckBox2.setText("jCheckBox2");
        jCheckBox2.setOpaque(false);

        jCheckBox3.setBackground(getBackground());
        jCheckBox3.setText("jCheckBox3");
        jCheckBox3.setOpaque(false);

        jCheckBox4.setBackground(getBackground());
        jCheckBox4.setText("jCheckBox4");
        jCheckBox4.setOpaque(false);

        jCheckBox5.setBackground(getBackground());
        jCheckBox5.setText("altro");
        jCheckBox5.setOpaque(false);

        javax.swing.GroupLayout jPanelRMNLayout = new javax.swing.GroupLayout(jPanelRMN);
        jPanelRMN.setLayout(jPanelRMNLayout);
        jPanelRMNLayout.setHorizontalGroup(
            jPanelRMNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRMNLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelRMNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addGap(62, 62, 62))
        );
        jPanelRMNLayout.setVerticalGroup(
            jPanelRMNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRMNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanelRMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataRMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(dataRMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRMN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel75.setText("Caratteristiche Cliniche:");

        jPanel7.setBackground(new java.awt.Color(239, 228, 176));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel76.setText("OCT:");

        dataOCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataOCTActionPerformed(evt);
            }
        });

        oct.setColumns(1);
        oct.setRows(1);
        oct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                octKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(oct);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataOCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(dataOCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        caricaFile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        caricaFile.setText("Documento da caricare");
        caricaFile.setToolTipText("");
        caricaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caricaFileActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("EON:");

        javax.swing.GroupLayout pannelloDiagnosticaLayout = new javax.swing.GroupLayout(pannelloDiagnostica);
        pannelloDiagnostica.setLayout(pannelloDiagnosticaLayout);
        pannelloDiagnosticaLayout.setHorizontalGroup(
            pannelloDiagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelloDiagnosticaLayout.createSequentialGroup()
                .addGroup(pannelloDiagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelloDiagnosticaLayout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diagnosi, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataDiagnosi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ospedale, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caricaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pannelloDiagnosticaLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel75)
                        .addGap(18, 18, 18)
                        .addComponent(caratteristicheCliniche, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pannelloDiagnosticaLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pannelloDiagnosticaLayout.setVerticalGroup(
            pannelloDiagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelloDiagnosticaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelloDiagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(diagnosi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82)
                    .addComponent(dataDiagnosi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(ospedale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caricaFile))
                .addGroup(pannelloDiagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelloDiagnosticaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel22))
                    .addGroup(pannelloDiagnosticaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pannelloDiagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(caratteristicheCliniche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pannelloDiagnosticaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pannelloDiagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout diagnosticaLayout = new javax.swing.GroupLayout(diagnostica);
        diagnostica.setLayout(diagnosticaLayout);
        diagnosticaLayout.setHorizontalGroup(
            diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diagnosticaLayout.createSequentialGroup()
                .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diagnosticaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diagnosticaLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(40, 40, 40)
                                .addComponent(dataEsord_Diagn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(modEsord_Diagn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pannelloDiagnostica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        diagnosticaLayout.setVerticalGroup(
            diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diagnosticaLayout.createSequentialGroup()
                .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, diagnosticaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(diagnosticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(dataEsord_Diagn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(modEsord_Diagn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pannelloDiagnostica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(212, 346, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Diagnostica", diagnostica);

        controlliAmb.setBackground(new java.awt.Color(239, 228, 176));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Cognome:");

        cognomeContrAmb.setEnabled(false);

        jLabel89.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel89.setText("Nome:");

        nomeContrAmb.setEnabled(false);
        nomeContrAmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeContrAmbActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel90.setText("Data:");

        dataContrAmb.setEditable(false);
        dataContrAmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataContrAmbActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel91.setText("Terapia Principale:");

        terapiaPrinc.setEnabled(false);

        jLabel92.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel92.setText("Medico Esaminatore:");

        jLabel93.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel93.setText("Tipo di controllo:");

        tipoControllo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Controllo ambulatoriale", "Ricaduta" }));
        tipoControllo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoControlloActionPerformed(evt);
            }
        });

        filler3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelContolloScroll.setBackground(new java.awt.Color(239, 228, 176));
        panelContolloScroll.setOpaque(false);

        panelControlloAmb.setBackground(new java.awt.Color(239, 228, 176));

        javax.swing.GroupLayout panelControlloAmbLayout = new javax.swing.GroupLayout(panelControlloAmb);
        panelControlloAmb.setLayout(panelControlloAmbLayout);
        panelControlloAmbLayout.setHorizontalGroup(
            panelControlloAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelControlloAmbLayout.setVerticalGroup(
            panelControlloAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelContolloScroll.setViewportView(panelControlloAmb);

        pannelloBarra.setOpaque(false);

        javax.swing.GroupLayout pannelloBarraLayout = new javax.swing.GroupLayout(pannelloBarra);
        pannelloBarra.setLayout(pannelloBarraLayout);
        pannelloBarraLayout.setHorizontalGroup(
            pannelloBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1286, Short.MAX_VALUE)
        );
        pannelloBarraLayout.setVerticalGroup(
            pannelloBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout controlliAmbLayout = new javax.swing.GroupLayout(controlliAmb);
        controlliAmb.setLayout(controlliAmbLayout);
        controlliAmbLayout.setHorizontalGroup(
            controlliAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlliAmbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlliAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(controlliAmbLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(controlliAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(controlliAmbLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cognomeContrAmb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel89)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeContrAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel90)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataContrAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(terapiaPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicoEsamContrAmb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoControllo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(panelContolloScroll, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controlliAmbLayout.createSequentialGroup()
                        .addComponent(pannelloBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(106, 106, 106))
        );

        controlliAmbLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cognomeContrAmb, nomeContrAmb});

        controlliAmbLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {medicoEsamContrAmb, tipoControllo});

        controlliAmbLayout.setVerticalGroup(
            controlliAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlliAmbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlliAmbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cognomeContrAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(nomeContrAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90)
                    .addComponent(dataContrAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(terapiaPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92)
                    .addComponent(medicoEsamContrAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)
                    .addComponent(tipoControllo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelContolloScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pannelloBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
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
        jLabel63.setText("S. Cerebellare:");

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
                        .addComponent(edss))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Immunosoppressione", immunu);

        jPanel1.setBackground(new java.awt.Color(112, 146, 190));

        indietro.setText("<");
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Data inserimento:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Data di nascita:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        trovaPaziente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        trovaPaziente.setText("Trova paziente");
        trovaPaziente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trovaPazienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");

        jScrollPane1.setName("terPreg"); // NOI18N

        terapiePregresse.setEditable(false);
        terapiePregresse.setBackground(new java.awt.Color(204, 255, 204));
        terapiePregresse.setColumns(1);
        terapiePregresse.setRows(1);
        jScrollPane1.setViewportView(terapiePregresse);

        cognome.setBackground(java.awt.Color.orange);
        cognome.setName(""); // NOI18N

        dataNascita.setName(""); // NOI18N

        cf.setName(""); // NOI18N

        dataIns.setName(""); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("CF:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Superficie corporea m2:");

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        sex.setName(""); // NOI18N

        pulsanteTerapie.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pulsanteTerapie.setText("Gestisci Terapie");
        pulsanteTerapie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsanteTerapieActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Cognome:");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Indirizzo:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Terapia Attuale:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Terapie pregresse:");

        avanti.setText(">");
        avanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiActionPerformed(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonAdd.setText("AGGIUNGI");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        telefono.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(telefono);

        nome.setBackground(java.awt.Color.orange);
        nome.setName(""); // NOI18N

        supCorpo.setName(""); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Data inizio terapia:");

        buttonMod.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonMod.setText("MODIFICA");
        buttonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModActionPerformed(evt);
            }
        });

        gestioneTel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gestioneTel.setText("Gestisci Telefono");
        gestioneTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestioneTelActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel83.setText("Note:");

        note.setColumns(1);
        note.setLineWrap(true);
        note.setRows(1);
        jScrollPane7.setViewportView(note);

        dataInizioTerapia.setEditable(false);
        dataInizioTerapia.setBackground(new java.awt.Color(204, 255, 204));

        terapiaAttuale.setEditable(false);
        terapiaAttuale.setBackground(new java.awt.Color(204, 255, 204));

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel88.setText("Sesso:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PAZIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(trovaPaziente)
                        .addGap(18, 18, 18)
                        .addComponent(indietro)
                        .addGap(18, 18, 18)
                        .addComponent(avanti)
                        .addGap(18, 18, 18)
                        .addComponent(buttonMod)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAdd)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(76, 76, 76)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel88)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dataNascita, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dataInizioTerapia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pulsanteTerapie)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(terapiaAttuale, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jLabel12)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dataIns, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(gestioneTel))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(130, 130, 130))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dataIns, dataNascita});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indietro)
                            .addComponent(avanti)
                            .addComponent(trovaPaziente)
                            .addComponent(buttonMod)
                            .addComponent(buttonAdd)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(supCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(dataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel23)
                                .addComponent(indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(dataInizioTerapia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(terapiaAttuale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel83)
                                        .addGap(35, 35, 35))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(pulsanteTerapie)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dataIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gestioneTel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dataIns, dataNascita});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cognome, supCorpo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        Integer prec=Pazienti.precedente();
        if(prec!=null)
        {
            ripristinaPulsanti();
            visualizzaDati(prec);
        }
    }//GEN-LAST:event_indietroActionPerformed

    private void avantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiActionPerformed
        Integer succ=Pazienti.successivo();
        if(succ!=null)
        {
            ripristinaPulsanti();
            visualizzaDati(succ);
        }
    }//GEN-LAST:event_avantiActionPerformed

    private void trovaPazienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trovaPazienteActionPerformed
        this.setVisible(false);
        new CercaPazienteUI(this);
    }//GEN-LAST:event_trovaPazienteActionPerformed

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
                Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_anamnesiKeyReleased

    private void modEsord_DiagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modEsord_DiagnActionPerformed
        //DA FARE
    }//GEN-LAST:event_modEsord_DiagnActionPerformed

    private void caricaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caricaFileActionPerformed
        if(Pazienti.getCurrID()!=null)
        {
            JFileChooser c = new JFileChooser();
            int rVal = c.showOpenDialog(this);
        }
    }//GEN-LAST:event_caricaFileActionPerformed

    private void buttonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModActionPerformed
        if(Pazienti.getCurrID()!=null)
        {
          //CASO 1 ABILITA MODIFICA
          if(buttonMod.getText().equals(NOME_MODIFICA))
          {
              abilitaComponentiPaziente(true);
              buttonMod.setText(NOME_TERMINA_MODIFICA);
          }
          //CASO 2 TERMINA MODIFICA
          else if(buttonMod.getText().equals(NOME_TERMINA_MODIFICA))
          {
              abilitaComponentiPaziente(false);
              buttonMod.setEnabled(false);
              int reply = JOptionPane.showConfirmDialog(null,"Vuoi salvare le modifiche?", "Conferma modifiche", JOptionPane.YES_NO_OPTION);
              if(reply==JOptionPane.YES_OPTION)
              {  
                  try {
                      if(nome.getText()==null || nome.getText().length()==0 || cognome.getText()==null || cognome.getText().length()==0)
                            throw new Exception();
                      PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Paziente SET Nome=?,Cognome=?,CF=?,Sesso=?,DataNascita=?,SuperficieCorporea=?,Indirizzo=?,Note=? WHERE ID=?");
                      pst.setString(1,nome.getText());
                      pst.setString(2,cognome.getText());
                      if(cf.getText()!=null && cf.getText().length()<=16)
                        pst.setString(3,cf.getText());
                      else
                      {
                        Utilita.mostraMessaggioErrore("Codice fiscale troppo lungo");
                        throw new Exception();
                      }
                      pst.setString(4,sex.getItemAt(sex.getSelectedIndex()));
                      if(dataNascita.getDate()!=null)
                         pst.setDate(5,new Date(dataNascita.getDate().getTime()));
                      else
                         pst.setNull(5, java.sql.Types.DATE);
                      if(supCorpo.getText()==null || supCorpo.getText().length()==0)
                          pst.setNull(6, java.sql.Types.DOUBLE);
                      else
                          pst.setDouble(6, Double.parseDouble(supCorpo.getText()));
                      pst.setString(7,indirizzo.getText());
                      pst.setString(8, note.getText());
                      pst.setInt(9, Pazienti.getCurrID());
                      pst.executeUpdate();
                      
                      
                  } catch (Exception ex) {
                      Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
                      Utilita.mostraMessaggioErrore("Controllare dati inseriti");
                      buttonMod.setEnabled(true);
                      abilitaComponentiPaziente(true);
                      return;
                  }
              }
              else
              {
                  //ripristino info precedenti
                  infoPersonali(Pazienti.getCurrID());
              }
              buttonMod.setText(NOME_MODIFICA);
              buttonMod.setEnabled(true);  
           }
        }
    }//GEN-LAST:event_buttonModActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        this.setVisible(false);
        ripristinaPulsanti();
        if(Pazienti.getCurrID()!=null)
            infoPersonali(Pazienti.getCurrID());
        new NuovoPazienteUI(this);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void pulsanteTerapieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsanteTerapieActionPerformed
        if(Pazienti.getCurrID()!=null)
        {
            this.setVisible(false);
            new TerapiaUI(Pazienti.getCurrID(),this);
        }
    }//GEN-LAST:event_pulsanteTerapieActionPerformed

    private void diagnosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosiActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Diagnosi=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,(String)diagnosi.getSelectedItem());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
            if(barra.getIndicePulsanteAttuale()==0)
                formaClnAtt.setSelectedItem(diagnosi.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_diagnosiActionPerformed

    private void dataDiagnosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDiagnosiActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        Date d=Utilita.DateUtilToSQL(dataDiagnosi.getDate());
        if(d==null)
        {
            Utilita.mostraMessaggioErrore("Inserire una data valida");
            dataDiagnosi.setDate(barra.getPulsanteAttuale().getData());
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Data_Diagnosi=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setDate(1, d);
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
            int id=barra.getPulsanteAttuale().getID();
            datiDiagnosi(id);
            barra.settaSelezionatoPerData(d);
            
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);   
            Utilita.mostraMessaggioErrore("C'è già una diagnosi in questa data");
            dataDiagnosi.setDate(barra.getPulsanteAttuale().getData());
        }
    }//GEN-LAST:event_dataDiagnosiActionPerformed

    private void caratteristicheClinicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caratteristicheClinicheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caratteristicheClinicheActionPerformed

    private void dataRMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRMNActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Data_RMN=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            Date d=Utilita.DateUtilToSQL(dataRMN.getDate());
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, d);
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_dataRMNActionPerformed

    private void dataPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPLActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Data_PL=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            Date d=Utilita.DateUtilToSQL(dataPL.getDate());
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, d);
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_dataPLActionPerformed

    private void dataOCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataOCTActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Data_OCT=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            Date d=Utilita.DateUtilToSQL(dataOCT.getDate());
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, d);
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_dataOCTActionPerformed

    private void dataNPSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNPSIActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Data_NPSI=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            Date d=Utilita.DateUtilToSQL(dataNPSI.getDate());
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, d);
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_dataNPSIActionPerformed

    private void nomeContrAmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeContrAmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeContrAmbActionPerformed

    private void dataContrAmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataContrAmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataContrAmbActionPerformed

    private void tipoControlloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoControlloActionPerformed
        // TODO add your handling code here:
        aggiornaDatiControllo(1);
    }//GEN-LAST:event_tipoControlloActionPerformed

    private void dataEsord_DiagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsord_DiagnActionPerformed
       if(Pazienti.getCurrID()==null)
                return;
        try {
            int id=Pazienti.getCurrID();
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Paziente SET Data_Esordio=? WHERE ID=?");
            if(dataEsord_Diagn.getDate()!=null)
                pst.setDate(1, new Date(dataEsord_Diagn.getDate().getTime()));
            else
                pst.setNull(1, java.sql.Types.DATE);
            pst.setInt(2, id);
            pst.executeUpdate();
            infoEsordio(id);
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEsord_DiagnActionPerformed

    private void ospedaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ospedaleKeyReleased
        if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || ospedale.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Ospedale=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,ospedale.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_ospedaleKeyReleased

    private void controlloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_controlloKeyReleased
         if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || controllo.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET EON=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,controllo.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_controlloKeyReleased

    private void dataPEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPEVActionPerformed
       if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Data_PEV=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            Date d=Utilita.DateUtilToSQL(dataPEV.getDate());
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, d);
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_dataPEVActionPerformed

    private void iggIndexKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iggIndexKeyReleased
        if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || iggIndex.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET IgG_Index=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,iggIndex.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_iggIndexKeyReleased

    private void iggLOCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iggLOCKeyReleased
        if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || iggLOC.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET IgG_Loc=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,iggLOC.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_iggLOCKeyReleased

    private void iggIFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iggIFKeyReleased
        if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || iggIF.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET IgG_IF=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,iggIF.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_iggIFKeyReleased

    private void pevKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pevKeyReleased
        if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || pev.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET PEV=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,pev.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_pevKeyReleased

    private void octKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_octKeyReleased
        if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || oct.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET OCT=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,oct.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_octKeyReleased

    private void npsiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npsiKeyReleased
        if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || npsi.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET NPSI=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,npsi.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_npsiKeyReleased

    private void varieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varieKeyReleased
        if(Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null || varie.getText()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET Varie=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,varie.getText());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_varieKeyReleased

    private void odPEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odPEVActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET OD=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,(String)odPEV.getSelectedItem());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
            if(barra.getIndicePulsanteAttuale()==0)
                formaClnAtt.setSelectedItem(diagnosi.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_odPEVActionPerformed

    private void osPEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osPEVActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET OS=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,(String)osPEV.getSelectedItem());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
            if(barra.getIndicePulsanteAttuale()==0)
                formaClnAtt.setSelectedItem(diagnosi.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_osPEVActionPerformed

    private void boigg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boigg1ActionPerformed
        if(!barra.isComboBoxDiagnosiAttiva() || Pazienti.getCurrID()==null || barra.getIndicePulsanteAttuale()==null)
                return;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Diagnosi_Paziente SET BoIgG=? WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setString(1,(String)boigg1.getSelectedItem());
            pst.setDate(2, barra.getPulsanteAttuale().getData());
            pst.setInt(3,barra.getPulsanteAttuale().getID());
            pst.executeUpdate();
            if(barra.getIndicePulsanteAttuale()==0)
                formaClnAtt.setSelectedItem(diagnosi.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Errore durante esecuzione dell'operazione");
        }
    }//GEN-LAST:event_boigg1ActionPerformed
    //barra con i nomi delle diagnosi
    private void AggiornaCampoDiagnosi()
    {
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Nome FROM DIAGNOSI");
            while(rs.next())
            {
                diagnosi.addItem(rs.getString(1));
                formaClnAtt.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void abilitaComponentiPaziente(boolean ab)
    {
        nome.setEnabled(ab);
        cognome.setEnabled(ab);
        indirizzo.setEnabled(ab);
        sex.setEnabled(ab);
        supCorpo.setEnabled(ab);
        dataNascita.setEnabled(ab);
        cf.setEnabled(ab);
        note.setEnabled(ab);
    }
    private void ripristinaPulsanti()
    {
        abilitaComponentiPaziente(false);
        buttonMod.setText(NOME_MODIFICA);
        
    }
    
    public void visualizzaDati(int id)
    {
        //IMPORTANTE
        Pazienti.setCurrID(id); //!!!
        
        infoPersonali(id);
        
        infoEsordio(id);
        
        datiStorico(id);
        
        datiAnamnesi(id);
        
        datiTelefono(id);
        
        aggiornaTerapie(id);
        
        barra.setIndicePulsanteAttuale(null);   //IMP
        azzeraCampiDiagnosi();
        datiDiagnosi(id);
        barra.settaPrimoSelezionato();
        
        barraControlli.aggiornaBarra(id);
    }
    
    public void datiDiagnosi(int id)
    {
        ArrayList<Date> date=new ArrayList<Date>(); 
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Data_Diagnosi FROM Diagnosi_Paziente WHERE ID_Paziente="+id+" ORDER BY Data_Diagnosi DESC");
            while(rs.next())
            {
                date.add(rs.getDate(1));
            }
            jTabbedPane1.setTitleAt(1, "Diagnostica ("+date.size()+")");
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }   
        barra.aggiorna(date);
        if(date.size()>0)
        {
            pressionePulsanteBarra(id, date.get(0),true);
            pannelloDiagnostica.setVisible(true);
        }
        else
            pannelloDiagnostica.setVisible(false);
    }
    public void pressionePulsanteBarra(int idPaz,Date data,boolean first)
    {
        barra.setComboBoxDiagnosiAttiva(false);
        try{
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Diagnosi_Paziente WHERE Data_Diagnosi=? AND ID_Paziente=?");
            pst.setDate(1, data);
            pst.setInt(2, idPaz);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
               
                diagnosi.setSelectedItem(rs.getString("Diagnosi"));
                dataDiagnosi.setDate(data);
                ospedale.setText(rs.getString("Ospedale"));
                controllo.setText(rs.getString("EON"));
                caratteristicheCliniche.setSelectedItem(rs.getString("Caratteristiche_Cliniche"));
                dataRMN.setDate(rs.getDate("Data_RMN"));
                //MANCA RMN!!!!
                dataPL.setDate(rs.getDate("Data_PL"));
                iggIndex.setText(rs.getString("IgG_Index"));
                iggLOC.setText(rs.getString("IgG_Loc"));
                iggIF.setText(rs.getString("IgG_IF"));
                boigg1.setSelectedItem(rs.getString("BoIgG"));
                dataPEV.setDate(rs.getDate("Data_PEV"));
                pev.setText(rs.getString("PEV"));
                odPEV.setSelectedItem(rs.getString("OD"));
                osPEV.setSelectedItem(rs.getString("OS"));
                dataOCT.setDate(rs.getDate("Data_OCT"));
                oct.setText(rs.getString("OCT"));
                dataNPSI.setDate(rs.getDate("Data_NPSI"));
                npsi.setText(rs.getString("NPSI"));
                varie.setText(rs.getString("Varie"));
                if(first)
                {
                    dataDiagno.setDate(data);
                    formaClnAtt.setSelectedItem(rs.getString("Diagnosi"));
                    
                }
            }
        }
        catch(Exception ex)
        {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        barra.setComboBoxDiagnosiAttiva(true);
    }
    public void aggiornaTerapie(int id)
    {
        dataInizioTerapia.setText("");
        terapiaAttuale.setText("");
        terapiePregresse.setText("");
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT * FROM Paziente_Terapia WHERE ID_Paziente="+id+" ORDER BY Data_Inizio DESC");
            if(rs.next())
            {
                 dataInizioTerapia.setText(Utilita.dataToString(rs.getDate("Data_Inizio")));
                 
                 terapiaAttuale.setText(rs.getString("Terapia"));
                 
                 String str="";
                 while(rs.next())
                 {
                     str+=rs.getString("Terapia")+" - dal ";
                     str+=Utilita.dataToString(rs.getDate("Data_Inizio"));
                     Date d=rs.getDate("Data_Fine");
                     if(d!=null)
                     {
                          str+=" al "+Utilita.dataToString(d);
                     }
                     str+="\n";
                 }
                 terapiePregresse.setText(str);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void aggiornaDatiControllo(int idControllo)
    {
       if(idControllo==-1)
       {
           inserisciPannelloControllo(idControllo, tipoControllo.getSelectedIndex());
           return;
       }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT Data,Terapia,Medico,Tipo_Controllo,Note FROM Controllo_Standard WHERE ID_Controllo=?");
            pst.setInt(1,idControllo);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                cognomeContrAmb.setText(cognome.getText());
                nomeContrAmb.setText(nome.getText());
                dataContrAmb.setDate(rs.getDate("Data"));
                terapiaPrinc.setText(rs.getString("Terapia"));
                medicoEsamContrAmb.setSelectedItem(rs.getString("Medico"));
                tipoControllo.setSelectedItem("Tipo_Controllo");
            }
            inserisciPannelloControllo(idControllo, tipoControllo.getSelectedIndex());
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void inserisciPannelloControllo(int idControllo,int i) //i=0 ordinario, i=1 ricaduta
    {
        if(panelControlloAmb.getComponentCount()>0)
        {
            panelControlloAmb.removeAll();
        }
        switch(i)
        {
            case 0:
                ambulatorio=new AmbulatorioOrdinarioUI(this,idControllo);
                panelControlloAmb.setLayout(new BoxLayout(panelControlloAmb, BoxLayout.LINE_AXIS));
                panelControlloAmb.add(ambulatorio);
                panelControlloAmb.setVisible(false);
                panelControlloAmb.setVisible(true);
                return;
            case 1:
                ricaduta=new RicadutaUI(this,idControllo);
                panelControlloAmb.setLayout(new BoxLayout(panelControlloAmb, BoxLayout.LINE_AXIS));
                panelControlloAmb.add(ricaduta);
                panelControlloAmb.setVisible(false);
                panelControlloAmb.setVisible(true);
                return;
        }
    }
    
    public void infoPersonali(int id)
    {
       //azzero info precedenti
        nome.setText("");
        cognome.setText("");
        cf.setText("");
        sex.setSelectedItem(null);
        dataNascita.setDate(null);
        supCorpo.setText("");
        indirizzo.setText("");
        dataIns.setDate(null);
        note.setText("");
        
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Nome,Cognome,CF,Sesso,DataNascita,SuperficieCorporea,Indirizzo,DataInserimento,Note FROM Paziente WHERE ID="+id);
            if(rs.next())
            {
                nome.setText(rs.getString("Nome"));
                cognome.setText(rs.getString("Cognome"));
                cf.setText(rs.getString("CF"));
                sex.setSelectedItem(rs.getString("Sesso"));
                dataNascita.setDate(rs.getDate("DataNascita"));
                supCorpo.setText(Double.toString(rs.getDouble("SuperficieCorporea")));
                indirizzo.setText(rs.getString("Indirizzo"));
                dataIns.setDate(rs.getDate("DataInserimento"));
                note.setText(rs.getString("Note"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void infoEsordio(int id)
    {
        modEsord.setSelectedItem(null);
        dataEsord.setDate(null);
        modEsord_Diagn.setSelectedItem(null);
        dataEsord_Diagn.setDate(null);
        
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Data_Esordio,Modalita_Esordio FROM Paziente WHERE ID="+id);
            if(rs.next())
            {
                //SISTEMARE MODALITà ESORDIO
                modEsord.setSelectedItem(rs.getString("Modalita_Esordio"));
                dataEsord.setDate(rs.getDate("Data_Esordio"));
                modEsord_Diagn.setSelectedItem(rs.getString("Modalita_Esordio"));
                dataEsord_Diagn.setDate(rs.getDate("Data_Esordio"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void datiStorico(int id)
    {
        storicoArea.setText("");
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT StoriaMalattia FROM Paziente WHERE ID="+id);
            if(rs.next())
                storicoArea.setText(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void datiAnamnesi(int id)
    {
        anamnesi.setText("");
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Anamnesi FROM Paziente WHERE ID="+id);
            if(rs.next())
               anamnesi.setText(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void datiTelefono(int id)
    {
        DefaultListModel d=new DefaultListModel();
        telefono.setModel(d);
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Numero,Appartenenza FROM Telefono WHERE Paziente="+id);
            while(rs.next())
            {
                String tmp=rs.getString(1);
                if(rs.getString(2)!=null && rs.getString(2).length()>0)
                    tmp+=" - "+rs.getString(2);
                d.addElement(tmp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void azzeraCampiDiagnosi()
    {
                barra.setComboBoxDiagnosiAttiva(false);
                dataDiagno.setDate(null);
                formaClnAtt.setSelectedItem(null);
                jTabbedPane1.setTitleAt(1, "Diagnostica");
                diagnosi.setSelectedItem(null);
                dataDiagnosi.setDate(null);
                ospedale.setText(null);
                controllo.setText(null);
                caratteristicheCliniche.setSelectedItem(null);
                dataRMN.setDate(null);
                //MANCA RMN!!!!
                dataPL.setDate(null);
                iggIndex.setText(null);
                iggLOC.setText(null);
                iggIF.setText(null);
                boigg1.setSelectedItem(null);
                dataPEV.setDate(null);
                pev.setText(null);
                odPEV.setSelectedItem(null);
                osPEV.setSelectedItem(null);
                dataOCT.setDate(null);
                oct.setText(null);
                dataNPSI.setDate(null);
                npsi.setText(null);
                varie.setText(null);
                barra.setComboBoxDiagnosiAttiva(true);
    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        GestioneDatabase.connessione();
        //UIManager.setLookAndFeel("javax.swing.plaf.mac.MacLookAndFeel");
        new PazienteUI().setVisible(true);
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
    private javax.swing.JComboBox<String> caratteristicheCliniche;
    private javax.swing.JButton caricaFile;
    private javax.swing.JTextField cf;
    private javax.swing.JTextField citologiaUrin;
    private javax.swing.JTextField cognome;
    private javax.swing.JTextField cognomeContrAmb;
    private javax.swing.JPanel controlliAmb;
    private javax.swing.JTextArea controllo;
    private org.jdesktop.swingx.JXDatePicker data1;
    private org.jdesktop.swingx.JXDatePicker data2;
    private org.jdesktop.swingx.JXDatePicker dataContrAmb;
    private org.jdesktop.swingx.JXDatePicker dataControl;
    private org.jdesktop.swingx.JXDatePicker dataDiagno;
    private org.jdesktop.swingx.JXDatePicker dataDiagnosi;
    private org.jdesktop.swingx.JXDatePicker dataEsamiBaseLine;
    private org.jdesktop.swingx.JXDatePicker dataEsord;
    private org.jdesktop.swingx.JXDatePicker dataEsord_Diagn;
    private javax.swing.JTextField dataInizioTerapia;
    private org.jdesktop.swingx.JXDatePicker dataIns;
    private org.jdesktop.swingx.JXDatePicker dataNPSI;
    private org.jdesktop.swingx.JXDatePicker dataNascita;
    private org.jdesktop.swingx.JXDatePicker dataOCT;
    private org.jdesktop.swingx.JXDatePicker dataPEV;
    private org.jdesktop.swingx.JXDatePicker dataPL;
    private org.jdesktop.swingx.JXDatePicker dataRMN;
    private javax.swing.JComboBox<String> diagnosi;
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
    private javax.swing.JTextField esUrine;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelPL;
    private javax.swing.JPanel jPanelRMN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
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
    private javax.swing.JComboBox<String> medicoEsamContrAmb;
    private javax.swing.JComboBox<String> modEsord;
    private javax.swing.JComboBox<String> modEsord_Diagn;
    private javax.swing.JTextField mon;
    private javax.swing.JTextField mon1;
    private javax.swing.JTextField mon2;
    private javax.swing.JTextField neu;
    private javax.swing.JTextField neu1;
    private javax.swing.JTextField neu2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nomeContrAmb;
    private javax.swing.JTextArea note;
    private javax.swing.JScrollPane noteScroll;
    private javax.swing.JTextArea npsi;
    private javax.swing.JTextField numCiclo;
    private javax.swing.JTextArea oct;
    private javax.swing.JComboBox<String> odPEV;
    private javax.swing.JComboBox<String> osPEV;
    private javax.swing.JTextField ospedale;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JScrollPane panelContolloScroll;
    private javax.swing.JPanel panelControlloAmb;
    private javax.swing.JPanel pannelloBarra;
    private javax.swing.JPanel pannelloDiagnostica;
    private javax.swing.JTextField pbg;
    private javax.swing.JTextArea pev;
    private javax.swing.JButton pulsanteTerapie;
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
    private javax.swing.JTextField terapiaAttuale;
    private javax.swing.JTextField terapiaPrinc;
    private javax.swing.JTextArea terapieConcomit;
    private javax.swing.JTextArea terapiePregresse;
    private javax.swing.JComboBox<String> tipoContol;
    private javax.swing.JComboBox<String> tipoControllo;
    private javax.swing.JButton trovaPaziente;
    private javax.swing.JTextArea varie;
    // End of variables declaration//GEN-END:variables
}
