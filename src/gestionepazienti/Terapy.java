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
public class Terapy {
    private Date dataInizio;
    private Date dataFine;
    private Integer idPaz;
    private String terapia;

    public Terapy(Date dataInizio, Date dataFine, Integer idPaz, String terapia) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.idPaz = idPaz;
        this.terapia = terapia;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }

    public void setTerapia(String terapia) {
        this.terapia = terapia;
    }

    
    public Date getDataInizio() {
        return dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public Integer getIdPaz() {
        return idPaz;
    }

    public String getTerapia() {
        return terapia;
    }
    
    
}
