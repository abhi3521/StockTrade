package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private Long id;
    private String name;
    private Double amount;


    public User(Long id, String name, Double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}




/*
Stocks Order Management System
Entities : user , Stocks, Orders
User should be able view list of available stocks and prices (assume static prices)
User balance , methods to add and remove balance (wallet).
Place order for a stock , check balance if sufficient execute order
Show all orders and their status

 */
