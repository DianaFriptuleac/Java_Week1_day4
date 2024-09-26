import ex1_dipendente.*;

import java.time.LocalDateTime;

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

        // Volontari
        Volontario firstVolontario = new Volontario("Mario", 30, "CV Mario Rossi");
        Volontario secondVolontario = new Volontario("Anna", 29, "CV Anna Neri");
        Volontario thirdVolontario = new Volontario("Luca", 31, "CV Luca Verdi");



        // Array di lavoratori (dipendenti e volontari)
        Lavorare[] persone = {firstDipendente, secondDipendente, thirdDipendente, firstVolontario, secondVolontario, thirdVolontario};



        // Iterazione e chiamata del metodo checkIn per ogni lavoratore
        for (Lavorare /*nome della classe*/  lavoratore  : persone /*nome array*/ ) {
            lavoratore.checkIn(LocalDateTime.now());  // Ora il metodo checkIn sarà disponibile
        }


        // Stampo gli stipendi solo per i dipendenti
        double totaleStipendiDaPagare = 0.0;
        for (Dipendente /*nome della classe*/ dipendente /*nome array*/ : new Dipendente[]{firstDipendente, secondDipendente, thirdDipendente}) {
            // Stampo i dettagli di ogni dipendente
            System.out.println("Numero della matricola: " + dipendente.getMatricola() +
                    " Stipendio mensile: " + dipendente.calculateSalary() + " euro");
            // Aggiungo lo stipendio al totale
            totaleStipendiDaPagare += dipendente.calculateSalary();
        }



      // Stampa il totale degli stipendi dopo aver iterato su tutti i dipendenti
        System.out.println("Totali stipendi da pagare questo mese: " + totaleStipendiDaPagare + " euro.");




        // Stampo la lista dei volontari
        System.out.println("\n------------------------Lista dei Volontari------------------------");
        Volontario[] volontari = {firstVolontario, secondVolontario, thirdVolontario};

        for (Volontario volontario : volontari) {
            System.out.println("Nome: " + volontario.getNome() +
                    ", Età: " + volontario.getEta() +
                    ", CV: " + volontario.getCv());
        }



}}