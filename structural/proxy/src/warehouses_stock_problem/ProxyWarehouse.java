package warehouses_stock_problem;

import java.util.*;
import java.util.function.BiConsumer;

public class ProxyWarehouse implements Warehouse{
    List<RealWarehouse> warehouseList;
    public ProxyWarehouse(List<RealWarehouse> warehouses){
        warehouseList=warehouses;
    }
    @Override
    public void fulfill(String order) {
        for (RealWarehouse warehouse : warehouseList) {
            for(Map.Entry<String,Integer> set : warehouse.stocks.entrySet()){
                if(Objects.equals(set.getKey(), order) && set.getValue()>0)
                {
                    warehouse.fulfill(order);
                    return;
                }
            }
        }
    }
}
