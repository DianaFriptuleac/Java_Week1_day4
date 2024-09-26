package ex1_dipendente;

import java.time.LocalDateTime;

public class Volontario implements Lavorare {
private final String nome;
private final int eta;
private final String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome(){
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }


    @Override
    public void checkIn(LocalDateTime data) {
        System.out.println("Il volontario " + nome + " ha fatto check-in in data: " + data);
    }
}
