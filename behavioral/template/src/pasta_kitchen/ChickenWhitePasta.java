package pasta_kitchen;

public class ChickenWhitePasta extends PastaTemplate{
    @Override
    void addSauce() {
        System.out.println("adding white sauce");
    }

    @Override
    void addProtein() {
        System.out.println("adding chicken");
    }

    @Override
    void addGarnish() {
        System.out.println("adding mint");
    }
}
