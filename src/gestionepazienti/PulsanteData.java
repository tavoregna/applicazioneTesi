package gestionepazienti;

import java.sql.Date;
import javax.swing.JButton;

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
    
    //ultimo pulsante premuto
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
