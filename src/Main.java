import ex1_dipendente.Dipartimento;
import ex1_dipendente.Dipendente;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------EX1------------------------");
        //I 3 dipendenti
        Dipendente firstDipendente = new Dipendente("CD5524", 1550.00, Dipartimento.PRODUZIONE);
        Dipendente secondDipendente = new Dipendente("CD5824", 2100.00, Dipartimento.AMMINISTRAZIONE);
        Dipendente thirdDipendente = new Dipendente("CD3524", 1850.00, Dipartimento.VENDITE);

        //Array di dipendenti
        Dipendente[] dipendenti = {firstDipendente, secondDipendente,thirdDipendente};

        //Stampo la matricola
        for(Dipendente dipendente: dipendenti){
            System.out.println("Numero della matricola: " + dipendente.getMatricola());
        }
    }

}