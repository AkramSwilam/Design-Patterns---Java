package Duck;

public class FlyWithWings implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Flying...!");
    }
}
