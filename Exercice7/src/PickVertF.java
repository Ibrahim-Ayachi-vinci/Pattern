public class PickVertF implements RobotFactory {



  @Override
  public Robot createRobot() {
    return new RobotImpl.RobotBuilder("Pic-Vert").puissance(1).bouclier(1).frequence(10).build();
  }
}