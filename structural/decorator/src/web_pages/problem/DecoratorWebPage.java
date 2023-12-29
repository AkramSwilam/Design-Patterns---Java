package web_pages.problem;

public class DecoratorWebPage implements WebPage {
    WebPage basicWebPage;
    public DecoratorWebPage(WebPage page){
        basicWebPage=page;
    }
    public void display(){
        basicWebPage.display();
    }
}
