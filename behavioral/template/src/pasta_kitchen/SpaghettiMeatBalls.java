package pasta_kitchen;

public class SpaghettiMeatBalls extends PastaTemplate{
    @Override
    void addSauce() {
        System.out.println("adding tomato sauce");
    }

    @Override
    void addProtein() {
        System.out.println("adding meat balls");
    }

    @Override
    void addGarnish() {
        System.out.println("adding pepper");
    }
}
