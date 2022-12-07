public abstract class Automobile{
    public String name;
    public int weight;
    public int power;
    public CarType carType;
    public EngineType engine;

    abstract public void turnEngineOn();
    abstract public void turnEngineOff();

    public class Engine {
        public static void turnEngine(boolean condition) {
            if (condition == true) {
                System.out.println("Engine is turned on");
            }
            if (condition == false) {
                System.out.println("Engine is turned off");
            }
        }
    }

    public class Wheel {
        public static void spinWheel(boolean direction) {
            if (direction == true) {
                System.out.println("Turning left!");
            }
            if (direction == false) {
                System.out.println("Turning right!");
            }
        }

    }



    public void spinWheelRight() {
        Wheel.spinWheel(true);
    }

    public void spinWheelLeft() {
        Wheel.spinWheel(false);
    }
    public void goForward(){
        System.out.println("Going forward");
    }
    public void stop(){
        System.out.println("Car stopped");
    }
}
