package src.app;

// Класс расчета стоимости товара, с учетом стоимости доставки
public class CalcCostDelivery extends CalcCostBase {

    // Стоимость доставки
    private final static double deliveryPrice = 7.0;

    // Расчет стоимости товара с учетом доставки
    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + deliveryPrice;
    }
}
