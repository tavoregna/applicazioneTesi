package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class ControlloAmbulatorialeStandardUI extends javax.swing.JPanel {

    private PazienteUI parent;
    private int idControllo;
    
    public ControlloAmbulatorialeStandardUI(PazienteUI p, int id) {
        initComponents();
        
        parent=p;
        idControllo=id;
        
        panelEsami.setLayout(new BoxLayout(panelEsami, BoxLayout.LINE_AXIS));
        panelEsami.add(new PannelloEsami(parent,panelGrafico));
        
        aggiornaDatiAmb(idControllo);
        
        this.setVisible(true);
    }

    public void aggiornaDatiAmb(int id)
    {
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Controllo_Standard WHERE ID_Controllo=?");
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
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diarioClinico = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rmEncefalica = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        esameObbNeuro = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        dataRMEncefalo = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dataRMCervDors = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rmCervDors = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        esamiEmatoChim = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        dataEsamEmato = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        terSinto = new javax.swing.JTextArea();
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
        panelGrafico = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        panelEsami = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setBackground(java.awt.Color.blue);
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Diario Clinico:");
        jLabel1.setOpaque(true);

        diarioClinico.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinico.setColumns(1);
        diarioClinico.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        diarioClinico.setRows(1);
        diarioClinico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diarioClinicoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(diarioClinico);

        jLabel3.setBackground(java.awt.Color.blue);
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Esame Obbiettivo neurologico (EON):");
        jLabel3.setOpaque(true);

        rmEncefalica.setBackground(new java.awt.Color(149, 238, 234));
        rmEncefalica.setColumns(1);
        rmEncefalica.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rmEncefalica.setRows(1);
        rmEncefalica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rmEncefalicaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(rmEncefalica);

        esameObbNeuro.setBackground(new java.awt.Color(149, 238, 234));
        esameObbNeuro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        esameObbNeuro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                esameObbNeuroKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(esameObbNeuro);

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

        rmCervDors.setBackground(new java.awt.Color(149, 238, 234));
        rmCervDors.setColumns(1);
        rmCervDors.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rmCervDors.setRows(1);
        rmCervDors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rmCervDorsKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(rmCervDors);

        jLabel5.setBackground(java.awt.Color.blue);
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Terapia sintomatica:");
        jLabel5.setOpaque(true);

        esamiEmatoChim.setBackground(new java.awt.Color(149, 238, 234));
        esamiEmatoChim.setColumns(1);
        esamiEmatoChim.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        esamiEmatoChim.setRows(1);
        esamiEmatoChim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                esamiEmatoChimKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(esamiEmatoChim);

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

        terSinto.setBackground(new java.awt.Color(149, 238, 234));
        terSinto.setColumns(1);
        terSinto.setRows(1);
        terSinto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                terSintoKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(terSinto);

        jPanel4.setBackground(new java.awt.Color(149, 238, 234));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Piramidale:");

        piramidale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                piramidaleKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Sensitivo:");

        sensitivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sensitivoKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Visivo:");

        visivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                visivoKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Tronco Enc.:");

        troncoEnc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                troncoEncKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Cerebellare:");

        cerebellare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cerebellareKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Sfinteriche:");

        sfinteriche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sfintericheKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Cerebrale:");

        cerebrale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cerebraleKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Deambulazione:");

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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(14, 14, 14)
                        .addComponent(deambulazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(troncoEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cerebrale, deambulazione, piramidale, sensitivo, troncoEnc, visivo});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cerebellare, sfinteriche});

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

        edss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edssKeyTyped(evt);
            }
        });

        graficoEDSS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        graficoEDSS.setForeground(java.awt.Color.red);
        graficoEDSS.setText("EDSS:");
        graficoEDSS.setOpaque(false);
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

        jScrollPane7.setBackground(new java.awt.Color(149, 238, 234));

        panelEsami.setBackground(new java.awt.Color(149, 238, 234));
        panelEsami.setPreferredSize(new java.awt.Dimension(275, 124));

        javax.swing.GroupLayout panelEsamiLayout = new javax.swing.GroupLayout(panelEsami);
        panelEsami.setLayout(panelEsamiLayout);
        panelEsamiLayout.setHorizontalGroup(
            panelEsamiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );
        panelEsamiLayout.setVerticalGroup(
            panelEsamiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        jScrollPane7.setViewportView(panelEsami);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7)
                                    .addComponent(jScrollPane5)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelGrafico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
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
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane7)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel5, jPanel1});

    }// </editor-fold>//GEN-END:initComponents

    private void diarioClinicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diarioClinicoKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Diario_Clinico=? WHERE ID_Controllo=?");
            pst.setString(1,diarioClinico.getText());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diarioClinicoKeyReleased

    private void rmEncefalicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rmEncefalicaKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET RM_Encefalica=? WHERE ID_Controllo=?");
            pst.setString(1,rmEncefalica.getText());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rmEncefalicaKeyReleased

    private void esameObbNeuroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esameObbNeuroKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET EON=? WHERE ID_Controllo=?");
            pst.setString(1,esameObbNeuro.getText());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esameObbNeuroKeyReleased

    private void rmCervDorsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rmCervDorsKeyReleased
       try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET RM_Cervico_Dorsale=? WHERE ID_Controllo=?");
            pst.setString(1,rmCervDors.getText());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rmCervDorsKeyReleased

    private void esamiEmatoChimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esamiEmatoChimKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Esami_Ematochimici=? WHERE ID_Controllo=?");
            pst.setString(1,esamiEmatoChim.getText());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esamiEmatoChimKeyReleased

    private void terSintoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_terSintoKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Terapia_Sintomatica=? WHERE ID_Controllo=?");
            pst.setString(1,terSinto.getText());
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terSintoKeyReleased

    private void dataRMEncefaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRMEncefaloActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Data_RM_Encefalica=? WHERE ID_Controllo=?");
            Date d=dataRMEncefalo.getDate();
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataRMEncefaloActionPerformed

    private void dataRMCervDorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRMCervDorsActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Data_RM_Cervico_Dorsale=? WHERE ID_Controllo=?");
            Date d=dataRMCervDors.getDate();
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataRMCervDorsActionPerformed

    private void dataEsamEmatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmatoActionPerformed
        try {
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
        }
    }//GEN-LAST:event_dataEsamEmatoActionPerformed

    private void edssKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edssKeyTyped
     //FINIREE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        if(edss.getText().length()!=0 && !Utilita.isNumeric(edss.getText()))
       {
           edss.setText(edss.getText().substring(0, edss.getText().length()-1));
           return;
       }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET EDSS=? WHERE ID_Controllo=?");
            if(edss.getText().length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(edss.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edssKeyTyped

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

    private void piramidaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_piramidaleKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Piramidale=? WHERE ID_Controllo=?");
            pst.setDouble(1,Double.parseDouble(piramidale.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_piramidaleKeyReleased

    private void sensitivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sensitivoKeyReleased
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Sensitivo=? WHERE ID_Controllo=?");
            pst.setDouble(1,Double.parseDouble(sensitivo.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sensitivoKeyReleased

    private void visivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_visivoKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Visivo=? WHERE ID_Controllo=?");
            pst.setDouble(1,Double.parseDouble(visivo.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_visivoKeyReleased

    private void troncoEncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_troncoEncKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Tronco_Enc=? WHERE ID_Controllo=?");
            pst.setDouble(1,Double.parseDouble(troncoEnc.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_troncoEncKeyReleased

    private void cerebellareKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cerebellareKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Cerebellare=? WHERE ID_Controllo=?");
            pst.setDouble(1,Double.parseDouble(cerebellare.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cerebellareKeyReleased

    private void sfintericheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sfintericheKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Sfinteriche=? WHERE ID_Controllo=?");
            pst.setDouble(1,Double.parseDouble(sfinteriche.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sfintericheKeyReleased

    private void cerebraleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cerebraleKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Cerebrale=? WHERE ID_Controllo=?");
            pst.setDouble(1,Double.parseDouble(cerebrale.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cerebraleKeyReleased

    private void deambulazioneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deambulazioneKeyReleased
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Controllo_Standard SET Deambulazione=? WHERE ID_Controllo=?");
            pst.setDouble(1,Double.parseDouble(deambulazione.getText()));
            pst.setInt(2, idControllo);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deambulazioneKeyReleased
    private DefaultCategoryDataset datiGrafico()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        ResultSet rs=GestioneDatabase.querySelect("SELECT EDSS,Data FROM Controllo_Standard WHERE ID_Paziente="+Pazienti.getCurrID()+" ORDER BY Data ASC");
        try {
            while(rs.next())
            {
                dataset.addValue(rs.getDouble(1), "",Utilita.dataToString(rs.getDate(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return dataset;
    }
                                                                                                                                                                                                                                                               
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel panelEsami;
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
