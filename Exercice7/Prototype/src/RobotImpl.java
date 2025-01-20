public class RobotImpl implements Robot {

  private final String name;

  private int pointsDeVie;

  private final int puissance;

  private final int bouclier;

  private final int frequence;

  public RobotImpl(RobotBuilder builder){
    this.name = builder.name;
    this.pointsDeVie = builder.pointsDeVie;
    this.puissance = builder.puissance;
    this.bouclier = builder.bouclier;
    this.frequence = builder.frequence;
  }

  @Override
  public int getCanon() {
    return puissance;
  }

  @Override
  public int getShield() {
    return bouclier;
  }

  @Override
  public int getFreq() {
    return frequence;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int diffLife(int i) {
    return pointsDeVie += i;
  }

  @Override
  public Robot clone() throws CloneNotSupportedException{
    return (Robot) super.clone();
  }

  @Override
  public String toString() {
    return "RobotImpl{" +
        "name='" + name + '\'' +
        ", pointsDeVie=" + pointsDeVie +
        ", puissance=" + puissance +
        ", bouclier=" + bouclier +
        ", frequence=" + frequence +
        '}';
  }

  public static class RobotBuilder {

    private final String name;

    private int pointsDeVie = 100;

    private int puissance = 1;

    private int bouclier = 1;

    private int frequence = 100;

    public RobotBuilder(String name){
      this.name = name;
    }

    public RobotBuilder pointsDeVie(int pointsDeVie){
      this.pointsDeVie = pointsDeVie;
      return this;
    }

    public RobotBuilder puissance(int puissance){
      this.puissance = puissance;
      return this;
    }

    public RobotBuilder bouclier(int bouclier){
      this.bouclier = bouclier;
      return this;
    }

    public RobotBuilder frequence(int frequence){
      this.frequence = frequence;
      return this;
    }

    public RobotImpl build(){
      return new RobotImpl(this);
    }

  }
}
