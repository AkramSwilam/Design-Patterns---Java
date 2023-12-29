package Duck;

public class NoQuack implements QuackStrategy{
    @Override
    public void quack() {
        System.out.println("silence ....");
    }
}
