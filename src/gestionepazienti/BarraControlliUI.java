package gestionepazienti;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class BarraControlliUI extends javax.swing.JPanel {

    private PazienteUI parent;
    
    private Integer indiceCorrente;
    
    private boolean inserimentoAttivo;
    
    public BarraControlliUI(PazienteUI p,int hei,int wid) {
        initComponents();
       
        parent=p;
        
        indiceCorrente=null;
        inserimentoAttivo=false;
        
        this.setBounds(0, 0, wid, hei);
        
        pannello.setLayout(new FlowLayout(FlowLayout.LEADING));
    }

    public boolean isInserimentoAttivo() {  ////////////
        return inserimentoAttivo;
    }
    
    
    public void aggiornaBarra(int id)
    {
        abilitaInserimento(false);
        indiceCorrente=null;
        pannello.removeAll();
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT * FROM Controllo_Standard WHERE ID_Paziente="+id+" ORDER BY Data ASC");
            int i=0;
            while(rs.next())
            {
                Date d=rs.getDate("Data");
                int c=rs.getInt("ID_Controllo");
                creaPulsante(i,d,c);
                i++;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BarraControlliUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        aggiornaUI();
    }
    
    private void aggiornaUI()
    {
        this.setVisible(false);
        this.setVisible(true);
    }
    
    private void creaPulsante(int i,Date d,int cod)
    {
        PulsanteBarraControlli b=new PulsanteBarraControlli(i,cod);
        b.setText(Utilita.dataToString(d));
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!(e.getSource() instanceof PulsanteBarraControlli))
                    return;
                pressionePulsanteBarra((PulsanteBarraControlli)(e.getSource())); 
            }
        }); 
        pannello.add(b);
    }
    
    public void pressionePulsanteBarra(PulsanteBarraControlli premuto)
    {
        parent.abilitaBarraSuperioreControllo(true); //////////////////////
        parent.tipoControlloAbilitato(false); //////////////////////////
        aggiornaPulsante(premuto.getIndicePulsante());
        indiceCorrente=premuto.getIndicePulsante();
        parent.aggiornaDatiControllo(premuto.getIdControllo());
        //metodo che dato l'id mi da informazioni sul controllo
    }
    private void aggiornaPulsante(int ind)
    {
        if((indiceCorrente!=null && pannello.getComponent(indiceCorrente)!=null))
            ((PulsanteBarraControlli)(pannello.getComponent(indiceCorrente))).setBackground(new JButton().getBackground());
        ((PulsanteBarraControlli)(pannello.getComponent(ind))).setBackground(Color.ORANGE);
    }
    private void abilitaInserimento(boolean b) ///////////////////////////7
    {
        parent.tipoControlloAbilitato(b);
        inserimentoAttivo=b;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aggiungi = new javax.swing.JButton();
        indietro = new javax.swing.JButton();
        avanti = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pannello = new javax.swing.JPanel();

        aggiungi.setText("+");
        aggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiActionPerformed(evt);
            }
        });

        indietro.setText("<");
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });

        avanti.setText(">");
        avanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avantiActionPerformed(evt);
            }
        });

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pannelloLayout = new javax.swing.GroupLayout(pannello);
        pannello.setLayout(pannelloLayout);
        pannelloLayout.setHorizontalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        pannelloLayout.setVerticalGroup(
            pannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pannello);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(aggiungi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indietro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avanti))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aggiungi, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(indietro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(avanti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        if(indiceCorrente!=null && indiceCorrente>=1)
        {
            parent.abilitaBarraSuperioreControllo(true);
            parent.tipoControlloAbilitato(false);
            aggiornaPulsante(indiceCorrente-1);
            indiceCorrente--;
            parent.aggiornaDatiControllo(((PulsanteBarraControlli)(pannello.getComponent(indiceCorrente))).getIdControllo());
        }
    }//GEN-LAST:event_indietroActionPerformed
    private void avantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avantiActionPerformed
        if(indiceCorrente!=null && indiceCorrente<pannello.getComponentCount()-1)
        {
            parent.abilitaBarraSuperioreControllo(true);
            parent.tipoControlloAbilitato(false);
            aggiornaPulsante(indiceCorrente+1);
            indiceCorrente++;
            parent.aggiornaDatiControllo(((PulsanteBarraControlli)(pannello.getComponent(indiceCorrente))).getIdControllo());
        }
    }//GEN-LAST:event_avantiActionPerformed

    private void aggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiActionPerformed
        if(Pazienti.getCurrID()==null)
            return;
        Utilita.mostraMessaggio("Stai per eseguire l'inserimento di una nuova scheda\n 1 - scegliere il tipo di controllo");
        abilitaInserimento(true);
        
    }//GEN-LAST:event_aggiungiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi;
    private javax.swing.JButton avanti;
    private javax.swing.JButton indietro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pannello;
    // End of variables declaration//GEN-END:variables
}
