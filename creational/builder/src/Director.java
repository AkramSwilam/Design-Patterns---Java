public class Director {
    MacMealBuilder builder;
    Director(MacMealBuilder builder){
        this.builder=builder;
    }
    MacMeal makeMeal(String burger, String drink, String fries){
        builder.buildBurger(burger);
        builder.buildDrink(drink);
        builder.BuildFries(fries);
        return  builder.macMeal;
    }
}
