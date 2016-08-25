
package gestionepazienti;

import java.awt.Color;
import java.util.Date;
import javax.swing.BoxLayout;


public class AmbulatorioOrdinarioUI extends javax.swing.JPanel {
    
    private PazienteUI parent;
    private ControlloAmbulatorialeStandardUI standard;
    private TerapiaPrincipaleUI terPrincipale;
    private Date dataControllo;
    
    public AmbulatorioOrdinarioUI(PazienteUI p, Date data) {
        initComponents();
        parent=p;
        dataControllo=data;
     /*  standard=new ControlloAmbulatorialeStandardUI(parent,dataControllo);
        terPrincipale=new TerapiaPrincipaleUI(parent, this,dataControllo);
        panelStandard.setLayout(new BoxLayout(panelStandard, BoxLayout.LINE_AXIS));
        panelTerPrincipale.setLayout(new BoxLayout(panelTerPrincipale, BoxLayout.LINE_AXIS));
        panelStandard.add(standard);
        panelTerPrincipale.add(terPrincipale);
        aggiornaDati(Pazienti.getCurrID(),dataControllo);*/
        this.setVisible(true);
        
    }
    
    public void coloreAmbulatoriOrdinari(int i) //i=Tipo terapia principale
    {
        if(i==1)
        {
         this.setBackground(new Color(181,230,29));
         return;
        }
        if(i==2)
        {
            this.setBackground(new Color(153,217,234));
            return;
        }
        this.setBackground(new Color(0,162,232));
    }

    public void aggiornaDati(int idPaz,Date date)
    {
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruppoTeraPrinc = new javax.swing.ButtonGroup();
        panelStandard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelTerPrincipale = new javax.swing.JPanel();

        setBackground(new java.awt.Color(181, 230, 29));
        setPreferredSize(new java.awt.Dimension(955, 666));

        javax.swing.GroupLayout panelStandardLayout = new javax.swing.GroupLayout(panelStandard);
        panelStandard.setLayout(panelStandardLayout);
        panelStandardLayout.setHorizontalGroup(
            panelStandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
        panelStandardLayout.setVerticalGroup(
            panelStandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Terapia Principale:");

        panelTerPrincipale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTerPrincipale.setOpaque(false);

        javax.swing.GroupLayout panelTerPrincipaleLayout = new javax.swing.GroupLayout(panelTerPrincipale);
        panelTerPrincipale.setLayout(panelTerPrincipaleLayout);
        panelTerPrincipaleLayout.setHorizontalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        panelTerPrincipaleLayout.setVerticalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTerPrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTerPrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gruppoTeraPrinc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelStandard;
    private javax.swing.JPanel panelTerPrincipale;
    // End of variables declaration//GEN-END:variables
}
