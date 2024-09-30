public class Not implements Strategy{


  private Strategy strategy1;

  public Not (Strategy strategy1){
    this.strategy1 = strategy1;
  }

  @Override
  public boolean estValide(String mot) {
    return !strategy1.estValide(mot);
  }
}
