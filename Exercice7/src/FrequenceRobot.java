public class FrequenceRobot extends Amelioration {

  private int multiplier;

  public FrequenceRobot(Robot robot, int multiplier) {
    super(robot);
    this.multiplier = multiplier;
  }

  @Override
  public int getFreq() {
    return super.getFreq()*multiplier;
  }
}
