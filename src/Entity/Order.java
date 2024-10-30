package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Order {
    private Long orderId;
    private Long userId;
    private Company company;
    private Integer noOfStocks;
    private double totalAmount;
    private String status;

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public Company getCompany() {
        return company;
    }

    public Integer getNoOfStocks() {
        return noOfStocks;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setNoOfStocks(Integer noOfStocks) {
        this.noOfStocks = noOfStocks;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(Long orderId, Long userId, Company company, Integer noOfStocks, double totalAmount, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.company = company;
        this.noOfStocks = noOfStocks;
        this.totalAmount = totalAmount;
        this.status = status;
    }
}
