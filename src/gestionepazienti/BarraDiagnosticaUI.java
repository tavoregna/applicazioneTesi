package gestionepazienti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BarraDiagnosticaUI extends javax.swing.JPanel {

    private Integer indicePulsanteAttuale;
    
    private boolean comboBoxDiagnosiAttiva;
    
    private ArrayList<PulsanteData> lista;
    
    private double totHeight;
    private double totWidth;
    private JPanel pane;
    private PazienteUI parent;
    
    public BarraDiagnosticaUI(PazienteUI p,double hei,double wid) {
        
        initComponents();
             comboBoxDiagnosiAttiva=true;   
        indicePulsanteAttuale=null;
        totHeight=hei;
        totWidth=wid;
        parent=p;
        
        this.setBounds(0, 0, (int)wid, (int)hei);
        this.setLayout(null); 
         
        lista=new ArrayList<PulsanteData>();
        
        aggiungi.setBounds(0, 0,(int) wid, (int)(5*hei/100));
        su.setBounds(0, aggiungi.getY()+aggiungi.getHeight(),(int) wid, (int)(10*hei/100));
        giu.setBounds(0, (int)hei-(int)(10*hei/100),(int) wid, (int)(10*hei/100));
        
        pane=new JPanel();
        pane.setBounds(0, su.getY()+su.getHeight(),(int)totWidth, giu.getY()-(su.getY()+su.getHeight()));
        pane.setOpaque(false);
        pane.setLayout(null);
        this.add(pane);
        
        this.setVisible(true);
    } 
    private void aggiornaUI()
    {
        pane.setVisible(false);
        pane.setVisible(true);
    }
    public void settaPrimoSelezionato()
    {
        if(lista!=null && lista.size()>0)
        {
            lista.get(0).getPulsante().setBackground(lista.get(0).getPulsante().getBackground().darker().darker());
            //pulsanteAttuale=lista.get(0);
            indicePulsanteAttuale=0;
        }
    }
    public boolean settaSelezionatoIesimo(int i)
    {
        if(lista!=null && lista.size()>i && i>=0)
        {
            for(int k=0;k<lista.size();k++)
            {
                lista.get(k).getPulsante().setBackground(pane.getBackground());
            }
            lista.get(i).getPulsante().setBackground(lista.get(i).getPulsante().getBackground().darker().darker());
            parent.pressionePulsanteBarra(lista.get(i).getID(),lista.get(i).getData() , false);
            indicePulsanteAttuale=i;
            return true;
        }
        return false;
    }
    public Integer getIndicePulsanteAttuale() {
        return indicePulsanteAttuale;
    }
    public void setIndicePulsanteAttuale(Integer indicePulsanteAttuale) {
        this.indicePulsanteAttuale = indicePulsanteAttuale;
    }
    public PulsanteData getPulsanteAttuale()
    {
        if(indicePulsanteAttuale!=null && indicePulsanteAttuale<lista.size())
            return lista.get(indicePulsanteAttuale);
        return null;
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
            String dataStr = Utilita.dataToString(d.get(i));
  
            JButton but=new JButton(Utilita.verticalizza(dataStr));
            but.setBounds(0, i*alt+initialY, larghezza, alt);
            but.setBackground(pane.getBackground());
            but.setHorizontalAlignment(SwingConstants.CENTER);
            but.setVerticalAlignment(SwingConstants.CENTER);
            but.setName(Integer.toString(i));
            but.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() instanceof JButton && parent!=null)
                    {
                        JButton p=(JButton)e.getSource();
                        int press=Integer.parseInt(p.getName());
                        settaSelezionatoIesimo(press);    
                    }
                }
            }); 
            but.setFont(new java.awt.Font("Tahoma", 1, sizeEtichette(numeroEtichette)));
            lista.add(new PulsanteData(d.get(i), but,Pazienti.getCurrID()));
            pane.add(but);
        }
        aggiornaUI();
    }
    
    public int sizeEtichette(int numEtic)
    {
     return 15-(4*(numEtic-1));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aggiungi = new javax.swing.JButton();
        su = new javax.swing.JButton();
        giu = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(50, 383));

        aggiungi.setBackground(new java.awt.Color(102, 255, 51));
        aggiungi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        aggiungi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aggiungi.setLabel("<html>+</html>");
        aggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiActionPerformed(evt);
            }
        });

        su.setBackground(new java.awt.Color(255, 204, 102));
        su.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        su.setText("<html>&uarr;</html>");
        su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suActionPerformed(evt);
            }
        });

        giu.setBackground(new java.awt.Color(255, 204, 102));
        giu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        giu.setText("<html>&darr;</html>");
        giu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giuActionPerformed(evt);
            }
        });

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

    private void suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suActionPerformed
        if(indicePulsanteAttuale!=null)
            settaSelezionatoIesimo(indicePulsanteAttuale-1);
    }//GEN-LAST:event_suActionPerformed

    private void giuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giuActionPerformed
        if(indicePulsanteAttuale!=null)
            settaSelezionatoIesimo(indicePulsanteAttuale+1);
    }//GEN-LAST:event_giuActionPerformed

    private void aggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiActionPerformed
        if(Pazienti.getCurrID()==null)
            return;
        int reply = JOptionPane.showConfirmDialog(null,"VUOI INSERIRE UNA NUOVA DIAGNOSI?", "Conferma nuova diagnosi", JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.NO_OPTION)
            return;      
        try {
            PreparedStatement pst=GestioneDatabase.preparedStatement("INSERT INTO Diagnosi_Paziente(Data_Diagnosi,ID_Paziente) VALUES (?,?)");
            pst.setDate(1, Utilita.DateUtilToSQL(Utilita.removeTime(new java.util.Date(System.currentTimeMillis()))));
            pst.setInt(2,Pazienti.getCurrID());
            pst.executeUpdate();
            parent.datiDiagnosi(Pazienti.getCurrID());
            settaPrimoSelezionato();
        } catch (SQLException ex) {
            Logger.getLogger(BarraDiagnosticaUI.class.getName()).log(Level.SEVERE, null, ex);
            Utilita.mostraMessaggioErrore("Esiste già una diagnosi con la data odierna");
        }
    }//GEN-LAST:event_aggiungiActionPerformed

    public boolean isComboBoxDiagnosiAttiva() {
        return comboBoxDiagnosiAttiva;
    }

    public void setComboBoxDiagnosiAttiva(boolean comboBoxDiagnosiAttiva) {
        this.comboBoxDiagnosiAttiva = comboBoxDiagnosiAttiva;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungi;
    private javax.swing.JButton giu;
    private javax.swing.JButton su;
    // End of variables declaration//GEN-END:variables
}
