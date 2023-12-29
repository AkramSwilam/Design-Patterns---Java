public class MediumMealBuilder extends MacMealBuilder {

    @Override
    void buildBurger(String burger) {
        this.macMeal.setBurger(burger);
    }

    @Override
    void buildDrink(String drink) {
        this.macMeal.setDrink(drink);
    }

    @Override
    void BuildFries(String fries) {
        this.macMeal.setFries(fries);
    }
}
