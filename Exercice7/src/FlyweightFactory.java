import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

  private Map<String, RobotFactory> factoryMap = new HashMap<String, RobotFactory>();

  public boolean put (String name, RobotFactory robotFactory){
    if (!name.equals("Pic-Vert") && !name.equals("Tank") && !name.equals("Grosse-Berta")){
      return false;
    }
    factoryMap.put(name, robotFactory);
    return true;
  }

  public Robot createRobot(String name){
    return factoryMap.get(name).createRobot();
  }

}
