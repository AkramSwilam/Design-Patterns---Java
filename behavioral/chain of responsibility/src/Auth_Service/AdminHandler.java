package Auth_Service;

import java.util.ArrayList;
import java.util.List;

public class AdminHandler extends Handler{
    List<String> admins=new ArrayList<>();
    public AdminHandler(){
        admins.add("akram");
    }
    @Override
    public boolean handle(String name, String password) {
        if (admins.contains(name))
            return this.handleNxt(name,password);

        return false;
    }
}
