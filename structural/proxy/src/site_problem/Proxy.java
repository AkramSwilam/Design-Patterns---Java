package site_problem;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Site{
    private final SiteConnector siteConnector;
   List<String> connections;
    public Proxy(){
        this.siteConnector=new SiteConnector();
        connections= new ArrayList<>();
        connections.add("google");
        connections.add("Facebook");
    }
    public void makeConnection(String url){
        if (connections.contains(url))
            System.out.println( "Access Disabled");
        else{
            this.siteConnector.display(url);
        }

    }

    @Override
    public void display(String url) {
        makeConnection(url);
    }
}
