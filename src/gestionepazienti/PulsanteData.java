/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.sql.Date;
import javax.swing.JButton;

/**
 *
 * @author Riccardo
 */
public class PulsanteData {
    private Date data;
    private JButton  pulsante;
    private int ID;

    public int getID() {
        return ID;
    }

    public Date getData() {
        return data;
    }

    public JButton getPulsante() {
        return pulsante;
    }

    public PulsanteData(Date data, JButton pulsante,int ID) {
        this.data = data;
        this.pulsante = pulsante;
        this.ID=ID;
    }
    
    private static PulsanteData premuto;

    public static PulsanteData getPremuto() {
        return premuto;
    }

    public static void setPremuto(PulsanteData premuto) {
        PulsanteData.premuto = premuto;
    }
    
    public static void nessunPremuto()
    {
        premuto=null;
    }
    
    
}
