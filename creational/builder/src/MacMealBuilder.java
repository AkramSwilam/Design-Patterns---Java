public abstract class MacMealBuilder {
    protected final MacMeal macMeal;
    MacMealBuilder(){
        this.macMeal=new MacMeal();
    }


    abstract void buildBurger(String burger);

   abstract void buildDrink(String drink);
   abstract void BuildFries(String fries);
}
