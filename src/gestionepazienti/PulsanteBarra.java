/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.awt.Color;
import java.sql.Date;
import javax.swing.JButton;

/**
 *
 * @author Riccardo
 */
public class PulsanteBarra extends JButton{
    private int indicePulsante;
    private Integer idControllo;
    private Color colore;
    private Date data;

    public PulsanteBarra(int indicePulsante, Integer idControllo) {
        super();
        this.indicePulsante = indicePulsante;
        this.idControllo = idControllo;
    }

    public PulsanteBarra(int indicePulsante, int idControllo, Date data) {
        super(Utilita.dataToString(data));
        this.indicePulsante = indicePulsante;
        this.idControllo = idControllo;
        this.data=data;
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
}
