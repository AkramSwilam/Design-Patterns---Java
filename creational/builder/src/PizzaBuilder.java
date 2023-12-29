public abstract class PizzaBuilder {
    Pizza pizza;
    PizzaBuilder(){
        pizza=new Pizza();
    }



    abstract void setFlavour();
    abstract void setSauce();
    abstract void setCheese();


}
