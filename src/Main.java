import ex1_dipendente.*;

public class Main {
    public static void main(String[] args) {
       // System.out.println("------------------------EX1------------------------");
        //I 3 dipendenti
        //Dipendente firstDipendente = new Dipendente("CD5524", 1550.00, Dipartimento.PRODUZIONE);
        //Dipendente secondDipendente = new Dipendente("CD5824", 2100.00, Dipartimento.AMMINISTRAZIONE);
       // Dipendente thirdDipendente = new Dipendente("CD3524", 1850.00, Dipartimento.VENDITE);


        System.out.println("------------------------EX2------------------------");
        //I 3 dipendenti
        Dipendente firstDipendente = new DipendenteFullTime("CD5524", Dipartimento.PRODUZIONE,1850.00);
        Dipendente secondDipendente = new DipendentePartTime("CD5824", Dipartimento.AMMINISTRAZIONE, 10.5, 90);
        Dipendente thirdDipendente = new Dirigente("CD3524", Dipartimento.VENDITE, 3150.00, 400);

        //Array di dipendenti
        Dipendente[] dipendenti = {firstDipendente, secondDipendente,thirdDipendente};

        //Stampo
        double totaleStipendiDaPagare = 0.0;
        for (Dipendente dipendente : dipendenti) {
            // Stampo i dettagli di ogni dipendente
            System.out.println("Numero della matricola: " + dipendente.getMatricola() +
                    " Stipendio mensile: " + dipendente.calculateSalary() + " euro");
            // Aggiungo lo stipendio al totale
            totaleStipendiDaPagare += dipendente.calculateSalary();
        }

      // Stampa il totale degli stipendi dopo aver iterato su tutti i dipendenti
        System.out.println("Totali stipendi da pagare questo mese: " + totaleStipendiDaPagare + " euro.");



    }

}