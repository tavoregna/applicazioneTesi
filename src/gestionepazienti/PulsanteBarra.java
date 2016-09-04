package gestionepazienti;

import java.awt.Color;
import java.sql.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class PulsanteBarra extends JButton implements Comparable<PulsanteBarra>{
    private int indicePulsante;
    private Integer idControllo;
    private int tipo;                    //1=DIAGNOSTICA, 2=CONTROLLO AMBULATORIALE, 3=TERAPIA INFUSIVA
    private Color colore;
    private Date data;

    public PulsanteBarra(int indicePulsante, Integer idControllo,int tipo) {
        super();
        this.indicePulsante = indicePulsante;
        this.idControllo = idControllo;
        this.tipo=tipo;
    }

    public PulsanteBarra(int indicePulsante, int idControllo, Date data,int tipo) {
        super(Utilita.dataToString(data));
        this.indicePulsante = indicePulsante;
        this.idControllo = idControllo;
        this.data=data;
        this.tipo=tipo;
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

    public void setColore(Color colore) {
        this.setBackground(colore);
        this.colore = colore;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
        this.setText(Utilita.dataToString(data));
    }

    public int getTipo() {
        return tipo;
    }
    
    public void ripristinaBordo()
    {
        this.setBorder(new JButton().getBorder());
    }
    public void bordoSelezione()
    {
        this.setBorder(BorderFactory.createBevelBorder(0, Color.green, Color.orange, Color.red, Color.blue));
    }
    
    @Override
    public int compareTo(PulsanteBarra o) {
        return this.data.compareTo(o.getData());
    }
    
}
