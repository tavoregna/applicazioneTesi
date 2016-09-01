package gestionepazienti;

import javax.swing.JButton;

public class PulsanteBarraControlli extends JButton{
    private int indicePulsante;
    private int idControllo;

    public PulsanteBarraControlli(int indicePulsante, int idControllo) {
        super();
        this.indicePulsante = indicePulsante;
        this.idControllo = idControllo;
    }

    public PulsanteBarraControlli(int indicePulsante, int idControllo, String text) {
        super(text);
        this.indicePulsante = indicePulsante;
        this.idControllo = idControllo;
    }
    
    public int getIndicePulsante() {
        return indicePulsante;
    }

    public void setIndicePulsante(int indicePulsante) {
        this.indicePulsante = indicePulsante;
    }

    public int getIdControllo() {
        return idControllo;
    }

    public void setIdControllo(int idControllo) {
        this.idControllo = idControllo;
    }
}
