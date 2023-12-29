package Light_Sysytem;

public class AirCondition implements ElectronicDevice{
    @Override
    public void on() {
        System.out.println("air condition is ON !");
    }

    @Override
    public void off() {
        System.out.println("air condition is OFF !");
    }
}
