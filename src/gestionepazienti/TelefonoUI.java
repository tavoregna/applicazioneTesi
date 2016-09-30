package gestionepazienti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.apache.commons.lang.NumberUtils;

public class TelefonoUI extends javax.swing.JFrame {

    private PazienteUI parent;
    private Integer pazID;
    private static String TITOLO="INSERIMENTO TELEFONO";
  
    private ArrayList<String> listNum;
    
    public TelefonoUI(int ID,PazienteUI p) {
        initComponents();
        Utilita.settaIconaFrame(this);
        jLabel1.setText(TITOLO+" "+trovaPaziente(ID).toUpperCase());
        this.setVisible(true);
        pazID=ID;
        parent=p;
        listNum=new ArrayList<String>();
        aggiornaLista(ID);
        
    }
    
    private void aggiornaLista(int id)
    {
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT Numero,Appartenenza FROM Telefono WHERE Paziente="+id);
            listNum.clear();
            DefaultListModel d=new DefaultListModel();
            while(rs.next())
            {
                String tmp=rs.getString(1);
                if(rs.getString(2)!=null && rs.getString(2).length()>0)
                    tmp+=" - "+rs.getString(2);
                d.addElement(tmp);
                listNum.add(rs.getString(1));
            }
                listaNumeri.setModel(d);
        } catch (SQLException ex) {
        }
    }
    
    public String trovaPaziente(int ID)
    {
        try {
            ResultSet rs= GestioneDatabase.querySelect("SELECT Nome,Cognome FROM Paziente WHERE ID="+ID);
            if(rs.next())
            {
                String stringa=rs.getString(1)+" "+rs.getString(2);
                return stringa;
            }
        }catch (SQLException ex) {
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        appartenenza = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNumeri = new javax.swing.JList<>();
        rimuovi = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        inserisci = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestione Telefono");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 221, 149));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERIMENTO TELEFONO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Numero:");

        listaNumeri.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaNumeri.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaNumeri);

        rimuovi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rimuovi.setText("RIMUOVI");
        rimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rimuoviActionPerformed(evt);
            }
        });

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        inserisci.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inserisci.setText("INSERICI");
        inserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserisciActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RIMOZIONE TELEFONO");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Appartenenza:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(appartenenza, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(inserisci, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(rimuovi)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(appartenenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inserisci, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rimuovi)
                        .addGap(108, 108, 108))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(parent!=null)
        {
            parent.datiTelefono(pazID);
            parent.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

    private void inserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserisciActionPerformed
       if(numero.getText()!=null && numero.getText().length()>5 && NumberUtils.isNumber(numero.getText()))
       {
           
           try {
               PreparedStatement st=GestioneDatabase.preparedStatement("INSERT INTO Telefono(Numero,Paziente,Appartenenza) VALUES (?,?,?)");
               st.setString(1, numero.getText());
               st.setInt(2,pazID);
               st.setString(3, appartenenza.getText());
               st.executeUpdate();
               aggiornaLista(pazID);
           } catch (SQLException ex) {
               Utilita.mostraMessaggio("Dati inseriti non validi o numero già inserito");
           }
       }
       else
       {
           Utilita.mostraMessaggio("Dati inseriti non validi");
       }
    }//GEN-LAST:event_inserisciActionPerformed

    private void rimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rimuoviActionPerformed
        int sel=listaNumeri.getSelectedIndex();
        if(sel==-1)
            return;
        GestioneDatabase.queryNonSelect("DELETE FROM Telefono WHERE Numero="+listNum.get(sel)+" AND Paziente="+pazID);
        aggiornaLista(pazID);
    }//GEN-LAST:event_rimuoviActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appartenenza;
    private javax.swing.JButton inserisci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaNumeri;
    private javax.swing.JTextField numero;
    private javax.swing.JButton rimuovi;
    // End of variables declaration//GEN-END:variables
}
