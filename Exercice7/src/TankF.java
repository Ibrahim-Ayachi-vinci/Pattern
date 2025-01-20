public class TankF implements RobotFactory {

  @Override
  public Robot createRobot() {
    return new RobotImpl.RobotBuilder("Tank").puissance(1).frequence(100).pointsDeVie(1000).build();
  }
}
