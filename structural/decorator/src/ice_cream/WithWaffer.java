package ice_cream;

public class WithWaffer extends IceCreamDecorator{
    public WithWaffer(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void make() {
        iceCream.make();
        System.out.println("Wafer");
    }
}
