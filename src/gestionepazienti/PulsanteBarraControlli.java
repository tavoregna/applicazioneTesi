package gestionepazienti;

import java.awt.Color;
import javax.swing.JButton;

public class PulsanteBarraControlli {
    private JButton pulsante;
    private Color colore;
    
    public void ripristinaColore()
    {
        if(colore!=null)
            pulsante.setBackground(colore);
    }

    public JButton getPulsante() {
        return pulsante;
    }

    public void setPulsante(JButton pulsante) {
        this.pulsante = pulsante;
    }

    public Color getColore() {
        return colore;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public PulsanteBarraControlli(JButton pulsante, Color colore) {
        this.pulsante = pulsante;
        this.colore = colore;
        ripristinaColore();
    }
}
