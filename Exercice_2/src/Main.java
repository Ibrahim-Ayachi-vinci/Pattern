import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage : java ListerMots1 fichier");
            System.exit(1);
        }
        String fichier = args[0];
        Strategy strategy1 = new CommencePar('t');
        Strategy strategy2 = new DeLongueur(8);
        Strategy strategy3 = new Palindrome();


        new ListerMots1(fichier).imprimer(strategy1);
        System.out.println("--------------------");
        new ListerMots1(fichier).imprimer(strategy2);
        System.out.println("--------------------");
        new ListerMots1(fichier).imprimer(strategy3);

    }
}