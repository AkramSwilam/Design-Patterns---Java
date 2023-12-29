package coffe_shop.problem;

public class Espresso extends Beverage{

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
