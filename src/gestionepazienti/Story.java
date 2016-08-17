package gestionepazienti;

import java.sql.Date;

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
