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
    
    private static PulsanteBarra prevButton;
    
    public Barra(PazienteUI p) {
        initComponents();
        parent=p;
        pulsanti=new ArrayList<PulsanteBarra>();
        prevButton=null;
        
        pannelloBarra.setLayout(new FlowLayout(FlowLayout.LEADING));
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
                Color colore=Color.WHITE;
                Date d=rs.getDate("Data");
                int c=rs.getInt("ID_Controllo");
                String nome=(rs.getInt("Tipo_Controllo")==1 ? "Ordinario" : "Ricaduta");
                if(rs.getInt("Tipo_Controllo")==1)
                {
                    ResultSet tipo=GestioneDatabase.querySelect("SELECT Terapia_Principale FROM Ambulatorio_Ordinario WHERE Controllo_Standard="+c);
                    int y=0;
                    if(tipo.next())
                        y=tipo.getInt("Terapia_Principale");
                    if(y==1)
                        colore=new Color(205,239,243);
                    else if(y==2)
                        colore=new Color(167,169,254);
                    else if(y==3)
                        colore=new Color(11,17,253);
                    else
                        colore=Color.WHITE;
                }
                else if(rs.getInt("Tipo_Controllo")==2)
                {
                    ResultSet tipo=GestioneDatabase.querySelect("SELECT Ricaduta FROM Ricaduta WHERE Controllo_Standard="+c);
                    String y="";
                    if(tipo.next())
                       y=tipo.getString("Ricaduta");
                    if(y!=null && (y.toLowerCase().equals("clinica") || y.toLowerCase().equals("radiologica")))
                        colore=Color.RED;
                    else
                        colore=Color.YELLOW;
                }
                creaPulsante(i,d,c,2,colore,nome);
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
                creaPulsante(i,d,c,3,Color.GREEN.darker(),rs.getString("Terapia"));
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
                creaPulsante(i,d,null,1,new Color(112,146,190),"Diagnosi");
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
    
    private void creaPulsante(int i,Date d,Integer cod,int tipo,Color c,String nome)
    {
        PulsanteBarra b=new PulsanteBarra(i,cod,tipo);
        b.setData(d);
        b.setText("<HTML>"+Utilita.dataToString(d)+"<BR>"+nome+"</HTML>");
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
            parent.pressionePulsanteBarra(1, premuto.getData(), false);//Pazienti.getCurrID()
            parent.selezionaScheda(1);
            return;
        }
        if(tipo==2)
        {
            parent.aggiornaDatiControllo(premuto.getIdControllo());
            parent.abilitaBarraSuperioreControllo(true);
            parent.selezionaScheda(2);
            return;
        }
        if(tipo==3)
        {
            parent.aggiornaDatiDH(premuto.getIdControllo());
            parent.abilitaBarraSuperioreDH(true);
            parent.selezionaScheda(3);
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
            .addGap(0, 807, Short.MAX_VALUE)
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void prevColor(Color col)
    {
        if(prevButton!=null)
            prevButton.setBackground(col);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pannelloBarra;
    // End of variables declaration//GEN-END:variables
}
