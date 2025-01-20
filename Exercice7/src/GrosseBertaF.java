public class GrosseBertaF implements RobotFactory{

  @Override
  public Robot createRobot() {
    return new RobotImpl.RobotBuilder("Grosse-Berta").puissance(10).frequence(200).build();
  }
}
