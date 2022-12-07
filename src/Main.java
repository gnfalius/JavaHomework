public class Main {
    public static void main(String[] args) {
    ElectricAutomobile mazdaFive= new ElectricAutomobile();
    mazdaFive.name="Mazda Five";
    mazdaFive.weight=2000;
    mazdaFive.power=200;
    mazdaFive.carType = CarType.light;
    drive(mazdaFive);
    RegularAutomobile niva=new RegularAutomobile();
    niva.name="Niva";
    niva.weight=2500;
    niva.power=130;
    niva.carType = CarType.offroad;
    drive(niva);
    }
    public static void drive(Automobile car){
        System.out.println("Your car is "+ car.name+". Its weight is "+ car.weight+" Kilograms. Its power is "+car.power+" horse powers");
        if (car.engine == EngineType.regular){
            car.turnEngineOn();
        }
        car.goForward();
        car.spinWheelRight();
        car.spinWheelLeft();
        if (car.engine == EngineType.regular){
            car.turnEngineOff();
        }
        car.stop();
        System.out.println("Nice driving!");
    }
}