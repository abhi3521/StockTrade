package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
public class Company {
    private Long id;
    private String stockName;
    private Double price;

    public Company(Long id, String stockName, Double price) {
        this.id = id;
        this.stockName = stockName;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getStockName() {
        return stockName;
    }

    public Double getPrice() {
        return price;
    }

}
