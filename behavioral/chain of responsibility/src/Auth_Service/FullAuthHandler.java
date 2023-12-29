package Auth_Service;

public class FullAuthHandler {
    Handler handler;
    public FullAuthHandler(Handler h){
        handler=h;
    }

    public boolean handle(String name, String password){
        if( handler.handle(name, password))
        {
            System.out.println("done");
            return true;
        }
        return false;
    }
}
