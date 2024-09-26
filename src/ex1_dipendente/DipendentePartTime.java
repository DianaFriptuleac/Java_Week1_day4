package ex1_dipendente;

public class DipendentePartTime extends Dipendente {
    private final double pagaOre;
    private final int oreLavorative;

    public DipendentePartTime(String matricola, Dipartimento dipartimento, double pagaOre, int oreLavorative) {
        super(matricola, dipartimento);
        this.pagaOre = pagaOre;
        this.oreLavorative = oreLavorative;
    }

    @Override
    //Override del metodo abstract della classe Dipendente e calcolo stipendio x i PartTime
    public double calculateSalary() {
        return pagaOre * oreLavorative;
    }
}
