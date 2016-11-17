package gestionepazienti;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class TysabriUI extends javax.swing.JPanel {

    private PazienteUI parent;
    private int idTysabri;
    
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
    
    public TysabriUI(PazienteUI p,int id) {
        initComponents();
        abilitaJCV(false);
        cancellaTysabri.setVisible(Opzioni.cancellaAttivo);
        idTysabri=id;
        parent=p;
        aggiornaDatiTysabri(idTysabri);
        Utilita.undoAndRedo(this);
    }

    public void abilitaJCV(boolean b)
    {
        dataJCVNew.setVisible(b);
        posNegJCVNew.setVisible(b);
        indexNew.setVisible(b);
    }
    
    public void aggiornaDatiTysabri(int id)
    {
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Tysabri WHERE ID_Tysabri=?");
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
               dataJCV.setDate(rs.getDate("Data_JCV"));
               posNegJCV.setSelectedItem(rs.getString("JCV"));
               if(posNegJCV.getSelectedIndex()==1)
                   index.setVisible(false);
               index.setText(""+rs.getDouble("Index"));
               note.setText(rs.getString("Note"));
            }
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        terSinto = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        esameObbNeuro = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        dataEsamEmato = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        panelGrafico = new javax.swing.JPanel();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        rmCervDors = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        diarioClinico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        esamiEmatoChim = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        dataRMCervDors = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rmEncefalica = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dataRMEncefalo = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        panelEsami = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        dataJCV = new org.jdesktop.swingx.JXDatePicker();
        posNegJCV = new javax.swing.JComboBox<>();
        index = new javax.swing.JTextField();
        addJCV = new javax.swing.JButton();
        dataJCVNew = new org.jdesktop.swingx.JXDatePicker();
        posNegJCVNew = new javax.swing.JComboBox<>();
        indexNew = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        cancellaTysabri = new javax.swing.JButton();
        buttonTer3F = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(1721, 674));

        terSinto.setBackground(new java.awt.Color(219, 238, 244));
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

        esameObbNeuro.setBackground(new java.awt.Color(219, 238, 244));
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

        jPanel3.setBackground(new java.awt.Color(0, 32, 96));

        dataEsamEmato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmatoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 192, 0));
        jLabel6.setText("Esami ematochimici:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataEsamEmato, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(219, 238, 244));
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
                .addContainerGap()
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel5.setBackground(new java.awt.Color(0, 32, 96));

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

        rmCervDors.setBackground(new java.awt.Color(219, 238, 244));
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

        diarioClinico.setBackground(new java.awt.Color(219, 238, 244));
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

        jLabel1.setBackground(new java.awt.Color(0, 32, 96));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 192, 0));
        jLabel1.setText("Diario Clinico:");
        jLabel1.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 32, 96));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 192, 0));
        jLabel3.setText("Esame Obbiettivo neurologico (EON):");
        jLabel3.setOpaque(true);

        esamiEmatoChim.setBackground(new java.awt.Color(219, 238, 244));
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

        jPanel2.setBackground(new java.awt.Color(0, 32, 96));

        dataRMCervDors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRMCervDorsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 192, 0));
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

        rmEncefalica.setBackground(new java.awt.Color(219, 238, 244));
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

        jLabel5.setBackground(new java.awt.Color(0, 32, 96));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 192, 0));
        jLabel5.setText("Terapia sintomatica:");
        jLabel5.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(0, 32, 96));

        dataRMEncefalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRMEncefaloActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 192, 0));
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

        jScrollPane7.setBackground(new java.awt.Color(149, 238, 234));
        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelEsami.setBackground(new java.awt.Color(219, 238, 244));
        panelEsami.setPreferredSize(new java.awt.Dimension(275, 124));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("JCV:");

        dataJCV.setEnabled(false);

        posNegJCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        posNegJCV.setSelectedIndex(-1);
        posNegJCV.setEnabled(false);

        index.setEnabled(false);

        addJCV.setBackground(java.awt.Color.green);
        addJCV.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        addJCV.setForeground(java.awt.Color.white);
        addJCV.setText("+");
        addJCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJCVActionPerformed(evt);
            }
        });

        posNegJCVNew.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        posNegJCVNew.setSelectedIndex(-1);
        posNegJCVNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posNegJCVNewActionPerformed(evt);
            }
        });

        indexNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEsamiLayout = new javax.swing.GroupLayout(panelEsami);
        panelEsami.setLayout(panelEsamiLayout);
        panelEsamiLayout.setHorizontalGroup(
            panelEsamiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsamiLayout.createSequentialGroup()
                .addGroup(panelEsamiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEsamiLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(addJCV))
                    .addGroup(panelEsamiLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelEsamiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEsamiLayout.createSequentialGroup()
                                .addComponent(dataJCVNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posNegJCVNew, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(indexNew, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEsamiLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataJCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posNegJCV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelEsamiLayout.setVerticalGroup(
            panelEsamiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsamiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEsamiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(dataJCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posNegJCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEsamiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataJCVNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posNegJCVNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addJCV)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(panelEsami);

        jLabel17.setBackground(new java.awt.Color(0, 32, 96));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 192, 0));
        jLabel17.setText("Note:");
        jLabel17.setOpaque(true);

        note.setBackground(new java.awt.Color(219, 238, 244));
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

        cancellaTysabri.setBackground(java.awt.Color.red);
        cancellaTysabri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancellaTysabri.setText("X");
        cancellaTysabri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaTysabriActionPerformed(evt);
            }
        });

        buttonTer3F.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonTer3F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionepazienti/Document-Microsoft-Word-icon.png"))); // NOI18N
        buttonTer3F.setText("L");
        buttonTer3F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTer3FActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancellaTysabri)
                    .addComponent(buttonTer3F))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7)
                                    .addComponent(jScrollPane5)))
                            .addComponent(jScrollPane4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cancellaTysabri, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTer3F, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane5))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane2, jScrollPane4});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancellaTysabri, jLabel1, jLabel3, jPanel1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel17, jLabel5, jPanel3});

    }// </editor-fold>//GEN-END:initComponents

    private void terSintoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_terSintoKeyReleased
        terSintoEdit=true;
    }//GEN-LAST:event_terSintoKeyReleased

    private void esameObbNeuroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esameObbNeuroKeyReleased
        esameObbNeuroEdit=true;
    }//GEN-LAST:event_esameObbNeuroKeyReleased

    private void dataEsamEmatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmatoActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Data_Esami_Ematochimici=? WHERE ID_Tysabri=?");
            Date d=dataEsamEmato.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEsamEmatoActionPerformed

    private void graficoEDSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficoEDSSActionPerformed
        JFreeChart chart = ChartFactory.createLineChart("EDSS", "", "",datiGrafico(), PlotOrientation.VERTICAL,false, true, true);
        
        ChartPanel pannelloGrafico=new ChartPanel(chart);
        pannelloGrafico.setPreferredSize(new java.awt.Dimension(panelGrafico.getWidth(), panelGrafico.getHeight()));
        pannelloGrafico.setBounds(0,0,panelGrafico.getWidth(),panelGrafico.getHeight());
        
        panelGrafico.setLayout(null);
        panelGrafico.removeAll();
        panelGrafico.add(pannelloGrafico);
        
        panelGrafico.setVisible(false);
        panelGrafico.setVisible(true);
        
    }//GEN-LAST:event_graficoEDSSActionPerformed
                                           
    private DefaultCategoryDataset datiGrafico()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        //ResultSet rs=GestioneDatabase.querySelect("SELECT EDSS,Data FROM Tysabri INNER JOIN DH_Standard ON ID_Tysabri=ID_DH WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data ASC");
        //ResultSet rs=GestioneDatabase.querySelect("SELECT EDSS,Data FROM Controllo_Standard WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data ASC");
        ResultSet rs=GestioneDatabase.querySelect("SELECT EDSS,Data FROM (SELECT EDSS,Data FROM Tysabri INNER JOIN DH_Standard ON ID_Tysabri=ID_DH WHERE ID_Paziente="+Pazienti.getCurrID()+") UNION (SELECT EDSS,Data FROM Controllo_Standard WHERE ID_Paziente="+Pazienti.getCurrID()+") ORDER BY Data ASC");
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
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return dataset;
    }
    
    private void rmCervDorsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rmCervDorsKeyReleased
        rmCervDorsEdit=true;
    }//GEN-LAST:event_rmCervDorsKeyReleased

    private void diarioClinicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diarioClinicoKeyReleased
        diarioClinicoEdit=true;
    }//GEN-LAST:event_diarioClinicoKeyReleased

    private void esamiEmatoChimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esamiEmatoChimKeyReleased
        esamiEmatoChimEdit=true;
    }//GEN-LAST:event_esamiEmatoChimKeyReleased

    private void dataRMCervDorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRMCervDorsActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Data_RM_Cervico_Dorsale=? WHERE ID_Tysabri=?");
            Date d=dataRMCervDors.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataRMCervDorsActionPerformed

    private void rmEncefalicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rmEncefalicaKeyReleased
        rmEncefalicaEdit=true;
    }//GEN-LAST:event_rmEncefalicaKeyReleased

    private void dataRMEncefaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRMEncefaloActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Data_RM_Encefalica=? WHERE ID_Tysabri=?");
            Date d=dataRMEncefalo.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataRMEncefaloActionPerformed

    private void addJCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJCVActionPerformed
        int reply = JOptionPane.showConfirmDialog(null,"Sei sicuro di voler inserire un nuovo JCV ??", "CONFERMA INSERIMENTO", JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_OPTION)
        {  
            addJCV.setEnabled(false);
            abilitaJCV(true);
            indexNew.setEnabled(false);
        }
    }//GEN-LAST:event_addJCVActionPerformed

    private void posNegJCVNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posNegJCVNewActionPerformed
        Date d=dataJCVNew.getDate();
        if(d==null)
        {
            posNegJCVNew.setSelectedIndex(-1);
            Utilita.mostraMessaggio("Devi inserire la data prima");
            return;
        }
        if(posNegJCVNew.getSelectedIndex()==0)
        {
            indexNew.setEnabled(true);
        }
        else
        {
            inserisciJCV(false);
            indexNew.setEnabled(false);
            indexNew.setText("-1");
        }
    }//GEN-LAST:event_posNegJCVNewActionPerformed

    private void indexNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexNewActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Tysabri WHERE ID_Tysabri=?");
            pst.setInt(1,idTysabri);
            ResultSet rs=pst.executeQuery();
            double ind;
            if(rs.next())
            {
               ind=Double.parseDouble(indexNew.getText());
               if(ind>=rs.getDouble("Index"))
               {
                   inserisciJCV(true);
               }
            }
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_indexNewActionPerformed

    private void piramidaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_piramidaleKeyReleased
         piramidaleEdit=true;
    }//GEN-LAST:event_piramidaleKeyReleased

    private void sensitivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sensitivoKeyReleased
        sensitivoEdit=true;
    }//GEN-LAST:event_sensitivoKeyReleased

    private void visivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_visivoKeyReleased
        visivoEdit=true;
    }//GEN-LAST:event_visivoKeyReleased

    private void troncoEncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_troncoEncKeyReleased
        troncoEncEdit=true;
    }//GEN-LAST:event_troncoEncKeyReleased

    private void cerebellareKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cerebellareKeyReleased
        cerebellareEdit=true;
    }//GEN-LAST:event_cerebellareKeyReleased

    private void sfintericheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sfintericheKeyReleased
       sfintericheEdit=true;
    }//GEN-LAST:event_sfintericheKeyReleased

    private void cerebraleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cerebraleKeyReleased
        cerebraleEdit=true;
    }//GEN-LAST:event_cerebraleKeyReleased

    private void deambulazioneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deambulazioneKeyReleased
        deambulazioneEdit=true;
    }//GEN-LAST:event_deambulazioneKeyReleased

    private void edssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edssKeyReleased
        edssEdit=true;
    }//GEN-LAST:event_edssKeyReleased

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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET EDSS=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_edssFocusLost

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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Piramidale=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_piramidaleFocusLost

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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Cerebellare=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_cerebellareFocusLost

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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Sensitivo=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_sensitivoFocusLost

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
           PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Sfinteriche=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_sfintericheFocusLost

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
           PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Visivo=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_visivoFocusLost

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
           PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Cerebrale=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cerebraleFocusLost

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
           PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Tronco_Enc=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_troncoEncFocusLost

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
           PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Deambulazione=? WHERE ID_Tysabri=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2,idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_deambulazioneFocusLost

    private void esamiEmatoChimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esamiEmatoChimFocusLost
        if(!esamiEmatoChimEdit)
            return;
        esamiEmatoChimEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Esami_Ematochimici=? WHERE ID_Tysabri=?");
            pst.setString(1,esamiEmatoChim.getText());
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esamiEmatoChimFocusLost

    private void terSintoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_terSintoFocusLost
        if(!terSintoEdit)
            return;
        terSintoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Terapia_Sintomatica=? WHERE ID_Tysabri=?");
            pst.setString(1,terSinto.getText());
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(TysabriUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terSintoFocusLost

    private void noteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noteKeyReleased
         noteEdit=true;
    }//GEN-LAST:event_noteKeyReleased

    private void noteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noteFocusLost
        if(!noteEdit)
            return;
        noteEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Note=? WHERE ID_Tysabri=?");
            pst.setString(1,note.getText());
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(TysabriUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_noteFocusLost

    private void rmCervDorsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rmCervDorsFocusLost
        if(!rmCervDorsEdit)
            return;
        rmCervDorsEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET RM_Cervico_Dorsale=? WHERE ID_Tysabri=?");
            pst.setString(1,rmCervDors.getText());
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rmCervDorsFocusLost

    private void rmEncefalicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rmEncefalicaFocusLost
        if(!rmEncefalicaEdit)
            return;
        rmEncefalicaEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET RM_Encefalica=? WHERE ID_Tysabri=?");
            pst.setString(1,rmEncefalica.getText());
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rmEncefalicaFocusLost

    private void esameObbNeuroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esameObbNeuroFocusLost
        if(!esameObbNeuroEdit)
            return;
        esameObbNeuroEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET EON=? WHERE ID_Tysabri=?");
            pst.setString(1,esameObbNeuro.getText());
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esameObbNeuroFocusLost

    private void diarioClinicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diarioClinicoFocusLost
        if(!diarioClinicoEdit)
            return;
        diarioClinicoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Diario_Clinico=? WHERE ID_Tysabri=?");
            pst.setString(1,diarioClinico.getText());
            pst.setInt(2, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diarioClinicoFocusLost

    private void cancellaTysabriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaTysabriActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("DELETE FROM Tysabri WHERE ID_Tysabri=?");
            pst.setInt(1, idTysabri);
            pst.executeUpdate();
            pst=GestioneDatabase.preparedStatement("DELETE FROM DH_Standard WHERE ID_DH=?");
            pst.setInt(1, idTysabri);
            pst.executeUpdate();
            parent.pulisciPanelDH();
            parent.aggiornaBarra();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancellaTysabriActionPerformed

    private void buttonTer3FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer3FActionPerformed
        String terapy="Tysabri";
        if(!GenerazioneWord.existsFarmaco("./ModelloLetteraAvvio/", terapy))
        {   
            Utilita.mostraMessaggio("Modello non trovato");
            return;
        }
        parent.setVisible(false);
        Paziente p=Utilita.oggettoPaziente(Pazienti.getCurrID());
        new finestraDatiLetteraAvvio(parent, p.getNome(), p.getCognome(), terapy, p.getSesso(), Utilita.DateUtilToSQL(Utilita.removeTime(new Date(System.currentTimeMillis()))));
    }//GEN-LAST:event_buttonTer3FActionPerformed
    
    public void inserisciJCV(boolean b)
    {
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Tysabri SET Data_JCV=?,JCV=?,Index=? WHERE ID_Tysabri=?");
            pst.setDate(1, Utilita.DateUtilToSQL(dataJCVNew.getDate()));
            pst.setString(2, (String)posNegJCVNew.getSelectedItem());
            if(b)
                pst.setDouble(3,Double.parseDouble(indexNew.getText()));
            else
                pst.setDouble(3,-1);
            pst.setInt(4, idTysabri);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Utilita.errore(ex);Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJCV;
    private javax.swing.JButton buttonTer3F;
    private javax.swing.JButton cancellaTysabri;
    private javax.swing.JTextField cerebellare;
    private javax.swing.JTextField cerebrale;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato;
    private org.jdesktop.swingx.JXDatePicker dataJCV;
    private org.jdesktop.swingx.JXDatePicker dataJCVNew;
    private org.jdesktop.swingx.JXDatePicker dataRMCervDors;
    private org.jdesktop.swingx.JXDatePicker dataRMEncefalo;
    private javax.swing.JTextField deambulazione;
    private javax.swing.JTextArea diarioClinico;
    private javax.swing.JTextField edss;
    private javax.swing.JTextArea esameObbNeuro;
    private javax.swing.JTextArea esamiEmatoChim;
    private javax.swing.JButton graficoEDSS;
    private javax.swing.JTextField index;
    private javax.swing.JTextField indexNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea note;
    private javax.swing.JPanel panelEsami;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JTextField piramidale;
    private javax.swing.JComboBox<String> posNegJCV;
    private javax.swing.JComboBox<String> posNegJCVNew;
    private javax.swing.JTextArea rmCervDors;
    private javax.swing.JTextArea rmEncefalica;
    private javax.swing.JTextField sensitivo;
    private javax.swing.JTextField sfinteriche;
    private javax.swing.JTextArea terSinto;
    private javax.swing.JTextField troncoEnc;
    private javax.swing.JTextField visivo;
    // End of variables declaration//GEN-END:variables
}
