public class RegularAutomobile extends Automobile implements Drivable{
    public void turnEngineOff() {
        Engine.turnEngine(false);
    }

    public void turnEngineOn() {
        Engine.turnEngine(true);
    }
    public RegularAutomobile(){
        this.engine=EngineType.regular;
    }
}
