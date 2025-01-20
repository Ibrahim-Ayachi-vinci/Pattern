public abstract class Amelioration implements Robot {

  private Robot robot;

  @Override
  public Robot clone() throws CloneNotSupportedException {
    Amelioration amelioration = (Amelioration) super.clone();
    amelioration.robot = amelioration.robot.clone();
    return amelioration;
  }

  public Amelioration(Robot robot){
    this.robot = robot;
  }

  @Override
  public int getCanon() {
    return robot.getCanon();
  }

  @Override
  public int getShield() {
    return robot.getShield();
  }

  @Override
  public int getFreq() {
    return robot.getFreq();
  }

  @Override
  public String getName() {
    return robot.getName();
  }

  @Override
  public int diffLife(int i) {
    return robot.diffLife(i);
  }
}
