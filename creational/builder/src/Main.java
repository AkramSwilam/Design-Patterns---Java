public class Main {
    public static void main(String[] args) {
        MacMealBuilder bigMeal=new BigMealBuilder();
        Director director=new Director(bigMeal);
        MacMeal meal=director.makeMeal("big burger","big cola", "big fries");
        System.out.println(meal.burger);

        PizzaBuilder p=new LargePizzaBuilder();
        PizzaDirector d=new PizzaDirector(p);
        d.cookPizza();
        Pizza pizza=d.getPizza();
        System.out.println(pizza.sauce);
    }
}