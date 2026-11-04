package org.example;

public class App {
    public static void main(String[] args) {
        City[] cities = {
                new City("Минск", 2000000, 348.8),
                new City("Гомель", 500000, 121.0),
                new City("Брест", 350000, 146.0),
                new City("Витебск", 370000, 134.0),
                new City("Гродно", 380000, 142.0),
                new City("Могилёв", 400000, 118.0)
        };
        City maxPop = cities[0];
        City maxArea = cities[0];
        for (City c : cities) {
            if (c.getPopulation() > maxPop.getPopulation()) maxPop = c;
            if (c.getArea() > maxArea.getArea()) maxArea = c;
        }
        System.out.println("Город с максимальным населением: " + maxPop);
        System.out.println("Город с максимальной площадью: " + maxArea);
        System.out.println("\nЗаказы");
        Order[] orders = {
                new Order(1, Status.NEW),
                new Order(2, Status.IN_PROGRESS),
                new Order(3, Status.COMPLETED),
                new Order(4, Status.CANCELLED),
                new Order(5, Status.COMPLETED)
        };
        System.out.println("Заказы со статусом COMPLETED:");
        for (Order o : orders) {
            if (o.getStatus() == Status.COMPLETED) {
                System.out.println(o);
            }
        }
    }
}