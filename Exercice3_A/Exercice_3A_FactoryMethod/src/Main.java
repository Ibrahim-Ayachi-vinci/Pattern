public class Main {

  public static void main(String[] args) {

    Livre livre1 = new Livre("livre1", 2019);
    Livre livre2 = new Livre("Livre2", 2018);

    DVD dvd1 = new DVD("dvd1", 2017);
    DVD dvd2 = new DVD("dvd2", 2016);

    MagasinDvd magasindvd = new MagasinDvd();

    magasindvd.ajouterProduct(dvd1.getName(), dvd1.getAnneeDeParution());
    magasindvd.ajouterProduct(dvd2.getName(), dvd2.getAnneeDeParution());

    MagasinLivre magasinLivre = new MagasinLivre();
    magasinLivre.ajouterProduct(livre1.getName(), livre1.getAnneeDeParution());
    magasinLivre.ajouterProduct(livre2.getName(), livre2.getAnneeDeParution());

    System.out.println(magasinLivre.retourneProduct(livre1.getName()));
  }
}