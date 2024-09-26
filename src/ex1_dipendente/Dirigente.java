package ex1_dipendente;

public class Dirigente extends Dipendente{
    private final double stipendioBase;
    private final double bonusMensili;

    public Dirigente(String matricola, Dipartimento dipartimento, double stipendioBase, double bonusMensili) {
        super(matricola, dipartimento);
        this.stipendioBase = stipendioBase;
        this.bonusMensili = bonusMensili;
    }

    @Override
    //Calcolo lo stipendio del dirigente
    public double calculateSalary() {
        return stipendioBase + bonusMensili;
    }
}
