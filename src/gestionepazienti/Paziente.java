package gestionepazienti;


public class Paziente {
    private String nome;
    private String cognome;
    private String sesso;

    public Paziente(String nome, String cognome, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
    }

    public String getNome() {
        if(nome==null)
            return "";
        return nome;
    }

    public String getCognome() {
        if(cognome==null)
            return "";
        return cognome;
    }

    public String getSesso() {
        if(sesso==null)
            return "M";
        return sesso;
    } 
}
