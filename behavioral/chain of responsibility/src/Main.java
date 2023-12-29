import Auth_Service.AdminHandler;
import Auth_Service.CredentialsHandler;
import Auth_Service.FullAuthHandler;
import Auth_Service.Handler;

public class Main {
    public static void main(String[] args) {
        Handler handler=new CredentialsHandler();
        handler.setNxt(new AdminHandler());
        FullAuthHandler fullAuthHandler=new FullAuthHandler(handler);
        fullAuthHandler.handle("akram","123");
    }
}