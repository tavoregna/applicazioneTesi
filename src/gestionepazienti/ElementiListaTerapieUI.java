package gestionepazienti;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ElementiListaTerapieUI extends javax.swing.JPanel {
    private Terapy terapiaInfo;
    private TerapiaUI parent;
    private boolean active;
    
    
    public ElementiListaTerapieUI(TerapiaUI p,ArrayList<String> lista,Terapy t) {
        active=false;
        initComponents();
        terapiaInfo=t;
        parent=p;
        dataFine.setDate(t.getDataFine());
        dataInizio.setDate(t.getDataInizio());
        int sel=0;
        for(int i=0;i<lista.size();i++)
        {
            listaTerapie.addItem(lista.get(i));
            if(lista.get(i).equals(t.getTerapia()))
                sel=i;
        }
        listaTerapie.setSelectedItem(t.getTerapia());
        active=true;
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaTerapie = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataInizio = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        dataFine = new org.jdesktop.swingx.JXDatePicker();
        elimina = new javax.swing.JButton();

        setBackground(new java.awt.Color(108, 255, 167));

        listaTerapie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        listaTerapie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTerapieActionPerformed(evt);
            }
        });

        jLabel2.setText("Inizio:");

        dataInizio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInizioActionPerformed(evt);
            }
        });

        jLabel3.setText("Fine:");

        dataFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFineActionPerformed(evt);
            }
        });

        elimina.setText("X");
        elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listaTerapie, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataFine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(elimina, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(listaTerapie, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(dataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(dataFine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(elimina))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dataInizioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInizioActionPerformed
        this.setEnabled(false);
        if(dataInizio.getDate()==null)
        {
            Utilita.mostraMessaggioErrore("Inserire la data di inizio terapia");
            dataInizio.setDate(terapiaInfo.getDataInizio());
            this.setEnabled(true);
            return;
        }
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Paziente_Terapia SET Data_Inizio=? WHERE ID_Paziente=? AND Data_Inizio=?");
            pst.setDate(1, new Date(dataInizio.getDate().getTime()));
            pst.setInt(2, terapiaInfo.getIdPaz());
            pst.setDate(3, new Date(terapiaInfo.getDataInizio().getTime()));
            pst.executeUpdate();
            parent.aggiornaTerapie();
        } catch (SQLException ex) {
            Utilita.mostraMessaggioErrore("ERRORE: un'altra terapia ha la stessa data d'inizio");
            dataInizio.setDate(terapiaInfo.getDataInizio());
        }
        this.setEnabled(true);
    }//GEN-LAST:event_dataInizioActionPerformed

    private void dataFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFineActionPerformed
        this.setEnabled(false);
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Paziente_Terapia SET Data_Fine=? WHERE ID_Paziente=? AND Data_Inizio=?");
            
            if(dataFine.getDate()!=null)
                pst.setDate(1,new Date(dataFine.getDate().getTime()));
            else
                pst.setNull(1, java.sql.Types.DATE);
            pst.setInt(2, terapiaInfo.getIdPaz());
            pst.setDate(3, new Date(terapiaInfo.getDataInizio().getTime()));
            pst.executeUpdate();
            if(dataFine.getDate()!=null)
                terapiaInfo.setDataFine(new Date(dataFine.getDate().getTime()));
            else
                terapiaInfo.setDataFine(null);
        } catch (SQLException ex) {
            
        }
        this.setEnabled(true);
    }//GEN-LAST:event_dataFineActionPerformed

    private void listaTerapieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTerapieActionPerformed
        if(!active)
            return;
        
        this.setEnabled(false);
        try {
            //aggiungiTerapia();
            PreparedStatement pst=GestioneDatabase.preparedStatement("UPDATE Paziente_Terapia SET Terapia=? WHERE ID_Paziente=? AND Data_Inizio=?");
            pst.setString(1,Utilita.standardizzaNomi((String)listaTerapie.getSelectedItem()));
            pst.setInt(2, terapiaInfo.getIdPaz());
           
            pst.setDate(3,new Date(dataInizio.getDate().getTime()));
            pst.executeUpdate();
            
            terapiaInfo.setTerapia(Utilita.standardizzaNomi((String)listaTerapie.getSelectedItem()));
        } catch (Exception ex) {
            Utilita.mostraMessaggioErrore("Terapia inserita non valida");
            listaTerapie.setSelectedItem(terapiaInfo.getTerapia());
        }
        this.setEnabled(true);
    }//GEN-LAST:event_listaTerapieActionPerformed

    private void eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaActionPerformed
        int reply = JOptionPane.showConfirmDialog(null,"Vuoi eliminare questo elemento?", "Conferma eliminazione", JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_OPTION)
        {  
            try {
                PreparedStatement st=GestioneDatabase.preparedStatement("DELETE FROM Paziente_Terapia WHERE Data_Inizio=? AND ID_Paziente=? AND Terapia=?");
                st.setDate(1, terapiaInfo.getDataInizio());
                st.setInt(2, terapiaInfo.getIdPaz());
                st.setString(3, terapiaInfo.getTerapia());
                st.executeUpdate();
                this.setEnabled(false);
                parent.aggiornaTerapie();
            } catch (SQLException ex) {
                Utilita.errore(ex);Logger.getLogger(ElementiListaTerapieUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_eliminaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker dataFine;
    private org.jdesktop.swingx.JXDatePicker dataInizio;
    private javax.swing.JButton elimina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> listaTerapie;
    // End of variables declaration//GEN-END:variables
}
