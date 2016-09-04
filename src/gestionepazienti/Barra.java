package gestionepazienti;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Barra extends javax.swing.JPanel {
    private PazienteUI parent;
    private ArrayList<PulsanteBarra> pulsanti;
    
    private PulsanteBarra prevButton;
    
    public Barra(PazienteUI p,int hei,int wid) {
        initComponents();
        parent=p;
        pulsanti=new ArrayList<PulsanteBarra>();
        prevButton=null;
        
        this.setBounds(0, 0, wid, hei);
        
        pannelloBarra.setLayout(new FlowLayout(FlowLayout.LEADING));
        
        aggiornaBarra(1);
    }
    public void aggiornaBarra(int id)
    {
        //indiceCorrente=null;
        pannelloBarra.removeAll();
        pulsanti.clear();
        int i=0;
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT * FROM Controllo_Standard WHERE ID_Paziente="+id+" ORDER BY Data ASC");
            
            while(rs.next())
            {
                Date d=rs.getDate("Data");
                int c=rs.getInt("ID_Controllo");
                creaPulsante(i,d,c,2,Color.ORANGE);
                i++;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BarraControlliUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT * FROM DH_Standard WHERE ID_Paziente="+id+" ORDER BY Data ASC");
            while(rs.next())
            {
                Date d=rs.getDate("Data");
                int c=rs.getInt("ID_DH");
                creaPulsante(i,d,c,3,Color.BLUE);
                i++;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BarraControlliUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            ResultSet rs=GestioneDatabase.querySelect("SELECT * FROM Diagnosi_Paziente WHERE ID_Paziente="+id+" ORDER BY Data_Diagnosi ASC");
            while(rs.next())
            {
                Date d=rs.getDate("Data_Diagnosi");
                creaPulsante(i,d,null,1,Color.PINK);
                i++;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BarraControlliUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ordinaPulsanti();
        aggiungiPulsantiAllaBarra();
        aggiornaUI();
    }
    private void aggiungiPulsantiAllaBarra()
    {
        for(int k=0;k<pulsanti.size();k++)
             pannelloBarra.add(pulsanti.get(k));
    }
    private void ordinaPulsanti()
    {
        Collections.sort(pulsanti);
    }
    private void aggiornaUI()
    {
        this.setVisible(false);
        this.setVisible(true);
    }
    
    private void creaPulsante(int i,Date d,Integer cod,int tipo,Color c)
    {
        PulsanteBarra b=new PulsanteBarra(i,cod,tipo);
        b.setData(d);
        b.setColore(c);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!(e.getSource() instanceof PulsanteBarra))
                    return;
                PulsanteBarra premuto=(PulsanteBarra)(e.getSource());
                aggiornaBordoPulsante(premuto);
                pressionePulsanteBarra(premuto);     
            }  
        });
        pulsanti.add(b);
    }
   
    public void pressionePulsanteBarra(PulsanteBarra premuto)
    {
        if(parent==null)
            return;
        int tipo=premuto.getTipo();
        if(tipo==1)
        {
            parent.selezionaScheda(1);
            return;
        }
        if(tipo==2)
        {
            parent.selezionaScheda(2);
            return;
        }
        if(tipo==3)
        {
            parent.selezionaScheda(4);
            return;
        }
        
    }
   private void aggiornaBordoPulsante(PulsanteBarra premuto)
    {
        if(prevButton!=null)
            prevButton.ripristinaBordo();
        prevButton=premuto;
        premuto.bordoSelezione();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pannelloBarra = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 51, 51));
        setOpaque(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pannelloBarra.setBackground(new java.awt.Color(153, 255, 51));
        pannelloBarra.setOpaque(false);

        javax.swing.GroupLayout pannelloBarraLayout = new javax.swing.GroupLayout(pannelloBarra);
        pannelloBarra.setLayout(pannelloBarraLayout);
        pannelloBarraLayout.setHorizontalGroup(
            pannelloBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        pannelloBarraLayout.setVerticalGroup(
            pannelloBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pannelloBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pannelloBarra;
    // End of variables declaration//GEN-END:variables
}
