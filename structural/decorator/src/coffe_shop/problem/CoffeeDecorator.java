package coffe_shop.problem;

public abstract class CoffeeDecorator extends Beverage  {
   Beverage beverage;
    CoffeeDecorator(Beverage b){
        beverage=b;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
