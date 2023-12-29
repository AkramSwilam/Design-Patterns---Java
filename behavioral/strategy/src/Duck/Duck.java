package Duck;

public abstract class Duck {
    FlyStrategy flyStrategy;
    QuackStrategy quackStrategy;

    public Duck(FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
    }

    public void fly(){
        flyStrategy.fly();
    }
    public void quack(){
        quackStrategy.quack();
    }
}
