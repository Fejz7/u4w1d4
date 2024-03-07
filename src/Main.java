import package1.Dipendente;


public class Main {

        public static void main(String[] args) {

            Dipendente dipendente1 = new Dipendente(1, 2000.0, Dipendente.Dipartimento.PRODUZIONE);
            Dipendente dipendente2 = new Dipendente(2, 2500.0, Dipendente.Dipartimento.AMMINISTRAZIONE);
            Dipendente dipendente3 = new Dipendente(3, 3000.0, Dipendente.Dipartimento.VENDITE);


            Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};


            for (Dipendente dipendente : dipendenti) {
                System.out.println("Matricola: " + dipendente.getMatricola());

                System.out.println("Stipendio: " + dipendente.getStipendio());
                System.out.println("Dipartimento: " +dipendente.getDipartimento());}
        }
    }
