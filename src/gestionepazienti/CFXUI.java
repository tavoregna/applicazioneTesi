package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CFXUI extends javax.swing.JPanel {

    private PazienteUI parent;
    private int idCFX;
    
    private boolean noteEdit;
    private boolean dosaggioEdit;
    private boolean grEdit;
    private boolean hbEdit;
    private boolean hctEdit;
    private boolean pbgEdit;
    private boolean esUrineEdit;
    private boolean citologiaUrinEdit;
    private boolean ecgEdit;
    private boolean ecografiaVescicEdit;
    private boolean ecocardioEdit;
    private boolean gbEdit;
    private boolean neuEdit;
    private boolean linfEdit;
    private boolean linfAssEdit;
    private boolean monEdit;
    private boolean eoEdit;
    private boolean basEdit;
    private boolean gb1Edit;
    private boolean gb2Edit;
    private boolean neu1Edit;
    private boolean neu2Edit;
    private boolean linf1Edit;
    private boolean linf2Edit;
    private boolean linfAss1Edit;
    private boolean linfAss2Edit;
    private boolean mon1Edit;
    private boolean mon2Edit;
    private boolean eo1Edit;
    private boolean eo2Edit;
    private boolean bas1Edit;
    private boolean bas2Edit;
    private boolean sPiramidaleEdit;
    private boolean sCerebellareEdit;
    private boolean sTroncoEncEdit;
    private boolean sVisivoEdit;
    private boolean sSfintericoEdit;
    private boolean sSensitivoEdit;
    private boolean edssEdit;
    private boolean enEdit;
    private boolean terapieConcomitEdit;
    
    
    
    public CFXUI(PazienteUI p,int id) {
        initComponents();
        cancellaCFX.setVisible(Opzioni.cancellaAttivo);
        idCFX=id;
        parent=p;
        aggiornaDatiCFX(idCFX);
        Utilita.undoAndRedo(this);
    }

    public void aggiornaDatiCFX(int id)
    {
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM CFX WHERE ID_CFX=?");
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
               ecografiaVescic.setText(rs.getString("Ecografia_Vescicolare"));
               dataEsamiBaseLine.setDate(rs.getDate("Data_Esami_BaseLine"));
               en.setText(rs.getString("EN"));
               data1.setDate(rs.getDate("Data_1"));
               terapieConcomit.setText(rs.getString("Terapie_Concomitanti"));
               note.setText(rs.getString("Note"));
               data2.setDate(rs.getDate("Data_2"));
               dosaggio.setText(rs.getString("Dosaggio"));
               gr.setText(rs.getString("GR"));
               sPiramidale.setText(rs.getString("Piramidale"));
               sSensitivo.setText(rs.getString("Sensitivo"));
               sVisivo.setText(rs.getString("Visivo"));
               sTroncoEnc.setText(rs.getString("Tronco_Encefalico"));
               sCerebellare.setText(rs.getString("Cerebellare"));
               sSfinterico.setText(rs.getString("Sfinterico"));
               edss.setText(rs.getString("EDSS"));
               gb.setText(rs.getString("GB"));
               gb1.setText(rs.getString("GB_1"));
               gb2.setText(rs.getString("GB_2"));
               neu.setText(rs.getString("Neu"));
               neu1.setText(rs.getString("Neu_1"));
               neu2.setText(rs.getString("Neu_2"));
               linf.setText(rs.getString("Linf"));
               linf1.setText(rs.getString("Linf_1"));
               linf2.setText(rs.getString("Linf_2"));
               linfAss.setText(rs.getString("Linf_Ass"));
               linfAss1.setText(rs.getString("Linf_Ass_1"));
               linfAss2.setText(rs.getString("Linf_Ass_2"));
               mon.setText(rs.getString("Mon"));
               mon1.setText(rs.getString("Mon_1"));
               mon2.setText(rs.getString("Mon_2"));
               eo.setText(rs.getString("EO"));
               eo1.setText(rs.getString("EO_1"));
               eo2.setText(rs.getString("EO_2"));
               bas.setText(rs.getString("Bas"));
               bas1.setText(rs.getString("Bas_1"));
               bas2.setText(rs.getString("Bas_2"));
               ecocardio.setText(rs.getString("Ecocardio"));
               hb.setText(rs.getString("HB"));
               hct.setText(rs.getString("HCT"));
               pbg.setText(rs.getString("PBG"));
               ecg.setText(rs.getString("ECG"));
               citologiaUrin.setText(rs.getString("Citologia_Urinaria"));
               esUrine.setText(rs.getString("Es_Urine"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel31 = new javax.swing.JLabel();
        hct = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        hb = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        gr = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        terapieConcomit = new javax.swing.JTextArea();
        mon1 = new javax.swing.JTextField();
        edss = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        linfAss1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        en = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        linf1 = new javax.swing.JTextField();
        pbg = new javax.swing.JTextField();
        neu1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        gb1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        ecg = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        ecografiaVescic = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        esUrine = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        citologiaUrin = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        linf2 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        ecocardio = new javax.swing.JTextField();
        gb2 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        neu2 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        bas1 = new javax.swing.JTextField();
        data2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel55 = new javax.swing.JLabel();
        eo1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        neu = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        gb = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        linfAss = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        linf = new javax.swing.JTextField();
        sPiramidale = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        bas2 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        linfAss2 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        eo2 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        mon2 = new javax.swing.JTextField();
        dosaggio = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        dataEsamiBaseLine = new org.jdesktop.swingx.JXDatePicker();
        jLabel38 = new javax.swing.JLabel();
        eo = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        bas = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        data1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel48 = new javax.swing.JLabel();
        sSfinterico = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        sCerebellare = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        sVisivo = new javax.swing.JTextField();
        sTroncoEnc = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        sSensitivo = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        mon = new javax.swing.JTextField();
        cancellaCFX = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(1721, 567));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel31.setText("Hct:");

        hct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hctFocusLost(evt);
            }
        });
        hct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hctKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setText("Hb:");

        hb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hbFocusLost(evt);
            }
        });
        hb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbActionPerformed(evt);
            }
        });
        hb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hbKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setText("GR:");

        gr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                grFocusLost(evt);
            }
        });
        gr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grKeyReleased(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel70.setText("Terapie Concomitanti:");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel53.setText("Eo:");

        terapieConcomit.setColumns(20);
        terapieConcomit.setRows(5);
        terapieConcomit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                terapieConcomitFocusLost(evt);
            }
        });
        terapieConcomit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                terapieConcomitKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(terapieConcomit);

        mon1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mon1FocusLost(evt);
            }
        });
        mon1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mon1KeyReleased(evt);
            }
        });

        edss.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edssFocusLost(evt);
            }
        });
        edss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edssKeyReleased(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel52.setText("Mon:");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel68.setText("EDSS:");

        linfAss1.setToolTipText("");
        linfAss1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfAss1FocusLost(evt);
            }
        });
        linfAss1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfAss1KeyReleased(evt);
            }
        });

        en.setColumns(20);
        en.setRows(5);
        en.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                enFocusLost(evt);
            }
        });
        en.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(en);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel51.setText("Linf Ass:");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel32.setText("PBG:");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel69.setText("EN:");

        linf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linf1FocusLost(evt);
            }
        });
        linf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linf1KeyReleased(evt);
            }
        });

        pbg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pbgFocusLost(evt);
            }
        });
        pbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbgActionPerformed(evt);
            }
        });
        pbg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pbgKeyReleased(evt);
            }
        });

        neu1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                neu1FocusLost(evt);
            }
        });
        neu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                neu1KeyReleased(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel50.setText("Linf:");

        gb1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                gb1FocusLost(evt);
            }
        });
        gb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gb1KeyReleased(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel49.setText("Neu:");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel71.setText("Note:");

        note.setColumns(20);
        note.setRows(5);
        note.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                noteFocusLost(evt);
            }
        });
        note.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noteKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(note);

        ecg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ecgFocusLost(evt);
            }
        });
        ecg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ecgKeyReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setText("Ecografia Vescicolare:");

        ecografiaVescic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ecografiaVescicFocusLost(evt);
            }
        });
        ecografiaVescic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ecografiaVescicKeyReleased(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setText("Ecocardio:");

        esUrine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                esUrineFocusLost(evt);
            }
        });
        esUrine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                esUrineKeyReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel34.setText("Citologia Urinaria:");

        citologiaUrin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                citologiaUrinFocusLost(evt);
            }
        });
        citologiaUrin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                citologiaUrinKeyReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("ECG:");

        linf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linf2FocusLost(evt);
            }
        });
        linf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linf2KeyReleased(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel56.setText("Neu:");

        ecocardio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ecocardioFocusLost(evt);
            }
        });
        ecocardio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ecocardioKeyReleased(evt);
            }
        });

        gb2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                gb2FocusLost(evt);
            }
        });
        gb2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gb2KeyReleased(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel57.setText("Linf:");

        neu2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                neu2FocusLost(evt);
            }
        });
        neu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                neu2KeyReleased(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel54.setText("Bas:");
        jLabel54.setToolTipText("");

        bas1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bas1FocusLost(evt);
            }
        });
        bas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bas1KeyReleased(evt);
            }
        });

        data2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data2ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel55.setText("GB:");

        eo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eo1FocusLost(evt);
            }
        });
        eo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eo1KeyReleased(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("Es Urine:");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel40.setText("Neu:");

        neu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                neuFocusLost(evt);
            }
        });
        neu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                neuKeyReleased(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel39.setText("GB:");

        gb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                gbFocusLost(evt);
            }
        });
        gb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gbKeyReleased(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel42.setText("Linf Ass:");

        linfAss.setToolTipText("");
        linfAss.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfAssFocusLost(evt);
            }
        });
        linfAss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfAssKeyReleased(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel41.setText("Linf:");

        linf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfFocusLost(evt);
            }
        });
        linf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfKeyReleased(evt);
            }
        });

        sPiramidale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sPiramidaleFocusLost(evt);
            }
        });
        sPiramidale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sPiramidaleKeyReleased(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel62.setText("S. Piramidale:");

        bas2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bas2FocusLost(evt);
            }
        });
        bas2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bas2KeyReleased(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel61.setText("Bas:");
        jLabel61.setToolTipText("");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel58.setText("Linf Ass:");

        linfAss2.setToolTipText("");
        linfAss2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfAss2FocusLost(evt);
            }
        });
        linfAss2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfAss2KeyReleased(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel60.setText("Eo:");

        eo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eo2FocusLost(evt);
            }
        });
        eo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eo2KeyReleased(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel59.setText("Mon:");

        mon2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mon2FocusLost(evt);
            }
        });
        mon2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mon2KeyReleased(evt);
            }
        });

        dosaggio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dosaggioFocusLost(evt);
            }
        });
        dosaggio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dosaggioKeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("Dosaggio:");

        dataEsamiBaseLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamiBaseLineActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel38.setText("Data Esami Baseline:");

        eo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eoFocusLost(evt);
            }
        });
        eo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eoKeyReleased(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel45.setText("Bas:");
        jLabel45.setToolTipText("");

        bas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                basFocusLost(evt);
            }
        });
        bas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basActionPerformed(evt);
            }
        });
        bas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                basKeyReleased(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel46.setText("Data 1°:");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel47.setText("Data 2°:");

        data1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data1ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel48.setText("GB:");

        sSfinterico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sSfintericoFocusLost(evt);
            }
        });
        sSfinterico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sSfintericoKeyReleased(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel66.setText("S. Sensitivo:");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel67.setText("S. Sfinterico:");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel63.setText("S. Cerebellare:");

        sCerebellare.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sCerebellareFocusLost(evt);
            }
        });
        sCerebellare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sCerebellareKeyReleased(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel64.setText("S. Visivo:");

        sVisivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sVisivoFocusLost(evt);
            }
        });
        sVisivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sVisivoActionPerformed(evt);
            }
        });
        sVisivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sVisivoKeyReleased(evt);
            }
        });

        sTroncoEnc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sTroncoEncFocusLost(evt);
            }
        });
        sTroncoEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTroncoEncActionPerformed(evt);
            }
        });
        sTroncoEnc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sTroncoEncKeyReleased(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel65.setText("S. Troncoencefalico:");

        sSensitivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sSensitivoFocusLost(evt);
            }
        });
        sSensitivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sSensitivoKeyReleased(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel43.setText("Mon:");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel44.setText("Eo:");

        mon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                monFocusLost(evt);
            }
        });
        mon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monKeyReleased(evt);
            }
        });

        cancellaCFX.setBackground(java.awt.Color.red);
        cancellaCFX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancellaCFX.setText("X");
        cancellaCFX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaCFXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancellaCFX)
                .addGap(147, 147, 147)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(dosaggio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addGap(2, 2, 2)
                                .addComponent(sPiramidale, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(649, 649, 649)
                                                .addComponent(sVisivo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel67)
                                                .addGap(18, 18, 18)
                                                .addComponent(sSfinterico, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel63)
                                                .addGap(18, 18, 18)
                                                .addComponent(sCerebellare, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel65)
                                                .addGap(18, 18, 18)
                                                .addComponent(sTroncoEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel64)))
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel66)
                                        .addGap(18, 18, 18)
                                        .addComponent(sSensitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel68)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel47)
                                                .addGap(18, 18, 18)
                                                .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                                .addComponent(mon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel38)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(dataEsamiBaseLine, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel46)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(data1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel39)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(gb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                        .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
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
                                                        .addComponent(mon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel60)
                                                .addGap(18, 18, 18)
                                                .addComponent(eo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel61)
                                                .addGap(18, 18, 18)
                                                .addComponent(bas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel44)
                                                .addGap(18, 18, 18)
                                                .addComponent(eo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel45)
                                                .addGap(18, 18, 18)
                                                .addComponent(bas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel53)
                                                .addGap(18, 18, 18)
                                                .addComponent(eo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel54)
                                                .addGap(18, 18, 18)
                                                .addComponent(bas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel30)
                                        .addGap(18, 18, 18)
                                        .addComponent(hb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(hct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel32)
                                        .addGap(18, 18, 18)
                                        .addComponent(pbg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel33)
                                        .addGap(18, 18, 18)
                                        .addComponent(esUrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel34)
                                        .addGap(18, 18, 18)
                                        .addComponent(citologiaUrin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(128, 128, 128)
                                        .addComponent(jLabel35)
                                        .addGap(18, 18, 18)
                                        .addComponent(ecg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(18, 18, 18)
                                        .addComponent(ecocardio, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel36)
                                        .addGap(18, 18, 18)
                                        .addComponent(ecografiaVescic, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(96, 96, 96))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {citologiaUrin, ecg, esUrine, gr, hb, hct, pbg});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bas, bas1, bas2, eo, eo1, eo2, gb, gb1, gb2, linf, linf1, linf2, linfAss, linfAss1, linfAss2, mon, mon1, mon2, neu, neu1, neu2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {edss, sSensitivo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel36, jLabel38, jLabel46, jLabel47});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(dosaggio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancellaCFX, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(ecografiaVescic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(ecocardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
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
                    .addComponent(bas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(sPiramidale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(sCerebellare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel64)
                    .addComponent(sVisivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(sSfinterico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(sSensitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(sTroncoEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel70)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel71))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void noteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noteKeyReleased
        noteEdit=true;
    }//GEN-LAST:event_noteKeyReleased

    private void cancellaCFXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaCFXActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("DELETE FROM CFX WHERE ID_CFX=?");
            pst.setInt(1, idCFX);
            pst.executeUpdate();
            pst=GestioneDatabase.preparedStatement("DELETE FROM DH_Standard WHERE ID_DH=?");
            pst.setInt(1, idCFX);
            pst.executeUpdate();
            parent.pulisciPanelDH();
            parent.aggiornaBarra();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancellaCFXActionPerformed

    private void dosaggioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dosaggioKeyReleased
        dosaggioEdit=true;
    }//GEN-LAST:event_dosaggioKeyReleased

    private void grKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grKeyReleased
        grEdit=true;
    }//GEN-LAST:event_grKeyReleased

    private void hbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hbKeyReleased
        hbEdit=true;
    }//GEN-LAST:event_hbKeyReleased

    private void hctKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hctKeyReleased
        hctEdit=true;
    }//GEN-LAST:event_hctKeyReleased

    private void pbgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pbgKeyReleased
        pbgEdit=true;
    }//GEN-LAST:event_pbgKeyReleased

    private void esUrineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esUrineKeyReleased
        esUrineEdit=true;
    }//GEN-LAST:event_esUrineKeyReleased

    private void citologiaUrinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_citologiaUrinKeyReleased
        citologiaUrinEdit=true;
    }//GEN-LAST:event_citologiaUrinKeyReleased

    private void ecgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecgKeyReleased
        ecgEdit=true;
    }//GEN-LAST:event_ecgKeyReleased

    private void ecografiaVescicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecografiaVescicKeyReleased
        ecografiaVescicEdit=true;
    }//GEN-LAST:event_ecografiaVescicKeyReleased

    private void ecocardioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecocardioKeyReleased
        ecocardioEdit=true;
    }//GEN-LAST:event_ecocardioKeyReleased

    private void gbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gbKeyReleased
        gbEdit=true;
    }//GEN-LAST:event_gbKeyReleased

    private void neuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_neuKeyReleased
        neuEdit=true;
    }//GEN-LAST:event_neuKeyReleased

    private void linfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfKeyReleased
        linfEdit=true;
    }//GEN-LAST:event_linfKeyReleased

    private void linfAssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfAssKeyReleased
        linfAssEdit=true;
    }//GEN-LAST:event_linfAssKeyReleased

    private void monKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monKeyReleased
        monEdit=true;
    }//GEN-LAST:event_monKeyReleased

    private void eoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eoKeyReleased
        eoEdit=true;
    }//GEN-LAST:event_eoKeyReleased

    private void basKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_basKeyReleased
        basEdit=true;
    }//GEN-LAST:event_basKeyReleased

    private void gb1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gb1KeyReleased
        gb1Edit=true;
    }//GEN-LAST:event_gb1KeyReleased

    private void gb2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gb2KeyReleased
        gb2Edit=true;
    }//GEN-LAST:event_gb2KeyReleased

    private void neu1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_neu1KeyReleased
        neu1Edit=true;
    }//GEN-LAST:event_neu1KeyReleased

    private void neu2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_neu2KeyReleased
        neu2Edit=true;
    }//GEN-LAST:event_neu2KeyReleased

    private void linf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linf1KeyReleased
        linf1Edit=true;
    }//GEN-LAST:event_linf1KeyReleased

    private void linf2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linf2KeyReleased
        linf2Edit=true;
    }//GEN-LAST:event_linf2KeyReleased

    private void linfAss1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfAss1KeyReleased
        linfAss1Edit=true;
    }//GEN-LAST:event_linfAss1KeyReleased

    private void linfAss2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfAss2KeyReleased
        linfAss2Edit=true;
    }//GEN-LAST:event_linfAss2KeyReleased

    private void mon1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mon1KeyReleased
        mon1Edit=true;
    }//GEN-LAST:event_mon1KeyReleased

    private void mon2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mon2KeyReleased
        mon2Edit=true;
    }//GEN-LAST:event_mon2KeyReleased

    private void eo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eo1KeyReleased
        eo1Edit=true;
    }//GEN-LAST:event_eo1KeyReleased

    private void eo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eo2KeyReleased
        eo2Edit=true;
    }//GEN-LAST:event_eo2KeyReleased

    private void bas1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bas1KeyReleased
        bas1Edit=true;
    }//GEN-LAST:event_bas1KeyReleased

    private void bas2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bas2KeyReleased
        bas2Edit=true;
    }//GEN-LAST:event_bas2KeyReleased

    private void sPiramidaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sPiramidaleKeyReleased
        sPiramidaleEdit=true;
    }//GEN-LAST:event_sPiramidaleKeyReleased

    private void sCerebellareKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sCerebellareKeyReleased
        sCerebellareEdit=true;
    }//GEN-LAST:event_sCerebellareKeyReleased

    private void sTroncoEncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sTroncoEncKeyReleased
        sTroncoEncEdit=true;
    }//GEN-LAST:event_sTroncoEncKeyReleased

    private void sVisivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sVisivoKeyReleased
        sVisivoEdit=true;
    }//GEN-LAST:event_sVisivoKeyReleased

    private void sSfintericoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sSfintericoKeyReleased
        sSfintericoEdit=true;
    }//GEN-LAST:event_sSfintericoKeyReleased

    private void sSensitivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sSensitivoKeyReleased
        sSensitivoEdit=true;
    }//GEN-LAST:event_sSensitivoKeyReleased

    private void edssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edssKeyReleased
        edssEdit=true;
    }//GEN-LAST:event_edssKeyReleased

    private void enKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enKeyReleased
        enEdit=true;
    }//GEN-LAST:event_enKeyReleased

    private void terapieConcomitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_terapieConcomitKeyReleased
        terapieConcomitEdit=true;
    }//GEN-LAST:event_terapieConcomitKeyReleased

    private void noteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noteFocusLost
        if(!noteEdit)
            return;
        noteEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Note=? WHERE ID_CFX=?");
            pst.setString(1,note.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_noteFocusLost

    private void enFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enFocusLost
        if(!enEdit)
            return;
        enEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET EN=? WHERE ID_CFX=?");
            pst.setString(1,en.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enFocusLost

    private void terapieConcomitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_terapieConcomitFocusLost
        if(!terapieConcomitEdit)
            return;
        terapieConcomitEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Terapie_Concomitanti=? WHERE ID_CFX=?");
            pst.setString(1,terapieConcomit.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terapieConcomitFocusLost

    private void sPiramidaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sPiramidaleFocusLost
        if(!sPiramidaleEdit)
            return;
        sPiramidaleEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Piramidale=? WHERE ID_CFX=?");
            pst.setString(1,sPiramidale.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sPiramidaleFocusLost

    private void sCerebellareFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sCerebellareFocusLost
        if(!sCerebellareEdit)
            return;
        sCerebellareEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Cerebellare=? WHERE ID_CFX=?");
            pst.setString(1,sCerebellare.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sCerebellareFocusLost

    private void sTroncoEncFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sTroncoEncFocusLost
        if(!sTroncoEncEdit)
            return;
        sTroncoEncEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Tronco_Encefalico=? WHERE ID_CFX=?");
            pst.setString(1,sTroncoEnc.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sTroncoEncFocusLost

    private void sVisivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sVisivoFocusLost
        if(!sVisivoEdit)
            return;
        sVisivoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Visivo=? WHERE ID_CFX=?");
            pst.setString(1,sVisivo.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sVisivoFocusLost

    private void sSfintericoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sSfintericoFocusLost
        if(!sSfintericoEdit)
            return;
        sSfintericoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Sfinterico=? WHERE ID_CFX=?");
            pst.setString(1,sSfinterico.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sSfintericoFocusLost

    private void sSensitivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sSensitivoFocusLost
        if(!sSensitivoEdit)
            return;
        sSensitivoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Sensitivo=? WHERE ID_CFX=?");
            pst.setString(1,sSensitivo.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sSensitivoFocusLost

    private void edssFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edssFocusLost
        if(!edssEdit)
            return;
        edssEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET EDSS=? WHERE ID_CFX=?");
            pst.setString(1,edss.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edssFocusLost

    private void dosaggioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dosaggioFocusLost
        if(!dosaggioEdit)
            return;
        dosaggioEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Dosaggio=? WHERE ID_CFX=?");
            pst.setString(1,dosaggio.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dosaggioFocusLost

    private void grFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grFocusLost
        if(!grEdit)
            return;
        grEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET GR=? WHERE ID_CFX=?");
            pst.setString(1,gr.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_grFocusLost

    private void hbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hbFocusLost
        if(!hbEdit)
            return;
        hbEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET HB=? WHERE ID_CFX=?");
            pst.setString(1,hb.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hbFocusLost

    private void hctFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hctFocusLost
        if(!hctEdit)
            return;
        hctEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET HCT=? WHERE ID_CFX=?");
            pst.setString(1,hct.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hctFocusLost

    private void pbgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pbgFocusLost
        if(!pbgEdit)
            return;
        pbgEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET PBG=? WHERE ID_CFX=?");
            pst.setString(1,pbg.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pbgFocusLost

    private void esUrineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esUrineFocusLost
        if(!esUrineEdit)
            return;
        esUrineEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Es_Urine=? WHERE ID_CFX=?");
            pst.setString(1,esUrine.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esUrineFocusLost

    private void citologiaUrinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_citologiaUrinFocusLost
        if(!citologiaUrinEdit)
            return;
        citologiaUrinEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Citologia_Urinaria=? WHERE ID_CFX=?");
            pst.setString(1,citologiaUrin.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_citologiaUrinFocusLost

    private void ecgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ecgFocusLost
        if(!ecgEdit)
            return;
        ecgEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET ECG=? WHERE ID_CFX=?");
            pst.setString(1,ecg.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ecgFocusLost

    private void ecografiaVescicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ecografiaVescicFocusLost
        if(!ecografiaVescicEdit)
            return;
        ecografiaVescicEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Ecografia_Vescicolare=? WHERE ID_CFX=?");
            pst.setString(1,ecografiaVescic.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ecografiaVescicFocusLost

    private void ecocardioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ecocardioFocusLost
        if(!ecocardioEdit)
            return;
        ecocardioEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Ecocardio=? WHERE ID_CFX=?");
            pst.setString(1,ecocardio.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ecocardioFocusLost

    private void dataEsamiBaseLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamiBaseLineActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Data_Esami_BaseLine=? WHERE ID_CFX=?");
            Date d=dataEsamiBaseLine.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEsamiBaseLineActionPerformed

    private void data1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data1ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Data_1=? WHERE ID_CFX=?");
            Date d=data1.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_data1ActionPerformed

    private void data2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data2ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Data_2=? WHERE ID_CFX=?");
            Date d=data2.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_data2ActionPerformed

    private void gbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gbFocusLost
        if(!gbEdit)
            return;
        gbEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET GB=? WHERE ID_CFX=?");
            pst.setString(1,gb.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gbFocusLost

    private void gb1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gb1FocusLost
        if(!gb1Edit)
            return;
        gb1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET GB_1=? WHERE ID_CFX=?");
            pst.setString(1,gb1.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gb1FocusLost

    private void gb2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gb2FocusLost
        if(!gb2Edit)
            return;
        gb2Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET GB_2=? WHERE ID_CFX=?");
            pst.setString(1,gb2.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gb2FocusLost

    private void neuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_neuFocusLost
        if(!neuEdit)
            return;
        neuEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Neu=? WHERE ID_CFX=?");
            pst.setString(1,neu.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_neuFocusLost

    private void neu1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_neu1FocusLost
        if(!neu1Edit)
            return;
        neu1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Neu_1=? WHERE ID_CFX=?");
            pst.setString(1,neu1.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_neu1FocusLost

    private void neu2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_neu2FocusLost
        if(!neu2Edit)
            return;
        neu2Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Neu_2=? WHERE ID_CFX=?");
            pst.setString(1,neu2.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_neu2FocusLost

    private void linfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfFocusLost
        if(!linfEdit)
            return;
        linfEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Linf=? WHERE ID_CFX=?");
            pst.setString(1,linf.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfFocusLost

    private void linf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linf1FocusLost
        if(!linf1Edit)
            return;
        linf1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Linf_1=? WHERE ID_CFX=?");
            pst.setString(1,linf1.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linf1FocusLost

    private void linf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linf2FocusLost
        if(!linf2Edit)
            return;
        linf2Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Linf_2=? WHERE ID_CFX=?");
            pst.setString(1,linf2.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linf2FocusLost

    private void linfAssFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfAssFocusLost
        if(!linfAssEdit)
            return;
        linfAssEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Linf_Ass=? WHERE ID_CFX=?");
            pst.setString(1,linfAss.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfAssFocusLost

    private void linfAss1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfAss1FocusLost
        if(!linfAss1Edit)
            return;
        linfAss1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Linf_Ass_1=? WHERE ID_CFX=?");
            pst.setString(1,linfAss1.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfAss1FocusLost

    private void linfAss2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfAss2FocusLost
        if(!linfAss2Edit)
            return;
        linfAss2Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Linf_Ass_2=? WHERE ID_CFX=?");
            pst.setString(1,linfAss2.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfAss2FocusLost

    private void monFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monFocusLost
        if(!monEdit)
            return;
        monEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Mon=? WHERE ID_CFX=?");
            pst.setString(1,mon.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_monFocusLost

    private void mon1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mon1FocusLost
        if(!mon1Edit)
            return;
        mon1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Mon_1=? WHERE ID_CFX=?");
            pst.setString(1,mon1.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mon1FocusLost

    private void mon2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mon2FocusLost
        if(!mon2Edit)
            return;
        mon2Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Mon_2=? WHERE ID_CFX=?");
            pst.setString(1,mon2.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mon2FocusLost

    private void eoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eoFocusLost
        if(!eoEdit)
            return;
        eoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET EO=? WHERE ID_CFX=?");
            pst.setString(1,eo.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eoFocusLost

    private void eo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eo1FocusLost
        if(!eo1Edit)
            return;
        eo1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET EO_1=? WHERE ID_CFX=?");
            pst.setString(1,eo1.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eo1FocusLost

    private void eo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eo2FocusLost
        if(!eo2Edit)
            return;
        eo2Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET EO_2=? WHERE ID_CFX=?");
            pst.setString(1,eo2.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eo2FocusLost

    private void basFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_basFocusLost
        if(!basEdit)
            return;
        basEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Bas=? WHERE ID_CFX=?");
            pst.setString(1,bas.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_basFocusLost

    private void bas1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bas1FocusLost
        if(!bas1Edit)
            return;
        bas1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Bas_1=? WHERE ID_CFX=?");
            pst.setString(1,bas1.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bas1FocusLost

    private void bas2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bas2FocusLost
        if(!bas2Edit)
            return;
        bas2Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE CFX SET Bas_2=? WHERE ID_CFX=?");
            pst.setString(1,bas2.getText());
            pst.setInt(2, idCFX);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CFXUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bas2FocusLost

    private void basActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basActionPerformed

    private void pbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pbgActionPerformed

    private void hbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hbActionPerformed

    private void sVisivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sVisivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sVisivoActionPerformed

    private void sTroncoEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTroncoEncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTroncoEncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bas;
    private javax.swing.JTextField bas1;
    private javax.swing.JTextField bas2;
    private javax.swing.JButton cancellaCFX;
    private javax.swing.JTextField citologiaUrin;
    private org.jdesktop.swingx.JXDatePicker data1;
    private org.jdesktop.swingx.JXDatePicker data2;
    private org.jdesktop.swingx.JXDatePicker dataEsamiBaseLine;
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
    private javax.swing.JTextField gb;
    private javax.swing.JTextField gb1;
    private javax.swing.JTextField gb2;
    private javax.swing.JTextField gr;
    private javax.swing.JTextField hb;
    private javax.swing.JTextField hct;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField linf;
    private javax.swing.JTextField linf1;
    private javax.swing.JTextField linf2;
    private javax.swing.JTextField linfAss;
    private javax.swing.JTextField linfAss1;
    private javax.swing.JTextField linfAss2;
    private javax.swing.JTextField mon;
    private javax.swing.JTextField mon1;
    private javax.swing.JTextField mon2;
    private javax.swing.JTextField neu;
    private javax.swing.JTextField neu1;
    private javax.swing.JTextField neu2;
    private javax.swing.JTextArea note;
    private javax.swing.JTextField pbg;
    private javax.swing.JTextField sCerebellare;
    private javax.swing.JTextField sPiramidale;
    private javax.swing.JTextField sSensitivo;
    private javax.swing.JTextField sSfinterico;
    private javax.swing.JTextField sTroncoEnc;
    private javax.swing.JTextField sVisivo;
    private javax.swing.JTextArea terapieConcomit;
    // End of variables declaration//GEN-END:variables
}
