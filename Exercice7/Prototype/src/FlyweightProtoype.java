import java.util.HashMap;
import java.util.Map;

public class FlyweightProtoype {

  private Map<String, Robot> robotMap = new HashMap<>();

  public void addPrototype(String name, Robot robot) {
    robotMap.put(name, robot);
  }

  public Robot createRobot(String name) throws CloneNotSupportedException{
    return robotMap.get(name).clone();
  }
}