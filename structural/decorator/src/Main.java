import coffe_shop.problem.Beverage;
import coffe_shop.problem.Espresso;
import coffe_shop.problem.Mocha;

public class Main {
    public static void main(String[] args) {
//        WebPage webPage = new BasicWebPage();
//        webPage=  new CheckoutPage(webPage);
//        webPage= new AuthWebPage(webPage);
//        webPage.display();

       Beverage beverage=new Espresso();
        beverage = new Mocha(beverage);
        System.out.println( beverage.getDescription());
        System.out.println( beverage.getPrice());
    }
}