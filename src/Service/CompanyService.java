package Service;

import Entity.Company;
import Repository.StockList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CompanyService {

    StockList stockList;

    public static List<Company> allStocks() {
        Map<Long, Company> stocks = StockList.getStockList();
        List<Company> company = new ArrayList<>();
        for(Map.Entry<Long, Company> e : stocks.entrySet()) {
            company.add(e.getValue());
        }
        return company;
    }

}
