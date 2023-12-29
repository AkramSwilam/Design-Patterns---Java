import download_problem.ProxyDownload;
import site_problem.Proxy;
import warehouses_stock_problem.ProxyWarehouse;
import warehouses_stock_problem.RealWarehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Proxy proxy=new Proxy();
//        proxy.makeConnection("google");
//        proxy.makeConnection("twitter");

//        ProxyDownload proxyDownload=new ProxyDownload("google");
//        proxyDownload.download();
//        proxyDownload.download();

        HashMap<String,Integer>map1=new HashMap<>();
        map1.put("nike",3);
        map1.put("puma",2);
        map1.put("adidas",2);
        RealWarehouse warehouse1=new RealWarehouse(map1);

        HashMap<String,Integer>map2=new HashMap<>();
        map2.put("HM",3);
        map2.put("Town Team",2);
        map2.put("Zara",2);
        RealWarehouse warehouse2=new RealWarehouse(map2);
        List<RealWarehouse> ws=new ArrayList<>();
        ws.add(warehouse1);
        ws.add(warehouse2);
        ProxyWarehouse proxyWarehouse=new ProxyWarehouse(ws);

        proxyWarehouse.fulfill("puma");
        proxyWarehouse.fulfill("puma");
        proxyWarehouse.fulfill("puma");
    }
}