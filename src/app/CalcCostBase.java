package src.app;

// Класс расчета базовой стоимости товара
public class CalcCostBase {

    // Базовый расчет стоимости товара
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice();
    }
}
