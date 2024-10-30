import Entity.Company;
import Service.CompanyService;
import Service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserService userService = new UserService();
        CompanyService companyService = new CompanyService();

//        userService.addBalance(1L, 5000, "Add");
//        userService.addBalance(1L, 2000, "Add");

        List<Company> companyList = CompanyService.allStocks();
        for(Company c : companyList) {
            System.out.println(c.getStockName() + " : " + c.getPrice());
        }

    }
}