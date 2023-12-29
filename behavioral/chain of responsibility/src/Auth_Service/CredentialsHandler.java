package Auth_Service;

import java.util.HashMap;
import java.util.Objects;

public class CredentialsHandler extends Handler {
    HashMap<String,String> usersData;
    public CredentialsHandler(){
        usersData=new HashMap<>();
        usersData.put("akram","123");
        usersData.put("ahmed","123");
    }
    @Override
    public boolean handle(String name, String password) {
        if (!usersData.containsKey(name))
            return false;
        if (!Objects.equals(usersData.get(name), password))
            return false;

        return this.handleNxt(name,password);
    }
}
