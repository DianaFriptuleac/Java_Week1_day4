package ex1_dipendente;

public class DipendenteFullTime extends Dipendente{
private final double stipendio;

    public DipendenteFullTime(String matricola, Dipartimento dipartimento, double stipendio) {
        super(matricola, dipartimento);
        this.stipendio = stipendio;
    }

    @Override
    public double calculateSalary() {
        return stipendio;  //faccio l'override del metodo abstract dichiarato della classe Dipendente
    }
}
