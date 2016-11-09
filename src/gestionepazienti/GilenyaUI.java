package gestionepazienti;

import static java.awt.image.ImageObserver.WIDTH;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GilenyaUI extends javax.swing.JPanel {
    
    private PazienteUI parent;
    private int idGilenya;
    
    
    private boolean acConsigliatiEdit=false;
    private boolean noteEdit=false;
    private boolean diarioClinicoEdit=false;
    private boolean esameObbNeuroEdit=false;
    private boolean terSintoEdit=false;
    
    private boolean edssEdit=false;
    private boolean deambulazioneEdit=false;
    private boolean troncoEncEdit=false;
    private boolean cerebraleEdit=false;
    private boolean visivoEdit=false;
    private boolean sfintericheEdit=false;
    private boolean sensitivoEdit=false;
    private boolean piramidaleEdit=false;
    private boolean cerebellareEdit=false;
    
    public GilenyaUI(PazienteUI p,int id) {
        initComponents();
        idGilenya=id;
        cancellaGilenya.setVisible(Opzioni.cancellaAttivo);
        parent=p;
        aggiornaDatiGilenya(idGilenya);
        Utilita.undoAndRedo(this);
    }

    public void aggiornaDatiGilenya(int id)
    {
         try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("SELECT * FROM Gilenya WHERE ID_Gilenya=?");
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {               
               diarioClinico.setText(rs.getString("Diario_Clinico"));
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
               acConsigliati.setText(rs.getString("Accertamenti_Consigliati"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PazienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edss = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        esameObbNeuro = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        diarioClinico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jScrollPane6 = new javax.swing.JScrollPane();
        terSinto = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        acConsigliati = new javax.swing.JTextArea();
        cancellaGilenya = new javax.swing.JButton();
        buttonTer3F = new javax.swing.JButton();

        setOpaque(false);

        jPanel5.setBackground(java.awt.Color.blue);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("EDSS:");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edss, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(edss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                        .addGap(14, 14, 14)
                        .addComponent(deambulazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(troncoEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
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

        jLabel5.setBackground(java.awt.Color.blue);
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Terapia sintomatica:");
        jLabel5.setOpaque(true);

        jLabel2.setBackground(java.awt.Color.blue);
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("Accertamenti Consigliati:");
        jLabel2.setOpaque(true);

        note.setBackground(new java.awt.Color(149, 238, 234));
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
        jScrollPane2.setViewportView(note);

        jLabel4.setBackground(java.awt.Color.blue);
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Note:");
        jLabel4.setOpaque(true);

        acConsigliati.setBackground(new java.awt.Color(149, 238, 234));
        acConsigliati.setColumns(20);
        acConsigliati.setRows(5);
        acConsigliati.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                acConsigliatiFocusLost(evt);
            }
        });
        acConsigliati.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                acConsigliatiKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(acConsigliati);

        cancellaGilenya.setBackground(java.awt.Color.red);
        cancellaGilenya.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancellaGilenya.setText("X");
        cancellaGilenya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellaGilenyaActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancellaGilenya)
                            .addComponent(buttonTer3F))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cancellaGilenya, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonTer3F, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4)))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancellaGilenya, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

    }// </editor-fold>//GEN-END:initComponents

    private void esameObbNeuroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esameObbNeuroKeyReleased
        esameObbNeuroEdit=true;
    }//GEN-LAST:event_esameObbNeuroKeyReleased

    private void diarioClinicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diarioClinicoKeyReleased
        diarioClinicoEdit=true;
    }//GEN-LAST:event_diarioClinicoKeyReleased

    private void terSintoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_terSintoKeyReleased
        terSintoEdit=true;
    }//GEN-LAST:event_terSintoKeyReleased

    private void acConsigliatiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acConsigliatiKeyReleased
        acConsigliatiEdit=true;
    }//GEN-LAST:event_acConsigliatiKeyReleased

    private void noteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noteKeyReleased
        noteEdit=true;
    }//GEN-LAST:event_noteKeyReleased

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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Piramidale=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Cerebellare=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Sensitivo=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Sfinteriche=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Visivo=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Cerebrale=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Tronco_Enc=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Deambulazione=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deambulazioneFocusLost

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
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET EDSS=? WHERE ID_Gilenya=?");
            if(val.length()==0)
                pst.setDouble(1,0);
            else
                pst.setDouble(1,Double.parseDouble(val));
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edssFocusLost

    private void edssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edssKeyReleased
        edssEdit=true;
    }//GEN-LAST:event_edssKeyReleased

    private void noteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noteFocusLost
        if(!noteEdit)
            return;
        noteEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Note=? WHERE ID_Gilenya=?");
            pst.setString(1,note.getText());
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_noteFocusLost

    private void acConsigliatiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acConsigliatiFocusLost
        if(!acConsigliatiEdit)
            return;
        acConsigliatiEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Accertamenti_Consigliati=? WHERE ID_Gilenya=?");
            pst.setString(1,acConsigliati.getText());
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_acConsigliatiFocusLost

    private void terSintoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_terSintoFocusLost
        if(!terSintoEdit)
            return;
        terSintoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Terapia_Sintomatica=? WHERE ID_Gilenya=?");
            pst.setString(1,terSinto.getText());
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terSintoFocusLost

    private void esameObbNeuroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esameObbNeuroFocusLost
        if(!esameObbNeuroEdit)
            return;
        esameObbNeuroEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET EON=? WHERE ID_Gilenya=?");
            pst.setString(1,esameObbNeuro.getText());
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_esameObbNeuroFocusLost

    private void diarioClinicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diarioClinicoFocusLost
        if(!diarioClinicoEdit)
            return;
        diarioClinicoEdit=false;
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Gilenya SET Diario_Clinico=? WHERE ID_Gilenya=?");
            pst.setString(1,diarioClinico.getText());
            pst.setInt(2, idGilenya);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_diarioClinicoFocusLost

    private void cancellaGilenyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancellaGilenyaActionPerformed
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("DELETE FROM Gilenya WHERE ID_Gilenya=?");
            pst.setInt(1, idGilenya);
            pst.executeUpdate();
            pst=GestioneDatabase.preparedStatement("DELETE FROM DH_Standard WHERE ID_DH=?");
            pst.setInt(1, idGilenya);
            pst.executeUpdate();
            parent.pulisciPanelDH();
            parent.aggiornaBarra();
        } catch (SQLException ex) {
            Logger.getLogger(ControlloAmbulatorialeStandardUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancellaGilenyaActionPerformed

    private void buttonTer3FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTer3FActionPerformed
        String terapy="Gilenya";
        if(!GenerazioneWord.existsFarmaco("./ModelloLetteraAvvio/", terapy))
        {   
            Utilita.mostraMessaggio("Modello non trovato");
            return;
        }
        parent.setVisible(false);
        Paziente p=Utilita.oggettoPaziente(Pazienti.getCurrID());
        new finestraDatiLetteraAvvio(parent, p.getNome(), p.getCognome(), terapy, p.getSesso(), Utilita.DateUtilToSQL(Utilita.removeTime(new Date(System.currentTimeMillis()))));
    }//GEN-LAST:event_buttonTer3FActionPerformed
                                                                        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea acConsigliati;
    private javax.swing.JButton buttonTer3F;
    private javax.swing.JButton cancellaGilenya;
    private javax.swing.JTextField cerebellare;
    private javax.swing.JTextField cerebrale;
    private javax.swing.JTextField deambulazione;
    private javax.swing.JTextArea diarioClinico;
    private javax.swing.JTextField edss;
    private javax.swing.JTextArea esameObbNeuro;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea note;
    private javax.swing.JTextField piramidale;
    private javax.swing.JTextField sensitivo;
    private javax.swing.JTextField sfinteriche;
    private javax.swing.JTextArea terSinto;
    private javax.swing.JTextField troncoEnc;
    private javax.swing.JTextField visivo;
    // End of variables declaration//GEN-END:variables
}
