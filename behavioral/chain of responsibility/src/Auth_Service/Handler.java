package Auth_Service;

public abstract class Handler {
    Handler nxt;

    public abstract boolean handle(String name, String password);

    public void setNxt(Handler nxt){
        this.nxt=nxt;
    }

    public boolean handleNxt(String name, String password){
        if(nxt==null)
            return true;
        return this.handle(name,password);
    }
}
