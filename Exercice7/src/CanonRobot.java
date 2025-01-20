public class CanonRobot extends Amelioration {


  private int multiplier;

  public CanonRobot(Robot robot, int multiplier) {
    super(robot);
    this.multiplier = multiplier;
  }

  @Override
  public int getCanon() {
    return super.getCanon()*multiplier;
  }
}
