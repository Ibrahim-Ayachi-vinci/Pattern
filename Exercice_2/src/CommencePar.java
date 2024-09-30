public class CommencePar implements Strategy{

  private char lettre;
  public CommencePar(char lettre){
    this.lettre = lettre;
  }

  @Override
  public boolean estValide(String mot) {
    return mot.charAt(0) == lettre;
  }
}
