package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ZinbrytaUI extends javax.swing.JPanel {

    private PazienteUI parent;
    private int idZinbryta;
    
    private boolean diarioClinicoEdit=false;
    private boolean terSintoEdit=false;
    private boolean rmCervDorsEdit=false;
    private boolean rmEncefalicaEdit=false;
    private boolean noteEdit=false;
    private boolean esameObbNeuroEdit=false;
    private boolean esamiEmatoChimEdit=false;
    
    private boolean edssEdit=false;
    private boolean deambulazioneEdit=false;
    private boolean troncoEncEdit=false;
    private boolean cerebraleEdit=false;
    private boolean visivoEdit=false;
    private boolean sfintericheEdit=false;
    private boolean sensitivoEdit=false;
    private boolean piramidaleEdit=false;
    private boolean cerebellareEdit=false;
    
    public ZinbrytaUI(PazienteUI p,int id) {
        initComponents();
        cancellaZinbryta.setVisible(Opzioni.cancellaAttivo);
        idZinbryta=id;
        parent=p;
        aggiornaDatiZinbryta(idZinbryta);
        Utilita.undoAndRedo(this);
    }

    
    
    public void aggiornaDatiZinbryta(int id)
    {
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Zinbryta WHERE ID_Zinbryta=?");
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
               diarioClinico.setText(rs.getString("Diario_Clinico"));
               dataRMEncefalo.setDate(rs.getDate("Data_RM_Encefalica"));
               rmEncefalica.setText(rs.getString("RM_Encefalica"));
               dataRMCervDors.setDate(rs.getDate("Data_RM_Cervico_Dorsale"));
               rmCervDors.setText(rs.getString("RM_Cervico_Dorsale"));
               esamiEmatoChim.setText(rs.getString("Esami_Ematochimici"));
               dataEsamEmato.setDate(rs.getDate("Data_Esami_Ematochimici"));
               terSinto.setText(rs.getString("Terapia_Sintomatica"));
               esameObbNeuro.setText(rs.getString("EON"));
               piramidale.setText(""+rs.getDouble("Piramidale"));
               sensitivo.setText(""+rs.getDouble("Sensitivo"));
               visivo.setText(""+rs.getDouble("Visivo"));
               troncoEnc.setText(""+rs.getDouble("Tronco_Enc"));
               cerebellare.setText(""+rs.getDouble("Cerebellare"));
               sfinteriche.setText(""+rs.getDouble("Sfinteriche"));
               cerebrale.setText(""+rs.getDouble("Cerebrale"));
               deambulazione.setText(""+rs.getDouble("Deambulazione"));
               edss.setText(""+rs.getDouble("EDSS"));
               note.setText(rs.getString("Note"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dataRMEncefalo = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diarioClinico = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        dataRMCervDors = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        piramidale = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sensitivo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        visivo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        troncoEnc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cerebellare = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sfinteriche = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cerebrale = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        deambulazione = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        edss = new javax.swing.JTextField();
        graficoEDSS = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        esamiEmatoChim = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        terSinto = new javax.swing.JTextArea();
        panelGrafico = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dataEsamEmato = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rmEncefalica = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        esameObbNeuro = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        rmCervDors = new javax.swing.JTextArea();
        cancellaZinbryta = new javax.swing.JButton();

        note.setBackground(new java.awt.Color(149, 238, 234));
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
        jScrollPane8.setViewportView(note);

        jLabel17.setBackground(java.awt.Color.blue);
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.red);
        jLabel17.setText("Note:");
        jLabel17.setOpaque(true);

        jPanel1.setBackground(java.awt.Color.blue);

        dataRMEncefalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRMEncefaloActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("RM encefalica:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addComponent(dataRMEncefalo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataRMEncefalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
        );

        jLabel5.setBackground(java.awt.Color.blue);
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Terapia sintomatica:");
        jLabel5.setOpaque(true);

        jLabel1.setBackground(java.awt.Color.blue);
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Diario Clinico:");
        jLabel1.setOpaque(true);

        jLabel3.setBackground(java.awt.Color.blue);
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Esame Obbiettivo neurologico (EON):");
        jLabel3.setOpaque(true);

        diarioClinico.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinico.setColumns(1);
        diarioClinico.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        diarioClinico.setRows(1);
        diarioClinico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                diarioClinicoFocusLost(evt);
            }
        });
        diarioClinico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diarioClinicoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(diarioClinico);

        jPanel2.setBackground(java.awt.Color.blue);

        dataRMCervDors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRMCervDorsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("RM cervico-dorsale:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(dataRMCervDors, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataRMCervDors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
        );

        jPanel4.setBackground(new java.awt.Color(149, 238, 234));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Piramidale:");

        piramidale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                piramidaleFocusLost(evt);
            }
        });
        piramidale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                piramidaleKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Sensitivo:");

        sensitivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sensitivoFocusLost(evt);
            }
        });
        sensitivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sensitivoKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Visivo:");

        visivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                visivoFocusLost(evt);
            }
        });
        visivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                visivoKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Tronco Enc.:");

        troncoEnc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                troncoEncFocusLost(evt);
            }
        });
        troncoEnc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                troncoEncKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Cerebellare:");

        cerebellare.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cerebellareFocusLost(evt);
            }
        });
        cerebellare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cerebellareKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Sfinteriche:");

        sfinteriche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sfintericheFocusLost(evt);
            }
        });
        sfinteriche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sfintericheKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Cerebrale:");

        cerebrale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cerebraleFocusLost(evt);
            }
        });
        cerebrale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cerebraleKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Deambulazione:");

        deambulazione.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                deambulazioneFocusLost(evt);
            }
        });
        deambulazione.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deambulazioneKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(piramidale, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sensitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cerebellare, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addGap(2, 2, 2)
                        .addComponent(sfinteriche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cerebrale, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(visivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deambulazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(troncoEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 148, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cerebrale, deambulazione, piramidale, sensitivo, sfinteriche, troncoEnc, visivo});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(piramidale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(sensitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(visivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(troncoEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(deambulazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cerebellare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(sfinteriche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cerebrale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(java.awt.Color.blue);

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

        graficoEDSS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        graficoEDSS.setForeground(java.awt.Color.red);
        graficoEDSS.setText("EDSS:");
        graficoEDSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficoEDSSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(graficoEDSS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edss, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(edss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(graficoEDSS))
        );

        esamiEmatoChim.setBackground(new java.awt.Color(149, 238, 234));
        esamiEmatoChim.setColumns(1);
        esamiEmatoChim.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        esamiEmatoChim.setRows(1);
        esamiEmatoChim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                esamiEmatoChimFocusLost(evt);
            }
        });
        esamiEmatoChim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                esamiEmatoChimKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(esamiEmatoChim);

        terSinto.setBackground(new java.awt.Color(149, 238, 234));
        terSinto.setColumns(1);
        terSinto.setRows(1);
        terSinto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                terSintoFocusLost(evt);
            }
        });
        terSinto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                terSintoKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(terSinto);

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel3.setBackground(java.awt.Color.blue);

        dataEsamEmato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmatoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Esami ematochimici:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataEsamEmato, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
        );

        rmEncefalica.setBackground(new java.awt.Color(149, 238, 234));
        rmEncefalica.setColumns(1);
        rmEncefalica.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rmEncefalica.setRows(1);
        rmEncefalica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rmEncefalicaFocusLost(evt);
            }
        });
        rmEncefalica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rmEncefalicaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(rmEncefalica);

        esameObbNeuro.setBackground(new java.awt.Color(149, 238, 234));
        esameObbNeuro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        esameObbNeuro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                esameObbNeuroFocusLost(evt);
            }
        });
        esameObbNeuro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                esameObbNeuroKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(esameObbNeuro);

        rmCervDors.setBackground(new java.awt.Color(149, 238, 234));
        rmCervDors.setColumns(1);
        rmCervDors.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rmCervDors.setRows(1);
        rmCervDors.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rmCervDorsFocusLost(evt);
            }
        });
        rmCervDors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rmCervDorsKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(rmCervDors);

        cancellaZinbryta.setBackground(java.awt.Color.red);
        cancellaZinbryta.setText("X");
        cancellaZinbryta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaZinbrytaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane5)))
                                    .addComponent(jScrollPane4)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cancellaZinbryta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cancellaZinbryta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void noteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noteFocusLost
        if(!noteEdit)
        return;
        noteEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Note=? WHERE ID_Zinbryta=?");
            pst.setString(1,note.getText());
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ZinbrytaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_noteFocusLost

    private void noteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noteKeyReleased
        noteEdit=true;
    }//GEN-LAST:event_noteKeyReleased

    private void dataRMEncefaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRMEncefaloActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Data_RM_Encefalica=? WHERE ID_Zinbryta=?");
            Date d=dataRMEncefalo.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataRMEncefaloActionPerformed

    private void diarioClinicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diarioClinicoFocusLost
        if(!diarioClinicoEdit)
        return;
        diarioClinicoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Diario_Clinico=? WHERE ID_Zinbryta=?");
            pst.setString(1,diarioClinico.getText());
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diarioClinicoFocusLost

    private void diarioClinicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diarioClinicoKeyReleased
        diarioClinicoEdit=true;
    }//GEN-LAST:event_diarioClinicoKeyReleased

    private void dataRMCervDorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRMCervDorsActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Data_RM_Cervico_Dorsale=? WHERE ID_Zinbryta=?");
            Date d=dataRMCervDors.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataRMCervDorsActionPerformed

    private void piramidaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_piramidaleFocusLost
        if(!piramidaleEdit)
        return;
        piramidaleEdit=false;
        String val=Utilita.virgolaToPunto(piramidale.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Piramidale=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_piramidaleFocusLost

    private void piramidaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_piramidaleKeyReleased
        piramidaleEdit=true;
    }//GEN-LAST:event_piramidaleKeyReleased

    private void sensitivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sensitivoFocusLost
        if(!sensitivoEdit)
        return;
        sensitivoEdit=false;
        String val=Utilita.virgolaToPunto(sensitivo.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Sensitivo=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sensitivoFocusLost

    private void sensitivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sensitivoKeyReleased
        sensitivoEdit=true;
    }//GEN-LAST:event_sensitivoKeyReleased

    private void visivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_visivoFocusLost
        if(!visivoEdit)
        return;
        visivoEdit=false;
        String val=Utilita.virgolaToPunto(visivo.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Visivo=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_visivoFocusLost

    private void visivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_visivoKeyReleased
        visivoEdit=true;
    }//GEN-LAST:event_visivoKeyReleased

    private void troncoEncFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_troncoEncFocusLost
        if(!troncoEncEdit)
        return;
        troncoEncEdit=false;
        String val=Utilita.virgolaToPunto(troncoEnc.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Tronco_Enc=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_troncoEncFocusLost

    private void troncoEncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_troncoEncKeyReleased
        troncoEncEdit=true;
    }//GEN-LAST:event_troncoEncKeyReleased

    private void cerebellareFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cerebellareFocusLost
        if(!cerebellareEdit)
        return;
        cerebellareEdit=false;
        String val=Utilita.virgolaToPunto(cerebellare.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Cerebellare=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cerebellareFocusLost

    private void cerebellareKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cerebellareKeyReleased
        cerebellareEdit=true;
    }//GEN-LAST:event_cerebellareKeyReleased

    private void sfintericheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sfintericheFocusLost
        if(!sfintericheEdit)
        return;
        sfintericheEdit=false;
        String val=Utilita.virgolaToPunto(sfinteriche.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Sfinteriche=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sfintericheFocusLost

    private void sfintericheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sfintericheKeyReleased
        sfintericheEdit=true;
    }//GEN-LAST:event_sfintericheKeyReleased

    private void cerebraleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cerebraleFocusLost
        if(!cerebraleEdit)
        return;
        cerebraleEdit=false;
        String val=Utilita.virgolaToPunto(cerebrale.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Cerebrale=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cerebraleFocusLost

    private void cerebraleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cerebraleKeyReleased
        cerebraleEdit=true;
    }//GEN-LAST:event_cerebraleKeyReleased

    private void deambulazioneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deambulazioneFocusLost
        if(!deambulazioneEdit)
        return;
        deambulazioneEdit=false;
        String val=Utilita.virgolaToPunto(deambulazione.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Deambulazione=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deambulazioneFocusLost

    private void deambulazioneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deambulazioneKeyReleased
        deambulazioneEdit=true;
    }//GEN-LAST:event_deambulazioneKeyReleased

    private void edssFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edssFocusLost
        if(!edssEdit)
        return;
        edssEdit=false;
        String val=Utilita.virgolaToPunto(edss.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET EDSS=? WHERE ID_Zinbryta=?");
            if(val.length()==0)
            pst.setDouble(1,0);
            else
            pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edssFocusLost

    private void edssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edssKeyReleased
        edssEdit=true;
    }//GEN-LAST:event_edssKeyReleased

    private void graficoEDSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficoEDSSActionPerformed
        JFreeChart chart = ChartFactory.createLineChart("EDSS", "", "",datiGrafico(), PlotOrientation.VERTICAL,false, true, true);

        ChartPanel pannelloGrafico=new ChartPanel(chart);
        pannelloGrafico.setPreferredSize(new java.awt.Dimension(panelGrafico.getWidth(), panelGrafico.getHeight()));
        pannelloGrafico.setBounds(0,0,panelGrafico.getWidth(),panelGrafico.getHeight());

        panelGrafico.setLayout(null);
        panelGrafico.add(pannelloGrafico);

        panelGrafico.setVisible(false);
        panelGrafico.setVisible(true);

    }//GEN-LAST:event_graficoEDSSActionPerformed

    private DefaultCategoryDataset datiGrafico()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        //ResultSet rs=GestioneDatabase.querySelect("SELECT EDSS,Data FROM Zinbryta INNER JOIN DH_Standard ON ID_Zinbryta=ID_DH WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data ASC");
        //ResultSet rs=GestioneDatabase.querySelect("SELECT EDSS,Data FROM Controllo_Standard WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data ASC");
        ResultSet rs=GestioneDatabase.querySelect("SELECT EDSS,Data FROM (SELECT EDSS,Data FROM Zinbryta INNER JOIN DH_Standard ON ID_Zinbryta=ID_DH WHERE ID_Paziente="+Pazienti.getCurrID()+") UNION (SELECT EDSS,Data FROM Controllo_Standard WHERE ID_Paziente="+Pazienti.getCurrID()+") ORDER BY Data ASC");
        Date prev=null;
        int i=1;
        try {
            while(rs.next())
            {
                String s=Utilita.dataToString(rs.getDate(2));
                if(prev!=null && prev.equals(rs.getDate(2)))
                {
                    i++;
                    s+="-"+i;
                }
                else
                {
                    prev=rs.getDate(2);
                    i=1;
                }
                dataset.addValue(rs.getDouble(1), "",s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return dataset;
    }
    
    private void esamiEmatoChimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esamiEmatoChimFocusLost
        if(!esamiEmatoChimEdit)
        return;
        esamiEmatoChimEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Esami_Ematochimici=? WHERE ID_Zinbryta=?");
            pst.setString(1,esamiEmatoChim.getText());
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esamiEmatoChimFocusLost

    private void esamiEmatoChimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esamiEmatoChimKeyReleased
        esamiEmatoChimEdit=true;
    }//GEN-LAST:event_esamiEmatoChimKeyReleased

    private void terSintoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_terSintoFocusLost
        if(!terSintoEdit)
        return;
        terSintoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Terapia_Sintomatica=? WHERE ID_Zinbryta=?");
            pst.setString(1,terSinto.getText());
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ZinbrytaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terSintoFocusLost

    private void terSintoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_terSintoKeyReleased
        terSintoEdit=true;
    }//GEN-LAST:event_terSintoKeyReleased

    private void dataEsamEmatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmatoActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET Data_Esami_Ematochimici=? WHERE ID_Zinbryta=?");
            Date d=dataEsamEmato.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEsamEmatoActionPerformed

    private void rmEncefalicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rmEncefalicaFocusLost
        if(!rmEncefalicaEdit)
        return;
        rmEncefalicaEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET RM_Encefalica=? WHERE ID_Zinbryta=?");
            pst.setString(1,rmEncefalica.getText());
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rmEncefalicaFocusLost

    private void rmEncefalicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rmEncefalicaKeyReleased
        rmEncefalicaEdit=true;
    }//GEN-LAST:event_rmEncefalicaKeyReleased

    private void esameObbNeuroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esameObbNeuroFocusLost
        if(!esameObbNeuroEdit)
        return;
        esameObbNeuroEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET EON=? WHERE ID_Zinbryta=?");
            pst.setString(1,esameObbNeuro.getText());
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esameObbNeuroFocusLost

    private void esameObbNeuroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esameObbNeuroKeyReleased
        esameObbNeuroEdit=true;
    }//GEN-LAST:event_esameObbNeuroKeyReleased

    private void rmCervDorsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rmCervDorsFocusLost
        if(!rmCervDorsEdit)
        return;
        rmCervDorsEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Zinbryta SET RM_Cervico_Dorsale=? WHERE ID_Zinbryta=?");
            pst.setString(1,rmCervDors.getText());
            pst.setInt(2, idZinbryta);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rmCervDorsFocusLost

    private void rmCervDorsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rmCervDorsKeyReleased
        rmCervDorsEdit=true;
    }//GEN-LAST:event_rmCervDorsKeyReleased

    private void cancellaZinbrytaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaZinbrytaActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("DELETE FROM Zinbryta WHERE ID_Zinbryta=?");
            pst.setInt(1, idZinbryta);
            pst.executeUpdate();
            pst=GestioneDatabase.preparedStatement("DELETE FROM DH_Standard WHERE ID_DH=?");
            pst.setInt(1, idZinbryta);
            pst.executeUpdate();
            parent.pulisciPanelDH();
            parent.aggiornaBarra();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancellaZinbrytaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancellaZinbryta;
    private javax.swing.JTextField cerebellare;
    private javax.swing.JTextField cerebrale;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato;
    private org.jdesktop.swingx.JXDatePicker dataRMCervDors;
    private org.jdesktop.swingx.JXDatePicker dataRMEncefalo;
    private javax.swing.JTextField deambulazione;
    private javax.swing.JTextArea diarioClinico;
    private javax.swing.JTextField edss;
    private javax.swing.JTextArea esameObbNeuro;
    private javax.swing.JTextArea esamiEmatoChim;
    private javax.swing.JButton graficoEDSS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea note;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JTextField piramidale;
    private javax.swing.JTextArea rmCervDors;
    private javax.swing.JTextArea rmEncefalica;
    private javax.swing.JTextField sensitivo;
    private javax.swing.JTextField sfinteriche;
    private javax.swing.JTextArea terSinto;
    private javax.swing.JTextField troncoEnc;
    private javax.swing.JTextField visivo;
    // End of variables declaration//GEN-END:variables
}
