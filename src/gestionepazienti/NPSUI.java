package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NPSUI extends javax.swing.JPanel {

    public int idNPS;
    public PazienteUI parent;
    private boolean scolaritaEdit;
    private boolean esitiEdit;
    private boolean elemCliniciEdit;
    private boolean MSNQEdit;
    private boolean FSSEdit;
    private boolean BDIEdit;
    private boolean altro2Edit;
    private boolean altroEdit;
    private boolean SDMTGEdit;
    private boolean SDMTCEdit;
    private boolean SDMTZEdit;
    private boolean PASATGEdit;
    private boolean PASATCEdit;
    private boolean PASATZEdit;
    private boolean SRTLTSGEdit;
    private boolean SRTLTSCEdit;
    private boolean SRTLTSZEdit;
    private boolean SRTCLTRGEdit;
    private boolean SRTCLTRCEdit;
    private boolean SRTCLTRZEdit;
    private boolean SPARTGEdit;
    private boolean SPARTCEdit;
    private boolean SPARTZEdit;
    private boolean SRTDGEdit;
    private boolean SRTDZEdit;
    private boolean SRTDCEdit;
    private boolean SPARTDGEdit;
    private boolean SPARTDCEdit;
    private boolean SPARTDZEdit;
    private boolean WLGGEdit;
    private boolean WLGCEdit;
    private boolean WLGZEdit;
    private boolean FSCATGEdit;
    private boolean FSCATCEdit;
    private boolean FSCATZEdit;
    private boolean FSDESGEdit;
    private boolean FSDESCEdit;
    private boolean FSDESZEdit;
    private boolean SRGEdit;
    private boolean SRCEdit;
    private boolean SRZEdit;
    private boolean SDMTG1Edit;
    private boolean SDMTC1Edit;
    private boolean SDMTZ1Edit;
    private boolean CVLTZEdit;
    private boolean CVLTCEdit;
    private boolean CVLTGEdit;
    private boolean BVMTGEdit;
    private boolean BVMTCEdit;
    private boolean BVMTZEdit;
    
    public NPSUI(PazienteUI p, int id) {
        initComponents();
        idNPS=id;
        parent=p;
        jButton1.setVisible(Opzioni.cancellaAttivo);
        aggiornaDatiNPS(idNPS);
        Utilita.undoAndRedo(this);
        this.setVisible(false);
        this.setVisible(true);
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
               int tipo=rs.getInt("Tipo");
                switch (tipo) {
                    case 1:
                        b1.setSelected(true);
                        break;
                    case 2:
                        b2.setSelected(true);
                        break;
                    case 3:
                        b3.setSelected(true);
                        break;
                    default:
                        break;
                }
               esiti.setText(rs.getString("Esiti"));
               elemClinici.setText(rs.getString("ElementiClinici"));
               BRB.setSelected(rs.getBoolean("BRB_NT"));
               DKEFS.setSelected(rs.getBoolean("D_KEFS"));
               BICAMS.setSelected(rs.getBoolean("BICAMS"));
               altroCombo.setSelected(rs.getBoolean("ALTRO"));
               msnqCombo.setSelected(rs.getBoolean("MSNQ_C"));
               DKEFS.setSelected(rs.getBoolean("D_KEFS"));
               altro.setText(rs.getString("ALTRO_1"));
               MSNQ.setText(rs.getString("MSNQ_V"));
               fssCombo.setSelected(rs.getBoolean("FSS_C"));
               FSS.setText(rs.getString("FSS_V"));
               bdiCombo.setSelected(rs.getBoolean("BDI_II_C"));
               BDI.setText(rs.getString("BDI_II_V"));
               altroCombo2.setSelected(rs.getBoolean("ALTRO_C"));
               altro2.setText(rs.getString("ALTRO_V"));
               SDMTG.setText(rs.getString("SDMT_G"));
               SDMTC.setText(rs.getString("SDMT_C"));
               SDMTZ.setText(rs.getString("SDMT_Z"));
               PASATG.setText(rs.getString("PASAT_G"));
               PASATC.setText(rs.getString("PASAT_C"));
               PASATZ.setText(rs.getString("PASAT_Z"));
               SRTLTSG.setText(rs.getString("SRT_LTS_G"));
               SRTLTSC.setText(rs.getString("SRT_LTS_C"));
               SRTLTSZ.setText(rs.getString("SRT_LTS_Z"));
               SRTCLTRG.setText(rs.getString("SRT_CLTR_G"));
               SRTCLTRC.setText(rs.getString("SRT_CLTR_C"));
               SRTCLTRZ.setText(rs.getString("SRT_CLTR_Z"));
               SRTDG.setText(rs.getString("SRT_D_G"));
               SRTDC.setText(rs.getString("SRT_D_C"));
               SRTDZ.setText(rs.getString("SRT_D_Z"));
               SPARTG.setText(rs.getString("SPART_G"));
               SPARTC.setText(rs.getString("SPART_C"));
               SPARTZ.setText(rs.getString("SPART_Z"));
               SPARTDG.setText(rs.getString("SPART_D_G"));
               SPARTDC.setText(rs.getString("SPART_D_C"));
               SPARTDZ.setText(rs.getString("SPART_D_Z"));
               WLGG.setText(rs.getString("WLG_G"));
               WLGC.setText(rs.getString("WLG_C"));
               WLGZ.setText(rs.getString("WLG_Z"));
               FSCATG.setText(rs.getString("FS_CAT_G"));
               FSCATC.setText(rs.getString("FS_CAT_C"));
               FSCATZ.setText(rs.getString("FS_CAT_Z"));
               FSDESG.setText(rs.getString("FS_DES_G"));
               FSDESC.setText(rs.getString("FS_DES_C"));
               FSDESZ.setText(rs.getString("FS_DES_Z"));
               SRG.setText(rs.getString("SR_G"));
               SRC.setText(rs.getString("SR_C"));
               SRZ.setText(rs.getString("SR_Z"));
               SDMTG1.setText(rs.getString("SDMT_G_BIC"));
               SDMTC1.setText(rs.getString("SDMT_C_BIC"));
               SDMTZ1.setText(rs.getString("SDMT_Z_BIC"));
               CVLTG.setText(rs.getString("CVLT_II_G"));
               CVLTC.setText(rs.getString("CVLT_II_C"));
               CVLTZ.setText(rs.getString("CVLT_II_Z"));
               BVMTG.setText(rs.getString("BVMT_R_G"));
               BVMTC.setText(rs.getString("BVMT_R_C"));
               BVMTZ.setText(rs.getString("BVMT_R_Z"));
            }
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        data = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
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
        WLGZ = new javax.swing.JTextField();
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

        setBackground(new java.awt.Color(255, 233, 151));
        setPreferredSize(new java.awt.Dimension(1784, 698));

        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Data:");

        buttonGroup1.add(b1);
        b1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b1.setText("Screening");
        b1.setOpaque(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b2);
        b2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b2.setText("Follow-up");
        b2.setOpaque(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b3);
        b3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b3.setText("Trial");
        b3.setOpaque(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Scolarità:");

        scolarita.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                scolaritaFocusLost(evt);
            }
        });
        scolarita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scolaritaKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Esiti:");

        esiti.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        esiti.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                esitiFocusLost(evt);
            }
        });
        esiti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                esitiKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(esiti);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Elementi clinici di rilievo:");

        elemClinici.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                elemCliniciFocusLost(evt);
            }
        });
        elemClinici.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                elemCliniciKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(elemClinici);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 233, 151));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pasat1.setText("FS DES");

        c.setText("C");

        SPARTDZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SPARTDZFocusLost(evt);
            }
        });
        SPARTDZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SPARTDZKeyReleased(evt);
            }
        });

        SRTCLTRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTCLTRGFocusLost(evt);
            }
        });
        SRTCLTRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTCLTRGKeyReleased(evt);
            }
        });

        c2.setText("C");

        SRTLTSC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTLTSCFocusLost(evt);
            }
        });
        SRTLTSC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTLTSCKeyReleased(evt);
            }
        });

        srtLTS.setText("SRT-LTS");

        SDMTG1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SDMTG1FocusLost(evt);
            }
        });
        SDMTG1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SDMTG1KeyReleased(evt);
            }
        });

        PASATG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PASATGFocusLost(evt);
            }
        });
        PASATG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PASATGKeyReleased(evt);
            }
        });

        spartD.setText("SPART-D");

        FSDESG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FSDESGFocusLost(evt);
            }
        });
        FSDESG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FSDESGKeyReleased(evt);
            }
        });

        SPARTZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SPARTZFocusLost(evt);
            }
        });
        SPARTZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SPARTZKeyReleased(evt);
            }
        });

        DKEFS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DKEFS.setText("D-KEFS ST");
        DKEFS.setOpaque(false);
        DKEFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DKEFSActionPerformed(evt);
            }
        });

        WLGG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                WLGGFocusLost(evt);
            }
        });
        WLGG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WLGGKeyReleased(evt);
            }
        });

        SRTCLTRC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTCLTRCFocusLost(evt);
            }
        });
        SRTCLTRC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTCLTRCKeyReleased(evt);
            }
        });

        FSCATC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FSCATCFocusLost(evt);
            }
        });
        FSCATC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FSCATCKeyReleased(evt);
            }
        });

        srtLTS1.setText("SR");

        CVLTC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CVLTCFocusLost(evt);
            }
        });
        CVLTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CVLTCKeyReleased(evt);
            }
        });

        wlg.setText("WLG");

        z.setText("Z");

        g.setText("G");

        SPARTDC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SPARTDCFocusLost(evt);
            }
        });
        SPARTDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SPARTDCKeyReleased(evt);
            }
        });

        SRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRGFocusLost(evt);
            }
        });
        SRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRGKeyReleased(evt);
            }
        });

        PASATC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PASATCFocusLost(evt);
            }
        });
        PASATC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PASATCKeyReleased(evt);
            }
        });

        sdmt2.setText("SDMT");

        pasat2.setText("CVLT-II");

        g1.setText("G");

        SRTDG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTDGFocusLost(evt);
            }
        });
        SRTDG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTDGKeyReleased(evt);
            }
        });

        SDMTG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SDMTGFocusLost(evt);
            }
        });
        SDMTG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SDMTGKeyReleased(evt);
            }
        });

        sdmt.setText("SDMT");

        SPARTG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SPARTGFocusLost(evt);
            }
        });
        SPARTG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SPARTGKeyReleased(evt);
            }
        });

        SDMTZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SDMTZFocusLost(evt);
            }
        });
        SDMTZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SDMTZKeyReleased(evt);
            }
        });

        PASATZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PASATZFocusLost(evt);
            }
        });
        PASATZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PASATZKeyReleased(evt);
            }
        });

        pasat.setText("PASAT");

        sdmt1.setText("FS CAT");

        CVLTG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CVLTGFocusLost(evt);
            }
        });
        CVLTG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CVLTGKeyReleased(evt);
            }
        });

        c1.setText("C");

        BICAMS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BICAMS.setText("BICAMS");
        BICAMS.setOpaque(false);
        BICAMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BICAMSActionPerformed(evt);
            }
        });

        BRB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BRB.setText("BRB-NT");
        BRB.setOpaque(false);
        BRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRBActionPerformed(evt);
            }
        });

        FSDESZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FSDESZFocusLost(evt);
            }
        });
        FSDESZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FSDESZKeyReleased(evt);
            }
        });

        SDMTC1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SDMTC1FocusLost(evt);
            }
        });
        SDMTC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SDMTC1KeyReleased(evt);
            }
        });

        srtCLTR.setText("SRT-CLTR");

        SRZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRZFocusLost(evt);
            }
        });
        SRZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRZKeyReleased(evt);
            }
        });

        srtD.setText("SRT-D");

        z1.setText("Z");

        SRTDZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTDZFocusLost(evt);
            }
        });
        SRTDZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTDZKeyReleased(evt);
            }
        });

        spart.setText("SPART");

        SDMTZ1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SDMTZ1FocusLost(evt);
            }
        });
        SDMTZ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SDMTZ1KeyReleased(evt);
            }
        });

        z2.setText("Z");

        SRC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRCFocusLost(evt);
            }
        });
        SRC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRCKeyReleased(evt);
            }
        });

        SDMTC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SDMTCFocusLost(evt);
            }
        });
        SDMTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SDMTCKeyReleased(evt);
            }
        });

        CVLTZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CVLTZFocusLost(evt);
            }
        });
        CVLTZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CVLTZKeyReleased(evt);
            }
        });

        SPARTDG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SPARTDGFocusLost(evt);
            }
        });
        SPARTDG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SPARTDGKeyReleased(evt);
            }
        });

        altroCombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        altroCombo.setText("Altro");
        altroCombo.setOpaque(false);
        altroCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altroComboActionPerformed(evt);
            }
        });

        SPARTC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SPARTCFocusLost(evt);
            }
        });
        SPARTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SPARTCKeyReleased(evt);
            }
        });

        SRTLTSG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTLTSGFocusLost(evt);
            }
        });
        SRTLTSG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTLTSGKeyReleased(evt);
            }
        });

        BVMTC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BVMTCFocusLost(evt);
            }
        });
        BVMTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BVMTCKeyReleased(evt);
            }
        });

        srtLTS2.setText("BVMT-R");

        altro.setColumns(20);
        altro.setRows(5);
        altro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                altroFocusLost(evt);
            }
        });
        altro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                altroKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(altro);

        BVMTG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BVMTGFocusLost(evt);
            }
        });
        BVMTG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BVMTGKeyReleased(evt);
            }
        });

        BVMTZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BVMTZFocusLost(evt);
            }
        });
        BVMTZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BVMTZKeyReleased(evt);
            }
        });

        SRTCLTRZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTCLTRZFocusLost(evt);
            }
        });
        SRTCLTRZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTCLTRZKeyReleased(evt);
            }
        });

        WLGZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                WLGZFocusLost(evt);
            }
        });
        WLGZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WLGZKeyReleased(evt);
            }
        });

        FSCATZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FSCATZFocusLost(evt);
            }
        });
        FSCATZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FSCATZKeyReleased(evt);
            }
        });

        g2.setText("G");

        FSCATG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FSCATGFocusLost(evt);
            }
        });
        FSCATG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FSCATGKeyReleased(evt);
            }
        });

        FSDESC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FSDESCFocusLost(evt);
            }
        });
        FSDESC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FSDESCKeyReleased(evt);
            }
        });

        WLGC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                WLGCFocusLost(evt);
            }
        });
        WLGC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WLGCKeyReleased(evt);
            }
        });

        SRTLTSZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTLTSZFocusLost(evt);
            }
        });
        SRTLTSZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTLTSZKeyReleased(evt);
            }
        });

        SRTDC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SRTDCFocusLost(evt);
            }
        });
        SRTDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SRTDCKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(BRB))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pasat)
                                    .addComponent(srtLTS)
                                    .addComponent(srtCLTR))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(PASATZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SRTCLTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SRTCLTRC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SRTCLTRZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sdmt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SDMTG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SDMTC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SDMTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(g)
                                .addGap(28, 28, 28)
                                .addComponent(c)
                                .addGap(30, 30, 30)
                                .addComponent(z, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BICAMS)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(g2)
                                    .addGap(28, 28, 28)
                                    .addComponent(c2)
                                    .addGap(30, 30, 30)
                                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pasat2)
                                            .addComponent(srtLTS2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(CVLTG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CVLTC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CVLTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(BVMTG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BVMTC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BVMTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sdmt2)
                                        .addGap(18, 18, 18)
                                        .addComponent(SDMTG1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SDMTC1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SDMTZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(120, 120, 120))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spartD)
                                        .addComponent(wlg))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                            .addComponent(WLGZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(srtD)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(SRTDG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SRTDC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SRTDZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SPARTG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SPARTC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SPARTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(719, 719, 719)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(altroCombo)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {z, z1, z2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pasat2, sdmt2, srtLTS2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pasat, sdmt, spart, spartD, srtCLTR, srtD, srtLTS, wlg});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pasat1, sdmt1, srtLTS1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DKEFS)
                                    .addComponent(altroCombo)
                                    .addComponent(BICAMS))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(g1)
                                            .addComponent(c1)
                                            .addComponent(z1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sdmt1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(FSCATG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(FSCATC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(FSCATZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                            .addComponent(BVMTZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)))
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
                            .addComponent(WLGZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wlg))))
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Questionario"));
        jPanel2.setOpaque(false);

        FSS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FSSFocusLost(evt);
            }
        });
        FSS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FSSKeyReleased(evt);
            }
        });

        bdiCombo.setText("BDI-II");
        bdiCombo.setOpaque(false);
        bdiCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdiComboActionPerformed(evt);
            }
        });

        altroCombo2.setText("ALTRO");
        altroCombo2.setOpaque(false);
        altroCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altroCombo2ActionPerformed(evt);
            }
        });

        msnqCombo.setText("MSNQ");
        msnqCombo.setOpaque(false);
        msnqCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msnqComboActionPerformed(evt);
            }
        });

        altro2.setColumns(20);
        altro2.setRows(5);
        altro2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                altro2FocusLost(evt);
            }
        });
        altro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                altro2KeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(altro2);

        fssCombo.setText("FSS");
        fssCombo.setOpaque(false);
        fssCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fssComboActionPerformed(evt);
            }
        });

        BDI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BDIFocusLost(evt);
            }
        });
        BDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDIActionPerformed(evt);
            }
        });
        BDI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BDIKeyReleased(evt);
            }
        });

        MSNQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MSNQFocusLost(evt);
            }
        });
        MSNQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MSNQKeyReleased(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(msnqCombo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MSNQ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bdiCombo)
                                    .addComponent(fssCombo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FSS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BDI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {altroCombo2, bdiCombo, fssCombo, msnqCombo});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msnqCombo)
                    .addComponent(MSNQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fssCombo)
                    .addComponent(FSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdiCombo)
                    .addComponent(BDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altroCombo2))
                .addContainerGap())
        );

        jButton1.setBackground(java.awt.Color.red);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(b1)
                        .addGap(18, 18, 18)
                        .addComponent(b2)
                        .addGap(18, 18, 18)
                        .addComponent(b3)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scolarita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(744, 744, 744))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(jLabel2)
                    .addComponent(scolarita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

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
            Utilita.errore(ex);Logger.getLogger(NPSUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        try
        {
            if(data.getDate()==null)
            {
                JOptionPane.showMessageDialog(null,"Devi inserire la data del CONTROLLO", "DATA MANCANTE", JOptionPane.ERROR_MESSAGE);
                return;
            }
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET Data=? WHERE ID_NPS=?");
            pst.setDate(1, Utilita.DateUtilToSQL(data.getDate()));
            pst.setInt(2, idNPS);
            pst.executeUpdate();
            parent.getBarra().aggiornaBarra(Pazienti.getCurrID());
            parent.getBarra().settaSelezionato(4, idNPS, null);
            
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataActionPerformed

    private void scolaritaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scolaritaKeyReleased
        scolaritaEdit = true;
    }//GEN-LAST:event_scolaritaKeyReleased

    private void esitiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esitiKeyReleased
        esitiEdit=true;
    }//GEN-LAST:event_esitiKeyReleased

    private void elemCliniciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elemCliniciKeyReleased
        elemCliniciEdit=true;
    }//GEN-LAST:event_elemCliniciKeyReleased

    private void MSNQKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MSNQKeyReleased
        MSNQEdit=true;
    }//GEN-LAST:event_MSNQKeyReleased

    private void FSSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FSSKeyReleased
        FSSEdit=true;
    }//GEN-LAST:event_FSSKeyReleased

    private void BDIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BDIKeyReleased
        BDIEdit=true;
    }//GEN-LAST:event_BDIKeyReleased

    private void altro2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_altro2KeyReleased
        altro2Edit=true;
    }//GEN-LAST:event_altro2KeyReleased

    private void scolaritaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scolaritaFocusLost
        if(!scolaritaEdit)
            return;
        scolaritaEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET Scolarita=? WHERE ID_NPS=?");
            pst.setString(1,scolarita.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_scolaritaFocusLost

    private void esitiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esitiFocusLost
        if(!esitiEdit)
            return;
        esitiEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET Esiti=? WHERE ID_NPS=?");
            pst.setString(1,esiti.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esitiFocusLost

    private void elemCliniciFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_elemCliniciFocusLost
        if(!elemCliniciEdit)
            return;
        elemCliniciEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET ElementiClinici=? WHERE ID_NPS=?");
            pst.setString(1,elemClinici.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_elemCliniciFocusLost

    private void MSNQFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MSNQFocusLost
        if(!MSNQEdit)
            return;
        MSNQEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET MSNQ_V=? WHERE ID_NPS=?");
            pst.setString(1,MSNQ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MSNQFocusLost

    private void FSSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FSSFocusLost
        if(!FSSEdit)
            return;
        FSSEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET FSS_V=? WHERE ID_NPS=?");
            pst.setString(1,FSS.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FSSFocusLost

    private void BDIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BDIFocusLost
        if(!BDIEdit)
            return;
        BDIEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET BDI_II_V=? WHERE ID_NPS=?");
            pst.setString(1,BDI.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BDIFocusLost

    private void altro2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_altro2FocusLost
        if(!altro2Edit)
            return;
        altro2Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET ALTRO_V=? WHERE ID_NPS=?");
            pst.setString(1,altro2.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_altro2FocusLost

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET Tipo=1 WHERE ID_NPS=?");
            pst.setInt(1, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET Tipo=2 WHERE ID_NPS=?");
            pst.setInt(1, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET Tipo=3 WHERE ID_NPS=?");
            pst.setInt(1, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void msnqComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msnqComboActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET MSNQ_C=? WHERE ID_NPS=?");
            pst.setBoolean(1, msnqCombo.isSelected());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_msnqComboActionPerformed

    private void fssComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fssComboActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET FSS_C=? WHERE ID_NPS=?");
            pst.setBoolean(1, fssCombo.isSelected());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fssComboActionPerformed

    private void bdiComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdiComboActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET BDI_II_C=? WHERE ID_NPS=?");
            pst.setBoolean(1, bdiCombo.isSelected());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bdiComboActionPerformed

    private void altroCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altroCombo2ActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET ALTRO_C=? WHERE ID_NPS=?");
            pst.setBoolean(1, altroCombo2.isSelected());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_altroCombo2ActionPerformed

    private void BRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRBActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET BRB_NT=? WHERE ID_NPS=?");
            pst.setBoolean(1, BRB.isSelected());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BRBActionPerformed

    private void DKEFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DKEFSActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET D_KEFS=? WHERE ID_NPS=?");
            pst.setBoolean(1, DKEFS.isSelected());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DKEFSActionPerformed

    private void BICAMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BICAMSActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET BICAMS=? WHERE ID_NPS=?");
            pst.setBoolean(1, BICAMS.isSelected());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BICAMSActionPerformed

    private void altroComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altroComboActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET ALTRO=? WHERE ID_NPS=?");
            pst.setBoolean(1, altroCombo.isSelected());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_altroComboActionPerformed

    private void altroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_altroKeyReleased
        altroEdit=true;
    }//GEN-LAST:event_altroKeyReleased

    private void altroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_altroFocusLost
        if(!altroEdit)
            return;
        altroEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET ALTRO_1=? WHERE ID_NPS=?");
            pst.setString(1,altro.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_altroFocusLost

    private void SDMTGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SDMTGKeyReleased
        SDMTGEdit=true;
    }//GEN-LAST:event_SDMTGKeyReleased

    private void SDMTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SDMTCKeyReleased
        SDMTCEdit=true;
    }//GEN-LAST:event_SDMTCKeyReleased

    private void SDMTZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SDMTZKeyReleased
        SDMTZEdit=true;
    }//GEN-LAST:event_SDMTZKeyReleased

    private void SDMTGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SDMTGFocusLost
        if(!SDMTGEdit)
            return;
        SDMTGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SDMT_G=? WHERE ID_NPS=?");
            pst.setString(1,SDMTG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SDMTGFocusLost

    private void SDMTCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SDMTCFocusLost
        if(!SDMTCEdit)
            return;
        SDMTCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SDMT_C=? WHERE ID_NPS=?");
            pst.setString(1,SDMTC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SDMTCFocusLost

    private void SDMTZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SDMTZFocusLost
        if(!SDMTZEdit)
            return;
        SDMTZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SDMT_Z=? WHERE ID_NPS=?");
            pst.setString(1,SDMTZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SDMTZFocusLost

    private void PASATGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PASATGKeyReleased
        PASATGEdit=true;
    }//GEN-LAST:event_PASATGKeyReleased

    private void PASATCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PASATCKeyReleased
        PASATCEdit=true;
    }//GEN-LAST:event_PASATCKeyReleased

    private void PASATZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PASATZKeyReleased
        PASATZEdit=true;
    }//GEN-LAST:event_PASATZKeyReleased

    private void PASATGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PASATGFocusLost
        if(!PASATGEdit)
            return;
        PASATGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET PASAT_G=? WHERE ID_NPS=?");
            pst.setString(1,PASATG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PASATGFocusLost

    private void PASATCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PASATCFocusLost
        if(!PASATCEdit)
            return;
        PASATCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET PASAT_C=? WHERE ID_NPS=?");
            pst.setString(1,PASATC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PASATCFocusLost

    private void PASATZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PASATZFocusLost
        if(!PASATZEdit)
            return;
        PASATZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET PASAT_Z=? WHERE ID_NPS=?");
            pst.setString(1,PASATZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PASATZFocusLost

    private void SRTLTSGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTLTSGKeyReleased
        SRTLTSGEdit=true;
    }//GEN-LAST:event_SRTLTSGKeyReleased

    private void SRTLTSCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTLTSCKeyReleased
        SRTLTSCEdit=true;
    }//GEN-LAST:event_SRTLTSCKeyReleased

    private void SRTLTSZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTLTSZKeyReleased
        SRTLTSZEdit=true;
    }//GEN-LAST:event_SRTLTSZKeyReleased

    private void SRTLTSGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTLTSGFocusLost
        if(!SRTLTSGEdit)
            return;
        SRTLTSGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_LTS_G=? WHERE ID_NPS=?");
            pst.setString(1,SRTLTSG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTLTSGFocusLost

    private void SRTLTSCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTLTSCFocusLost
        if(!SRTLTSCEdit)
            return;
        SRTLTSCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_LTS_C=? WHERE ID_NPS=?");
            pst.setString(1,SRTLTSC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTLTSCFocusLost

    private void SRTLTSZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTLTSZFocusLost
        if(!SRTLTSZEdit)
            return;
        SRTLTSZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_LTS_Z=? WHERE ID_NPS=?");
            pst.setString(1,SRTLTSZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTLTSZFocusLost

    private void SRTCLTRGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTCLTRGKeyReleased
        SRTCLTRGEdit=true;
    }//GEN-LAST:event_SRTCLTRGKeyReleased

    private void SRTCLTRCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTCLTRCKeyReleased
        SRTCLTRCEdit=true;
    }//GEN-LAST:event_SRTCLTRCKeyReleased

    private void SRTCLTRZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTCLTRZKeyReleased
        SRTCLTRZEdit=true;
    }//GEN-LAST:event_SRTCLTRZKeyReleased

    private void SRTCLTRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTCLTRGFocusLost
        if(!SRTCLTRGEdit)
            return;
        SRTCLTRGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_CLTR_G=? WHERE ID_NPS=?");
            pst.setString(1,SRTCLTRG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTCLTRGFocusLost

    private void SRTCLTRCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTCLTRCFocusLost
        if(!SRTCLTRCEdit)
            return;
        SRTCLTRCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_CLTR_C=? WHERE ID_NPS=?");
            pst.setString(1,SRTCLTRC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTCLTRCFocusLost

    private void SRTCLTRZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTCLTRZFocusLost
        if(!SRTCLTRZEdit)
            return;
        SRTCLTRZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_CLTR_Z=? WHERE ID_NPS=?");
            pst.setString(1,SRTCLTRZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTCLTRZFocusLost

    private void SPARTGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SPARTGKeyReleased
        SPARTGEdit=true;
    }//GEN-LAST:event_SPARTGKeyReleased

    private void SPARTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SPARTCKeyReleased
        SPARTCEdit=true;
    }//GEN-LAST:event_SPARTCKeyReleased

    private void SPARTZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SPARTZKeyReleased
        SPARTZEdit=true;
    }//GEN-LAST:event_SPARTZKeyReleased

    private void SPARTGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SPARTGFocusLost
        if(!SPARTGEdit)
            return;
        SPARTGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SPART_G=? WHERE ID_NPS=?");
            pst.setString(1,SPARTG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SPARTGFocusLost

    private void SPARTCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SPARTCFocusLost
        if(!SPARTCEdit)
            return;
        SPARTCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SPART_C=? WHERE ID_NPS=?");
            pst.setString(1,SPARTC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SPARTCFocusLost

    private void SPARTZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SPARTZFocusLost
        if(!SPARTZEdit)
            return;
        SPARTZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SPART_Z=? WHERE ID_NPS=?");
            pst.setString(1,SPARTZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SPARTZFocusLost

    private void SRTDGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTDGKeyReleased
        SRTDGEdit=true;
    }//GEN-LAST:event_SRTDGKeyReleased

    private void SRTDCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTDCKeyReleased
        SRTDCEdit=true;
    }//GEN-LAST:event_SRTDCKeyReleased

    private void SRTDZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRTDZKeyReleased
        SRTDZEdit=true;
    }//GEN-LAST:event_SRTDZKeyReleased

    private void SRTDGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTDGFocusLost
        if(!SRTDGEdit)
            return;
        SRTDGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_D_G=? WHERE ID_NPS=?");
            pst.setString(1,SRTDG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTDGFocusLost

    private void SRTDCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTDCFocusLost
        if(!SRTDCEdit)
            return;
        SRTDCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_D_C=? WHERE ID_NPS=?");
            pst.setString(1,SRTDC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTDCFocusLost

    private void SRTDZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRTDZFocusLost
        if(!SRTDZEdit)
            return;
        SRTDZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SRT_D_Z=? WHERE ID_NPS=?");
            pst.setString(1,SRTDZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRTDZFocusLost

    private void SPARTDGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SPARTDGKeyReleased
        SPARTDGEdit=true;
    }//GEN-LAST:event_SPARTDGKeyReleased

    private void SPARTDCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SPARTDCKeyReleased
        SPARTDCEdit=true;
    }//GEN-LAST:event_SPARTDCKeyReleased

    private void SPARTDZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SPARTDZKeyReleased
        SPARTDZEdit=true;
    }//GEN-LAST:event_SPARTDZKeyReleased

    private void SPARTDGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SPARTDGFocusLost
        if(!SPARTDGEdit)
            return;
        SPARTDGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SPART_D_G=? WHERE ID_NPS=?");
            pst.setString(1,SPARTDG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SPARTDGFocusLost

    private void SPARTDCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SPARTDCFocusLost
        if(!SPARTDCEdit)
            return;
        SPARTDCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SPART_D_C=? WHERE ID_NPS=?");
            pst.setString(1,SPARTDC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SPARTDCFocusLost

    private void SPARTDZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SPARTDZFocusLost
        if(!SPARTDZEdit)
            return;
        SPARTDZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SPART_D_Z=? WHERE ID_NPS=?");
            pst.setString(1,SPARTDZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SPARTDZFocusLost

    private void WLGGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WLGGKeyReleased
        WLGGEdit=true;
    }//GEN-LAST:event_WLGGKeyReleased

    private void WLGCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WLGCKeyReleased
        WLGCEdit=true;
    }//GEN-LAST:event_WLGCKeyReleased

    private void WLGZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WLGZKeyReleased
        WLGZEdit=true;
    }//GEN-LAST:event_WLGZKeyReleased

    private void WLGGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WLGGFocusLost
        if(!WLGGEdit)
            return;
        WLGGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET WLG_G=? WHERE ID_NPS=?");
            pst.setString(1,WLGG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_WLGGFocusLost

    private void WLGCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WLGCFocusLost
        if(!WLGCEdit)
            return;
        WLGCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET WLG_C=? WHERE ID_NPS=?");
            pst.setString(1,WLGC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_WLGCFocusLost

    private void WLGZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WLGZFocusLost
        if(!WLGZEdit)
            return;
        WLGZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET WLG_Z=? WHERE ID_NPS=?");
            pst.setString(1,WLGZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_WLGZFocusLost

    private void FSCATGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FSCATGKeyReleased
        FSCATGEdit=true;
    }//GEN-LAST:event_FSCATGKeyReleased

    private void FSCATCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FSCATCKeyReleased
        FSCATCEdit=true;
    }//GEN-LAST:event_FSCATCKeyReleased

    private void FSCATZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FSCATZKeyReleased
        FSCATZEdit=true;
    }//GEN-LAST:event_FSCATZKeyReleased

    private void FSCATGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FSCATGFocusLost
        if(!FSCATGEdit)
            return;
        FSCATGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET FS_CAT_G=? WHERE ID_NPS=?");
            pst.setString(1,FSCATG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FSCATGFocusLost

    private void FSCATCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FSCATCFocusLost
        if(!FSCATCEdit)
            return;
        FSCATCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET FS_CAT_C=? WHERE ID_NPS=?");
            pst.setString(1,FSCATC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FSCATCFocusLost

    private void FSCATZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FSCATZFocusLost
        if(!FSCATZEdit)
            return;
        FSCATZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET FS_CAT_Z=? WHERE ID_NPS=?");
            pst.setString(1,FSCATZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FSCATZFocusLost

    private void FSDESGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FSDESGKeyReleased
        FSDESGEdit=true;
    }//GEN-LAST:event_FSDESGKeyReleased

    private void FSDESCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FSDESCKeyReleased
        FSDESCEdit=true;
    }//GEN-LAST:event_FSDESCKeyReleased

    private void FSDESZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FSDESZKeyReleased
        FSDESZEdit=true;
    }//GEN-LAST:event_FSDESZKeyReleased

    private void FSDESGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FSDESGFocusLost
        if(!FSDESGEdit)
            return;
        FSDESGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET FS_DES_G=? WHERE ID_NPS=?");
            pst.setString(1,FSDESG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FSDESGFocusLost

    private void FSDESCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FSDESCFocusLost
        if(!FSDESCEdit)
            return;
        FSDESCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET FS_DES_C=? WHERE ID_NPS=?");
            pst.setString(1,FSDESC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FSDESCFocusLost

    private void FSDESZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FSDESZFocusLost
        if(!FSDESZEdit)
            return;
        FSDESZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET FS_DES_Z=? WHERE ID_NPS=?");
            pst.setString(1,FSDESZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FSDESZFocusLost

    private void SRGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRGKeyReleased
        SRGEdit=true;
    }//GEN-LAST:event_SRGKeyReleased

    private void SRCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRCKeyReleased
        SRCEdit=true;
    }//GEN-LAST:event_SRCKeyReleased

    private void SRZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRZKeyReleased
        SRZEdit=true;
    }//GEN-LAST:event_SRZKeyReleased

    private void SRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRGFocusLost
        if(!SRGEdit)
            return;
        SRGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SR_G=? WHERE ID_NPS=?");
            pst.setString(1,SRG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRGFocusLost

    private void SRCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRCFocusLost
        if(!SRCEdit)
            return;
        SRCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SR_C=? WHERE ID_NPS=?");
            pst.setString(1,SRC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRCFocusLost

    private void SRZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SRZFocusLost
        if(!SRZEdit)
            return;
        SRZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SR_Z=? WHERE ID_NPS=?");
            pst.setString(1,SRZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SRZFocusLost

    private void SDMTG1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SDMTG1KeyReleased
        SDMTG1Edit=true;
    }//GEN-LAST:event_SDMTG1KeyReleased

    private void SDMTC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SDMTC1KeyReleased
        SDMTC1Edit=true;
    }//GEN-LAST:event_SDMTC1KeyReleased

    private void SDMTZ1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SDMTZ1KeyReleased
        SDMTZ1Edit=true;
    }//GEN-LAST:event_SDMTZ1KeyReleased

    private void SDMTG1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SDMTG1FocusLost
        if(!SDMTG1Edit)
            return;
        SDMTG1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SDMT_G_BIC=? WHERE ID_NPS=?");
            pst.setString(1,SDMTG1.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SDMTG1FocusLost

    private void SDMTC1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SDMTC1FocusLost
        if(!SDMTC1Edit)
            return;
        SDMTC1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SDMT_C_BIC=? WHERE ID_NPS=?");
            pst.setString(1,SDMTC1.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SDMTC1FocusLost

    private void SDMTZ1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SDMTZ1FocusLost
        if(!SDMTZ1Edit)
            return;
        SDMTZ1Edit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET SDMT_Z_BIC=? WHERE ID_NPS=?");
            pst.setString(1,SDMTZ1.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SDMTZ1FocusLost

    private void CVLTGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CVLTGKeyReleased
        CVLTGEdit=true;
    }//GEN-LAST:event_CVLTGKeyReleased

    private void CVLTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CVLTCKeyReleased
        CVLTCEdit=true;
    }//GEN-LAST:event_CVLTCKeyReleased

    private void CVLTZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CVLTZKeyReleased
        CVLTZEdit=true;
    }//GEN-LAST:event_CVLTZKeyReleased

    private void CVLTGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CVLTGFocusLost
        if(!CVLTGEdit)
            return;
        CVLTGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET CVLT_II_G=? WHERE ID_NPS=?");
            pst.setString(1,CVLTG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CVLTGFocusLost

    private void CVLTCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CVLTCFocusLost
        if(!CVLTCEdit)
            return;
        CVLTCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET CVLT_II_C=? WHERE ID_NPS=?");
            pst.setString(1,CVLTC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CVLTCFocusLost

    private void CVLTZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CVLTZFocusLost
        if(!CVLTZEdit)
            return;
        CVLTZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET CVLT_II_Z=? WHERE ID_NPS=?");
            pst.setString(1,CVLTZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CVLTZFocusLost

    private void BVMTGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BVMTGKeyReleased
        BVMTGEdit=true;
    }//GEN-LAST:event_BVMTGKeyReleased

    private void BVMTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BVMTCKeyReleased
        BVMTCEdit=true;
    }//GEN-LAST:event_BVMTCKeyReleased

    private void BVMTZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BVMTZKeyReleased
        BVMTZEdit=true;
    }//GEN-LAST:event_BVMTZKeyReleased

    private void BVMTGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BVMTGFocusLost
        if(!BVMTGEdit)
            return;
        BVMTGEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET BVMT_R_G=? WHERE ID_NPS=?");
            pst.setString(1,BVMTG.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BVMTGFocusLost

    private void BVMTCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BVMTCFocusLost
        if(!BVMTCEdit)
            return;
        BVMTCEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET BVMT_R_C=? WHERE ID_NPS=?");
            pst.setString(1,BVMTC.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BVMTCFocusLost

    private void BVMTZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BVMTZFocusLost
        if(!BVMTZEdit)
            return;
        BVMTZEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE ValutazioneNPS SET BVMT_R_Z=? WHERE ID_NPS=?");
            pst.setString(1,BVMTZ.getText());
            pst.setInt(2, idNPS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BVMTZFocusLost


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
    private javax.swing.JTextField WLGZ;
    private javax.swing.JTextArea altro;
    private javax.swing.JTextArea altro2;
    private javax.swing.JCheckBox altroCombo;
    private javax.swing.JCheckBox altroCombo2;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JCheckBox bdiCombo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel c;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private org.jdesktop.swingx.JXDatePicker data;
    private javax.swing.JTextArea elemClinici;
    private javax.swing.JTextArea esiti;
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
    private javax.swing.JCheckBox msnqCombo;
    private javax.swing.JLabel pasat;
    private javax.swing.JLabel pasat1;
    private javax.swing.JLabel pasat2;
    private javax.swing.JTextField scolarita;
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
    private javax.swing.JLabel wlg;
    private javax.swing.JLabel z;
    private javax.swing.JLabel z1;
    private javax.swing.JLabel z2;
    // End of variables declaration//GEN-END:variables
}
