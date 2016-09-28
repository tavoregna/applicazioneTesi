package gestionepazienti;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PannelloLemtradaUI extends javax.swing.JPanel {

    private PazienteUI parent;
    private int giorno;
    private int idLemtrada;
    private double linfociti;
    
    private boolean diarioClinicoEdit=false;
    private boolean leucocitiEdit=false;
    private boolean piastrineEdit=false;
    private boolean creatininaEdit=false;
    private boolean ureaEdit=false;
    private boolean esUrineEdit=false;
    
    private boolean linfoHelperPerEdit=false;
    private boolean linfTotEdit=false;
    private boolean linfoTPerEdit=false;
    private boolean linfoTCitoPerEdit=false;
    private boolean linfoBPerEdit=false;
    private boolean linfoNKPerEdit=false;
    
    public PannelloLemtradaUI(int id, int giorno) {
        initComponents();
        idLemtrada=id;
        this.giorno=giorno;
        aggiornaDatiLemtrada(idLemtrada,giorno);
    }
    
    public void aggiornaDatiLemtrada(int id,int giorno)
    {
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Lemtrada WHERE ID_Standard=? AND Giorno=?");
            pst.setInt(1,id);
            pst.setInt(2,giorno);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                diarioClinico.setText(rs.getString("Diario_Clinico"));
                dataDC.setDate(rs.getDate("Data_DC"));
                dataEsamEmato.setDate(rs.getDate("Data_Esami"));
                leucociti.setText(""+rs.getDouble("Leucociti"));
                piastrine.setText(""+rs.getDouble("Piastrine"));
                linfTot.setText(""+rs.getDouble("Linfociti_Totali"));
                linfoTPer.setText(""+rs.getDouble("Linfociti_T"));
                linfoT.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_T")));
                linfoHelperPer.setText(""+rs.getDouble("Linfociti_T_Helper"));
                linfoHelper.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_T_Helper")));
                linfoTCitoPer.setText(""+rs.getDouble("Linfociti_T_Citotossici"));
                linfoTCito.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_T_Citotossici")));
                linfoBPer.setText(""+rs.getDouble("Linfociti_B"));
                linfoB.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_B")));
                linfoNKPer.setText(""+rs.getDouble("Linfociti_NK"));
                linfoNK.setText(""+calcoloLinfociti(rs.getDouble("Linfociti_Totali"), rs.getDouble("Linfociti_NK")));
                esUrine.setText(rs.getString("Es_Urine"));
                urea.setText(rs.getString("Urea"));
                creatinina.setText(rs.getString("Creatinina"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PannelloLemtradaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Double calcoloLinfociti(double tot,double per)
    {
        return (tot*per)/100;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        diarioClinico = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        dataEsamEmato = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dataDC = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        esEmato = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        leucociti = new javax.swing.JTextField();
        piastrine = new javax.swing.JTextField();
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

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(877, 146));

        diarioClinico.setBackground(new java.awt.Color(149, 238, 234));
        diarioClinico.setColumns(20);
        diarioClinico.setRows(5);
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

        jPanel4.setBackground(java.awt.Color.blue);

        dataEsamEmato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEsamEmatoActionPerformed(evt);
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
                .addComponent(dataEsamEmato, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataEsamEmato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7))
        );

        jPanel3.setBackground(java.awt.Color.blue);

        dataDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDCActionPerformed(evt);
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
                .addComponent(dataDC, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dataDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
        );

        jScrollPane2.setPreferredSize(new java.awt.Dimension(390, 96));

        esEmato.setBackground(new java.awt.Color(149, 238, 234));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Leucociti:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Piastrine");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Linfociti totali:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Linfociti T:");

        leucociti.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                leucocitiFocusLost(evt);
            }
        });
        leucociti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leucocitiKeyReleased(evt);
            }
        });

        piastrine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                piastrineFocusLost(evt);
            }
        });
        piastrine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                piastrineKeyReleased(evt);
            }
        });

        linfTot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfTotFocusLost(evt);
            }
        });
        linfTot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfTotKeyReleased(evt);
            }
        });

        linfoTPer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfoTPerFocusLost(evt);
            }
        });
        linfoTPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfoTPerKeyReleased(evt);
            }
        });

        jLabel5.setText("x10^9/L");

        jLabel16.setText("x10^9/L");

        jLabel17.setText("%");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Linfociti T helper:");

        linfoHelperPer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfoHelperPerFocusLost(evt);
            }
        });
        linfoHelperPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfoHelperPerKeyReleased(evt);
            }
        });

        linfoT.setEnabled(false);

        jLabel20.setText("x10^9/L");

        jLabel21.setText("%");

        linfoHelper.setEnabled(false);

        jLabel23.setText("x10^9/L");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Linfociti T citotossici:");

        linfoTCitoPer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfoTCitoPerFocusLost(evt);
            }
        });
        linfoTCitoPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfoTCitoPerKeyReleased(evt);
            }
        });

        jLabel25.setText("%");

        linfoTCito.setEnabled(false);

        jLabel27.setText("x10^9/L");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Linfociti B:");

        linfoBPer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfoBPerFocusLost(evt);
            }
        });
        linfoBPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfoBPerKeyReleased(evt);
            }
        });

        jLabel28.setText("%");

        linfoB.setEnabled(false);

        jLabel29.setText("x10^9/L");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setText("Linfociti NK:");

        linfoNKPer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                linfoNKPerFocusLost(evt);
            }
        });
        linfoNKPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                linfoNKPerKeyReleased(evt);
            }
        });

        jLabel31.setText("%");

        linfoNK.setEnabled(false);

        jLabel32.setText("x10^9/L");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("Es. Urine:");

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
        jLabel34.setText("Urea:");

        urea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ureaFocusLost(evt);
            }
        });
        urea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ureaKeyReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("Creatinina:");

        creatinina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                creatininaFocusLost(evt);
            }
        });
        creatinina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                creatininaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout esEmatoLayout = new javax.swing.GroupLayout(esEmato);
        esEmato.setLayout(esEmatoLayout);
        esEmatoLayout.setHorizontalGroup(
            esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(esEmatoLayout.createSequentialGroup()
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esUrine)
                            .addGroup(esEmatoLayout.createSequentialGroup()
                                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(esEmatoLayout.createSequentialGroup()
                                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(linfoHelperPer, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(linfoTCitoPer)
                                            .addComponent(linfoBPer)
                                            .addComponent(linfoNKPer))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel31)))
                                    .addComponent(urea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(creatinina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(esEmatoLayout.createSequentialGroup()
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leucociti, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(piastrine, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfTot, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linfoTPer, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(linfoTCito)
                    .addComponent(linfoHelper, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linfoT, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(linfoB)
                    .addComponent(linfoNK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        esEmatoLayout.setVerticalGroup(
            esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esEmatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(leucociti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(piastrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(linfTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(linfoTPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(linfoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoHelperPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(linfoHelper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoTCitoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(linfoTCito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoBPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(linfoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linfoNKPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(linfoNK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esUrine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esEmatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatinina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(esEmato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dataEsamEmatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataEsamEmatoActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Data_Esami=? WHERE ID_Standard=? AND Giorno=?");
            Date d=dataEsamEmato.getDate();
            if(d==null)
                pst.setNull(1, java.sql.Types.DATE);
            else
                pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idLemtrada);
            pst.setInt(3, giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataEsamEmatoActionPerformed

    private void dataDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDCActionPerformed
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Data_DC=? WHERE ID_Standard=? AND Giorno=?");
            Date d=dataDC.getDate();
            if(d==null)
            pst.setNull(1, java.sql.Types.DATE);
            else
            pst.setDate(1, Utilita.DateUtilToSQL(d));
            pst.setInt(2, idLemtrada);
            pst.setInt(3, giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataDCActionPerformed


    private void leucocitiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leucocitiKeyReleased
         leucocitiEdit=true;
    }//GEN-LAST:event_leucocitiKeyReleased

    private void piastrineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_piastrineKeyReleased
         piastrineEdit=true;
    }//GEN-LAST:event_piastrineKeyReleased

    private void linfTotKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfTotKeyReleased
         linfTotEdit=true;
         try{
            linfoT.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoTPer.getText())));
        } catch(Exception e){linfoT.setText("0");}
         try{
            linfoHelper.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoHelperPer.getText())));
        } catch(Exception e){linfoHelper.setText("0");}
         try{
            linfoTCito.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoTCitoPer.getText())));
        } catch(Exception e){linfoTCito.setText("0");}
         try{
            linfoB.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoBPer.getText())));
        } catch(Exception e){linfoB.setText("0");}
         try{
            linfoNK.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoNKPer.getText())));
        } catch(Exception e){linfoNK.setText("0");}
    }//GEN-LAST:event_linfTotKeyReleased

    private void linfoTPerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfoTPerKeyReleased
        linfoTPerEdit=true;
        try{
            linfoT.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoTPer.getText())));
        } catch(Exception e){linfoT.setText("0");}
    }//GEN-LAST:event_linfoTPerKeyReleased

    private void linfoHelperPerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfoHelperPerKeyReleased
        linfoHelperPerEdit=true;
        try{
            linfoHelper.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoHelperPer.getText())));
        } catch(Exception e){linfoHelper.setText("0");}
    }//GEN-LAST:event_linfoHelperPerKeyReleased

    private void linfoTCitoPerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfoTCitoPerKeyReleased
         linfoTCitoPerEdit=true;
         try{
            linfoTCito.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoTCitoPer.getText())));
        } catch(Exception e){linfoTCito.setText("0");}
    }//GEN-LAST:event_linfoTCitoPerKeyReleased

    private void linfoBPerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfoBPerKeyReleased
        linfoBPerEdit=true;
        try{
            linfoB.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoBPer.getText())));
        } catch(Exception e){linfoB.setText("0");}
    }//GEN-LAST:event_linfoBPerKeyReleased

    private void linfoNKPerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linfoNKPerKeyReleased
         linfoNKPerEdit=true;
        try{
            linfoNK.setText(""+calcoloLinfociti(Double.parseDouble(linfTot.getText()),Double.parseDouble(linfoNKPer.getText())));
        } catch(Exception e){linfoNK.setText("0");}
    }//GEN-LAST:event_linfoNKPerKeyReleased

    private void esUrineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esUrineKeyReleased
       esUrineEdit=true;
    }//GEN-LAST:event_esUrineKeyReleased

    private void ureaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ureaKeyReleased
        ureaEdit=true;
    }//GEN-LAST:event_ureaKeyReleased

    private void creatininaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creatininaKeyReleased
         creatininaEdit=true;
    }//GEN-LAST:event_creatininaKeyReleased

    private void leucocitiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_leucocitiFocusLost
        if(!leucocitiEdit)
            return;
        leucocitiEdit=false;
        String val=Utilita.virgolaToPunto(leucociti.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Leucociti=? WHERE ID_Standard=? AND Giorno=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_leucocitiFocusLost

    private void piastrineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_piastrineFocusLost
        if(!piastrineEdit)
            return;
        piastrineEdit=false;
        String val=Utilita.virgolaToPunto(piastrine.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Piastrine=? WHERE ID_Standard=? AND Giorno=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_piastrineFocusLost

    private void esUrineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esUrineFocusLost
        if(!esUrineEdit)
            return;
        esUrineEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Es_Urine=? WHERE ID_Standard=? AND Giorno=?");
            pst.setString(1,esUrine.getText());
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esUrineFocusLost

    private void ureaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ureaFocusLost
        if(!ureaEdit)
            return;
        ureaEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Urea=? WHERE ID_Standard=? AND Giorno=?");
            pst.setString(1,urea.getText());
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ureaFocusLost

    private void creatininaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creatininaFocusLost
       if(!creatininaEdit)
           return;
       creatininaEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Creatinina=? WHERE ID_Standard=? AND Giorno=?");
            pst.setString(1,creatinina.getText());
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_creatininaFocusLost

    private void linfTotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfTotFocusLost
        if(!linfTotEdit)
            return;
        linfTotEdit=false;
        String val=Utilita.virgolaToPunto(linfTot.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_Totali=? WHERE ID_Standard=? AND Giorno=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfTotFocusLost

    private void linfoTPerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfoTPerFocusLost
        if(!linfoTPerEdit)
            return;
        linfoTPerEdit=false;
        String val=Utilita.virgolaToPunto(linfoTPer.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_T=? WHERE ID_Standard=? AND Giorno=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoTPerFocusLost

    private void linfoHelperPerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfoHelperPerFocusLost
        if(!linfoHelperPerEdit)
            return;
        linfoHelperPerEdit=false;
        String val=Utilita.virgolaToPunto(linfoHelperPer.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_T_Helper=? WHERE ID_Standard=? AND Giorno=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoHelperPerFocusLost

    private void linfoTCitoPerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfoTCitoPerFocusLost
        if(!linfoTCitoPerEdit)
            return;
        linfoTCitoPerEdit=false;
        String val=Utilita.virgolaToPunto(linfoTCitoPer.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_T_Citotossici=? WHERE ID_Standard=? AND Giorno=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoTCitoPerFocusLost

    private void linfoBPerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfoBPerFocusLost
        if(!linfoBPerEdit)
            return;
        linfoBPerEdit=false;
        String val=Utilita.virgolaToPunto(linfoBPer.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_B=? WHERE ID_Standard=? AND Giorno=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoBPerFocusLost

    private void linfoNKPerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linfoNKPerFocusLost
       if(!linfoNKPerEdit)
            return;
        linfoNKPerEdit=false;
        String val=Utilita.virgolaToPunto(linfoNKPer.getText());
        if(val.length()!=0 && !Utilita.isNumeric(val))
        {
            Utilita.mostraMessaggioErrore("Controllare i dati inseriti");
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Linfociti_NK=? WHERE ID_Standard=? AND Giorno=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linfoNKPerFocusLost

    private void diarioClinicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diarioClinicoKeyReleased
       diarioClinicoEdit=true;
    }//GEN-LAST:event_diarioClinicoKeyReleased

    private void diarioClinicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diarioClinicoFocusLost
        if(!diarioClinicoEdit)
            return;
        diarioClinicoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Lemtrada SET Diario_Clinico=? WHERE ID_Standard=? AND Giorno=?");
            pst.setString(1,diarioClinico.getText());
            pst.setInt(2, idLemtrada);
            pst.setInt(3,giorno);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diarioClinicoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField creatinina;
    private org.jdesktop.swingx.JXDatePicker dataDC;
    private org.jdesktop.swingx.JXDatePicker dataEsamEmato;
    private javax.swing.JTextArea diarioClinico;
    private javax.swing.JPanel esEmato;
    private javax.swing.JTextField esUrine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField leucociti;
    private javax.swing.JTextField linfTot;
    private javax.swing.JTextField linfoB;
    private javax.swing.JTextField linfoBPer;
    private javax.swing.JTextField linfoHelper;
    private javax.swing.JTextField linfoHelperPer;
    private javax.swing.JTextField linfoNK;
    private javax.swing.JTextField linfoNKPer;
    private javax.swing.JTextField linfoT;
    private javax.swing.JTextField linfoTCito;
    private javax.swing.JTextField linfoTCitoPer;
    private javax.swing.JTextField linfoTPer;
    private javax.swing.JTextField piastrine;
    private javax.swing.JTextField urea;
    // End of variables declaration//GEN-END:variables
}
