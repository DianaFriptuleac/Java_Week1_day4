package ex1_dipendente;

import java.time.LocalDateTime;

public abstract class Dipendente implements Lavorare {
    private final String matricola;  //non puo essere modificato dopo l'inizializzazione
    private Dipartimento dipartimento;  //preso da enum


    //Costruttore
    public Dipendente(String matricola,Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    //Get matricola

    public String getMatricola(){
        return matricola;
    }


    //Get e Set per il dipartimento

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //Calcolo dello stipendio
    //mi assicuro che ogni sottoclasse abbia questo metodo ma visto che cambia x ogni classe di dipendente lo metto abstract
    public abstract double calculateSalary();

    //Metodo checkIn
    @Override
    public void checkIn(LocalDateTime data){
        System.out.println("Dipendente: "+ matricola+ " check-in fatto in data: " + data);
    }
}
