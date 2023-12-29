package ice_cream;

public class WithNuts extends IceCreamDecorator{

    public WithNuts(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void make() {
        iceCream.make();
        System.out.println("With Nuts");
    }
}
