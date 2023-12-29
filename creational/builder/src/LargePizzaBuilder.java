public class LargePizzaBuilder extends PizzaBuilder{

    @Override
    void setFlavour() {
        this.pizza.setFlavour("large flavour");
    }

    @Override
    void setSauce() {
        this.pizza.setSauce("large sauce");
    }

    @Override
    void setCheese() {
        this.pizza.setCheese("large cheese");
    }
}
