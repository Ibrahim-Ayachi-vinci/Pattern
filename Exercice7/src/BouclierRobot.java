public class BouclierRobot extends Amelioration {

  private int multiplier;

  public BouclierRobot(Robot robot, int multiplier) {
    super(robot);
    this.multiplier = multiplier;
  }

  @Override
  public int getShield() {
    return super.getShield()*multiplier;
  }
}
