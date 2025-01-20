public class PointsDeVieRobot extends Amelioration{

  private int multiplier;

  public PointsDeVieRobot(Robot robot, int multiplier) {
    super(robot);
    this.multiplier = multiplier;
  }

  @Override
  public int diffLife(int i) {
    return super.diffLife(i/multiplier);
  }
}
