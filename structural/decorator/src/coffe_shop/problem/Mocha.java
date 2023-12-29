package coffe_shop.problem;

public class Mocha extends CoffeeDecorator{

    public Mocha(Beverage b) {
        super(b);
    }

    @Override
   public String getDescription() {
        return beverage.getDescription()+" Mocha";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice()+7;
    }


}
