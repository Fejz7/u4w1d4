package package1;

public class AltroMain {
    public static void main(String[] args) {

        Dipendente dipendente = new Dipendente(2, 2500.0, Dipendente.Dipartimento.AMMINISTRAZIONE);


        System.out.println("Dipartimento prima della modifica: " + dipendente.getDipartimento());


        dipendente.setDipartimento(Dipendente.Dipartimento.PRODUZIONE);


        System.out.println("Dipartimento dopo la modifica: " + dipendente.getDipartimento());
    }
}

