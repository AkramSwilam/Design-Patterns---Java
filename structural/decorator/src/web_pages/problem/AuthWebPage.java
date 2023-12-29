package web_pages.problem;

public class AuthWebPage extends DecoratorWebPage{

    public AuthWebPage(WebPage page) {
        super(page);
    }



    @Override
    public void display() {
        super.display();
        auth();
    }
    public void auth(){
        System.out.println("auth page");
    }
}
