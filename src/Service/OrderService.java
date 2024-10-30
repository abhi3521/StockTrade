package Service;

import Entity.Company;
import Entity.Order;
import Entity.User;
import Repository.OrderList;
import Repository.StockList;
import Repository.UserList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderService {
    UserList userList;
    StockList stockList;
    OrderList orderList;
    UserService userService;
    public String purchaseStock(Long userId, Long stockId, int quantity) {
        User user  = userList.getUserByUserId(userId);
        Company stock = stockList.getStockById(stockId);
        double totalAmount = stock.getPrice() * quantity;
        if(user.getAmount() < totalAmount) {
            return "UnSufficient Balance";
        }
        int orderId = orderList.getOrderMap().size();
        Order order = new Order((long) (orderId+1), userId, stock, quantity, totalAmount, "SUCCESS");
        userService.addBalance(userId, totalAmount, "purchase");
        orderList.addOrder(order);
        return "Order purchased successfully!";

    }

    public List<Order> allOrder() {
        List<Order> orders = new ArrayList<>();
        Map<Long, Order> orderMap = orderList.getOrderMap();
        return orders;
    }
}
