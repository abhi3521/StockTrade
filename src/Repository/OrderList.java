package Repository;

import Entity.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderList {
    Map<Long, Order>  orderMap = new HashMap<>();

    public void addOrder(Order order){
        orderMap.put(order.getOrderId(), order);
    }

    public Map<Long, Order> getOrderMap() {
        return orderMap;
    }
}


