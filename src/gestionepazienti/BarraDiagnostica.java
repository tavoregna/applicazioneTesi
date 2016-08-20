/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Riccardo
 */
public class BarraDiagnostica extends javax.swing.JPanel {

    private ArrayList<PulsanteData> lista;
    
    private double totHeight;
    private double totWidth;
    private JPanel pane;
    private Paziente parent;
    
    public BarraDiagnostica(Paziente p,double hei,double wid) {
        
        initComponents();
        this.setBounds(0, 0, (int)wid, (int)hei);
        totHeight=hei;
        parent=p;
        totWidth=wid;
        lista=new ArrayList<PulsanteData>();
        this.setLayout(null);
        aggiungi.setBounds(0, 0,(int) wid, (int)(5*hei/100));
        su.setBounds(0, aggiungi.getY()+aggiungi.getHeight(),(int) wid, (int)(10*hei/100));
        giu.setBounds(0, (int)hei-(int)(10*hei/100),(int) wid, (int)(10*hei/100));
        pane=new JPanel();
        pane.setBounds(0, su.getY()+su.getHeight(),(int)totWidth, giu.getY()-(su.getY()+su.getHeight()));
        pane.setLayout(null);
        this.add(pane);
        this.setVisible(true);
    }
    public void settaColori(Color bg)
    {
        this.setBackground(bg);
        pane.setBackground(bg);
    }
    private void aggiornaUI()
    {
        pane.setVisible(false);
        pane.setVisible(true);
    }
    public void aggiorna(ArrayList<Date> d)
    {
        
        
            lista.clear();
            pane.removeAll();
        aggiornaUI();
        if(d==null || d.size()==0)
        {
            aggiornaUI();
            return;
        }
        
        int numeroEtichette=d.size();
        int initialY=0;
        int altezza=pane.getHeight();
        int alt=altezza/numeroEtichette;
        int larghezza=pane.getWidth();
        
        for(int i=0;i<numeroEtichette;i++)
        {
            
            
            SimpleDateFormat sdf = new SimpleDateFormat(); // creo l'oggetto
            sdf.applyPattern("dd/MM/yyyy");  
            String dataStr = sdf.format(d.get(i)); // data corrente (20 febbraio 2014)
  
            JButton but=new JButton(Utilita.verticalizza(dataStr));
            but.setBounds(0, i*alt+initialY, larghezza, alt);
            but.setBackground(pane.getBackground());
            but.setHorizontalAlignment(SwingConstants.CENTER);
            but.setVerticalAlignment(SwingConstants.CENTER);
            but.setName(Integer.toString(i));
            but.setFont(new java.awt.Font("Tahoma", 1, 15/numeroEtichette));
            lista.add(new PulsanteData(d.get(i), but,Pazienti.getCurrID()));
            pane.add(but);
        }
        aggiornaUI();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aggiungi = new javax.swing.JButton();
        su = new javax.swing.JButton();
        giu = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));
        setPreferredSize(new java.awt.Dimension(50, 383));

        aggiungi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        aggiungi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aggiungi.setLabel("<html>+</html>");

        su.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        su.setText("<html>&uarr;</html>");

        giu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        giu.setText("<html>&darr;</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(giu)
            .addComponent(aggiungi)
            .addComponent(su, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(aggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(giu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi;
    private javax.swing.JButton giu;
    private javax.swing.JButton su;
    // End of variables declaration//GEN-END:variables
}
