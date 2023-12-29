package ice_cream;

public abstract class IceCreamDecorator implements IceCream {
    IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public abstract void make();
}
