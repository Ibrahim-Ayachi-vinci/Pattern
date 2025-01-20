public class Main {

  public static void main(String[] args) {

    FlyweightFactory factory = new FlyweightFactory();
    factory.put("Pic-Vert", new PickVertF());
    factory.put("Tank", new TankF());
    factory.put("Grosse-Berta", new GrosseBertaF());

    Robot tank = factory.createRobot("Tank");

    System.out.println(tank);

  }

}
