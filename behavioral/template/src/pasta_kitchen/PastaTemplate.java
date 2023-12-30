package pasta_kitchen;

public abstract class PastaTemplate {
    void boilWater(){
        System.out.println("Water is boiling...");
    }
    void cookPasta(){
        System.out.println("Pasta is being cooked");
    }
    abstract void addSauce();
    abstract void addProtein();
    abstract void addGarnish();
    public void cook(){
        boilWater();
        cookPasta();
        addProtein();
        addSauce();
        addGarnish();
    }
}
