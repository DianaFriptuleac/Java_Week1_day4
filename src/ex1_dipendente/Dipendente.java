package ex1_dipendente;

public class Dipendente {
    private final String matricola;  //non puo essere modificato dopo l'inizializzazione
    private final double stipendio;  //non puo essere modificato dopo l'inizializzazione
    private Dipartimento dipartimento;  //preso da enum


    //Costruttore
    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //Get e Set

    public String getMatricola(){
        return matricola;
    }

    public double getStipendio(){
        return stipendio;
    }

    //Get e Set per il dipartimento

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}
