package warehouses_stock_problem;

import java.util.HashMap;

public class RealWarehouse implements Warehouse {

    HashMap<String,Integer> stocks;
    public RealWarehouse(HashMap<String,Integer> s){
        stocks=s;
    }
    @Override
    public void fulfill(String order) {
        stocks.put(order,stocks.get(order)-1);
        System.out.println("fulfilled");
    }
}
