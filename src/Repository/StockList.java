package Repository;

import Entity.Company;

import java.util.HashMap;
import java.util.Map;

public class StockList {

     private static Map<Long, Company> stockList = new HashMap<>();



    private static void addToStockList() {
        Company c1 = new Company(1L, "c1", 200.0);
        Company c2 = new Company(2L, "c2", 100.0);
        Company c3 = new Company(3L, "c3", 50.0);
        stockList.put(1L, c1);
        stockList.put(2L, c2);
        stockList.put(3L, c3);
    }

    public static Map<Long, Company> getStockList() {
        addToStockList();
        return stockList;
    }

    public Company getStockById(Long id) {
        return stockList.get(id);
    }
}
