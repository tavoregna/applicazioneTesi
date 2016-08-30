
package gestionepazienti;

import java.awt.Color;
import java.util.Date;
import javax.swing.BoxLayout;


public class AmbulatorioOrdinarioUI extends javax.swing.JPanel {
    
    private PazienteUI parent;
    private ControlloAmbulatorialeStandardUI standard;
    private TerapiaPrincipaleUI terPrincipale;
    private int idControllo;
    
    public AmbulatorioOrdinarioUI(PazienteUI p, int id) {
        initComponents();
        parent=p;
        idControllo=id;
        standard=new ControlloAmbulatorialeStandardUI(parent,idControllo);
        terPrincipale=new TerapiaPrincipaleUI(parent, this,idControllo);
        panelStandard.setLayout(new BoxLayout(panelStandard, BoxLayout.LINE_AXIS));
        panelTerPrincipale.setLayout(new BoxLayout(panelTerPrincipale, BoxLayout.LINE_AXIS));
        panelStandard.add(standard);
        panelTerPrincipale.add(terPrincipale);
        //aggiornaDati(idControllo);
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

    /*public void aggiornaDati(int id)
    {
        if(id==-1)
        {
            return;
        }
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruppoTeraPrinc = new javax.swing.ButtonGroup();
        panelStandard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelTerPrincipale = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(910, 656));

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
        panelTerPrincipale.setPreferredSize(new java.awt.Dimension(451, 150));

        javax.swing.GroupLayout panelTerPrincipaleLayout = new javax.swing.GroupLayout(panelTerPrincipale);
        panelTerPrincipale.setLayout(panelTerPrincipaleLayout);
        panelTerPrincipaleLayout.setHorizontalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );
        panelTerPrincipaleLayout.setVerticalGroup(
            panelTerPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
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
                .addContainerGap(219, Short.MAX_VALUE))
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
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gruppoTeraPrinc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelStandard;
    private javax.swing.JPanel panelTerPrincipale;
    // End of variables declaration//GEN-END:variables
}
