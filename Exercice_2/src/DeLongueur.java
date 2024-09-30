public class DeLongueur implements Strategy{

  int longueur;

  public DeLongueur(int longueur){
    this.longueur = longueur;
  }

  @Override
  public boolean estValide(String mot) {
    return mot.length() == longueur;
  }
}
