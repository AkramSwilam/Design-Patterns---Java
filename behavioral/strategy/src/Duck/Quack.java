package Duck;

public class Quack implements QuackStrategy{

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
