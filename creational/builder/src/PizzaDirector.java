public class PizzaDirector {
    PizzaBuilder builder;
    PizzaDirector(PizzaBuilder builder){
        this.builder=builder;
    }

    void cookPizza(){
        builder.setCheese();
        builder.setFlavour();
        builder.setSauce();
    }

    Pizza getPizza(){
        return builder.pizza;
    }
}
