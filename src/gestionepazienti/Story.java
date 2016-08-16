/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionepazienti;

import java.sql.Date;

/**
 *
 * @author Riccardo
 */
public class Story {
    private int ID;
    private Date data;
    private String testo;

    public int getID() {
        return ID;
    }

    public Date getData() {
        return data;
    }

    public String getTesto() {
        return testo;
    }

    public Story(int ID, Date data, String testo) {
        this.ID = ID;
        this.data = data;
        this.testo = testo;
    }
    
    
    
}
