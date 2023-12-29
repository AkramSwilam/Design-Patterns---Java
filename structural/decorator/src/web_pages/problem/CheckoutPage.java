package web_pages.problem;

public class CheckoutPage extends DecoratorWebPage{
    public CheckoutPage(WebPage page) {
        super(page);
    }

    @Override
    public void display() {
        super.display();
        checkout();
    }
    public void checkout(){
        System.out.println("checkout page");
    }
}
