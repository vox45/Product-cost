package src.app;

public class Main {

    public static void main(String[] args) {
        // Получаем входные данные
        String[] data = getData();
        // Формируем объект из входных данных
        Product product = new Product(data[0],
                Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));
        // Рассчитываем базовую стоимость товара
        CalcCostBase costBase = new CalcCostBase();
        double baseCost = costBase.calcCost(product);
        // Рассчитываем стоимость товара с учетом доставки
        CalcCostDelivery costDelivery = new CalcCostDelivery();
        double deliveryCost = costDelivery.calcCost(product);
        // Формируем вывод
        String baseOutput = product + "\nCost is " +
                Constants.CURRENCY + " " + baseCost + ".";
        String deliveryOutput = product + "\nCost is " +
                Constants.CURRENCY + " " + deliveryCost + ".";
        // Выводим результат
        getOutput(baseOutput);
        getOutput(deliveryOutput);
    }

    // Набор входных данных
    public static String[] getData() {
        return new String[] {"abc", "5", "2.5"};
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
