public class ElectricAutomobile extends Automobile implements Drivable {
   @Override
   public void turnEngineOff() {
      return;

   }

   @Override
   public void turnEngineOn() {
      return;
   }
   public ElectricAutomobile(){
      this.engine=EngineType.electric;
   }
}
